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

    AEROGEL(ItemGrade.MicroMaterial),
    CHEMICALCATALYST(ItemGrade.MicroMaterial),
    CHEMICALSUPERBASE(ItemGrade.MicroMaterial),
    EPINEPHRINE(ItemGrade.MicroMaterial),
    EPOXYADHESIVE(ItemGrade.MicroMaterial),
    GRAPHENE(ItemGrade.MicroMaterial),
    OXYGENICBACTERIA(ItemGrade.MicroMaterial),
    PHNEUTRALISER(ItemGrade.MicroMaterial),
    RDX(ItemGrade.MicroMaterial),
    VISCOELASTICPOLYMER(ItemGrade.MicroMaterial),


    //Tech
    CARBONFIBREPLATING(ItemGrade.MicroMaterial),
    ENCRYPTEDMEMORYCHIP(ItemGrade.MicroMaterial),
    MEMORYCHIP(ItemGrade.MicroMaterial),
    MICROHYDRAULICS(ItemGrade.MicroMaterial),
    MICROTHRUSTERS(ItemGrade.MicroMaterial),
    OPTICALLENS(ItemGrade.MicroMaterial),
    SCRAMBLER(ItemGrade.MicroMaterial),
    TITANIUMPLATING(ItemGrade.MicroMaterial),
    TRANSMITTER(ItemGrade.MicroMaterial),
    TUNGSTENCARBIDE(ItemGrade.MicroMaterial),
    WEAPONCOMPONENT(ItemGrade.MicroMaterial),


    //Circuits
    CIRCUITBOARD(ItemGrade.MicroMaterial),
    CIRCUITSWITCH(ItemGrade.MicroMaterial),
    ELECTRICALFUSE(ItemGrade.MicroMaterial),
    ELECTRICALWIRING(ItemGrade.MicroMaterial),
    ELECTROMAGNET(ItemGrade.MicroMaterial),
    IONBATTERY(ItemGrade.MicroMaterial),
    METALCOIL(ItemGrade.MicroMaterial),
    MICROSUPERCAPACITOR(ItemGrade.MicroMaterial),
    MICROTRANSFORMER(ItemGrade.MicroMaterial),
    MICROELECTRODE(ItemGrade.MicroMaterial),
    MOTOR(ItemGrade.MicroMaterial),
    OPTICALFIBRE(ItemGrade.MicroMaterial),


    //Item
    AGRICULTURALPROCESSSAMPLE(ItemGrade.MicroMaterial),
    BIOCHEMICALAGENT(ItemGrade.MicroMaterial),
    BIOLOGICALSAMPLE(ItemGrade.MicroMaterial),
    BUILDINGSCHEMATIC(ItemGrade.MicroMaterial),
    CALIFORNIUM(ItemGrade.MicroMaterial),
    CASTFOSSIL(ItemGrade.MicroMaterial),
    CHEMICALPROCESSSAMPLE(ItemGrade.MicroMaterial),
    CHEMICALSAMPLE(ItemGrade.MicroMaterial),
    COMPACTLIBRARY(ItemGrade.MicroMaterial),
    COMPRESSIONLIQUEFIEDGAS(ItemGrade.MicroMaterial),
    DEEPMANTLESAMPLE(ItemGrade.MicroMaterial),
    DEGRADEDPOWERREGULATOR(ItemGrade.MicroMaterial),
    GMEDS(ItemGrade.MicroMaterial),
    GENETICREPAIRMEDS(ItemGrade.MicroMaterial),
    HEALTHCANISTER(ItemGrade.MicroMaterial),
    HEALTHMONITOR(ItemGrade.MicroMaterial),
    HUSH(ItemGrade.MicroMaterial),
    INERTIACANISTER(ItemGrade.MicroMaterial),
    INFINITY(ItemGrade.MicroMaterial),
    INORGANICCONTAMINANT(ItemGrade.MicroMaterial),
    INSIGHT(ItemGrade.MicroMaterial),
    INSIGHTDATABANK(ItemGrade.MicroMaterial),
    INSIGHTENTERTAINMENTSUITE(ItemGrade.MicroMaterial),
    IONISEDGAS(ItemGrade.MicroMaterial),
    LAZARUS(ItemGrade.MicroMaterial),
    MICROBIALINHIBITOR(ItemGrade.MicroMaterial),
    MUTAGENICCATALYST(ItemGrade.MicroMaterial),
    NUTRITIONALCONCENTRATE(ItemGrade.MicroMaterial),
    PERSONALCOMPUTER(ItemGrade.MicroMaterial),
    PERSONALDOCUMENTS(ItemGrade.MicroMaterial),
    PETRIFIEDFOSSIL(ItemGrade.MicroMaterial),
    LARGECAPACITYPOWERREGULATOR(ItemGrade.MicroMaterial),
    PUSH(ItemGrade.MicroMaterial),
    PYROLYTICCATALYST(ItemGrade.MicroMaterial),
    REFINEMENTPROCESSSAMPLE(ItemGrade.MicroMaterial),
    SHIPSCHEMATIC(ItemGrade.MicroMaterial),
    SUITSCHEMATIC(ItemGrade.MicroMaterial),
    SURVEILLANCEEQUIPMENT(ItemGrade.MicroMaterial),
    SYNTHETICGENOME(ItemGrade.MicroMaterial),
    SYNTHETICPATHOGEN(ItemGrade.MicroMaterial),
    TRUEFORMFOSSIL(ItemGrade.MicroMaterial),
    UNIVERSALTRANSLATOR(ItemGrade.MicroMaterial),
    VEHICLESCHEMATIC(ItemGrade.MicroMaterial),
    WEAPONSCHEMATIC(ItemGrade.MicroMaterial),


    //Data
    ACCIDENTLOGS(ItemGrade.MicroMaterial),
    AIRQUALITYREPORTS(ItemGrade.MicroMaterial),
    ATMOSPHERICDATA(ItemGrade.MicroMaterial),
    AUDIOLOGS(ItemGrade.MicroMaterial),
    AXCOMBATLOGS(ItemGrade.MicroMaterial),
    BALLISTICDATA(ItemGrade.MicroMaterial),
    BIOLOGICALWEAPONDATA(ItemGrade.MicroMaterial),
    BIOMETRICDATA(ItemGrade.MicroMaterial),
    BLACKLISTDATA(ItemGrade.MicroMaterial),
    BLOODTESTRESULTS(ItemGrade.MicroMaterial),
    CAMPAIGNPLANS(ItemGrade.MicroMaterial),
    CATMEDIA(ItemGrade.MicroMaterial),
    CENSUSDATA(ItemGrade.MicroMaterial),
    CHEMICALEXPERIMENTDATA(ItemGrade.MicroMaterial),
    CHEMICALFORMULAE(ItemGrade.MicroMaterial),
    CHEMICALINVENTORY(ItemGrade.MicroMaterial),
    CHEMICALPATENTS(ItemGrade.MicroMaterial),
    CHEMICALWEAPONDATA(ItemGrade.MicroMaterial),
    CLASSICENTERTAINMENT(ItemGrade.MicroMaterial),
    CLINICALTRAILRECORDS(ItemGrade.MicroMaterial),
    COCKTAILRECIPES(ItemGrade.MicroMaterial),
    COMBATTRAININGMATERIAL(ItemGrade.MicroMaterial),
    COMBATANTPERFORMANCE(ItemGrade.MicroMaterial),
    CONFLICTHISTORY(ItemGrade.MicroMaterial),
    CRIMINALRECORDS(ItemGrade.MicroMaterial),
    CROPYIELDANALYSIS(ItemGrade.MicroMaterial),
    CULINARYRECIPES(ItemGrade.MicroMaterial),
    DIGITALDESIGNS(ItemGrade.MicroMaterial),
    DUTYROTA(ItemGrade.MicroMaterial),
    EMPLOYEEDIRECTORY(ItemGrade.MicroMaterial),
    EMPLOYEEEXPENSES(ItemGrade.MicroMaterial),
    EMPLOYEEGENETICDATA(ItemGrade.MicroMaterial),
    EMPLOYMENTHISTORY(ItemGrade.MicroMaterial),
    ENHANCEDINTERROGATIONRECORDINGS(ItemGrade.MicroMaterial),
    ESPIONAGEMATERIAL(ItemGrade.MicroMaterial),
    EVACUATIONPROTOCOLS(ItemGrade.MicroMaterial),
    EXPLORATIONJOURNALS(ItemGrade.MicroMaterial),
    EXTRACTIONYIELDDATA(ItemGrade.MicroMaterial),
    FACTIONASSOCIATES(ItemGrade.MicroMaterial),
    FACTIONDONATORLIST(ItemGrade.MicroMaterial),
    FACTIONNEWS(ItemGrade.MicroMaterial),
    FINANCIALPROJECTIONS(ItemGrade.MicroMaterial),
    GEOGRAPHICALDATA(ItemGrade.MicroMaterial),
    GEOLOGICALDATA(ItemGrade.MicroMaterial),
    HYDROPONICDATA(ItemGrade.MicroMaterial),
    INCIDENTLOGS(ItemGrade.MicroMaterial),
    INFLUENCEPROJECTIONS(ItemGrade.MicroMaterial),
    INTERNALCORRESPONDENCE(ItemGrade.MicroMaterial),
    INTERROGATIONRECORDINGS(ItemGrade.MicroMaterial),
    INTERVIEWRECORDINGS(ItemGrade.MicroMaterial),
    JOBAPPLICATIONS(ItemGrade.MicroMaterial),
    KOMPROMAT(ItemGrade.MicroMaterial),
    LITERARYFICTION(ItemGrade.MicroMaterial),
    MAINTENANCELOGS(ItemGrade.MicroMaterial),
    MANUFACTURINGINSTRUCTIONS(ItemGrade.MicroMaterial),
    MEDICALRECORDS(ItemGrade.MicroMaterial),
    MEETINGMINUTES(ItemGrade.MicroMaterial),
    MINERALSURVEY(ItemGrade.MicroMaterial),
    MININGANALYTICS(ItemGrade.MicroMaterial),
    MULTIMEDIAENTERTAINMENT(ItemGrade.MicroMaterial),
    NETWORKACCESSHISTORY(ItemGrade.MicroMaterial),
    NETWORKSECURITYPROTOCOLS(ItemGrade.MicroMaterial),
    NEXTOFKINRECORDS(ItemGrade.MicroMaterial),
    NOCDATA(ItemGrade.MicroMaterial),
    OPERATIONALMANUAL(ItemGrade.MicroMaterial),
    OPINIONPOLLS(ItemGrade.MicroMaterial),
    PATIENTHISTORY(ItemGrade.MicroMaterial),
    PATROLROUTES(ItemGrade.MicroMaterial),
    PAYROLLINFORMATION(ItemGrade.MicroMaterial),
    PERSONALLOGS(ItemGrade.MicroMaterial),
    PHARMACEUTICALPATENTS(ItemGrade.MicroMaterial),
    PHOTOALBUMS(ItemGrade.MicroMaterial),
    PLANTGROWTHCHARTS(ItemGrade.MicroMaterial),
    POLITICALAFFILIATIONS(ItemGrade.MicroMaterial),
    PRISONERLOGS(ItemGrade.MicroMaterial),
    PRODUCTIONREPORTS(ItemGrade.MicroMaterial),
    PRODUCTIONSCHEDULE(ItemGrade.MicroMaterial),
    PROPAGANDA(ItemGrade.MicroMaterial),
    PURCHASERECORDS(ItemGrade.MicroMaterial),
    PURCHASEREQUESTS(ItemGrade.MicroMaterial),
    RADIOACTIVITYDATA(ItemGrade.MicroMaterial),
    REACTOROUTPUTREVIEW(ItemGrade.MicroMaterial),
    RECYCLINGLOGS(ItemGrade.MicroMaterial),
    RESIDENTIALDIRECTORY(ItemGrade.MicroMaterial),
    RISKASSESSMENTS(ItemGrade.MicroMaterial),
    SALESRECORDS(ItemGrade.MicroMaterial),
    SECURITYEXPENSES(ItemGrade.MicroMaterial),
    SECURITYPLANS(ItemGrade.MicroMaterial),
    SEEDGENEAOLOGY(ItemGrade.MicroMaterial),
    SETTLEMENTASSAULTPLANS(ItemGrade.MicroMaterial),
    SETTLEMENTDEFENCEPLANS(ItemGrade.MicroMaterial),
    SHAREHOLDERINFORMATION(ItemGrade.MicroMaterial),
    SLUSHFUNDLOGS(ItemGrade.MicroMaterial),
    SMEARCAMPAIGNPLANS(ItemGrade.MicroMaterial),
    SPECTRALANALYSISDATA(ItemGrade.MicroMaterial),
    SPYWARE(ItemGrade.MicroMaterial),
    STELLARACTIVITYLOGS(ItemGrade.MicroMaterial),
    SURVEILLEANCELOGS(ItemGrade.MicroMaterial),
    TACTICALPLANS(ItemGrade.MicroMaterial),
    TAXRECORDS(ItemGrade.MicroMaterial),
    TOPOGRAPHICALSURVEYS(ItemGrade.MicroMaterial),
    TRAVELPERMITS(ItemGrade.MicroMaterial),
    TROOPDEPLOYMENTRECORDS(ItemGrade.MicroMaterial),
    UNIONMEMBERSHIP(ItemGrade.MicroMaterial),
    VACCINATIONRECORDS(ItemGrade.MicroMaterial),
    VACCINERESEARCH(ItemGrade.MicroMaterial),
    VIPSECURITYDETAIL(ItemGrade.MicroMaterial),
    VIROLOGYDATA(ItemGrade.MicroMaterial),
    VIRUS(ItemGrade.MicroMaterial),
    VISITORREGISTER(ItemGrade.MicroMaterial),
    WEAPONINVENTORY(ItemGrade.MicroMaterial),
    WEAPONTESTDATA(ItemGrade.MicroMaterial),
    XENODEFENCEPROTOCOLS(ItemGrade.MicroMaterial),

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
