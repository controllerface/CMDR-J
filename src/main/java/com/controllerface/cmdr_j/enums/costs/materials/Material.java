package com.controllerface.cmdr_j.enums.costs.materials;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.recipes.MaterialTradeRecipe;
import com.controllerface.cmdr_j.classes.tasks.MaterialTradeBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskCost;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.classes.data.Pair;

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
    TG_RESIDUEDATA(ItemGrade.RARE),


    //Chemicals

    AEROGEL(ItemGrade.Chemical_Asset),
    CHEMICALCATALYST(ItemGrade.Chemical_Asset),
    CHEMICALSUPERBASE(ItemGrade.Chemical_Asset),
    EPINEPHRINE(ItemGrade.Chemical_Asset),
    EPOXYADHESIVE(ItemGrade.Chemical_Asset),
    GRAPHENE(ItemGrade.Chemical_Asset),
    OXYGENICBACTERIA(ItemGrade.Chemical_Asset),
    PHNEUTRALISER(ItemGrade.Chemical_Asset),
    RDX(ItemGrade.Chemical_Asset),
    VISCOELASTICPOLYMER(ItemGrade.Chemical_Asset),


    //Tech
    CARBONFIBREPLATING(ItemGrade.Tech_Asset),
    ENCRYPTEDMEMORYCHIP(ItemGrade.Tech_Asset),
    MEMORYCHIP(ItemGrade.Tech_Asset),
    MICROHYDRAULICS(ItemGrade.Tech_Asset),
    MICROTHRUSTERS(ItemGrade.Tech_Asset),
    OPTICALLENS(ItemGrade.Tech_Asset),
    SCRAMBLER(ItemGrade.Tech_Asset),
    TITANIUMPLATING(ItemGrade.Tech_Asset),
    TRANSMITTER(ItemGrade.Tech_Asset),
    TUNGSTENCARBIDE(ItemGrade.Tech_Asset),
    WEAPONCOMPONENT(ItemGrade.Tech_Asset),


    //Circuits
    CIRCUITBOARD(ItemGrade.Circuit_Asset),
    CIRCUITSWITCH(ItemGrade.Circuit_Asset),
    ELECTRICALFUSE(ItemGrade.Circuit_Asset),
    ELECTRICALWIRING(ItemGrade.Circuit_Asset),
    ELECTROMAGNET(ItemGrade.Circuit_Asset),
    IONBATTERY(ItemGrade.Circuit_Asset),
    METALCOIL(ItemGrade.Circuit_Asset),
    MICROSUPERCAPACITOR(ItemGrade.Circuit_Asset),
    MICROTRANSFORMER(ItemGrade.Circuit_Asset),
    MICROELECTRODE(ItemGrade.Circuit_Asset),
    MOTOR(ItemGrade.Circuit_Asset),
    OPTICALFIBRE(ItemGrade.Circuit_Asset),


    //Item
    AGRICULTURALPROCESSSAMPLE(ItemGrade.Goods),
    BIOCHEMICALAGENT(ItemGrade.Goods),
    BIOLOGICALSAMPLE(ItemGrade.Goods),
    BUILDINGSCHEMATIC(ItemGrade.Goods),
    CALIFORNIUM(ItemGrade.Goods),
    CASTFOSSIL(ItemGrade.Goods),
    CHEMICALPROCESSSAMPLE(ItemGrade.Goods),
    CHEMICALSAMPLE(ItemGrade.Goods),
    COMPACTLIBRARY(ItemGrade.Goods),
    COMPRESSIONLIQUEFIEDGAS(ItemGrade.Goods),
    DEEPMANTLESAMPLE(ItemGrade.Goods),
    DEGRADEDPOWERREGULATOR(ItemGrade.Goods),
    GMEDS(ItemGrade.Goods),
    GENETICREPAIRMEDS(ItemGrade.Goods),
    HEALTHCANISTER(ItemGrade.Goods),
    HEALTHMONITOR(ItemGrade.Goods),
    HUSH(ItemGrade.Goods),
    INERTIACANISTER(ItemGrade.Goods),
    INFINITY(ItemGrade.Goods),
    INORGANICCONTAMINANT(ItemGrade.Goods),
    INSIGHT(ItemGrade.Goods),
    INSIGHTDATABANK(ItemGrade.Goods),
    INSIGHTENTERTAINMENTSUITE(ItemGrade.Goods),
    IONISEDGAS(ItemGrade.Goods),
    LAZARUS(ItemGrade.Goods),
    MICROBIALINHIBITOR(ItemGrade.Goods),
    MUTAGENICCATALYST(ItemGrade.Goods),
    NUTRITIONALCONCENTRATE(ItemGrade.Goods),
    PERSONALCOMPUTER(ItemGrade.Goods),
    PERSONALDOCUMENTS(ItemGrade.Goods),
    PETRIFIEDFOSSIL(ItemGrade.Goods),
    LARGECAPACITYPOWERREGULATOR(ItemGrade.Goods),
    PUSH(ItemGrade.Goods),
    PYROLYTICCATALYST(ItemGrade.Goods),
    REFINEMENTPROCESSSAMPLE(ItemGrade.Goods),
    SHIPSCHEMATIC(ItemGrade.Goods),
    SUITSCHEMATIC(ItemGrade.Goods),
    SURVEILLANCEEQUIPMENT(ItemGrade.Goods),
    SYNTHETICGENOME(ItemGrade.Goods),
    SYNTHETICPATHOGEN(ItemGrade.Goods),
    TRUEFORMFOSSIL(ItemGrade.Goods),
    UNIVERSALTRANSLATOR(ItemGrade.Goods),
    VEHICLESCHEMATIC(ItemGrade.Goods),
    WEAPONSCHEMATIC(ItemGrade.Goods),


    //Data
    ACCIDENTLOGS(ItemGrade.Data),
    AIRQUALITYREPORTS(ItemGrade.Data),
    ATMOSPHERICDATA(ItemGrade.Data),
    AUDIOLOGS(ItemGrade.Data),
    AXCOMBATLOGS(ItemGrade.Data),
    BALLISTICDATA(ItemGrade.Data),
    BIOLOGICALWEAPONDATA(ItemGrade.Data),
    BIOMETRICDATA(ItemGrade.Data),
    BLACKLISTDATA(ItemGrade.Data),
    BLOODTESTRESULTS(ItemGrade.Data),
    CAMPAIGNPLANS(ItemGrade.Data),
    CATMEDIA(ItemGrade.Data),
    CENSUSDATA(ItemGrade.Data),
    CHEMICALEXPERIMENTDATA(ItemGrade.Data),
    CHEMICALFORMULAE(ItemGrade.Data),
    CHEMICALINVENTORY(ItemGrade.Data),
    CHEMICALPATENTS(ItemGrade.Data),
    CHEMICALWEAPONDATA(ItemGrade.Data),
    CLASSICENTERTAINMENT(ItemGrade.Data),
    CLINICALTRAILRECORDS(ItemGrade.Data),
    COCKTAILRECIPES(ItemGrade.Data),
    COMBATTRAININGMATERIAL(ItemGrade.Data),
    COMBATANTPERFORMANCE(ItemGrade.Data),
    CONFLICTHISTORY(ItemGrade.Data),
    CRIMINALRECORDS(ItemGrade.Data),
    CROPYIELDANALYSIS(ItemGrade.Data),
    CULINARYRECIPES(ItemGrade.Data),
    DIGITALDESIGNS(ItemGrade.Data),
    DUTYROTA(ItemGrade.Data),
    EMPLOYEEDIRECTORY(ItemGrade.Data),
    EMPLOYEEEXPENSES(ItemGrade.Data),
    EMPLOYEEGENETICDATA(ItemGrade.Data),
    EMPLOYMENTHISTORY(ItemGrade.Data),
    ENHANCEDINTERROGATIONRECORDINGS(ItemGrade.Data),
    ESPIONAGEMATERIAL(ItemGrade.Data),
    EVACUATIONPROTOCOLS(ItemGrade.Data),
    EXPLORATIONJOURNALS(ItemGrade.Data),
    EXTRACTIONYIELDDATA(ItemGrade.Data),
    FACTIONASSOCIATES(ItemGrade.Data),
    FACTIONDONATORLIST(ItemGrade.Data),
    FACTIONNEWS(ItemGrade.Data),
    FINANCIALPROJECTIONS(ItemGrade.Data),
    GENESEQUENCINGDATA(ItemGrade.Data),
    GENETICRESEARCH(ItemGrade.Data),
    GEOGRAPHICALDATA(ItemGrade.Data),
    GEOLOGICALDATA(ItemGrade.Data),
    HYDROPONICDATA(ItemGrade.Data),
    INCIDENTLOGS(ItemGrade.Data),
    INFLUENCEPROJECTIONS(ItemGrade.Data),
    INTERNALCORRESPONDENCE(ItemGrade.Data),
    INTERROGATIONRECORDINGS(ItemGrade.Data),
    INTERVIEWRECORDINGS(ItemGrade.Data),
    JOBAPPLICATIONS(ItemGrade.Data),
    KOMPROMAT(ItemGrade.Data),
    LITERARYFICTION(ItemGrade.Data),
    MAINTENANCELOGS(ItemGrade.Data),
    MANUFACTURINGINSTRUCTIONS(ItemGrade.Data),
    MEDICALRECORDS(ItemGrade.Data),
    MEETINGMINUTES(ItemGrade.Data),
    MINERALSURVEY(ItemGrade.Data),
    MININGANALYTICS(ItemGrade.Data),
    MULTIMEDIAENTERTAINMENT(ItemGrade.Data),
    NETWORKACCESSHISTORY(ItemGrade.Data),
    NETWORKSECURITYPROTOCOLS(ItemGrade.Data),
    NEXTOFKINRECORDS(ItemGrade.Data),
    NOCDATA(ItemGrade.Data),
    OPERATIONALMANUAL(ItemGrade.Data),
    OPINIONPOLLS(ItemGrade.Data),
    PATIENTHISTORY(ItemGrade.Data),
    PATROLROUTES(ItemGrade.Data),
    PAYROLLINFORMATION(ItemGrade.Data),
    PERSONALLOGS(ItemGrade.Data),
    PHARMACEUTICALPATENTS(ItemGrade.Data),
    PHOTOALBUMS(ItemGrade.Data),
    PLANTGROWTHCHARTS(ItemGrade.Data),
    POLITICALAFFILIATIONS(ItemGrade.Data),
    PRISONERLOGS(ItemGrade.Data),
    PRODUCTIONREPORTS(ItemGrade.Data),
    PRODUCTIONSCHEDULE(ItemGrade.Data),
    PROPAGANDA(ItemGrade.Data),
    PURCHASERECORDS(ItemGrade.Data),
    PURCHASEREQUESTS(ItemGrade.Data),
    RADIOACTIVITYDATA(ItemGrade.Data),
    REACTOROUTPUTREVIEW(ItemGrade.Data),
    RECYCLINGLOGS(ItemGrade.Data),
    RESIDENTIALDIRECTORY(ItemGrade.Data),
    RISKASSESSMENTS(ItemGrade.Data),
    SALESRECORDS(ItemGrade.Data),
    SECURITYEXPENSES(ItemGrade.Data),
    SECURITYPLANS(ItemGrade.Data),
    SEEDGENEAOLOGY(ItemGrade.Data),
    SETTLEMENTASSAULTPLANS(ItemGrade.Data),
    SETTLEMENTDEFENCEPLANS(ItemGrade.Data),
    SHAREHOLDERINFORMATION(ItemGrade.Data),
    SLUSHFUNDLOGS(ItemGrade.Data),
    SMEARCAMPAIGNPLANS(ItemGrade.Data),
    SPECTRALANALYSISDATA(ItemGrade.Data),
    SPYWARE(ItemGrade.Data),
    STELLARACTIVITYLOGS(ItemGrade.Data),
    SURVEILLEANCELOGS(ItemGrade.Data),
    TACTICALPLANS(ItemGrade.Data),
    TAXRECORDS(ItemGrade.Data),
    TOPOGRAPHICALSURVEYS(ItemGrade.Data),
    TRAVELPERMITS(ItemGrade.Data),
    TROOPDEPLOYMENTRECORDS(ItemGrade.Data),
    UNIONMEMBERSHIP(ItemGrade.Data),
    VACCINATIONRECORDS(ItemGrade.Data),
    VACCINERESEARCH(ItemGrade.Data),
    VIPSECURITYDETAIL(ItemGrade.Data),
    VIROLOGYDATA(ItemGrade.Data),
    VIRUS(ItemGrade.Data),
    VISITORREGISTER(ItemGrade.Data),
    WEAPONINVENTORY(ItemGrade.Data),
    WEAPONTESTDATA(ItemGrade.Data),
    XENODEFENCEPROTOCOLS(ItemGrade.Data),

    ;

    private final ItemGrade grade;
    private String localizedName = toString();
    private String locationInformation;
    private final List<TaskRecipe> associated = new ArrayList<>();

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
