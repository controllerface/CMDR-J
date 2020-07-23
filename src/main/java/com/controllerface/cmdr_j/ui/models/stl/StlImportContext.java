package com.controllerface.cmdr_j.ui.models.stl;

import com.controllerface.cmdr_j.ui.models.FloatVector;
import javafx.scene.shape.TriangleMesh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class StlImportContext
{
    public final AtomicInteger nextPoint = new AtomicInteger(0);
    public final AtomicInteger nextNormal = new AtomicInteger(0);
    public final Map<Integer, String> vertexMap = new HashMap<>();
    public final Map<String, FloatVector> normalMap = new HashMap<>();
    public final List<int[]> faceBuffer = new ArrayList<>();

    public final TriangleMesh mesh;
    public final boolean calculateNormals;

    public StlImportContext(TriangleMesh mesh, boolean calculateNormals)
    {
        this.mesh = mesh;
        this.calculateNormals = calculateNormals;
    }
}
