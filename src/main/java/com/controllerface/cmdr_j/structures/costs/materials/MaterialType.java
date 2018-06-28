package com.controllerface.cmdr_j.structures.costs.materials;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * An enumeration of all the crafting material types in Elite: Dangerous
 *
 * Created by Controllerface on 3/20/2018.
 */
public enum MaterialType
{
    RAW(EnumSet.of(MaterialSubCostCategory.Raw_Elements_1,
            MaterialSubCostCategory.Raw_Elements_2,
            MaterialSubCostCategory.Raw_Elements_3,
            MaterialSubCostCategory.Raw_Elements_4,
            MaterialSubCostCategory.Raw_Elements_5,
            MaterialSubCostCategory.Raw_Elements_6,
            MaterialSubCostCategory.Raw_Elements_7)),

    MANUFACTURED(EnumSet.of(MaterialSubCostCategory.Chemical,
            MaterialSubCostCategory.Thermic,
            MaterialSubCostCategory.Heat,
            MaterialSubCostCategory.Conductive,
            MaterialSubCostCategory.Mechanical_Components,
            MaterialSubCostCategory.Capacitors,
            MaterialSubCostCategory.Shielding,
            MaterialSubCostCategory.Composite,
            MaterialSubCostCategory.Crystals,
            MaterialSubCostCategory.Alloys,
            MaterialSubCostCategory.Thargoid_Technology,
            MaterialSubCostCategory.Guardian_Technology)),

    ENCODED(EnumSet.of(MaterialSubCostCategory.Emission_Data,
            MaterialSubCostCategory.Wake_Scans,
            MaterialSubCostCategory.Shield_Data,
            MaterialSubCostCategory.Encryption_Files,
            MaterialSubCostCategory.Data_Archives,
            MaterialSubCostCategory.Encoded_Firmware,
            MaterialSubCostCategory.Thargoid_Data,
            MaterialSubCostCategory.Guardian_Blueprint_Data,
            MaterialSubCostCategory.Guardian_Obelisk_Data)),

    ;

    private final EnumSet<MaterialSubCostCategory> categories;

    MaterialType(EnumSet<MaterialSubCostCategory> categories)
    {
        this.categories = categories;
    }

    public Stream<MaterialSubCostCategory> categories()
    {
        return categories.stream();
    }

    public static Optional<MaterialType> findMatchingType(Material material)
    {
        return Arrays.stream(values())
                .filter(type -> type.categories()
                        .anyMatch(category -> category.hasMaterial(material)))
                .findFirst();
    }

    public boolean hasMaterial(Material material)
    {
        return categories().anyMatch(category -> category.hasMaterial(material));
    }
}
