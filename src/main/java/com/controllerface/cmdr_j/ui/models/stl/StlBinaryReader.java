package com.controllerface.cmdr_j.ui.models.stl;

import com.controllerface.cmdr_j.ui.models.FloatVector;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class StlBinaryReader implements Iterable<StlFacet>
{
    private final InputStream testModel;
    private final AtomicInteger remainingtriangles = new AtomicInteger(0);

    public StlBinaryReader(InputStream testModel)
    {
        this.testModel = new BufferedInputStream(testModel);
        if (!initialize())
        {
            System.err.println("Could not read model");
        }
    }

    private boolean initialize()
    {
        try
        {
            int bytesRead;

            byte[] header = new byte[80];
            bytesRead = testModel.read(header);
            if (bytesRead != 80)
            {
                System.out.println("Bad header");
                return false;
            }

            //String headerText = new String(header);
            // todo: could log this. could add a logger too.


            byte[] triangleCount = new byte[4];
            bytesRead = testModel.read(triangleCount);
            if (bytesRead != 4)
            {
                System.out.println("Bad triangle count");
                return false;
            }

            int triangles = ByteBuffer.wrap(triangleCount)
                    .order(ByteOrder.LITTLE_ENDIAN)
                    .getInt();

            remainingtriangles.set(triangles);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private float getNextFloat() throws IOException
    {
        byte[] rawFloat = new byte[4];
        return Optional.of(testModel.read(rawFloat))
                .filter(bytesRead -> bytesRead == 4)
                .map(_x -> ByteBuffer.wrap(rawFloat)
                        .order(ByteOrder.LITTLE_ENDIAN)
                        .getFloat())
                .orElse(0.0f);
    }

    private short getNextShort() throws IOException
    {
        byte[] rawShort = new byte[2];
        return Optional.of(testModel.read(rawShort))
                .filter(bytesRead -> bytesRead == 2)
                .map(_x -> ByteBuffer.wrap(rawShort)
                        .order(ByteOrder.LITTLE_ENDIAN)
                        .getShort())
                .orElse((short) 0);
    }

    @NotNull
    @Override
    public Iterator<StlFacet> iterator()
    {
        return new Iterator<>()
        {
            @Override
            public boolean hasNext()
            {
                return remainingtriangles.get() > 0;
            }

            @Override
            public StlFacet next()
            {
                try
                {
                    FloatVector N = new FloatVector(getNextFloat(), getNextFloat(), getNextFloat());
                    FloatVector A = new FloatVector(getNextFloat(), getNextFloat(), getNextFloat());
                    FloatVector B = new FloatVector(getNextFloat(), getNextFloat(), getNextFloat());
                    FloatVector C = new FloatVector(getNextFloat(), getNextFloat(), getNextFloat());
                    getNextShort();
                    remainingtriangles.decrementAndGet();
                    return new StlFacet(A, B, C, N);
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                    return null;
                }
            }
        };
    }
}
