package com.controllerface.cmdr_j.structures.costs.commodities;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.structures.equipment.ItemGrade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum Commodity implements ProcurementCost
{
    // Chemicals
    EXPLOSIVES(ItemGrade.Space),
    HYDROGENFUEL(ItemGrade.Space),
    HYDROGENPEROXIDE(ItemGrade.Mining),
    LIQUIDOXYGEN(ItemGrade.Space),
    MINERALOIL(ItemGrade.Space),
    NERVEAGENTS(ItemGrade.Planet),
    PESTICIDES(ItemGrade.Space),
    SURFACESTABILISERS(ItemGrade.Space),
    SYNTHETICREAGENTS(ItemGrade.Planet),
    WATER(ItemGrade.Space),

    // Consumer Items
    CLOTHING(ItemGrade.Space),
    CONSUMERTECHNOLOGY(ItemGrade.Space),
    DOMESTICAPPLIANCES(ItemGrade.Space),
    EVACUATIONSHELTER(ItemGrade.Space),
    SURVIVALEQUIPMENT(ItemGrade.Space),

    // Legal Drugs
    BEER(ItemGrade.Space),
    BOOTLEGLIQUOR(ItemGrade.Mission), // unaivalable
    LIQUOR(ItemGrade.Space),
    BASICNARCOTICS(ItemGrade.Space),
    TOBACCO(ItemGrade.Space),
    WINE(ItemGrade.Space),

    // Foods
    ALGAE(ItemGrade.Space),
    ANIMALMEAT(ItemGrade.Space),
    COFFEE(ItemGrade.Space),
    FISH(ItemGrade.Space),
    FOODCARTRIDGES(ItemGrade.Space),
    FRUITANDVEGETABLES(ItemGrade.Space),
    GRAIN(ItemGrade.Space),
    SYNTHETICMEAT(ItemGrade.Space),
    TEA(ItemGrade.Space),

    // Industrial Materials
    CERAMICCOMPOSITES(ItemGrade.Planet),
    CMMCOMPOSITE(ItemGrade.Planet),
    INSULATINGMEMBRANE(ItemGrade.Space),
    METAALLOYS(ItemGrade.Planet),
    COOLINGHOSES(ItemGrade.Mission),
    NEOFABRICINSULATION(ItemGrade.Mission),
    POLYMERS(ItemGrade.Space),
    SEMICONDUCTORS(ItemGrade.Space),
    SUPERCONDUCTORS(ItemGrade.Space),

    // Machinery
    ARTICULATIONMOTORS(ItemGrade.Mission),
    ATMOSPHERICEXTRACTORS(ItemGrade.Space),
    BUILDINGFABRICATORS(ItemGrade.Space),
    CROPHARVESTERS(ItemGrade.Space),
    EMERGENCYPOWERCELLS(ItemGrade.Space),
    POWERGRIDASSEMBLY(ItemGrade.Space),
    EXHAUSTMANIFOLD(ItemGrade.Space),
    GEOLOGICALEQUIPMENT(ItemGrade.Space),
    HEATSINKINTERLINK(ItemGrade.Space),
    HNSHOCKMOUNT(ItemGrade.Space),
    MAGNETICEMITTERCOIL(ItemGrade.Space),
    MARINESUPPLIES(ItemGrade.Space),
    HELIOSTATICFURNACES(ItemGrade.Space),
    MINERALEXTRACTORS(ItemGrade.Space),
    MODULARTERMINALS(ItemGrade.Mission),
    POWERCONVERTER(ItemGrade.Space),
    POWERGENERATORS(ItemGrade.Space),
    POWERTRANSFERCONDUITS(ItemGrade.Space),
    RADIATIONBAFFLE(ItemGrade.Space),
    REINFORCEDMOUNTINGPLATE(ItemGrade.Space),
    SKIMERCOMPONENTS(ItemGrade.Space),
    THERMALCOOLINGUNITS(ItemGrade.Space),
    WATERPURIFIERS(ItemGrade.Space),

    // Medicines
    ADVANCEDMEDICINES(ItemGrade.Space),
    AGRICULTURALMEDICINES(ItemGrade.Space),
    BASICMEDICINES(ItemGrade.Space),
    COMBATSTABILISERS(ItemGrade.Space),
    PERFORMANCEENHANCERS(ItemGrade.Space),
    PROGENITORCELLS(ItemGrade.Space),

    // Metals
    ALUMINIUM(ItemGrade.Space),
    BERYLLIUM(ItemGrade.Space),
    BISMUTH(ItemGrade.Planet),
    COBALT(ItemGrade.Space),
    COPPER(ItemGrade.Space),
    GALLIUM(ItemGrade.Space),
    GOLD(ItemGrade.Space),
    HAFNIUM178(ItemGrade.Mission), // unavailable
    INDIUM(ItemGrade.Space),
    LANTHANUM(ItemGrade.Planet),
    LITHIUM(ItemGrade.Space),
    OSMIUM(ItemGrade.Mining),
    PALLADIUM(ItemGrade.Space),
    PLATINUM(ItemGrade.Mining),
    PLATINUMALLOY(ItemGrade.Mission), // unavailable
    PRASEODYMIUM(ItemGrade.Mining),
    SAMARIUM(ItemGrade.Mining),
    SILVER(ItemGrade.Space),
    TANTALUM(ItemGrade.Space),
    THALLIUM(ItemGrade.Planet),
    THORIUM(ItemGrade.Planet),
    TITANIUM(ItemGrade.Space),
    URANIUM(ItemGrade.Space),

    // Minerals
    BAUXITE(ItemGrade.Space),
    BERTRANDITE(ItemGrade.Space),
    BROMELLITE(ItemGrade.Mining),
    COLTAN(ItemGrade.Space),
    CRYOLITE(ItemGrade.Planet),
    GALLITE(ItemGrade.Space),
    GOSLARITE(ItemGrade.Planet),
    INDITE(ItemGrade.Space),
    JADEITE(ItemGrade.POI),
    LEPIDOLITE(ItemGrade.Space),
    LITHIUMHYDROXIDE(ItemGrade.Mining),
    LOWTEMPERATUREDIAMOND(ItemGrade.Mining),
    METHANECLATHRATE(ItemGrade.Mining),
    METHANOLMONOHYDRATECRYSTALS(ItemGrade.Mining),
    MOISSANITE(ItemGrade.POI),
    PAINITE(ItemGrade.Mining),
    PYROPHYLLITE(ItemGrade.Planet),
    RUTILE(ItemGrade.Space),
    TAAFFEITE(ItemGrade.POI),
    URANINITE(ItemGrade.Space),

    // Core Deposits
    RHODPLUMSITE(ItemGrade.Mining),
    SERENDIBITE(ItemGrade.Mining),
    MONAZITE(ItemGrade.Mining),
    MUSGRAVITE(ItemGrade.Mining),
    BENITOITE(ItemGrade.Mining),
    GRANDIDIERITE(ItemGrade.Mining),
    ALEXANDRITE(ItemGrade.Mining),
    OPAL(ItemGrade.Mining),

    // Salvage
    AIRELICS(ItemGrade.Salvage),
    USSCARGOANCIENTARTEFACT(ItemGrade.Salvage),
    ANCIENTCASKET(ItemGrade.Salvage),
    ANCIENTORB(ItemGrade.Salvage),
    ANCIENTRELIC(ItemGrade.Salvage),
    ANCIENTTABLET(ItemGrade.Salvage),
    ANCIENTTOTEM(ItemGrade.Salvage),
    ANCIENTURN(ItemGrade.Salvage),
    ANCIENTKEY(ItemGrade.Salvage),
    ANTIMATTERCONTAINMENTUNIT(ItemGrade.Salvage),
    ANTIQUEJEWELLERY(ItemGrade.Salvage),
    ANTIQUITIES(ItemGrade.Salvage),
    ASSAULTPLANS(ItemGrade.Salvage),
    USSCARGOBLACKBOX(ItemGrade.Salvage),
    COMERCIALSAMPLES(ItemGrade.Salvage),
    DAMAGEDESCAPEPOD(ItemGrade.Salvage),
    DATACORE(ItemGrade.Salvage),
    DIPLOMATICBAG(ItemGrade.Salvage),
    EARTHRELICS(ItemGrade.Salvage),
    ENCRYPTEDCORRESPONDENCE(ItemGrade.Salvage),
    ENCRIPTEDDATASTORAGE(ItemGrade.Salvage),
    USSCARGOEXPERIMENTALCHEMICALS(ItemGrade.Salvage),
    FOSSILREMNANTS(ItemGrade.Salvage),
    GENEBANK(ItemGrade.Salvage),
    GEOLOGICALSAMPLES(ItemGrade.Salvage),
    HOSTAGE(ItemGrade.Salvage),
    LARGEEXPLORATIONDATACASH(ItemGrade.Salvage),
    MILITARYINTELLIGENCE(ItemGrade.Salvage),
    USSCARGOMILITARYPLANS(ItemGrade.Salvage),
    MYSTERIOUSIDOL(ItemGrade.Salvage),
    OCCUPIEDESCAPEPOD(ItemGrade.Salvage),
    PERSONALEFFECTS(ItemGrade.Salvage),
    POLITICALPRISONER(ItemGrade.Salvage),
    PRECIOUSGEMS(ItemGrade.Salvage),
    PROHIBITEDRESEARCHMATERIALS(ItemGrade.Salvage),
    USSCARGOPROTOTYPETECH(ItemGrade.Salvage),
    USSCARGORAREARTWORK(ItemGrade.Salvage),
    USSCARGOREBELTRANSMISSIONS(ItemGrade.Salvage),
    SAP8CORECONTAINER(ItemGrade.Salvage),
    SCIENTIFICRESEARCH(ItemGrade.Salvage),
    SCIENTIFICSAMPLES(ItemGrade.Salvage),
    SMALLEXPLORATIONDATACASH(ItemGrade.Salvage),
    SPACEPIONEERRELICS(ItemGrade.Salvage),
    TACTICALDATA(ItemGrade.Salvage),
    USSCARGOTECHNICALBLUEPRINTS(ItemGrade.Salvage),
    THARGOIDBASILISKTISSUESAMPLE(ItemGrade.Salvage),
    THARGOIDBIOLOGICALMATTER(ItemGrade.Salvage),
    THARGOIDCYCLOPSTISSUESAMPLE(ItemGrade.Salvage),
    THARGOIDHEART(ItemGrade.Salvage),
    THARGOIDLINK(ItemGrade.Salvage),
    THARGOIDMEDUSATISSUESAMPLE(ItemGrade.Salvage),
    THARGOIDPROBE(ItemGrade.Salvage),
    THARGOIDRESIN(ItemGrade.Salvage),
    THARGOIDSCOUTTISSUESAMPLE(ItemGrade.Salvage),
    THARGOIDSENSOR(ItemGrade.Salvage),
    THARGOIDTECHNOLOGYSAMPLES(ItemGrade.Salvage),
    TIMECAPSULE(ItemGrade.Salvage),
    USSCARGOTRADEDATA(ItemGrade.Salvage),
    TRINKETSOFHIDDENFORTUNE(ItemGrade.Salvage),
    UNSTABLEDATACORE(ItemGrade.Salvage),
    WRECKAGECOMPONENTS(ItemGrade.Salvage),

    UNKNOWNARTIFACT(ItemGrade.Salvage),
    UNKNOWNARTIFACT2(ItemGrade.Salvage),
    UNKNOWNARTIFACT3(ItemGrade.Salvage),
    UNKNOWNRESIN(ItemGrade.Salvage),
    UNKNOWNBIOLOGICALMATTER(ItemGrade.Salvage),
    UNKNOWNTECHNOLOGYSAMPLES(ItemGrade.Salvage),

    THARGOIDTISSUESAMPLETYPE1(ItemGrade.Salvage),
    THARGOIDTISSUESAMPLETYPE2(ItemGrade.Salvage),
    THARGOIDTISSUESAMPLETYPE3(ItemGrade.Salvage),
    THARGOIDTISSUESAMPLETYPE4(ItemGrade.Salvage),



    // Slaves
    IMPERIALSLAVES(ItemGrade.Space),
    SLAVES(ItemGrade.Space),

    // Technology
    ADVANCEDCATALYSERS(ItemGrade.Space),
    ANIMALMONITORS(ItemGrade.Space),
    AQUAPONICSYSTEMS(ItemGrade.Space),
    AUTOFABRICATORS(ItemGrade.Space),
    BIOREDUCINGLICHEN(ItemGrade.Space),
    COMPUTERCOMPONENTS(ItemGrade.Space),
    HAZARDOUSENVIRONMENTSUITS(ItemGrade.Space),
    DIAGNOSTICSENSOR(ItemGrade.Space),
    IONDISTRIBUTOR(ItemGrade.Space),
    TERRAINENRICHMENTSYSTEMS(ItemGrade.Space),
    MEDICALDIAGNOSTICEQUIPMENT(ItemGrade.Space),
    MICROCONTROLLERS(ItemGrade.Space),
    MUONIMAGER(ItemGrade.Planet),
    NANOBREAKERS(ItemGrade.Mission),
    RESONATINGSEPARATORS(ItemGrade.Space),
    ROBOTICS(ItemGrade.Space),
    STRUCTURALREGULATORS(ItemGrade.Space),
    TELEMETRYSUITE(ItemGrade.Mission),

    // Textiles
    CONDUCTIVEFABRICS(ItemGrade.Space),
    LEATHER(ItemGrade.Space),
    MILITARYGRADEFABRICS(ItemGrade.Space),
    NATURALFABRICS(ItemGrade.Space),
    SYNTHETICFABRICS(ItemGrade.Space),

    // Waste
    BIOWASTE(ItemGrade.Space),
    CHEMICALWASTE(ItemGrade.Mission), // unavailable
    SCRAP(ItemGrade.Space),
    TOXICWASTE(ItemGrade.Mission), // unavailable

    // Weapons
    BATTLEWEAPONS(ItemGrade.Space),
    LANDMINES(ItemGrade.Planet),
    NONLETHALWEAPONS(ItemGrade.Space),
    PERSONALWEAPONS(ItemGrade.Space),
    REACTIVEARMOUR(ItemGrade.Space),

    // Drones
    DRONES(ItemGrade.Drone),

    // Rare Commodities
    AEPYORNISEGG(ItemGrade.Rare),
    AGANIPPERUSH(ItemGrade.Rare),
    ALACARAKMOSKINART(ItemGrade.Rare),
    ALBINOQUECHUAMAMMOTH(ItemGrade.Rare),
    ALTAIRIANSKIN(ItemGrade.Rare),
    ALYABODYSOAP(ItemGrade.Rare),
    ANDULIGAFIREWORKS(ItemGrade.Rare),
    ANYNACOFFEE(ItemGrade.Rare),
    AROUCACONVENTUALSWEETS(ItemGrade.Rare),
    AZCANCRIFORMULA42(ItemGrade.Rare),
    AZUREMILK(ItemGrade.Rare),
    BALTAHSINEVACUUMKRILL(ItemGrade.Rare),
    BANKIAMPHIBIOUSLEATHER(ItemGrade.Rare),
    BASTSNAKEGIN(ItemGrade.Rare),
    BELALANSRAYLEATHER(ItemGrade.Rare),
    BORASETANIPATHOGENETICS(ItemGrade.Rare),
    BUCKYBALLBEERMATS(ItemGrade.Rare),
    BURNHAMBILEDISTILLATE(ItemGrade.Rare),
    CD75KITTENBRANDCOFFEE(ItemGrade.Rare),
    CENTAURIMEGAGIN(ItemGrade.Rare),
    CEREMONIALHEIKETEA(ItemGrade.Rare),
    CETIRABBITS(ItemGrade.Rare),
    CHAMELEONCLOTH(ItemGrade.Rare),
    CHATEAUDEAEGAEON(ItemGrade.Rare),
    CHERBONESBLOODCRYSTALS(ItemGrade.Rare),
    CHIERIDANIMARINEPASTE(ItemGrade.Rare),
    COQUIMSPONGIFORMVICTUALS(ItemGrade.Rare),
    CROMSILVERFESH(ItemGrade.Rare),
    CRYSTALLINESPHERES(ItemGrade.Rare),
    DAMNACARAPACES(ItemGrade.Rare),
    DELTAPHOENICISPALMS(ItemGrade.Rare),
    DEURINGASTRUFFLES(ItemGrade.Rare),
    DISOMACORN(ItemGrade.Rare),
    EDENAPPLESOFAERIAL(ItemGrade.Rare),
    ELEUTHERMALS(ItemGrade.Rare),
    ERANINPEARLWHISKEY(ItemGrade.Rare),
    ESHUUMBRELLAS(ItemGrade.Rare),
    ESUSEKUCAVIAR(ItemGrade.Rare),
    ETHGREZETEABUDS(ItemGrade.Rare),
    FUJINTEA(ItemGrade.Rare),
    GALACTICTRAVELGUIDES(ItemGrade.Rare),
    GEAWENDANCEDUST(ItemGrade.Rare),
    GERASIANGUEUZEBEER(ItemGrade.Rare),
    GIANTIRUKAMASNAILS(ItemGrade.Rare),
    GIANTVERRIX(ItemGrade.Rare),
    GILYASIGNATUREWEAPONS(ItemGrade.Rare),
    GOMANYAUPONCOFFEE(ItemGrade.Rare),
    HAIDNEBLACKBREW(ItemGrade.Rare),
    HARMASILVERSEARUM(ItemGrade.Rare),
    HAVASUPAIDREAMCATCHER(ItemGrade.Rare),
    HELVETITJPEARLS(ItemGrade.Rare),
    HIP10175BUSHMEAT(ItemGrade.Rare),
    HIP118311SWARM(ItemGrade.Rare),
    HIPORGANOPHOSPHATES(ItemGrade.Rare),
    HIPPROTOSQUID(ItemGrade.Rare),
    HOLVADUELLINGBLADES(ItemGrade.Rare),
    HONESTYPILLS(ItemGrade.Rare),
    HR7221WHEAT(ItemGrade.Rare),
    INDIBOURBON(ItemGrade.Rare),
    JAQUESQUINENTIANSTILL(ItemGrade.Rare),
    JARADHARREPUZZLEBOX(ItemGrade.Rare),
    JAROUARICE(ItemGrade.Rare),
    JOTUNMOOKAH(ItemGrade.Rare),
    KACHIRIGINFILTERLEECHES(ItemGrade.Rare),
    KAMITRACIGARS(ItemGrade.Rare),
    KAMORINHISTORICWEAPONS(ItemGrade.Rare),
    KARETIICOUTURE(ItemGrade.Rare),
    KARSUKILOCUSTS(ItemGrade.Rare),
    KINAGOVIOLINS(ItemGrade.Rare),
    KONGGAALE(ItemGrade.Rare),
    KOROKUNGPELLETS(ItemGrade.Rare),
    LAVIANBRANDY(ItemGrade.Rare),
    ALIENEGGS(ItemGrade.Rare),
    LEESTIANEVILJUICE(ItemGrade.Rare),
    LIVEHECATESEAWORMS(ItemGrade.Rare),
    LTTHYPERSWEET(ItemGrade.Rare),
    LUCANONIONHEAD(ItemGrade.Rare),
    LYRAEWEED(ItemGrade.Rare),
    MASTERCHEFS(ItemGrade.Rare),
    MECHUCOSHIGHTEA(ItemGrade.Rare),
    MEDBSTARLUBE(ItemGrade.Rare),
    MOKOJINGBEASTFEAST(ItemGrade.Rare),
    MOMUSBOGSPANIEL(ItemGrade.Rare),
    MOTRONAEXPERIENCEJELLY(ItemGrade.Rare),
    MUKUSUBIICHITINOS(ItemGrade.Rare),
    MULACHIGIANTFUNGUS(ItemGrade.Rare),
    NERITUSBERRIES(ItemGrade.Rare),
    NGADANDARIFIREOPALS(ItemGrade.Rare),
    NGUNAMODERNANTIQUES(ItemGrade.Rare),
    NJANGARISADDLES(ItemGrade.Rare),
    NONEUCLIDIANEXOTANKS(ItemGrade.Rare),
    OCHOENGCHILLIES(ItemGrade.Rare),
    ONIONHEAD(ItemGrade.Rare),
    ONIONHEADALPHASTRAIN(ItemGrade.Rare),
    ONIONHEADBETASTRAIN(ItemGrade.Rare),
    OPHIUCHEXINOARTEFACTS(ItemGrade.Rare),
    ORRERIANVICIOUSBREW(ItemGrade.Rare),
    PANTAAPRAYERSTICKS(ItemGrade.Rare),
    PAVONISEARGRUBS(ItemGrade.Rare),
    PERSONALGIFTS(ItemGrade.Rare),
    RAJUKRUMULTISTOVES(ItemGrade.Rare),
    RAPABAOSNAKESKINS(ItemGrade.Rare),
    RUSANIOLDSMOKEY(ItemGrade.Rare),
    SANUMADECORATIVEMEAT(ItemGrade.Rare),
    SAXONWINE(ItemGrade.Rare),
    SHANSCHARISORCHID(ItemGrade.Rare),
    SOONTILLRELICS(ItemGrade.Rare),
    SOTHISCRYSTALLINEGOLD(ItemGrade.Rare),
    TANMARKTRANQUILTEA(ItemGrade.Rare),
    TARACHSPICE(ItemGrade.Rare),
    TAURICHIMES(ItemGrade.Rare),
    TERRAMATERBLOODBORES(ItemGrade.Rare),
    THEHUTTONMUG(ItemGrade.Rare),
    THRUTISCREAM(ItemGrade.Rare),
    TIOLCEWASTE2PASTEUNITS(ItemGrade.Rare),
    TOXANDJIVIROCIDE(ItemGrade.Rare),
    ULTRACOMPACTPROCESSOR(ItemGrade.Rare),
    USZAIANTREEGRUB(ItemGrade.Rare),
    UTGAROARMILLENNIALEGGS(ItemGrade.Rare),
    UZUMOKULOWGWINGS(ItemGrade.Rare),
    VHERCULISBODYRUB(ItemGrade.Rare),
    VANAYEQUICERATOMORPHAFUR(ItemGrade.Rare),
    VEGASLIMWEED(ItemGrade.Rare),
    VIDAVANTIANLACE(ItemGrade.Rare),
    VOIDEXTRACTCOFFEE(ItemGrade.Rare),
    VOLKHABBEEDRONES(ItemGrade.Rare),
    WATERSOFSHINTARA(ItemGrade.Rare),
    WHEEMETEWHEATCAKES(ItemGrade.Rare),
    WITCHHAULKOBEBEEF(ItemGrade.Rare),
    WOLFFESH(ItemGrade.Rare),
    WULPAHYPERBORESYSTEMS(ItemGrade.Rare),
    WUTHIELOKUFROTH(ItemGrade.Rare),
    XIHEBIOMORPHICCOMPANIONS(ItemGrade.Rare),
    YASOKONDILEAF(ItemGrade.Rare),
    ZEESSZEANTGRUBGLUE(ItemGrade.Rare),


    // Powerplay Items
    AISLINGMEDIAMATERIALS(ItemGrade.Faction),
    AISLINGMEDIARESOURCES(ItemGrade.Faction),
    AISLINGPROMOTIONALMATERIALS(ItemGrade.Faction),
    ALLIANCETRADEAGREEMENTS(ItemGrade.Faction),
    ALLIANCELEGASLATIVECONTRACTS(ItemGrade.Faction),
    ALLIANCELEGASLATIVERECORDS(ItemGrade.Faction),
    LAVIGNYCORRUPTIONDOSSIERS(ItemGrade.Faction),
    LAVIGNYFIELDSUPPLIES(ItemGrade.Faction),
    LAVIGNYGARISONSUPPLIES(ItemGrade.Faction),
    RESTRICTEDPACKAGE(ItemGrade.Faction),
    LIBERALCAMPAIGNMATERIALS(ItemGrade.Faction),
    FEDERALAID(ItemGrade.Faction),
    FEDERALTRADECONTRACTS(ItemGrade.Faction),
    LOANEDARMS(ItemGrade.Faction),
    PATREUSFIELDSUPPLIES(ItemGrade.Faction),
    PATREUSGARISONSUPPLIES(ItemGrade.Faction),
    RESTRICTEDINTEL(ItemGrade.Faction),
    REPUBLICANFIELDSUPPLIES(ItemGrade.Faction),
    REPUBLICANGARISONSUPPLIES(ItemGrade.Faction),
    SIRIUSFRANCHISEPACKAGE(ItemGrade.Faction),
    SIRIUSCOMMERCIALCONTRACTS(ItemGrade.Faction),
    SIRIUSINDUSTRIALEQUIPMENT(ItemGrade.Faction),
    TORVALCOMMERCIALCONTRACTS(ItemGrade.Faction),
    IMPERIALPRISONER(ItemGrade.Faction),
    UTOPIANPUBLICITY(ItemGrade.Faction),
    UTOPIANFIELDSUPPLIES(ItemGrade.Faction),
    UTOPIANDISSIDENT(ItemGrade.Faction),
    ILLICITCONSIGNMENT(ItemGrade.Faction),
    UNMARKEDWEAPONS(ItemGrade.Faction),
    ONIONHEADSAMPLES(ItemGrade.Faction),
    COUNTERCULTURESUPPORT(ItemGrade.Faction),
    MARKEDSLAVES(ItemGrade.Faction),
    TORVALDEEDS(ItemGrade.Faction),
    ONIONHEADDERIVATIVES(ItemGrade.Faction),
    OUTOFDATEGOODS(ItemGrade.Faction),
    UNDERGROUNDSUPPORT(ItemGrade.Faction),
    GROMCOUNTERINTELLIGENCE(ItemGrade.Faction),
    GROMWARTROPHIES(ItemGrade.Faction);

    private final ItemGrade grade;
    private String localizedName = name();
    private String locationInformation = "";
    private final List<ProcurementRecipe> associated = new ArrayList<>();

    Commodity(ItemGrade grade)
    {
        this.grade = grade;
    }

    @Override
    public String getLocationInformation()
    {
        return grade.getLocationDescription() + "\n" + locationInformation;
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
    public void setLocationInformation(String locationInformation)
    {
        this.locationInformation = locationInformation;
    }

    @Override
    public String getLocalizedName()
    {
        return localizedName;
    }

    @Override
    public void setLocalizedName(String localizedName)
    {
        this.localizedName = localizedName;
    }

    @Override
    public ItemGrade getGrade()
    {
        return grade;
    }
}
