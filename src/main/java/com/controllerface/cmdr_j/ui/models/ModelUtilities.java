package com.controllerface.cmdr_j.ui.models;

import com.controllerface.cmdr_j.classes.commander.StarShip;
import com.controllerface.cmdr_j.ui.models.stl.*;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.shape.VertexFormat;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ModelUtilities
{
    public static class STL
    {
        public static TriangleMesh loadModel(String model, boolean ascii, boolean calculateNormals)
        {
            VertexFormat vertexFormat = calculateNormals
                    ? VertexFormat.POINT_NORMAL_TEXCOORD
                    : VertexFormat.POINT_TEXCOORD;

            TriangleMesh mesh = new TriangleMesh(vertexFormat);

            mesh.getTexCoords().addAll(0, 1);

            StlImportContext context = new StlImportContext(mesh, calculateNormals);

            try
            {
                try(InputStream testModel = StarShip.class.getResourceAsStream(model))
                {
                    Iterable<StlFacet> stlReader = ascii
                            ? new StlAsciiReader(testModel)
                            : new StlBinaryReader(testModel);

                    StreamSupport.stream(stlReader.spliterator(), false)
                            .map(facet -> calculateFace(context, facet))
                            .forEach(context.faceBuffer::add);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
                return mesh;
            }

            context.faceBuffer.forEach(face ->
            {
                List<Integer> nextFace = new ArrayList<>();

                Arrays.stream(face).forEach(axis ->
                {
                    nextFace.add(axis);
                    nextFace.add(0);
                });

                if (calculateNormals)
                {
                    int normalA = calculateNormal(context, context.vertexMap.get(face[0]));
                    int normalB = calculateNormal(context, context.vertexMap.get(face[1]));
                    int normalC = calculateNormal(context, context.vertexMap.get(face[2]));

                    nextFace.add(1, normalA);
                    nextFace.add(4, normalB);
                    nextFace.add(7, normalC);
                }

                nextFace.forEach(index -> mesh.getFaces().addAll(index));
            });

            return mesh;
        }

        private static int[] calculateFace(StlImportContext context, StlFacet facet)
        {
            int indexA = calculatePointIndex(context, facet.pointA, facet.normal);
            int indexB = calculatePointIndex(context, facet.pointB, facet.normal);
            int indexC = calculatePointIndex(context, facet.pointC, facet.normal);
            return new int[]{ indexA, indexB, indexC };
        }

        private static int calculateNormal(StlImportContext importContext, String vertexKey)
        {
            FloatVector normalSum = importContext.normalMap.get(vertexKey);

            float magnitude =
                    ((float) Math.sqrt(Math.pow(normalSum.x, 2) + Math.pow(normalSum.y, 2) + Math.pow(normalSum.z, 2)));

            float[] rawNormal = new float[3];

            if (magnitude == 0)
            {
                rawNormal[0] = 0f;
                rawNormal[1] = 0f;
                rawNormal[2] = 0f;
            }
            else
            {
                rawNormal[0] = normalSum.x / magnitude;
                rawNormal[1] = normalSum.y / magnitude;
                rawNormal[2] = normalSum.z / magnitude;
            }

            importContext.mesh.getNormals().addAll(rawNormal);
            return importContext.nextNormal.getAndIncrement();
        }

        private static int calculatePointIndex(StlImportContext context, FloatVector point, FloatVector faceNormal)
        {
            context.mesh.getPoints().addAll(point.x, point.y, point.z);
            int vertex = context.nextPoint.getAndIncrement();

            if (context.calculateNormals)
            {
                String vertexKey = point.x + ":" + point.y + ":" + point.z;
                context.vertexMap.put(vertex, vertexKey);
                FloatVector vertexNormal = Optional.ofNullable(context.normalMap.get(vertexKey))
                        .map(currentNormal -> currentNormal.add(faceNormal))
                        .orElse(faceNormal);
                context.normalMap.put(vertexKey, vertexNormal);
            }

            return vertex;
        }
    }

    public static class OBJ
    {
        // todo: clean this up maybe? also maybe break this out and release open source?
        private TriangleMesh getObjModel()
        {
            TriangleMesh mesh = new TriangleMesh(VertexFormat.POINT_NORMAL_TEXCOORD);
            mesh.getTexCoords().addAll(1, 0);

            try (InputStream testModel = StarShip.class.getResourceAsStream("/models/test.obj"))
            {
                Scanner scanner = new Scanner(testModel);

                while (scanner.hasNext())
                {
                    String next = scanner.next();
                    if (next.equals("v"))
                    {
                        float x = scanner.nextFloat();
                        float y = scanner.nextFloat();
                        float z = scanner.nextFloat();
                        float w = scanner.hasNextFloat() ? scanner.nextFloat() : 0.0f;
                        mesh.getPoints().addAll(x, y, z);
                    }
                    if (next.equals("vn"))
                    {
                        float i = scanner.nextFloat();
                        float j = scanner.nextFloat();
                        float k = scanner.nextFloat();
                        mesh.getNormals().addAll(i, j, k);
                    }
                    if (next.equals("f"))
                    {
                        String p0Group = scanner.next();
                        String[] p0tokens = p0Group.split("/");

                        String p1Group = scanner.next();
                        String[] p1tokens = p1Group.split("/");

                        String p2Group = scanner.next();
                        String[] p2tokens = p2Group.split("/");

                        int p0index = Integer.parseInt(p0tokens[0]) - 1;
                        int p0normal = Integer.parseInt(p0tokens[2]) - 1;

                        int p1index = Integer.parseInt(p1tokens[0]) - 1;
                        int p1normal = Integer.parseInt(p1tokens[2]) - 1;

                        int p2index = Integer.parseInt(p2tokens[0]) - 1;
                        int p2normal = Integer.parseInt(p2tokens[2]) - 1;

                        mesh.getFaces().addAll(
                                p0index,
                                p0normal,
                                0,
                                p1index,
                                p1normal,
                                0,
                                p2index,
                                p2normal,
                                0);

                    }
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            return mesh;
        }
    }
}
