package com.controllerface.cmdr_j.enums.costs.materials;

import com.controllerface.cmdr_j.classes.events.handlers.ship.LoadoutHandler;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.TaskCostCategory;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * An enumeration of all the crafting material categories in Elite: Dangerous
 *
 * Created by Controllerface on 3/20/2018.
 */
public enum MaterialSubCostCategory implements TaskCostCategory
{
    /*
    Raw Elements
     */

    Raw_Elements_1(1, EnumSet.of(Material.CARBON,
            Material.VANADIUM,
            Material.NIOBIUM,
            Material.YTTRIUM)),

    Raw_Elements_2(2, EnumSet.of(Material.PHOSPHORUS,
            Material.CHROMIUM,
            Material.MOLYBDENUM,
            Material.TECHNETIUM)),

    Raw_Elements_3(3, EnumSet.of(Material.SULPHUR,
            Material.MANGANESE,
            Material.CADMIUM,
            Material.RUTHENIUM)),

    Raw_Elements_4(4, EnumSet.of(Material.IRON,
            Material.ZINC,
            Material.TIN,
            Material.SELENIUM)),

    Raw_Elements_5(5, EnumSet.of(Material.NICKEL,
            Material.GERMANIUM,
            Material.TUNGSTEN,
            Material.TELLURIUM)),

    Raw_Elements_6(6, EnumSet.of(Material.RHENIUM,
            Material.ARSENIC,
            Material.MERCURY,
            Material.POLONIUM)),

    Raw_Elements_7(7, EnumSet.of(Material.LEAD,
            Material.ZIRCONIUM,
            Material.BORON,
            Material.ANTIMONY)),


    /*
    Manufactured
     */

    Alloys(1, EnumSet.of(Material.SALVAGEDALLOYS,
            Material.GALVANISINGALLOYS,
            Material.PHASEALLOYS,
            Material.PROTOLIGHTALLOYS,
            Material.PROTORADIOLICALLOYS)),

    Capacitors(2, EnumSet.of(Material.GRIDRESISTORS,
            Material.HYBRIDCAPACITORS,
            Material.ELECTROCHEMICALARRAYS,
            Material.POLYMERCAPACITORS,
            Material.MILITARYSUPERCAPACITORS)),

    Chemical(3, EnumSet.of(Material.CHEMICALSTORAGEUNITS,
            Material.CHEMICALPROCESSORS,
            Material.CHEMICALDISTILLERY,
            Material.CHEMICALMANIPULATORS,
            Material.PHARMACEUTICALISOLATORS)),

    Composite(4, EnumSet.of(Material.COMPACTCOMPOSITES,
            Material.FILAMENTCOMPOSITES,
            Material.HIGHDENSITYCOMPOSITES,
            Material.FEDPROPRIETARYCOMPOSITES,
            Material.FEDCORECOMPOSITES)),

    Conductive(5, EnumSet.of(Material.BASICCONDUCTORS,
            Material.CONDUCTIVECOMPONENTS,
            Material.CONDUCTIVECERAMICS,
            Material.CONDUCTIVEPOLYMERS,
            Material.BIOTECHCONDUCTORS)),

    Crystals(6, EnumSet.of(Material.CRYSTALSHARDS,
            Material.UNCUTFOCUSCRYSTALS,
            Material.FOCUSCRYSTALS,
            Material.REFINEDFOCUSCRYSTALS,
            Material.EXQUISITEFOCUSCRYSTALS)),

    Heat(7, EnumSet.of(Material.HEATCONDUCTIONWIRING,
            Material.HEATDISPERSIONPLATE,
            Material.HEATEXCHANGERS,
            Material.HEATVANES,
            Material.PROTOHEATRADIATORS)),

    Mechanical_Components(8, EnumSet.of(Material.MECHANICALSCRAP,
            Material.MECHANICALEQUIPMENT,
            Material.MECHANICALCOMPONENTS,
            Material.CONFIGURABLECOMPONENTS,
            Material.IMPROVISEDCOMPONENTS)),

    Shielding(9, EnumSet.of(Material.WORNSHIELDEMITTERS,
            Material.SHIELDEMITTERS,
            Material.SHIELDINGSENSORS,
            Material.COMPOUNDSHIELDING,
            Material.IMPERIALSHIELDING)),

    Thermic(10, EnumSet.of(Material.TEMPEREDALLOYS,
            Material.HEATRESISTANTCERAMICS,
            Material.PRECIPITATEDALLOYS,
            Material.THERMICALLOYS,
            Material.MILITARYGRADEALLOYS)),

