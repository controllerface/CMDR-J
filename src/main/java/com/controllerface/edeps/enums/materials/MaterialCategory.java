package com.controllerface.edeps.enums.materials;

import com.controllerface.edeps.ProcurementCategory;
import com.controllerface.edeps.ProcurementCost;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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
    Thargoid_Data(Material.Thargoid_Structural_Data,
            Material.Ship_Flight_Data,
            Material.Ship_Systems_Data,
            Material.Thargoid_Material_Composition_Data,
            Material.Thargoid_Ship_Signature,
            Material.Thargoid_Residue_Data,
            Material.Thargoid_Wake_Data),

    Thargoid_Technology(Material.Thargoid_Carapace,
            Material.Bio_Mechanical_Conduits,
            Material.Propulsion_Elements,
            Material.Thargoid_Energy_Cell,
            Material.Weapon_Parts,
            Material.Wreckage_Components,
            Material.Thargoid_Technological_Components,
            Material.Sensor_Fragment,
            Material.Thargoid_Organic_Circuitry),

    // Guardian
    Guardian_Blueprint_Data(Material.Guardian_Module_Blueprint_Segment,
                  Material.Guardian_Vessel_Blueprint_Segment,
                  Material.Guardian_Weapon_Blueprint_Segment),

    Guardian_Obelisk_Data(Material.Pattern_Gamma_Obelisk_Data,
            Material.Pattern_Beta_Obelisk_Data,
            Material.Pattern_Alpha_Obelisk_Data,
            Material.Pattern_Delta_Obelisk_Data,
            Material.Pattern_Epsilon_Obelisk_Data),

    Guardian_Technology(Material.Guardian_Power_Cell,
            Material.Guardian_Sentinel_Wreckage_Components,
            Material.Guardian_Power_Conduit,
            Material.Guardian_Sentinel_Weapon_Parts,
            Material.Guardian_Technology_Component),

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
