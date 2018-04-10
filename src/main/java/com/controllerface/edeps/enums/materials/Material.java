package com.controllerface.edeps.enums.materials;

/**
 * An enumeration of all the crafting materials in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum Material
{
    //RAW:,
    //----,

    CARBON(MaterialGrade.GRADE_1),
    PHOSPHORUS(MaterialGrade.GRADE_1),
    SULPHUR(MaterialGrade.GRADE_1),
    IRON(MaterialGrade.GRADE_1),
    NICKEL(MaterialGrade.GRADE_1),
    RHENIUM(MaterialGrade.GRADE_1),
    LEAD(MaterialGrade.GRADE_1),


    VANADIUM(MaterialGrade.GRADE_2),
    CHROMIUM(MaterialGrade.GRADE_2),
    MANGANESE(MaterialGrade.GRADE_2),
    ZINC(MaterialGrade.GRADE_2),
    GERMANIUM(MaterialGrade.GRADE_2),
    ARSENIC(MaterialGrade.GRADE_2),
    ZIRCONIUM(MaterialGrade.GRADE_2),

    NIOBIUM(MaterialGrade.GRADE_3),
    MOLYBDENUM(MaterialGrade.GRADE_3),
    CADMIUM(MaterialGrade.GRADE_3),
    TIN(MaterialGrade.GRADE_3),
    TUNGSTEN(MaterialGrade.GRADE_3),
    MERCURY(MaterialGrade.GRADE_3),
    BORON(MaterialGrade.GRADE_3),

    YTTRIUM(MaterialGrade.GRADE_4),
    TECHNETIUM(MaterialGrade.GRADE_4),
    RUTHENIUM(MaterialGrade.GRADE_4),
    SELENIUM(MaterialGrade.GRADE_4),
    TELLURIUM(MaterialGrade.GRADE_4),
    POLONIUM(MaterialGrade.GRADE_4),
    ANTIMONY(MaterialGrade.GRADE_4),

    //Manufactured:,
    //-------------,

    CHEMICALSTORAGEUNITS(MaterialGrade.GRADE_1),
    TEMPEREDALLOYS(MaterialGrade.GRADE_1),
    HEATCONDUCTIONWIRING(MaterialGrade.GRADE_1),
    BASICCONDUCTORS(MaterialGrade.GRADE_1),
    MECHANICALSCRAP(MaterialGrade.GRADE_1),
    GRIDRESISTORS(MaterialGrade.GRADE_1),
    WORNSHIELDEMITTERS(MaterialGrade.GRADE_1),
    COMPACTCOMPOSITES(MaterialGrade.GRADE_1),
    CRYSTALSHARDS(MaterialGrade.GRADE_1),
    SALVAGEDALLOYS(MaterialGrade.GRADE_1),

    CHEMICALPROCESSORS(MaterialGrade.GRADE_2),
    HEATRESISTANTCERAMICS(MaterialGrade.GRADE_2),
    HEATDISPERSIONPLATE(MaterialGrade.GRADE_2),
    CONDUCTIVECOMPONENTS(MaterialGrade.GRADE_2),
    MECHANICALEQUIPMENT(MaterialGrade.GRADE_2),
    HYBRIDCAPACITORS(MaterialGrade.GRADE_2),
    SHIELDEMITTERS(MaterialGrade.GRADE_2),
    FILAMENTCOMPOSITES(MaterialGrade.GRADE_2),
    UNCUTFOCUSCRYSTALS(MaterialGrade.GRADE_2),
    GALVANISINGALLOYS(MaterialGrade.GRADE_2),

    CHEMICALDISTILLERY(MaterialGrade.GRADE_3),
    PRECIPITATEDALLOYS(MaterialGrade.GRADE_3),
    HEATEXCHANGERS(MaterialGrade.GRADE_3),
    CONDUCTIVECERAMICS(MaterialGrade.GRADE_3),
    MECHANICALCOMPONENTS(MaterialGrade.GRADE_3),
    ELECTROCHEMICALARRAYS(MaterialGrade.GRADE_3),
    SHIELDINGSENSORS(MaterialGrade.GRADE_3),
    HIGHDENSITYCOMPOSITES(MaterialGrade.GRADE_3),
    FOCUSCRYSTALS(MaterialGrade.GRADE_3),
    PHASEALLOYS(MaterialGrade.GRADE_3),

    CHEMICALMANIPULATORS(MaterialGrade.GRADE_4),
    THERMICALLOYS(MaterialGrade.GRADE_4),
    HEATVANES(MaterialGrade.GRADE_4),
    CONDUCTIVEPOLYMERS(MaterialGrade.GRADE_4),
    CONFIGURABLECOMPONENTS(MaterialGrade.GRADE_4),
    POLYMERCAPACITORS(MaterialGrade.GRADE_4),
    COMPOUNDSHIELDING(MaterialGrade.GRADE_4),
    FEDPROPRIETARYCOMPOSITES(MaterialGrade.GRADE_4),
    REFINEDFOCUSCRYSTALS(MaterialGrade.GRADE_4),
    PROTOLIGHTALLOYS(MaterialGrade.GRADE_4),

    PHARMACEUTICALISOLATORS(MaterialGrade.GRADE_5),
    MILITARYGRADEALLOYS(MaterialGrade.GRADE_5),
    PROTOHEATRADIATORS(MaterialGrade.GRADE_5),
    BIOTECHCONDUCTORS(MaterialGrade.GRADE_5),
    IMPROVISEDCOMPONENTS(MaterialGrade.GRADE_5),
    MILITARYSUPERCAPACITORS(MaterialGrade.GRADE_5),
    IMPERIALSHIELDING(MaterialGrade.GRADE_5),
    FEDCORECOMPOSITES(MaterialGrade.GRADE_5),
    EXQUISITEFOCUSCRYSTALS(MaterialGrade.GRADE_5),
    PROTORADIOLICALLOYS(MaterialGrade.GRADE_5),


    //ENCODED:,
    //-----,

    SCRAMBLEDEMISSIONDATA(MaterialGrade.GRADE_1),
    DISRUPTEDWAKEECHOES(MaterialGrade.GRADE_1),
    SHIELDCYCLERECORDINGS(MaterialGrade.GRADE_1),
    ENCRYPTEDFILES(MaterialGrade.GRADE_1),
    BULKSCANDATA(MaterialGrade.GRADE_1),
    LEGACYFIRMWARE(MaterialGrade.GRADE_1),

    ARCHIVEDEMISSIONDATA(MaterialGrade.GRADE_2),
    FSDTELEMETRY(MaterialGrade.GRADE_2),
    SHIELDSOAKANALYSIS(MaterialGrade.GRADE_2),
    ENCRYPTIONCODES(MaterialGrade.GRADE_2),
    SCANARCHIVES(MaterialGrade.GRADE_2),
    CONSUMERFIRMWARE(MaterialGrade.GRADE_2),

    EMISSIONDATA(MaterialGrade.GRADE_3),
    WAKESOLUTIONS(MaterialGrade.GRADE_3),
    SHIELDDENSITYREPORTS(MaterialGrade.GRADE_3),
    SYMMETRICKEYS(MaterialGrade.GRADE_3),
    SCANDATABANKS(MaterialGrade.GRADE_3),
    INDUSTRIALFIRMWARE(MaterialGrade.GRADE_3),

    DECODEDEMISSIONDATA(MaterialGrade.GRADE_4),
    HYPERSPACETRAJECTORIES(MaterialGrade.GRADE_4),
    SHIELDPATTERNANALYSIS(MaterialGrade.GRADE_4),
    ENCRYPTIONARCHIVES(MaterialGrade.GRADE_4),
    ENCODEDSCANDATA(MaterialGrade.GRADE_4),
    SECURITYFIRMWARE(MaterialGrade.GRADE_4),

    COMPACTEMISSIONSDATA(MaterialGrade.GRADE_5),
    DATAMINEDWAKE(MaterialGrade.GRADE_5),
    SHIELDFREQUENCYDATA(MaterialGrade.GRADE_5),
    ADAPTIVEENCRYPTORS(MaterialGrade.GRADE_5),
    CLASSIFIEDSCANDATA(MaterialGrade.GRADE_5),
    EMBEDDEDFIRMWARE(MaterialGrade.GRADE_5),


    //Alien Manufactured:,
    //-----,

    Guardian_Power_Cell(MaterialGrade.GRADE_1),
    Guardian_Sentinel_Wreckage_Components(MaterialGrade.GRADE_1),
    Guardian_Power_Conduit(MaterialGrade.GRADE_2),
    Guardian_Sentinel_Weapon_Parts(MaterialGrade.GRADE_3),
    Guardian_Technology_Component(MaterialGrade.GRADE_3),

    Thargoid_Carapace(MaterialGrade.GRADE_2),
    Bio_Mechanical_Conduits(MaterialGrade.GRADE_3),
    Propulsion_Elements(MaterialGrade.GRADE_3),
    Thargoid_Energy_Cell(MaterialGrade.GRADE_3),
    Weapon_Parts(MaterialGrade.GRADE_3),
    Wreckage_Components(MaterialGrade.GRADE_3),
    Thargoid_Technological_Components(MaterialGrade.GRADE_4),
    Sensor_Fragment(MaterialGrade.GRADE_5),
    Thargoid_Organic_Circuitry(MaterialGrade.GRADE_5),


    //Alien ENCODED:,
    //-----,

    Pattern_Gamma_Obelisk_Data(MaterialGrade.GRADE_1),
    Pattern_Beta_Obelisk_Data(MaterialGrade.GRADE_2),
    Pattern_Alpha_Obelisk_Data(MaterialGrade.GRADE_3),
    Pattern_Delta_Obelisk_Data(MaterialGrade.GRADE_4),
    Pattern_Epsilon_Obelisk_Data(MaterialGrade.GRADE_5),
    Guardian_Module_Blueprint_Segment(MaterialGrade.GRADE_4),
    Guardian_Vessel_Blueprint_Segment(MaterialGrade.GRADE_4),
    Guardian_Weapon_Blueprint_Segment(MaterialGrade.GRADE_4),

    Thargoid_Structural_Data(MaterialGrade.GRADE_2),
    Ship_Flight_Data(MaterialGrade.GRADE_3),
    Ship_Systems_Data(MaterialGrade.GRADE_3),
    Thargoid_Material_Composition_Data(MaterialGrade.GRADE_3),
    Thargoid_Ship_Signature(MaterialGrade.GRADE_3),
    Thargoid_Residue_Data(MaterialGrade.GRADE_4),
    Thargoid_Wake_Data(MaterialGrade.GRADE_4),
;

    private MaterialType type;
    private final MaterialGrade grade;
    private String localizedName = toString();

    Material(MaterialGrade grade)
    {
        this.grade = grade;
    }

    public MaterialGrade getGrade()
    {
        return grade;
    }

    public void setType(MaterialType type)
    {
        this.type = type;
    }

    public MaterialType getType()
    {
        return type;
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
