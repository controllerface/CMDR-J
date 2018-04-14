package com.controllerface.edeps.enums.costs.materials;

import com.controllerface.edeps.ProcurementCategory;
import com.controllerface.edeps.ProcurementCost;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * An enumeration of all the crafting material categories in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum MaterialCategory implements ProcurementCategory
{
    // Raw Elements
    Raw_Elements_1(Material.CARBON,
            Material.VANADIUM,
            Material.NIOBIUM,
            Material.YTTRIUM),

    Raw_Elements_2(Material.PHOSPHORUS,
            Material.CHROMIUM,
            Material.MOLYBDENUM,
            Material.TECHNETIUM),

    Raw_Elements_3(Material.SULPHUR,
            Material.MANGANESE,
            Material.CADMIUM,
            Material.RUTHENIUM),

    Raw_Elements_4(Material.IRON,
            Material.ZINC,
            Material.TIN,
            Material.SELENIUM),

    Raw_Elements_5(Material.NICKEL,
            Material.GERMANIUM,
            Material.TUNGSTEN,
            Material.TELLURIUM),

    Raw_Elements_6(Material.RHENIUM,
            Material.ARSENIC,
            Material.MERCURY,
            Material.POLONIUM),

    Raw_Elements_7(Material.LEAD,
            Material.ZIRCONIUM,
            Material.BORON,
            Material.ANTIMONY),

    // Manufactured
    Chemical(Material.CHEMICALSTORAGEUNITS,
            Material.CHEMICALPROCESSORS,
            Material.CHEMICALDISTILLERY,
            Material.CHEMICALMANIPULATORS,
            Material.PHARMACEUTICALISOLATORS),

    Thermic(Material.TEMPEREDALLOYS,
            Material.HEATRESISTANTCERAMICS,
            Material.PRECIPITATEDALLOYS,
            Material.THERMICALLOYS,
            Material.MILITARYGRADEALLOYS),

    Heat(Material.HEATCONDUCTIONWIRING,
            Material.HEATDISPERSIONPLATE,
            Material.HEATEXCHANGERS,
            Material.HEATVANES,
            Material.PROTOHEATRADIATORS),

    Conductive(Material.BASICCONDUCTORS,
            Material.CONDUCTIVECOMPONENTS,
            Material.CONDUCTIVECERAMICS,
            Material.CONDUCTIVEPOLYMERS,
            Material.BIOTECHCONDUCTORS),

    Mechanical_Components(Material.MECHANICALSCRAP,
            Material.MECHANICALEQUIPMENT,
            Material.MECHANICALCOMPONENTS,
            Material.CONFIGURABLECOMPONENTS,
            Material.IMPROVISEDCOMPONENTS),

    Capacitors(Material.GRIDRESISTORS,
            Material.HYBRIDCAPACITORS,
            Material.ELECTROCHEMICALARRAYS,
            Material.POLYMERCAPACITORS,
            Material.MILITARYSUPERCAPACITORS),

    Shielding(Material.WORNSHIELDEMITTERS,
            Material.SHIELDEMITTERS,
            Material.SHIELDINGSENSORS,
            Material.COMPOUNDSHIELDING,
            Material.IMPERIALSHIELDING),

    Composite(Material.COMPACTCOMPOSITES,
            Material.FILAMENTCOMPOSITES,
            Material.HIGHDENSITYCOMPOSITES,
            Material.FEDPROPRIETARYCOMPOSITES,
            Material.FEDCORECOMPOSITES),

    Crystals(Material.CRYSTALSHARDS,
            Material.UNCUTFOCUSCRYSTALS,
            Material.FOCUSCRYSTALS,
            Material.REFINEDFOCUSCRYSTALS,
            Material.EXQUISITEFOCUSCRYSTALS),

    Alloys(Material.SALVAGEDALLOYS,
            Material.GALVANISINGALLOYS,
            Material.PHASEALLOYS,
            Material.PROTOLIGHTALLOYS,
            Material.PROTORADIOLICALLOYS),

    // Data
    Emission_Data(Material.SCRAMBLEDEMISSIONDATA,
            Material.ARCHIVEDEMISSIONDATA,
            Material.EMISSIONDATA,
            Material.DECODEDEMISSIONDATA,
            Material.COMPACTEMISSIONSDATA),

    Wake_Scans(Material.DISRUPTEDWAKEECHOES,
            Material.FSDTELEMETRY,
            Material.WAKESOLUTIONS,
            Material.HYPERSPACETRAJECTORIES,
            Material.DATAMINEDWAKE),

    Shield_Data(Material.SHIELDCYCLERECORDINGS,
            Material.SHIELDSOAKANALYSIS,
            Material.SHIELDDENSITYREPORTS,
            Material.SHIELDPATTERNANALYSIS,
            Material.SHIELDFREQUENCYDATA),

    Encryption_Files(Material.ENCRYPTEDFILES,
            Material.ENCRYPTIONCODES,
            Material.SYMMETRICKEYS,
            Material.ENCRYPTIONARCHIVES,
            Material.ADAPTIVEENCRYPTORS),

    Data_Archives(Material.BULKSCANDATA,
            Material.SCANARCHIVES,
            Material.SCANDATABANKS,
            Material.ENCODEDSCANDATA,
            Material.CLASSIFIEDSCANDATA),

    Encoded_Firmware(Material.LEGACYFIRMWARE,
            Material.CONSUMERFIRMWARE,
            Material.INDUSTRIALFIRMWARE,
            Material.SECURITYFIRMWARE,
            Material.EMBEDDEDFIRMWARE),

    // Thargoid
    Thargoid_Data(Material.TG_STRUCTURALDATA,
            Material.TG_SHIPFLIGHTDATA,
            Material.TG_SHIPSYSTEMSDATA,
            Material.TG_COMPOSITIONDATA,
            Material.UNKNOWNSHIPSIGNATURE,
            Material.TG_RESIDUEDATA,
            Material.UNKNOWNWAKEDATA),

    Thargoid_Technology(Material.UNKNOWNCARAPACE,
            Material.TG_BIOMECHANICALCONDUITS,
            Material.TG_PROPULSIONELEMENT,
            Material.UNKNOWNENERGYCELL,
            Material.TG_WEAPONPARTS,
            Material.TG_WRECKAGECOMPONENTS,
            Material.UNKNOWNTECHNOLOGYCOMPONENTS,
            Material.UNKNOWNENERGYSOURCE,
            Material.UNKNOWNORGANICCIRCUITRY),

    // Guardian
    Guardian_Blueprint_Data(Material.GUARDIAN_MODULEBLUEPRINT,
                  Material.GUARDIAN_VESSELBLUEPRINT,
                  Material.GUARDIAN_WEAPONBLUEPRINT),

    Guardian_Obelisk_Data(Material.ANCIENTHISTORICALDATA,
            Material.ANCIENTCULTURALDATA,
            Material.ANCIENTBIOLOGICALDATA,
            Material.ANCIENTLANGUAGEDATA,
            Material.ANCIENTTECHNOLOGICALDATA),

    Guardian_Technology(Material.GUARDIAN_POWERCELL,
            Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS,
            Material.GUARDIAN_POWERCONDUIT,
            Material.GUARDIAN_SENTINEL_WEAPONPARTS,
            Material.GUARDIAN_TECHCOMPONENT),

    UNKNOWN();

    private final Material[] materials;

    MaterialCategory(Material ... materials)
    {
        this.materials = materials;
    }

    public Stream<Material> materials()
    {
        return Arrays.stream(materials);
    }

    public boolean hasMaterial(Material material)
    {
        return materials()
                .anyMatch(m -> m == material);
    }

    public static ProcurementCategory findMatchingCategory(ProcurementCost cost)
    {
        if (!(cost instanceof Material)) return UNKNOWN;
        Material material = ((Material) cost);
        return Arrays.stream(values())
                .filter(category->category.hasMaterial(material))
                .findFirst().orElse(UNKNOWN);
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}
