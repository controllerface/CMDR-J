package com.controllerface.edeps.structures.costs.materials;

import com.controllerface.edeps.ProcurementCategory;
import com.controllerface.edeps.ProcurementCost;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * An enumeration of all the crafting material categories in Elite: Dangerous
 *
 * Created by Controllerface on 3/20/2018.
 */
public enum MaterialSubCategory implements ProcurementCategory
{
    /*
    Raw Elements
     */

    Raw_Elements_1(1, Material.CARBON,
            Material.VANADIUM,
            Material.NIOBIUM,
            Material.YTTRIUM),

    Raw_Elements_2(2, Material.PHOSPHORUS,
            Material.CHROMIUM,
            Material.MOLYBDENUM,
            Material.TECHNETIUM),

    Raw_Elements_3(3, Material.SULPHUR,
            Material.MANGANESE,
            Material.CADMIUM,
            Material.RUTHENIUM),

    Raw_Elements_4(4, Material.IRON,
            Material.ZINC,
            Material.TIN,
            Material.SELENIUM),

    Raw_Elements_5(5, Material.NICKEL,
            Material.GERMANIUM,
            Material.TUNGSTEN,
            Material.TELLURIUM),

    Raw_Elements_6(6, Material.RHENIUM,
            Material.ARSENIC,
            Material.MERCURY,
            Material.POLONIUM),

    Raw_Elements_7(7, Material.LEAD,
            Material.ZIRCONIUM,
            Material.BORON,
            Material.ANTIMONY),


    /*
    Manufactured
     */

    Alloys(1, Material.SALVAGEDALLOYS,
            Material.GALVANISINGALLOYS,
            Material.PHASEALLOYS,
            Material.PROTOLIGHTALLOYS,
            Material.PROTORADIOLICALLOYS),

    Capacitors(2, Material.GRIDRESISTORS,
            Material.HYBRIDCAPACITORS,
            Material.ELECTROCHEMICALARRAYS,
            Material.POLYMERCAPACITORS,
            Material.MILITARYSUPERCAPACITORS),

    Chemical(3, Material.CHEMICALSTORAGEUNITS,
            Material.CHEMICALPROCESSORS,
            Material.CHEMICALDISTILLERY,
            Material.CHEMICALMANIPULATORS,
            Material.PHARMACEUTICALISOLATORS),

    Composite(4, Material.COMPACTCOMPOSITES,
            Material.FILAMENTCOMPOSITES,
            Material.HIGHDENSITYCOMPOSITES,
            Material.FEDPROPRIETARYCOMPOSITES,
            Material.FEDCORECOMPOSITES),

    Conductive(5, Material.BASICCONDUCTORS,
            Material.CONDUCTIVECOMPONENTS,
            Material.CONDUCTIVECERAMICS,
            Material.CONDUCTIVEPOLYMERS,
            Material.BIOTECHCONDUCTORS),

    Crystals(6, Material.CRYSTALSHARDS,
            Material.UNCUTFOCUSCRYSTALS,
            Material.FOCUSCRYSTALS,
            Material.REFINEDFOCUSCRYSTALS,
            Material.EXQUISITEFOCUSCRYSTALS),

    Heat(7, Material.HEATCONDUCTIONWIRING,
            Material.HEATDISPERSIONPLATE,
            Material.HEATEXCHANGERS,
            Material.HEATVANES,
            Material.PROTOHEATRADIATORS),

    Mechanical_Components(8, Material.MECHANICALSCRAP,
            Material.MECHANICALEQUIPMENT,
            Material.MECHANICALCOMPONENTS,
            Material.CONFIGURABLECOMPONENTS,
            Material.IMPROVISEDCOMPONENTS),

    Shielding(9, Material.WORNSHIELDEMITTERS,
            Material.SHIELDEMITTERS,
            Material.SHIELDINGSENSORS,
            Material.COMPOUNDSHIELDING,
            Material.IMPERIALSHIELDING),

    Thermic(10, Material.TEMPEREDALLOYS,
            Material.HEATRESISTANTCERAMICS,
            Material.PRECIPITATEDALLOYS,
            Material.THERMICALLOYS,
            Material.MILITARYGRADEALLOYS),

