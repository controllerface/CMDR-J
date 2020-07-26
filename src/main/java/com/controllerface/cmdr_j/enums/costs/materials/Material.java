package com.controllerface.cmdr_j.enums.costs.materials;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.MaterialTradeRecipe;
import com.controllerface.cmdr_j.classes.tasks.*;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * An enumeration of all the crafting materials in Elite: Dangerous
 *
 * Created by Controllerface on 3/20/2018.
 */
public enum Material implements TaskCost
{
    // RAW

    CARBON(ItemGrade.VERY_COMMON, UIFunctions.Icons.rawTradeIcon),
    PHOSPHORUS(ItemGrade.VERY_COMMON, UIFunctions.Icons.rawTradeIcon),
    SULPHUR(ItemGrade.VERY_COMMON, UIFunctions.Icons.rawTradeIcon),
    IRON(ItemGrade.VERY_COMMON, UIFunctions.Icons.rawTradeIcon),
    NICKEL(ItemGrade.VERY_COMMON, UIFunctions.Icons.rawTradeIcon),
    RHENIUM(ItemGrade.VERY_COMMON, UIFunctions.Icons.rawTradeIcon),
    LEAD(ItemGrade.VERY_COMMON, UIFunctions.Icons.rawTradeIcon),


    VANADIUM(ItemGrade.COMMON, UIFunctions.Icons.rawTradeIcon),
    CHROMIUM(ItemGrade.COMMON, UIFunctions.Icons.rawTradeIcon),
    MANGANESE(ItemGrade.COMMON, UIFunctions.Icons.rawTradeIcon),
    ZINC(ItemGrade.COMMON, UIFunctions.Icons.rawTradeIcon),
    GERMANIUM(ItemGrade.COMMON, UIFunctions.Icons.rawTradeIcon),
    ARSENIC(ItemGrade.COMMON, UIFunctions.Icons.rawTradeIcon),
    ZIRCONIUM(ItemGrade.COMMON, UIFunctions.Icons.rawTradeIcon),

    NIOBIUM(ItemGrade.STANDARD, UIFunctions.Icons.rawTradeIcon),
    MOLYBDENUM(ItemGrade.STANDARD, UIFunctions.Icons.rawTradeIcon),
    CADMIUM(ItemGrade.STANDARD, UIFunctions.Icons.rawTradeIcon),
    TIN(ItemGrade.STANDARD, UIFunctions.Icons.rawTradeIcon),
    TUNGSTEN(ItemGrade.STANDARD, UIFunctions.Icons.rawTradeIcon),
    MERCURY(ItemGrade.STANDARD, UIFunctions.Icons.rawTradeIcon),
    BORON(ItemGrade.STANDARD, UIFunctions.Icons.rawTradeIcon),

    YTTRIUM(ItemGrade.RARE, UIFunctions.Icons.rawTradeIcon),
    TECHNETIUM(ItemGrade.RARE, UIFunctions.Icons.rawTradeIcon),
    RUTHENIUM(ItemGrade.RARE, UIFunctions.Icons.rawTradeIcon),
    SELENIUM(ItemGrade.RARE, UIFunctions.Icons.rawTradeIcon),
    TELLURIUM(ItemGrade.RARE, UIFunctions.Icons.rawTradeIcon),
    POLONIUM(ItemGrade.RARE, UIFunctions.Icons.rawTradeIcon),
    ANTIMONY(ItemGrade.RARE, UIFunctions.Icons.rawTradeIcon),


    // Manufactured

