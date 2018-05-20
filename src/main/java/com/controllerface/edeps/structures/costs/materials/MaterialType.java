package com.controllerface.edeps.structures.costs.materials;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * An enumeration of all the crafting material types in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum MaterialType
{
    RAW(MaterialSubCategory.Raw_Elements_1,
            MaterialSubCategory.Raw_Elements_2,
            MaterialSubCategory.Raw_Elements_3,
            MaterialSubCategory.Raw_Elements_4,
            MaterialSubCategory.Raw_Elements_5,
            MaterialSubCategory.Raw_Elements_6,
            MaterialSubCategory.Raw_Elements_7),

    MANUFACTURED(MaterialSubCategory.Chemical,
            MaterialSubCategory.Thermic,
            MaterialSubCategory.Heat,
            MaterialSubCategory.Conductive,
            MaterialSubCategory.Mechanical_Components,
            MaterialSubCategory.Capacitors,
            MaterialSubCategory.Shielding,
            MaterialSubCategory.Composite,
            MaterialSubCategory.Crystals,
            MaterialSubCategory.Alloys,
            MaterialSubCategory.Thargoid_Technology,
            MaterialSubCategory.Guardian_Technology),

    ENCODED(MaterialSubCategory.Emission_Data,
            MaterialSubCategory.Wake_Scans,
            MaterialSubCategory.Shield_Data,
            MaterialSubCategory.Encryption_Files,
            MaterialSubCategory.Data_Archives,
            MaterialSubCategory.Encoded_Firmware,
            MaterialSubCategory.Thargoid_Data,
            MaterialSubCategory.Guardian_Blueprint_Data,
            MaterialSubCategory.Guardian_Obelisk_Data),

    UNKNOWN();

    private final MaterialSubCategory[] categories;

    MaterialType(MaterialSubCategory... categories)
    {
        this.categories = categories;
    }

    public Stream<MaterialSubCategory> categories()
    {
        return Arrays.stream(categories);
    }

    public static MaterialType findMatchingType(Material material)
    {
        return Arrays.stream(values())
                .filter(type -> type.categories()
                        .anyMatch(category -> category.hasMaterial(material)))
                .findFirst().orElse(UNKNOWN);
    }

    public boolean hasMaterial(Material material)
    {
        return categories()
                .anyMatch(category -> category.hasMaterial(material));
    }
}
