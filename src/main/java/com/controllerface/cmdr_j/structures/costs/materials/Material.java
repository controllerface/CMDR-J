package com.controllerface.cmdr_j.structures.costs.materials;

import com.controllerface.cmdr_j.ProcurementBlueprint;
import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.data.MaterialTradeRecipe;
import com.controllerface.cmdr_j.data.procurements.CostData;
import com.controllerface.cmdr_j.data.procurements.MaterialTradeBlueprint;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;
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
public enum Material implements ProcurementCost
{
    // RAW

    CARBON(ItemGrade.VERY_COMMON),
    PHOSPHORUS(ItemGrade.VERY_COMMON),
    SULPHUR(ItemGrade.VERY_COMMON),
    IRON(ItemGrade.VERY_COMMON),
    NICKEL(ItemGrade.VERY_COMMON),
    RHENIUM(ItemGrade.VERY_COMMON),
    LEAD(ItemGrade.VERY_COMMON),


    VANADIUM(ItemGrade.COMMON),
    CHROMIUM(ItemGrade.COMMON),
    MANGANESE(ItemGrade.COMMON),
    ZINC(ItemGrade.COMMON),
    GERMANIUM(ItemGrade.COMMON),
    ARSENIC(ItemGrade.COMMON),
    ZIRCONIUM(ItemGrade.COMMON),

    NIOBIUM(ItemGrade.STANDARD),
    MOLYBDENUM(ItemGrade.STANDARD),
    CADMIUM(ItemGrade.STANDARD),
    TIN(ItemGrade.STANDARD),
    TUNGSTEN(ItemGrade.STANDARD),
    MERCURY(ItemGrade.STANDARD),
    BORON(ItemGrade.STANDARD),

    YTTRIUM(ItemGrade.RARE),
    TECHNETIUM(ItemGrade.RARE),
    RUTHENIUM(ItemGrade.RARE),
    SELENIUM(ItemGrade.RARE),
    TELLURIUM(ItemGrade.RARE),
    POLONIUM(ItemGrade.RARE),
    ANTIMONY(ItemGrade.RARE),


    // Manufactured

    CHEMICALSTORAGEUNITS(ItemGrade.VERY_COMMON),
    TEMPEREDALLOYS(ItemGrade.VERY_COMMON),
    HEATCONDUCTIONWIRING(ItemGrade.VERY_COMMON),
    BASICCONDUCTORS(ItemGrade.VERY_COMMON),
    MECHANICALSCRAP(ItemGrade.VERY_COMMON),
    GRIDRESISTORS(ItemGrade.VERY_COMMON),
    WORNSHIELDEMITTERS(ItemGrade.VERY_COMMON),
    COMPACTCOMPOSITES(ItemGrade.VERY_COMMON),
    CRYSTALSHARDS(ItemGrade.VERY_COMMON),
    SALVAGEDALLOYS(ItemGrade.VERY_COMMON),

    CHEMICALPROCESSORS(ItemGrade.COMMON),
    HEATRESISTANTCERAMICS(ItemGrade.COMMON),
    HEATDISPERSIONPLATE(ItemGrade.COMMON),
    CONDUCTIVECOMPONENTS(ItemGrade.COMMON),
    MECHANICALEQUIPMENT(ItemGrade.COMMON),
    HYBRIDCAPACITORS(ItemGrade.COMMON),
    SHIELDEMITTERS(ItemGrade.COMMON),
    FILAMENTCOMPOSITES(ItemGrade.COMMON),
    UNCUTFOCUSCRYSTALS(ItemGrade.COMMON),
    GALVANISINGALLOYS(ItemGrade.COMMON),

