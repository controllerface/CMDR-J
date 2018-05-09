package com.controllerface.edeps.structures.costs.materials;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.structures.equipment.ItemGrade;

import java.util.ArrayList;
import java.util.List;

/**
 * An enumeration of all the crafting materials in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum Material implements ProcurementCost
{
    // RAW

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


    // Manufactured

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


    // Encoded

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


    // Alien Manufactured

    GUARDIAN_POWERCELL(ItemGrade.GRADE_1),
    GUARDIAN_SENTINEL_WRECKAGECOMPONENTS(ItemGrade.GRADE_1),
    GUARDIAN_POWERCONDUIT(ItemGrade.GRADE_2),
    GUARDIAN_SENTINEL_WEAPONPARTS(ItemGrade.GRADE_3),
    GUARDIAN_TECHCOMPONENT(ItemGrade.GRADE_3),

    UNKNOWNCARAPACE(ItemGrade.GRADE_2),
    UNKNOWNENERGYCELL(ItemGrade.GRADE_3),
    UNKNOWNTECHNOLOGYCOMPONENTS(ItemGrade.GRADE_4),
    UNKNOWNENERGYSOURCE(ItemGrade.GRADE_5),
    UNKNOWNORGANICCIRCUITRY(ItemGrade.GRADE_5),
    TG_BIOMECHANICALCONDUITS(ItemGrade.GRADE_3),
    TG_PROPULSIONELEMENT(ItemGrade.GRADE_3),
    TG_WEAPONPARTS(ItemGrade.GRADE_3),
    TG_WRECKAGECOMPONENTS(ItemGrade.GRADE_3),


    // Alien Encoded

    ANCIENTHISTORICALDATA(ItemGrade.GRADE_1), // gamma
    ANCIENTCULTURALDATA(ItemGrade.GRADE_2), // beta
    ANCIENTBIOLOGICALDATA(ItemGrade.GRADE_3), // alpha
    ANCIENTLANGUAGEDATA(ItemGrade.GRADE_4), // delta
    ANCIENTTECHNOLOGICALDATA(ItemGrade.GRADE_5), // epsilon
    GUARDIAN_MODULEBLUEPRINT(ItemGrade.GRADE_4),
    GUARDIAN_VESSELBLUEPRINT(ItemGrade.GRADE_4),
    GUARDIAN_WEAPONBLUEPRINT(ItemGrade.GRADE_4),

    UNKNOWNSHIPSIGNATURE(ItemGrade.GRADE_3),
    UNKNOWNWAKEDATA(ItemGrade.GRADE_4),
    TG_STRUCTURALDATA(ItemGrade.GRADE_2),
    TG_SHIPFLIGHTDATA(ItemGrade.GRADE_3),
    TG_SHIPSYSTEMSDATA(ItemGrade.GRADE_3),
    TG_COMPOSITIONDATA(ItemGrade.GRADE_3),
    TG_RESIDUEDATA(ItemGrade.GRADE_4);

    private final ItemGrade grade;
    private String localizedName = toString();
    private String locationInformation;
    private final List<ProcurementRecipe> associated = new ArrayList<>();

    Material(ItemGrade grade)
    {
        this.locationInformation = name();
        this.grade = grade;
    }

    public void setLocationInformation(String locationInformation)
    {
        this.locationInformation = locationInformation;
    }

    @Override
    public List<ProcurementRecipe> getAssociated()
    {
        return associated;
    }

    @Override
    public void associate(ProcurementRecipe recipe)
    {
        associated.add(recipe);
    }

    @Override
    public String getLocationInformation()
    {
        return locationInformation;
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
