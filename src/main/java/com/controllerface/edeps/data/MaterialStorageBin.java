package com.controllerface.edeps.data;

import com.controllerface.edeps.enums.materials.Material;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private final List<MaterialInventoryData> materials = new ArrayList<>();

    public abstract boolean check(Material material);

    public abstract void init();

    public MaterialStorageBin()
    {
        init();
    }

    public Stream<MaterialInventoryData> materialStream()
    {
        return materials.stream();
    }

    public void clear()
    {
        materials.clear();
        init();
    }

    public int hasMat(Material material)
    {
        if (check(material))
        {
            return materials.stream().filter(d->d.getMaterial() == material)
                    .map(MaterialInventoryData::getQuantity)
                    .findFirst().orElse(0);
        }
        return -1;
    }

    public boolean addMat(Material material, int count)
    {
        if (check(material))
        {
            MaterialInventoryData data = materials.stream()
                    .filter(m->m.getMaterial()==material)
                    .findFirst().orElse(null);
            if (data != null) data.adjustCount(count);
            else
            {
                data = new MaterialInventoryData(material, 0);
                materials.add(data);
            }
            return true;
        }
        return false;
    }
}