    CHEMICALDISTILLERY(ItemGrade.STANDARD),
    PRECIPITATEDALLOYS(ItemGrade.STANDARD),
    HEATEXCHANGERS(ItemGrade.STANDARD),
    CONDUCTIVECERAMICS(ItemGrade.STANDARD),
    MECHANICALCOMPONENTS(ItemGrade.STANDARD),
    ELECTROCHEMICALARRAYS(ItemGrade.STANDARD),
    SHIELDINGSENSORS(ItemGrade.STANDARD),
    HIGHDENSITYCOMPOSITES(ItemGrade.STANDARD),
    FOCUSCRYSTALS(ItemGrade.STANDARD),
    PHASEALLOYS(ItemGrade.STANDARD),

    CHEMICALMANIPULATORS(ItemGrade.RARE),
    THERMICALLOYS(ItemGrade.RARE),
    HEATVANES(ItemGrade.RARE),
    CONDUCTIVEPOLYMERS(ItemGrade.RARE),
    CONFIGURABLECOMPONENTS(ItemGrade.RARE),
    POLYMERCAPACITORS(ItemGrade.RARE),
    COMPOUNDSHIELDING(ItemGrade.RARE),
    FEDPROPRIETARYCOMPOSITES(ItemGrade.RARE),
    REFINEDFOCUSCRYSTALS(ItemGrade.RARE),
    PROTOLIGHTALLOYS(ItemGrade.RARE),

    PHARMACEUTICALISOLATORS(ItemGrade.VERY_RARE),
    MILITARYGRADEALLOYS(ItemGrade.VERY_RARE),
    PROTOHEATRADIATORS(ItemGrade.VERY_RARE),
    BIOTECHCONDUCTORS(ItemGrade.VERY_RARE),
    IMPROVISEDCOMPONENTS(ItemGrade.VERY_RARE),
    MILITARYSUPERCAPACITORS(ItemGrade.VERY_RARE),
    IMPERIALSHIELDING(ItemGrade.VERY_RARE),
    FEDCORECOMPOSITES(ItemGrade.VERY_RARE),
    EXQUISITEFOCUSCRYSTALS(ItemGrade.VERY_RARE),
    PROTORADIOLICALLOYS(ItemGrade.VERY_RARE),


    // Encoded

    SCRAMBLEDEMISSIONDATA(ItemGrade.VERY_COMMON),
    DISRUPTEDWAKEECHOES(ItemGrade.VERY_COMMON),
    SHIELDCYCLERECORDINGS(ItemGrade.VERY_COMMON),
    ENCRYPTEDFILES(ItemGrade.VERY_COMMON),
    BULKSCANDATA(ItemGrade.VERY_COMMON),
    LEGACYFIRMWARE(ItemGrade.VERY_COMMON),

    ARCHIVEDEMISSIONDATA(ItemGrade.COMMON),
    FSDTELEMETRY(ItemGrade.COMMON),
    SHIELDSOAKANALYSIS(ItemGrade.COMMON),
    ENCRYPTIONCODES(ItemGrade.COMMON),
    SCANARCHIVES(ItemGrade.COMMON),
    CONSUMERFIRMWARE(ItemGrade.COMMON),

    EMISSIONDATA(ItemGrade.STANDARD),
    WAKESOLUTIONS(ItemGrade.STANDARD),
    SHIELDDENSITYREPORTS(ItemGrade.STANDARD),
    SYMMETRICKEYS(ItemGrade.STANDARD),
    SCANDATABANKS(ItemGrade.STANDARD),
    INDUSTRIALFIRMWARE(ItemGrade.STANDARD),

    DECODEDEMISSIONDATA(ItemGrade.RARE),
    HYPERSPACETRAJECTORIES(ItemGrade.RARE),
    SHIELDPATTERNANALYSIS(ItemGrade.RARE),
    ENCRYPTIONARCHIVES(ItemGrade.RARE),
    ENCODEDSCANDATA(ItemGrade.RARE),
    SECURITYFIRMWARE(ItemGrade.RARE),