    CHEMICALSTORAGEUNITS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    TEMPEREDALLOYS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    HEATCONDUCTIONWIRING(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    BASICCONDUCTORS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    MECHANICALSCRAP(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    GRIDRESISTORS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    WORNSHIELDEMITTERS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    COMPACTCOMPOSITES(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    CRYSTALSHARDS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    SALVAGEDALLOYS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),

    CHEMICALPROCESSORS(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    HEATRESISTANTCERAMICS(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    HEATDISPERSIONPLATE(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    CONDUCTIVECOMPONENTS(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    MECHANICALEQUIPMENT(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    HYBRIDCAPACITORS(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    SHIELDEMITTERS(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    FILAMENTCOMPOSITES(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    UNCUTFOCUSCRYSTALS(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    GALVANISINGALLOYS(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),

    CHEMICALDISTILLERY(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    PRECIPITATEDALLOYS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    HEATEXCHANGERS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    CONDUCTIVECERAMICS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    MECHANICALCOMPONENTS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    ELECTROCHEMICALARRAYS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    SHIELDINGSENSORS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    HIGHDENSITYCOMPOSITES(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    FOCUSCRYSTALS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    PHASEALLOYS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),

    CHEMICALMANIPULATORS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    THERMICALLOYS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    HEATVANES(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    CONDUCTIVEPOLYMERS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    CONFIGURABLECOMPONENTS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    POLYMERCAPACITORS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    COMPOUNDSHIELDING(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    FEDPROPRIETARYCOMPOSITES(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    REFINEDFOCUSCRYSTALS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    PROTOLIGHTALLOYS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),

    PHARMACEUTICALISOLATORS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    MILITARYGRADEALLOYS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    PROTOHEATRADIATORS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    BIOTECHCONDUCTORS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    IMPROVISEDCOMPONENTS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    MILITARYSUPERCAPACITORS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    IMPERIALSHIELDING(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    FEDCORECOMPOSITES(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    EXQUISITEFOCUSCRYSTALS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    PROTORADIOLICALLOYS(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),


    // Encoded

    SCRAMBLEDEMISSIONDATA(ItemGrade.VERY_COMMON, UIFunctions.Icons.dataTradeIcon),
    DISRUPTEDWAKEECHOES(ItemGrade.VERY_COMMON, UIFunctions.Icons.dataTradeIcon),
    SHIELDCYCLERECORDINGS(ItemGrade.VERY_COMMON, UIFunctions.Icons.dataTradeIcon),
    ENCRYPTEDFILES(ItemGrade.VERY_COMMON, UIFunctions.Icons.dataTradeIcon),
    BULKSCANDATA(ItemGrade.VERY_COMMON, UIFunctions.Icons.dataTradeIcon),
    LEGACYFIRMWARE(ItemGrade.VERY_COMMON, UIFunctions.Icons.dataTradeIcon),

    ARCHIVEDEMISSIONDATA(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon),
    FSDTELEMETRY(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon),
    SHIELDSOAKANALYSIS(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon),
    ENCRYPTIONCODES(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon),
    SCANARCHIVES(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon),
    CONSUMERFIRMWARE(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon),

    EMISSIONDATA(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    WAKESOLUTIONS(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    SHIELDDENSITYREPORTS(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    SYMMETRICKEYS(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    SCANDATABANKS(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    INDUSTRIALFIRMWARE(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),

    DECODEDEMISSIONDATA(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    HYPERSPACETRAJECTORIES(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    SHIELDPATTERNANALYSIS(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    ENCRYPTIONARCHIVES(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    ENCODEDSCANDATA(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    SECURITYFIRMWARE(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),

    COMPACTEMISSIONSDATA(ItemGrade.VERY_RARE, UIFunctions.Icons.dataTradeIcon),
    DATAMINEDWAKE(ItemGrade.VERY_RARE, UIFunctions.Icons.dataTradeIcon),
    SHIELDFREQUENCYDATA(ItemGrade.VERY_RARE, UIFunctions.Icons.dataTradeIcon),
    ADAPTIVEENCRYPTORS(ItemGrade.VERY_RARE, UIFunctions.Icons.dataTradeIcon),
    CLASSIFIEDSCANDATA(ItemGrade.VERY_RARE, UIFunctions.Icons.dataTradeIcon),
    EMBEDDEDFIRMWARE(ItemGrade.VERY_RARE, UIFunctions.Icons.dataTradeIcon),


    // Alien Manufactured

    GUARDIAN_POWERCELL(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    GUARDIAN_SENTINEL_WRECKAGECOMPONENTS(ItemGrade.VERY_COMMON, UIFunctions.Icons.mfdTradeIcon),
    GUARDIAN_POWERCONDUIT(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    GUARDIAN_SENTINEL_WEAPONPARTS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    GUARDIAN_TECHCOMPONENT(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),

    UNKNOWNCARAPACE(ItemGrade.COMMON, UIFunctions.Icons.mfdTradeIcon),
    UNKNOWNENERGYCELL(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    UNKNOWNTECHNOLOGYCOMPONENTS(ItemGrade.RARE, UIFunctions.Icons.mfdTradeIcon),
    UNKNOWNENERGYSOURCE(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    UNKNOWNORGANICCIRCUITRY(ItemGrade.VERY_RARE, UIFunctions.Icons.mfdTradeIcon),
    TG_BIOMECHANICALCONDUITS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    TG_PROPULSIONELEMENT(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    TG_WEAPONPARTS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),
    TG_WRECKAGECOMPONENTS(ItemGrade.STANDARD, UIFunctions.Icons.mfdTradeIcon),


    // Alien Encoded

    ANCIENTHISTORICALDATA(ItemGrade.VERY_COMMON, UIFunctions.Icons.dataTradeIcon), // gamma
    ANCIENTCULTURALDATA(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon), // beta
    ANCIENTBIOLOGICALDATA(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon), // alpha
    ANCIENTLANGUAGEDATA(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon), // delta
    ANCIENTTECHNOLOGICALDATA(ItemGrade.VERY_RARE, UIFunctions.Icons.dataTradeIcon), // epsilon
    GUARDIAN_MODULEBLUEPRINT(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    GUARDIAN_VESSELBLUEPRINT(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    GUARDIAN_WEAPONBLUEPRINT(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),

    UNKNOWNSHIPSIGNATURE(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    UNKNOWNWAKEDATA(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon),
    TG_STRUCTURALDATA(ItemGrade.COMMON, UIFunctions.Icons.dataTradeIcon),
    TG_SHIPFLIGHTDATA(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    TG_SHIPSYSTEMSDATA(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    TG_COMPOSITIONDATA(ItemGrade.STANDARD, UIFunctions.Icons.dataTradeIcon),
    TG_RESIDUEDATA(ItemGrade.RARE, UIFunctions.Icons.dataTradeIcon);

    private final ItemGrade grade;
    private String localizedName = toString();
    private String locationInformation;
    private final List<TaskRecipe> associated = new ArrayList<>();

    private final List<Pair<CostData, Integer>> tradeCosts = new ArrayList<>();

    private final Icon icon;

    Material(ItemGrade grade, Icon icon)
    {
        this.locationInformation = name();
        this.grade = grade;
        this.icon = icon;
    }

    public Icon getIcon()
    {
        return icon;
    }

    // used to add a cost of some other material which can be paid to procure some number of this material in trade
    public void addTradeCost(CostData tradeCost, int count)
    {
        tradeCosts.add(new Pair<>(tradeCost, -1 * count));
    }

    public Optional<TaskBlueprint> getTradeBlueprint()
    {
        if (tradeCosts.isEmpty()) return Optional.empty();

        List<TaskRecipe> tradeRecipes = tradeCosts.stream()
                .map(c->new MaterialTradeRecipe(c.getKey(), new CostData(this, c.getValue())))
                .collect(Collectors.toList());

        return Optional.of(new MaterialTradeBlueprint(this, tradeRecipes));
    }

    public void setLocationInformation(String locationInformation)
    {
        this.locationInformation = locationInformation;
    }

    @Override
    public List<TaskRecipe> getAssociated()
    {
        return associated;
    }

    @Override
    public void associate(TaskRecipe recipe)
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
