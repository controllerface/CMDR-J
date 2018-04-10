package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**
 * An abstract storage bin object, used to keep track of materials of a single type. Implementations will contain the
 * logic for checking if a material is appropriate for the container and initializing the storage object with 0 counts
 * of all the materials of the material type.
 *
 * Created by Stephen on 3/20/2018.
 */
public abstract class MaterialStorageBin
{
    private final Map<Material, Integer> mats = new HashMap<>();

    public abstract boolean check(Material material);

    public abstract void init();

    public MaterialStorageBin()
    {
        init();
    }

    public Stream<MaterialInventoryData> materialStream()
    {
        return mats.entrySet().stream().map(e->new MaterialInventoryData(e.getKey(),e.getValue()));
    }

    public void clear()
    {
        mats.clear();
        init();
    }

    public int hasMat(Material material)
    {
        if (check(material))
        {
            return mats.computeIfAbsent(material, m -> 0);
        }
        return -1;
    }

    public boolean addMat(Material material, int count)
    {
        if (check(material))
        {
            mats.computeIfPresent(material,(m, c) -> c + count);
            mats.computeIfAbsent(material, m -> count);
            return true;
        }
        return false;
    }
}