    // Thargoid Manufactured
    Thargoid_Technology(11, EnumSet.of(Material.UNKNOWNCARAPACE,
            Material.TG_BIOMECHANICALCONDUITS,
            Material.TG_PROPULSIONELEMENT,
            Material.UNKNOWNENERGYCELL,
            Material.TG_WEAPONPARTS,
            Material.TG_WRECKAGECOMPONENTS,
            Material.UNKNOWNTECHNOLOGYCOMPONENTS,
            Material.UNKNOWNENERGYSOURCE,
            Material.UNKNOWNORGANICCIRCUITRY)),

    // Guardian Manufactured
    Guardian_Technology(12, EnumSet.of(Material.GUARDIAN_POWERCELL,
            Material.GUARDIAN_SENTINEL_WRECKAGECOMPONENTS,
            Material.GUARDIAN_POWERCONDUIT,
            Material.GUARDIAN_SENTINEL_WEAPONPARTS,
            Material.GUARDIAN_TECHCOMPONENT)),

    /*
    Data
     */

    Data_Archives(1, EnumSet.of(Material.BULKSCANDATA,
            Material.SCANARCHIVES,
            Material.SCANDATABANKS,
            Material.ENCODEDSCANDATA,
            Material.CLASSIFIEDSCANDATA)),

    Emission_Data(2, EnumSet.of(Material.SCRAMBLEDEMISSIONDATA,
            Material.ARCHIVEDEMISSIONDATA,
            Material.EMISSIONDATA,
            Material.DECODEDEMISSIONDATA,
            Material.COMPACTEMISSIONSDATA)),

    Encoded_Firmware(3, EnumSet.of(Material.LEGACYFIRMWARE,
            Material.CONSUMERFIRMWARE,
            Material.INDUSTRIALFIRMWARE,
            Material.SECURITYFIRMWARE,
            Material.EMBEDDEDFIRMWARE)),

    Encryption_Files(4, EnumSet.of(Material.ENCRYPTEDFILES,
            Material.ENCRYPTIONCODES,
            Material.SYMMETRICKEYS,
            Material.ENCRYPTIONARCHIVES,
            Material.ADAPTIVEENCRYPTORS)),

    Shield_Data(5, EnumSet.of(Material.SHIELDCYCLERECORDINGS,
            Material.SHIELDSOAKANALYSIS,
            Material.SHIELDDENSITYREPORTS,
            Material.SHIELDPATTERNANALYSIS,
            Material.SHIELDFREQUENCYDATA)),

    Wake_Scans(6, EnumSet.of(Material.DISRUPTEDWAKEECHOES,
            Material.FSDTELEMETRY,
            Material.WAKESOLUTIONS,
            Material.HYPERSPACETRAJECTORIES,
            Material.DATAMINEDWAKE)),

    // Thargoid Data
    Thargoid_Data(7, EnumSet.of(Material.TG_STRUCTURALDATA,
            Material.UNKNOWNSHIPSIGNATURE,
            Material.TG_SHIPFLIGHTDATA,
            Material.TG_SHIPSYSTEMSDATA,
            Material.TG_COMPOSITIONDATA,
            Material.UNKNOWNWAKEDATA,
            Material.TG_RESIDUEDATA)),

    // Guardian Blueprint Data
    Guardian_Blueprint_Data(8, EnumSet.of(Material.GUARDIAN_MODULEBLUEPRINT,
            Material.GUARDIAN_VESSELBLUEPRINT,
            Material.GUARDIAN_WEAPONBLUEPRINT)),

    // Guardian Obelisk Data
    Guardian_Obelisk_Data(9, EnumSet.of(Material.ANCIENTHISTORICALDATA,
            Material.ANCIENTCULTURALDATA,
            Material.ANCIENTBIOLOGICALDATA,
            Material.ANCIENTLANGUAGEDATA,
            Material.ANCIENTTECHNOLOGICALDATA)),

    ;

    private final int numericalValue;
    private final EnumSet<Material> materials;

    MaterialSubCostCategory(int numericalValue, EnumSet<Material> materials)
    {
        this.numericalValue = numericalValue;
        this.materials = materials;
    }


    public Stream<Material> materials()
    {
        return materials.stream();
    }

    public boolean hasMaterial(Material material)
    {
        return materials.contains(material);
    }

    public static Optional<MaterialSubCostCategory> findMatchingSubCategory(TaskCost cost)
    {
        if (!(cost instanceof Material)) return Optional.empty();
        Material material = ((Material) cost);
        return Arrays.stream(values())
                .filter(category->category.hasMaterial(material))
                .findFirst();
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