    COMPACTEMISSIONSDATA(ItemGrade.VERY_RARE),
    DATAMINEDWAKE(ItemGrade.VERY_RARE),
    SHIELDFREQUENCYDATA(ItemGrade.VERY_RARE),
    ADAPTIVEENCRYPTORS(ItemGrade.VERY_RARE),
    CLASSIFIEDSCANDATA(ItemGrade.VERY_RARE),
    EMBEDDEDFIRMWARE(ItemGrade.VERY_RARE),


    // Alien Manufactured

    GUARDIAN_POWERCELL(ItemGrade.VERY_COMMON),
    GUARDIAN_SENTINEL_WRECKAGECOMPONENTS(ItemGrade.VERY_COMMON),
    GUARDIAN_POWERCONDUIT(ItemGrade.COMMON),
    GUARDIAN_SENTINEL_WEAPONPARTS(ItemGrade.STANDARD),
    GUARDIAN_TECHCOMPONENT(ItemGrade.STANDARD),

    UNKNOWNCARAPACE(ItemGrade.COMMON),
    UNKNOWNENERGYCELL(ItemGrade.STANDARD),
    UNKNOWNTECHNOLOGYCOMPONENTS(ItemGrade.RARE),
    UNKNOWNENERGYSOURCE(ItemGrade.VERY_RARE),
    UNKNOWNORGANICCIRCUITRY(ItemGrade.VERY_RARE),
    TG_BIOMECHANICALCONDUITS(ItemGrade.STANDARD),
    TG_PROPULSIONELEMENT(ItemGrade.STANDARD),
    TG_WEAPONPARTS(ItemGrade.STANDARD),
    TG_WRECKAGECOMPONENTS(ItemGrade.STANDARD),


    // Alien Encoded

    ANCIENTHISTORICALDATA(ItemGrade.VERY_COMMON), // gamma
    ANCIENTCULTURALDATA(ItemGrade.COMMON), // beta
    ANCIENTBIOLOGICALDATA(ItemGrade.STANDARD), // alpha
    ANCIENTLANGUAGEDATA(ItemGrade.RARE), // delta
    ANCIENTTECHNOLOGICALDATA(ItemGrade.VERY_RARE), // epsilon
    GUARDIAN_MODULEBLUEPRINT(ItemGrade.RARE),
    GUARDIAN_VESSELBLUEPRINT(ItemGrade.RARE),
    GUARDIAN_WEAPONBLUEPRINT(ItemGrade.RARE),

    UNKNOWNSHIPSIGNATURE(ItemGrade.STANDARD),
    UNKNOWNWAKEDATA(ItemGrade.RARE),
    TG_STRUCTURALDATA(ItemGrade.COMMON),
    TG_SHIPFLIGHTDATA(ItemGrade.STANDARD),
    TG_SHIPSYSTEMSDATA(ItemGrade.STANDARD),
    TG_COMPOSITIONDATA(ItemGrade.STANDARD),
    TG_RESIDUEDATA(ItemGrade.RARE);

    private final ItemGrade grade;
    private String localizedName = toString();
    private String locationInformation;
    private final List<ProcurementRecipe> associated = new ArrayList<>();

    private final List<Pair<CostData, Integer>> tradeCosts = new ArrayList<>();

    Material(ItemGrade grade)
    {
        this.locationInformation = name();
        this.grade = grade;
    }

    // used to add a cost of some other material which can be paid to procure some number of this material in trade
    public void addTradeCost(CostData tradeCost, int count)
    {
        tradeCosts.add(new Pair<>(tradeCost, -1 * count));
    }

    public Optional<ProcurementBlueprint> getTradeBlueprint()
    {
        if (tradeCosts.isEmpty()) return Optional.empty();

        List<ProcurementRecipe> tradeRecipes = tradeCosts.stream()
                .map(c->new MaterialTradeRecipe(c.getKey(), new CostData(this, c.getValue())))
                .collect(Collectors.toList());

        return Optional.of(new MaterialTradeBlueprint(this, tradeRecipes));
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
