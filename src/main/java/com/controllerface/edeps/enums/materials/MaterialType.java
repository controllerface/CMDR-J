package com.controllerface.edeps.enums.materials;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * An enumeration of all the crafting material types in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum MaterialType
{
    RAW(MaterialCategory.Raw_Elements_1,
            MaterialCategory.Raw_Elements_2,
            MaterialCategory.Raw_Elements_3,
            MaterialCategory.Raw_Elements_4,
            MaterialCategory.Raw_Elements_5,
            MaterialCategory.Raw_Elements_6,
            MaterialCategory.Raw_Elements_7),

    MANUFACTURED(MaterialCategory.Chemical,
            MaterialCategory.Thermic,
            MaterialCategory.Heat,
            MaterialCategory.Conductive,
            MaterialCategory.Mechanical_Components,
            MaterialCategory.Capacitors,
            MaterialCategory.Shielding,
            MaterialCategory.Composite,
            MaterialCategory.Crystals,
            MaterialCategory.Alloys,
            MaterialCategory.Thargoid_Technology,
            MaterialCategory.Guardian_Technology),

    ENCODED(MaterialCategory.Emission_Data,
            MaterialCategory.Wake_Scans,
            MaterialCategory.Shield_Data,
            MaterialCategory.Encryption_Files,
            MaterialCategory.Data_Archives,
            MaterialCategory.Encoded_Firmware,
            MaterialCategory.Thargoid_Data,
            MaterialCategory.Guardian_Blueprint_Data,
            MaterialCategory.Guardian_Obelisk_Data),

    UNKNOWN();

    private final List<MaterialCategory> categories;

    MaterialType(MaterialCategory ... categories)
    {
        this.categories = Arrays.stream(categories).collect(Collectors.toList());
    }

    public List<MaterialCategory> getCategories()
    {
        return categories;
    }

    public static MaterialType findMatchingType(Material material)
    {
        return Arrays.stream(values())
                .filter(type -> type.categories.stream()
                        .filter(category -> category
                                .hasMaterial(material))
                        .findFirst().isPresent())
                .findFirst().orElse(UNKNOWN);
    }

    public boolean hasMaterial(Material material)
    {
        return categories.stream()
                .filter(category -> category.hasMaterial(material))
                .findAny().isPresent();
    }
}
