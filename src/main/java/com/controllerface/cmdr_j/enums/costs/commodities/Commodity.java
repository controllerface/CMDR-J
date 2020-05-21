package com.controllerface.cmdr_j.enums.costs.commodities;

import com.controllerface.cmdr_j.classes.procurements.ProcurementCost;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum Commodity implements ProcurementCost
{
    // Chemicals
    AGRONOMICTREATMENT(ItemGrade.Space),
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
    OCCUPIEDCRYOPOD(ItemGrade.Salvage),
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
    TIMECAPSULE(ItemGrade.Salvage),
    USSCARGOTRADEDATA(ItemGrade.Salvage),
    TRINKETSOFHIDDENFORTUNE(ItemGrade.Salvage),
    UNSTABLEDATACORE(ItemGrade.Salvage),
    WRECKAGECOMPONENTS(ItemGrade.Salvage),

    USSCARGOANCIENTARTEFACT(ItemGrade.Guardian),
    AIRELICS(ItemGrade.Guardian),
    ANCIENTCASKET(ItemGrade.Guardian),
    ANCIENTORB(ItemGrade.Guardian),
    ANCIENTRELIC(ItemGrade.Guardian),
    ANCIENTTABLET(ItemGrade.Guardian),
    ANCIENTTOTEM(ItemGrade.Guardian),
    ANCIENTURN(ItemGrade.Guardian),
    ANCIENTKEY(ItemGrade.Guardian),

    THARGOIDBASILISKTISSUESAMPLE(ItemGrade.Thargoid),
    THARGOIDBIOLOGICALMATTER(ItemGrade.Thargoid),
    THARGOIDCYCLOPSTISSUESAMPLE(ItemGrade.Thargoid),
    THARGOIDHEART(ItemGrade.Thargoid),
    THARGOIDLINK(ItemGrade.Thargoid),
    THARGOIDMEDUSATISSUESAMPLE(ItemGrade.Thargoid),
    THARGOIDPROBE(ItemGrade.Thargoid),
    THARGOIDRESIN(ItemGrade.Thargoid),
    THARGOIDSCOUTTISSUESAMPLE(ItemGrade.Thargoid),
    THARGOIDSENSOR(ItemGrade.Thargoid),
    THARGOIDTECHNOLOGYSAMPLES(ItemGrade.Thargoid),
    UNKNOWNARTIFACT(ItemGrade.Thargoid),
    UNKNOWNARTIFACT2(ItemGrade.Thargoid),
    UNKNOWNARTIFACT3(ItemGrade.Thargoid),
    UNKNOWNRESIN(ItemGrade.Thargoid),
    UNKNOWNBIOLOGICALMATTER(ItemGrade.Thargoid),
    UNKNOWNTECHNOLOGYSAMPLES(ItemGrade.Thargoid),
    THARGOIDTISSUESAMPLETYPE1(ItemGrade.Thargoid),
    THARGOIDTISSUESAMPLETYPE2(ItemGrade.Thargoid),
    THARGOIDTISSUESAMPLETYPE3(ItemGrade.Thargoid),
    THARGOIDTISSUESAMPLETYPE4(ItemGrade.Thargoid),

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
    AEPYORNISEGG(ItemGrade.RareCommodity),
    AGANIPPERUSH(ItemGrade.RareCommodity),
    ALACARAKMOSKINART(ItemGrade.RareCommodity),
    ALBINOQUECHUAMAMMOTH(ItemGrade.RareCommodity),
    ALTAIRIANSKIN(ItemGrade.RareCommodity),
    ALYABODYSOAP(ItemGrade.RareCommodity),
    ANDULIGAFIREWORKS(ItemGrade.RareCommodity),
    ANYNACOFFEE(ItemGrade.RareCommodity),
    AROUCACONVENTUALSWEETS(ItemGrade.RareCommodity),
    AZCANCRIFORMULA42(ItemGrade.RareCommodity),
    AZUREMILK(ItemGrade.RareCommodity),
    BALTAHSINEVACUUMKRILL(ItemGrade.RareCommodity),
    BANKIAMPHIBIOUSLEATHER(ItemGrade.RareCommodity),
    BASTSNAKEGIN(ItemGrade.RareCommodity),
    BELALANSRAYLEATHER(ItemGrade.RareCommodity),
    BORASETANIPATHOGENETICS(ItemGrade.RareCommodity),
    BUCKYBALLBEERMATS(ItemGrade.RareCommodity),
    BURNHAMBILEDISTILLATE(ItemGrade.RareCommodity),
    CD75KITTENBRANDCOFFEE(ItemGrade.RareCommodity),
    CENTAURIMEGAGIN(ItemGrade.RareCommodity),
    CEREMONIALHEIKETEA(ItemGrade.RareCommodity),
    CETIRABBITS(ItemGrade.RareCommodity),
    CHAMELEONCLOTH(ItemGrade.RareCommodity),
    CHATEAUDEAEGAEON(ItemGrade.RareCommodity),
    CHERBONESBLOODCRYSTALS(ItemGrade.RareCommodity),
    CHIERIDANIMARINEPASTE(ItemGrade.RareCommodity),
    COQUIMSPONGIFORMVICTUALS(ItemGrade.RareCommodity),
    CROMSILVERFESH(ItemGrade.RareCommodity),
    CRYSTALLINESPHERES(ItemGrade.RareCommodity),
    DAMNACARAPACES(ItemGrade.RareCommodity),
    DELTAPHOENICISPALMS(ItemGrade.RareCommodity),
    DEURINGASTRUFFLES(ItemGrade.RareCommodity),
    DISOMACORN(ItemGrade.RareCommodity),
    EDENAPPLESOFAERIAL(ItemGrade.RareCommodity),
    ELEUTHERMALS(ItemGrade.RareCommodity),
    ERANINPEARLWHISKEY(ItemGrade.RareCommodity),
    ESHUUMBRELLAS(ItemGrade.RareCommodity),
    ESUSEKUCAVIAR(ItemGrade.RareCommodity),
    ETHGREZETEABUDS(ItemGrade.RareCommodity),
    FUJINTEA(ItemGrade.RareCommodity),
    GALACTICTRAVELGUIDES(ItemGrade.RareCommodity),
    GEAWENDANCEDUST(ItemGrade.RareCommodity),
    GERASIANGUEUZEBEER(ItemGrade.RareCommodity),
    GIANTIRUKAMASNAILS(ItemGrade.RareCommodity),
    GIANTVERRIX(ItemGrade.RareCommodity),
    GILYASIGNATUREWEAPONS(ItemGrade.RareCommodity),
    GOMANYAUPONCOFFEE(ItemGrade.RareCommodity),
    HAIDNEBLACKBREW(ItemGrade.RareCommodity),
    HARMASILVERSEARUM(ItemGrade.RareCommodity),
    HAVASUPAIDREAMCATCHER(ItemGrade.RareCommodity),
    HELVETITJPEARLS(ItemGrade.RareCommodity),
    HIP10175BUSHMEAT(ItemGrade.RareCommodity),
    HIP118311SWARM(ItemGrade.RareCommodity),
    HIPORGANOPHOSPHATES(ItemGrade.RareCommodity),
    HIPPROTOSQUID(ItemGrade.RareCommodity),
    HOLVADUELLINGBLADES(ItemGrade.RareCommodity),
    HONESTYPILLS(ItemGrade.RareCommodity),
    HR7221WHEAT(ItemGrade.RareCommodity),
    INDIBOURBON(ItemGrade.RareCommodity),
    JAQUESQUINENTIANSTILL(ItemGrade.RareCommodity),
    JARADHARREPUZZLEBOX(ItemGrade.RareCommodity),
    JAROUARICE(ItemGrade.RareCommodity),
    JOTUNMOOKAH(ItemGrade.RareCommodity),
    KACHIRIGINFILTERLEECHES(ItemGrade.RareCommodity),
    KAMITRACIGARS(ItemGrade.RareCommodity),
    KAMORINHISTORICWEAPONS(ItemGrade.RareCommodity),
    KARETIICOUTURE(ItemGrade.RareCommodity),
    KARSUKILOCUSTS(ItemGrade.RareCommodity),
    KINAGOVIOLINS(ItemGrade.RareCommodity),
    KONGGAALE(ItemGrade.RareCommodity),
    KOROKUNGPELLETS(ItemGrade.RareCommodity),
    LAVIANBRANDY(ItemGrade.RareCommodity),
    ALIENEGGS(ItemGrade.RareCommodity),
    LEESTIANEVILJUICE(ItemGrade.RareCommodity),
    LIVEHECATESEAWORMS(ItemGrade.RareCommodity),
    LTTHYPERSWEET(ItemGrade.RareCommodity),
    LUCANONIONHEAD(ItemGrade.RareCommodity),
    LYRAEWEED(ItemGrade.RareCommodity),
    MASTERCHEFS(ItemGrade.RareCommodity),
    MECHUCOSHIGHTEA(ItemGrade.RareCommodity),
    MEDBSTARLUBE(ItemGrade.RareCommodity),
    MOKOJINGBEASTFEAST(ItemGrade.RareCommodity),
    MOMUSBOGSPANIEL(ItemGrade.RareCommodity),
    MOTRONAEXPERIENCEJELLY(ItemGrade.RareCommodity),
    MUKUSUBIICHITINOS(ItemGrade.RareCommodity),
    MULACHIGIANTFUNGUS(ItemGrade.RareCommodity),
    NERITUSBERRIES(ItemGrade.RareCommodity),
    NGADANDARIFIREOPALS(ItemGrade.RareCommodity),
    NGUNAMODERNANTIQUES(ItemGrade.RareCommodity),
    NJANGARISADDLES(ItemGrade.RareCommodity),
    NONEUCLIDIANEXOTANKS(ItemGrade.RareCommodity),
    OCHOENGCHILLIES(ItemGrade.RareCommodity),
    ONIONHEAD(ItemGrade.RareCommodity),
    ONIONHEADALPHASTRAIN(ItemGrade.RareCommodity),
    ONIONHEADBETASTRAIN(ItemGrade.RareCommodity),
    OPHIUCHEXINOARTEFACTS(ItemGrade.RareCommodity),
    ORRERIANVICIOUSBREW(ItemGrade.RareCommodity),
    PANTAAPRAYERSTICKS(ItemGrade.RareCommodity),
    PAVONISEARGRUBS(ItemGrade.RareCommodity),
    PERSONALGIFTS(ItemGrade.RareCommodity),
    RAJUKRUMULTISTOVES(ItemGrade.RareCommodity),
    RAPABAOSNAKESKINS(ItemGrade.RareCommodity),
    RUSANIOLDSMOKEY(ItemGrade.RareCommodity),
    SANUMADECORATIVEMEAT(ItemGrade.RareCommodity),
    SAXONWINE(ItemGrade.RareCommodity),
    SHANSCHARISORCHID(ItemGrade.RareCommodity),
    SOONTILLRELICS(ItemGrade.RareCommodity),
    SOTHISCRYSTALLINEGOLD(ItemGrade.RareCommodity),
    TANMARKTRANQUILTEA(ItemGrade.RareCommodity),
    TARACHSPICE(ItemGrade.RareCommodity),
    TAURICHIMES(ItemGrade.RareCommodity),
    TERRAMATERBLOODBORES(ItemGrade.RareCommodity),
    THEHUTTONMUG(ItemGrade.RareCommodity),
    THRUTISCREAM(ItemGrade.RareCommodity),
    TIOLCEWASTE2PASTEUNITS(ItemGrade.RareCommodity),
    TOXANDJIVIROCIDE(ItemGrade.RareCommodity),
    ULTRACOMPACTPROCESSOR(ItemGrade.RareCommodity),
    USZAIANTREEGRUB(ItemGrade.RareCommodity),
    UTGAROARMILLENNIALEGGS(ItemGrade.RareCommodity),
    UZUMOKULOWGWINGS(ItemGrade.RareCommodity),
    VHERCULISBODYRUB(ItemGrade.RareCommodity),
    VANAYEQUICERATOMORPHAFUR(ItemGrade.RareCommodity),
    VEGASLIMWEED(ItemGrade.RareCommodity),
    VIDAVANTIANLACE(ItemGrade.RareCommodity),
    VOIDEXTRACTCOFFEE(ItemGrade.RareCommodity),
    VOLKHABBEEDRONES(ItemGrade.RareCommodity),
    WATERSOFSHINTARA(ItemGrade.RareCommodity),
    WHEEMETEWHEATCAKES(ItemGrade.RareCommodity),
    WITCHHAULKOBEBEEF(ItemGrade.RareCommodity),
    WOLFFESH(ItemGrade.RareCommodity),
    WULPAHYPERBORESYSTEMS(ItemGrade.RareCommodity),
    WUTHIELOKUFROTH(ItemGrade.RareCommodity),
    XIHEBIOMORPHICCOMPANIONS(ItemGrade.RareCommodity),
    YASOKONDILEAF(ItemGrade.RareCommodity),
    ZEESSZEANTGRUBGLUE(ItemGrade.RareCommodity),


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
