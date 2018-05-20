package com.controllerface.edeps.structures.costs.materials;

import com.controllerface.edeps.ProcurementCategory;
import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.data.procurements.CostData;
import javafx.util.Pair;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * An enumeration of all the crafting material categories in Elite: Dangerous
 *
 * Created by Stephen on 3/20/2018.
 */
public enum MaterialSubCategory implements ProcurementCategory
{
    /*
    Raw Elements
     */

    Raw_Elements_1(true, 1, Material.CARBON,
            Material.VANADIUM,
            Material.NIOBIUM,
            Material.YTTRIUM),

    Raw_Elements_2(true, 2, Material.PHOSPHORUS,
            Material.CHROMIUM,
            Material.MOLYBDENUM,
            Material.TECHNETIUM),

    Raw_Elements_3(true, 3, Material.SULPHUR,
            Material.MANGANESE,
            Material.CADMIUM,
            Material.RUTHENIUM),

    Raw_Elements_4(true, 4, Material.IRON,
            Material.ZINC,
            Material.TIN,
            Material.SELENIUM),

    Raw_Elements_5(true, 5, Material.NICKEL,
            Material.GERMANIUM,
            Material.TUNGSTEN,
            Material.TELLURIUM),

    Raw_Elements_6(true, 6, Material.RHENIUM,
            Material.ARSENIC,
            Material.MERCURY,
            Material.POLONIUM),

    Raw_Elements_7(true, 7, Material.LEAD,
            Material.ZIRCONIUM,
            Material.BORON,
            Material.ANTIMONY),


    /*
    Manufactured
     */

    Alloys(true, 1, Material.SALVAGEDALLOYS,
            Material.GALVANISINGALLOYS,
            Material.PHASEALLOYS,
            Material.PROTOLIGHTALLOYS,
            Material.PROTORADIOLICALLOYS),

    Capacitors(true, 2, Material.GRIDRESISTORS,
            Material.HYBRIDCAPACITORS,
            Material.ELECTROCHEMICALARRAYS,
            Material.POLYMERCAPACITORS,
            Material.MILITARYSUPERCAPACITORS),

    Chemical(true, 3, Material.CHEMICALSTORAGEUNITS,
            Material.CHEMICALPROCESSORS,
            Material.CHEMICALDISTILLERY,
            Material.CHEMICALMANIPULATORS,
            Material.PHARMACEUTICALISOLATORS),

    Composite(true, 4, Material.COMPACTCOMPOSITES,
            Material.FILAMENTCOMPOSITES,
            Material.HIGHDENSITYCOMPOSITES,
            Material.FEDPROPRIETARYCOMPOSITES,
            Material.FEDCORECOMPOSITES),

    Conductive(true, 5, Material.BASICCONDUCTORS,
            Material.CONDUCTIVECOMPONENTS,
            Material.CONDUCTIVECERAMICS,
            Material.CONDUCTIVEPOLYMERS,
            Material.BIOTECHCONDUCTORS),

    Crystals(true, 6, Material.CRYSTALSHARDS,
            Material.UNCUTFOCUSCRYSTALS,
            Material.FOCUSCRYSTALS,
            Material.REFINEDFOCUSCRYSTALS,
            Material.EXQUISITEFOCUSCRYSTALS),

    Heat(true, 7, Material.HEATCONDUCTIONWIRING,
            Material.HEATDISPERSIONPLATE,
            Material.HEATEXCHANGERS,
            Material.HEATVANES,
            Material.PROTOHEATRADIATORS),

    Mechanical_Components(true, 8, Material.MECHANICALSCRAP,
            Material.MECHANICALEQUIPMENT,
            Material.MECHANICALCOMPONENTS,
            Material.CONFIGURABLECOMPONENTS,
            Material.IMPROVISEDCOMPONENTS),

    Shielding(true, 9, Material.WORNSHIELDEMITTERS,
            Material.SHIELDEMITTERS,
            Material.SHIELDINGSENSORS,
            Material.COMPOUNDSHIELDING,
            Material.IMPERIALSHIELDING),

