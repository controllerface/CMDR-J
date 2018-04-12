package com.controllerface.edeps.enums.costs.materials;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.enums.common.ItemGrade;

/**
 * An enumeration of all the crafting materials in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum Material implements ProcurementCost
{
    //RAW:,
    //----,

    CARBON(ItemGrade.GRADE_1),
    PHOSPHORUS(ItemGrade.GRADE_1),
    SULPHUR(ItemGrade.GRADE_1),
    IRON(ItemGrade.GRADE_1),
    NICKEL(ItemGrade.GRADE_1),
    RHENIUM(ItemGrade.GRADE_1),
    LEAD(ItemGrade.GRADE_1),


    VANADIUM(ItemGrade.GRADE_2),
    CHROMIUM(ItemGrade.GRADE_2),
    MANGANESE(ItemGrade.GRADE_2),
    ZINC(ItemGrade.GRADE_2),
    GERMANIUM(ItemGrade.GRADE_2),
    ARSENIC(ItemGrade.GRADE_2),
    ZIRCONIUM(ItemGrade.GRADE_2),

    NIOBIUM(ItemGrade.GRADE_3),
    MOLYBDENUM(ItemGrade.GRADE_3),
    CADMIUM(ItemGrade.GRADE_3),
    TIN(ItemGrade.GRADE_3),
    TUNGSTEN(ItemGrade.GRADE_3),
    MERCURY(ItemGrade.GRADE_3),
    BORON(ItemGrade.GRADE_3),

    YTTRIUM(ItemGrade.GRADE_4),
    TECHNETIUM(ItemGrade.GRADE_4),
    RUTHENIUM(ItemGrade.GRADE_4),
    SELENIUM(ItemGrade.GRADE_4),
    TELLURIUM(ItemGrade.GRADE_4),
    POLONIUM(ItemGrade.GRADE_4),
    ANTIMONY(ItemGrade.GRADE_4),

    //Manufactured:,
    //-------------,

    CHEMICALSTORAGEUNITS(ItemGrade.GRADE_1),
    TEMPEREDALLOYS(ItemGrade.GRADE_1),
    HEATCONDUCTIONWIRING(ItemGrade.GRADE_1),
    BASICCONDUCTORS(ItemGrade.GRADE_1),
    MECHANICALSCRAP(ItemGrade.GRADE_1),
    GRIDRESISTORS(ItemGrade.GRADE_1),
    WORNSHIELDEMITTERS(ItemGrade.GRADE_1),
    COMPACTCOMPOSITES(ItemGrade.GRADE_1),
    CRYSTALSHARDS(ItemGrade.GRADE_1),
    SALVAGEDALLOYS(ItemGrade.GRADE_1),

    CHEMICALPROCESSORS(ItemGrade.GRADE_2),
    HEATRESISTANTCERAMICS(ItemGrade.GRADE_2),
    HEATDISPERSIONPLATE(ItemGrade.GRADE_2),
    CONDUCTIVECOMPONENTS(ItemGrade.GRADE_2),
    MECHANICALEQUIPMENT(ItemGrade.GRADE_2),
    HYBRIDCAPACITORS(ItemGrade.GRADE_2),
    SHIELDEMITTERS(ItemGrade.GRADE_2),
    FILAMENTCOMPOSITES(ItemGrade.GRADE_2),
    UNCUTFOCUSCRYSTALS(ItemGrade.GRADE_2),
    GALVANISINGALLOYS(ItemGrade.GRADE_2),

    CHEMICALDISTILLERY(ItemGrade.GRADE_3),
    PRECIPITATEDALLOYS(ItemGrade.GRADE_3),
    HEATEXCHANGERS(ItemGrade.GRADE_3),
    CONDUCTIVECERAMICS(ItemGrade.GRADE_3),
    MECHANICALCOMPONENTS(ItemGrade.GRADE_3),
    ELECTROCHEMICALARRAYS(ItemGrade.GRADE_3),
    SHIELDINGSENSORS(ItemGrade.GRADE_3),
    HIGHDENSITYCOMPOSITES(ItemGrade.GRADE_3),
    FOCUSCRYSTALS(ItemGrade.GRADE_3),
    PHASEALLOYS(ItemGrade.GRADE_3),

    CHEMICALMANIPULATORS(ItemGrade.GRADE_4),
    THERMICALLOYS(ItemGrade.GRADE_4),
    HEATVANES(ItemGrade.GRADE_4),
    CONDUCTIVEPOLYMERS(ItemGrade.GRADE_4),
    CONFIGURABLECOMPONENTS(ItemGrade.GRADE_4),
    POLYMERCAPACITORS(ItemGrade.GRADE_4),
    COMPOUNDSHIELDING(ItemGrade.GRADE_4),
    FEDPROPRIETARYCOMPOSITES(ItemGrade.GRADE_4),
    REFINEDFOCUSCRYSTALS(ItemGrade.GRADE_4),
    PROTOLIGHTALLOYS(ItemGrade.GRADE_4),

    PHARMACEUTICALISOLATORS(ItemGrade.GRADE_5),
    MILITARYGRADEALLOYS(ItemGrade.GRADE_5),
    PROTOHEATRADIATORS(ItemGrade.GRADE_5),
    BIOTECHCONDUCTORS(ItemGrade.GRADE_5),
    IMPROVISEDCOMPONENTS(ItemGrade.GRADE_5),
    MILITARYSUPERCAPACITORS(ItemGrade.GRADE_5),
    IMPERIALSHIELDING(ItemGrade.GRADE_5),
    FEDCORECOMPOSITES(ItemGrade.GRADE_5),
    EXQUISITEFOCUSCRYSTALS(ItemGrade.GRADE_5),
    PROTORADIOLICALLOYS(ItemGrade.GRADE_5),


    //ENCODED:,
    //-----,

    SCRAMBLEDEMISSIONDATA(ItemGrade.GRADE_1),
    DISRUPTEDWAKEECHOES(ItemGrade.GRADE_1),
    SHIELDCYCLERECORDINGS(ItemGrade.GRADE_1),
    ENCRYPTEDFILES(ItemGrade.GRADE_1),
    BULKSCANDATA(ItemGrade.GRADE_1),
    LEGACYFIRMWARE(ItemGrade.GRADE_1),

    ARCHIVEDEMISSIONDATA(ItemGrade.GRADE_2),
    FSDTELEMETRY(ItemGrade.GRADE_2),
    SHIELDSOAKANALYSIS(ItemGrade.GRADE_2),
    ENCRYPTIONCODES(ItemGrade.GRADE_2),
    SCANARCHIVES(ItemGrade.GRADE_2),
    CONSUMERFIRMWARE(ItemGrade.GRADE_2),

    EMISSIONDATA(ItemGrade.GRADE_3),
    WAKESOLUTIONS(ItemGrade.GRADE_3),
    SHIELDDENSITYREPORTS(ItemGrade.GRADE_3),
    SYMMETRICKEYS(ItemGrade.GRADE_3),
    SCANDATABANKS(ItemGrade.GRADE_3),
    INDUSTRIALFIRMWARE(ItemGrade.GRADE_3),

    DECODEDEMISSIONDATA(ItemGrade.GRADE_4),
    HYPERSPACETRAJECTORIES(ItemGrade.GRADE_4),
    SHIELDPATTERNANALYSIS(ItemGrade.GRADE_4),
    ENCRYPTIONARCHIVES(ItemGrade.GRADE_4),
    ENCODEDSCANDATA(ItemGrade.GRADE_4),
    SECURITYFIRMWARE(ItemGrade.GRADE_4),

    COMPACTEMISSIONSDATA(ItemGrade.GRADE_5),
    DATAMINEDWAKE(ItemGrade.GRADE_5),
    SHIELDFREQUENCYDATA(ItemGrade.GRADE_5),
    ADAPTIVEENCRYPTORS(ItemGrade.GRADE_5),
    CLASSIFIEDSCANDATA(ItemGrade.GRADE_5),
    EMBEDDEDFIRMWARE(ItemGrade.GRADE_5),


    //Alien Manufactured:,
    //-----,

    Guardian_Power_Cell(ItemGrade.GRADE_1),
    Guardian_Sentinel_Wreckage_Components(ItemGrade.GRADE_1),
    Guardian_Power_Conduit(ItemGrade.GRADE_2),
    Guardian_Sentinel_Weapon_Parts(ItemGrade.GRADE_3),
    Guardian_Technology_Component(ItemGrade.GRADE_3),

    Thargoid_Carapace(ItemGrade.GRADE_2),
    Bio_Mechanical_Conduits(ItemGrade.GRADE_3),
    Propulsion_Elements(ItemGrade.GRADE_3),
    Thargoid_Energy_Cell(ItemGrade.GRADE_3),
    Weapon_Parts(ItemGrade.GRADE_3),
    Wreckage_Components(ItemGrade.GRADE_3),
    Thargoid_Technological_Components(ItemGrade.GRADE_4),
    Sensor_Fragment(ItemGrade.GRADE_5),
    Thargoid_Organic_Circuitry(ItemGrade.GRADE_5),


    //Alien ENCODED:,
    //-----,

    Pattern_Gamma_Obelisk_Data(ItemGrade.GRADE_1),
    Pattern_Beta_Obelisk_Data(ItemGrade.GRADE_2),
    Pattern_Alpha_Obelisk_Data(ItemGrade.GRADE_3),
    Pattern_Delta_Obelisk_Data(ItemGrade.GRADE_4),
    Pattern_Epsilon_Obelisk_Data(ItemGrade.GRADE_5),
    Guardian_Module_Blueprint_Segment(ItemGrade.GRADE_4),
    Guardian_Vessel_Blueprint_Segment(ItemGrade.GRADE_4),
    Guardian_Weapon_Blueprint_Segment(ItemGrade.GRADE_4),

    Thargoid_Structural_Data(ItemGrade.GRADE_2),
    Ship_Flight_Data(ItemGrade.GRADE_3),
    Ship_Systems_Data(ItemGrade.GRADE_3),
    Thargoid_Material_Composition_Data(ItemGrade.GRADE_3),
    Thargoid_Ship_Signature(ItemGrade.GRADE_3),
    Thargoid_Residue_Data(ItemGrade.GRADE_4),
    Thargoid_Wake_Data(ItemGrade.GRADE_4);

    private final ItemGrade grade;
    private String localizedName = toString();

    Material(ItemGrade grade)
    {
        this.grade = grade;
    }

    public ItemGrade getGrade()
    {
        return grade;
    }

    public void setLocalizedName(String localizedName)
    {
        this.localizedName = localizedName;
    }

    public String getLocalizedName()
    {
        return localizedName;
    }
}
