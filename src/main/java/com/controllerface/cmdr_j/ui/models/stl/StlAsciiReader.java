package com.controllerface.cmdr_j.ui.models.stl;

import com.controllerface.cmdr_j.ui.models.FloatVector;

import java.io.InputStream;
import java.util.Scanner;

public class StlAsciiReader implements StlReader
{
    private final Scanner scanner;

    private StlFacet nextFacet = null;

    public StlAsciiReader(InputStream testModel)
    {
        this.scanner = new Scanner(testModel);
    }

    private void tryFacetRead()
    {
        boolean done = false;
        while (scanner.hasNext() && !done)
        {
            String nextToken = scanner.next();
            if (nextToken.equals("facet") && nextFacet == null)
            {
                scanner.next("normal");

                FloatVector N = new FloatVector(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

                scanner.next("outer");
                scanner.next("loop");

                scanner.next("vertex");
                FloatVector A = new FloatVector(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

                scanner.next("vertex");
                FloatVector B = new FloatVector(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

                scanner.next("vertex");
                FloatVector C = new FloatVector(scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());

                scanner.next("endloop");
                scanner.next("endfacet");

                nextFacet = new StlFacet(A, B, C, N);
                done = true;
            }
        }
    }

    @Override
    public boolean hasMoreFacets()
    {
        tryFacetRead();
        return nextFacet != null;
    }

    @Override
    public StlFacet getNextFacet()
    {
        StlFacet next = nextFacet;
        nextFacet = null;
        return next;
    }
}