    // Thargoid Manufactured
    Thargoid_Technology(11, Material.UNKNOWNCARAPACE,
            Material.TG_BIOMECHANICALCONDUITS,
            Material.TG_PROPULSIONELEMENT,
            Material.UNKNOWNENERGYCELL,
            Material.TG_WEAPONPARTS,
            Material.TG_WRECKAGECOMPONENTS,
            Material.UNKNOWNTECHNOLOGYCOMPONENTS,
            Material.UNKNOWNENERGYSOURCE,
            Material.UNKNOWNORGANICCIRCUITRY),

    // Guardian Manufactured
    Guardian_Technology(12, Material.GUARDIAN_POWERCELL,
            Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS,
            Material.GUARDIAN_POWERCONDUIT,
            Material.GUARDIAN_SENTINEL_WEAPONPARTS,
            Material.GUARDIAN_TECHCOMPONENT),

    /*
    Data
     */

    Data_Archives(1, Material.BULKSCANDATA,
            Material.SCANARCHIVES,
            Material.SCANDATABANKS,
            Material.ENCODEDSCANDATA,
            Material.CLASSIFIEDSCANDATA),

    Emission_Data(2, Material.SCRAMBLEDEMISSIONDATA,
            Material.ARCHIVEDEMISSIONDATA,
            Material.EMISSIONDATA,
            Material.DECODEDEMISSIONDATA,
            Material.COMPACTEMISSIONSDATA),

    Encoded_Firmware(3, Material.LEGACYFIRMWARE,
            Material.CONSUMERFIRMWARE,
            Material.INDUSTRIALFIRMWARE,
            Material.SECURITYFIRMWARE,
            Material.EMBEDDEDFIRMWARE),

    Encryption_Files(4, Material.ENCRYPTEDFILES,
            Material.ENCRYPTIONCODES,
            Material.SYMMETRICKEYS,
            Material.ENCRYPTIONARCHIVES,
            Material.ADAPTIVEENCRYPTORS),

    Shield_Data(5, Material.SHIELDCYCLERECORDINGS,
            Material.SHIELDSOAKANALYSIS,
            Material.SHIELDDENSITYREPORTS,
            Material.SHIELDPATTERNANALYSIS,
            Material.SHIELDFREQUENCYDATA),

    Wake_Scans(6, Material.DISRUPTEDWAKEECHOES,
            Material.FSDTELEMETRY,
            Material.WAKESOLUTIONS,
            Material.HYPERSPACETRAJECTORIES,
            Material.DATAMINEDWAKE),

    // Thargoid Data
    Thargoid_Data(7, Material.TG_STRUCTURALDATA,
            Material.TG_SHIPFLIGHTDATA,
            Material.TG_SHIPSYSTEMSDATA,
            Material.TG_COMPOSITIONDATA,
            Material.UNKNOWNSHIPSIGNATURE,
            Material.TG_RESIDUEDATA,
            Material.UNKNOWNWAKEDATA),

    // Guardian Blueprint Data
    Guardian_Blueprint_Data(8, Material.GUARDIAN_MODULEBLUEPRINT,
                  Material.GUARDIAN_VESSELBLUEPRINT,
                  Material.GUARDIAN_WEAPONBLUEPRINT),

    // Guardian Obelisk Data
    Guardian_Obelisk_Data(9, Material.ANCIENTHISTORICALDATA,
            Material.ANCIENTCULTURALDATA,
            Material.ANCIENTBIOLOGICALDATA,
            Material.ANCIENTLANGUAGEDATA,
            Material.ANCIENTTECHNOLOGICALDATA),

    UNKNOWN(-100);

    private final int numericalValue;
    private final Material[] materials;

    MaterialSubCategory(int numericalValue, Material... materials)
    {
        this.numericalValue = numericalValue;
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

    public static ProcurementCategory findMatchingSubCategory(ProcurementCost cost)
    {
        if (!(cost instanceof Material)) return UNKNOWN;
        Material material = ((Material) cost);
        return Arrays.stream(values())
                .filter(category->category.hasMaterial(material))
                .findFirst().orElse(UNKNOWN);
    }

    @Override
    public int getNumericalValue()
    {
        return numericalValue;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }
}