    Thermic(true, 10, Material.TEMPEREDALLOYS,
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

    Data_Archives(true, 1, Material.BULKSCANDATA,
            Material.SCANARCHIVES,
            Material.SCANDATABANKS,
            Material.ENCODEDSCANDATA,
            Material.CLASSIFIEDSCANDATA),

    Emission_Data(true, 2, Material.SCRAMBLEDEMISSIONDATA,
            Material.ARCHIVEDEMISSIONDATA,
            Material.EMISSIONDATA,
            Material.DECODEDEMISSIONDATA,
            Material.COMPACTEMISSIONSDATA),

    Encoded_Firmware(true, 3, Material.LEGACYFIRMWARE,
            Material.CONSUMERFIRMWARE,
            Material.INDUSTRIALFIRMWARE,
            Material.SECURITYFIRMWARE,
            Material.EMBEDDEDFIRMWARE),

    Encryption_Files(true, 4, Material.ENCRYPTEDFILES,
            Material.ENCRYPTIONCODES,
            Material.SYMMETRICKEYS,
            Material.ENCRYPTIONARCHIVES,
            Material.ADAPTIVEENCRYPTORS),

    Shield_Data(true, 5, Material.SHIELDCYCLERECORDINGS,
            Material.SHIELDSOAKANALYSIS,
            Material.SHIELDDENSITYREPORTS,
            Material.SHIELDPATTERNANALYSIS,
            Material.SHIELDFREQUENCYDATA),

    Wake_Scans(true, 6, Material.DISRUPTEDWAKEECHOES,
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

    private static final double downgradeMultiplier = 3;
    private static final double upgradeMultiplier = 6;

    private final int numericalValue;
    private final Material[] materials;

    MaterialSubCategory(int numericalValue, Material... materials)
    {
        this(false, numericalValue, materials);
    }

    MaterialSubCategory(boolean tradeable, int numericalValue, Material... materials)
    {
        this.numericalValue = numericalValue;
        this.materials = materials;

        if (tradeable) calculateTradeCosts(materials);

    }

    private static void calculateTradeCosts(Material ... materials)
    {
        // for each of the materials in this sub-category, we need to calculate the trade costs required to
        // trade some number of one material, for some number of another.
        Stream.of(materials).forEach(material ->
        {
            // get the numerical value of this material's grade
            int thisGrade = material.getGrade().getNumericalValue();

            // now for all related materials (and filtering out THIS material which is unneeded for trades)
            // use the related material's grade to calculate how much it costs to trade for this one, and
            // how many of this material trading the related material will yield.
            Stream.of(materials)
                    .filter(relatedMaterial -> relatedMaterial != material)
                    .forEach(relatedMaterial ->
                    {
                        // get the numerical value of the trade candidate's grade, and compare it with this
                        // material's grade to determine the cost to convert between the two
                        int thatGrade = relatedMaterial.getGrade().getNumericalValue();
                        Pair<Integer, Integer> tradeValues = calculateTreadCost(thatGrade, thisGrade);

                        // the the trade amount required would exceed the maximum storage capacity of the item,
                        // there's no point in adding it as a trade cost because it can never be attained
                        if (tradeValues.getKey() > relatedMaterial.getGrade().getMaximumQuantity()) return;

                        material.addTradeCost(new CostData(relatedMaterial, tradeValues.getKey()), tradeValues.getValue());
                    });
        });
    }

    private static Pair<Integer, Integer> calculateTreadCost(int from, int to)
    {
        int tradeCost;
        int tradeYield;
        if (from > to)
        {
            tradeCost = 1;
            double gradeDiff = (double) (from - to);
            tradeYield = (int) Math.pow(downgradeMultiplier, gradeDiff);
        }
        else
        {
            tradeYield = 1;
            int gradeDiff = to - from;
            tradeCost = (int) Math.pow(upgradeMultiplier, gradeDiff);
        }
        return new Pair<>(tradeCost, tradeYield);
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
