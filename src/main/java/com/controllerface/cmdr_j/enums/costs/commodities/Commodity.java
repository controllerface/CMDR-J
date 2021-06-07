package com.controllerface.cmdr_j.enums.costs.commodities;

import com.controllerface.cmdr_j.interfaces.tasks.TaskCost;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/11/2018.
 */
public enum Commodity implements TaskCost
{
    PLATINUM                            (128049152L, ItemGrade.Metals),
    PALLADIUM                           (128049153L, ItemGrade.Metals),
    GOLD                                (128049154L, ItemGrade.Metals),
    SILVER                              (128049155L, ItemGrade.Metals),
    BERTRANDITE                         (128049156L, ItemGrade.Minerals),
    INDITE                              (128049157L, ItemGrade.Minerals),
    GALLITE                             (128049158L, ItemGrade.Minerals),
    COLTAN                              (128049159L, ItemGrade.Minerals),
    URANINITE                           (128049160L, ItemGrade.Minerals),
    LEPIDOLITE                          (128049161L, ItemGrade.Minerals),
    COBALT                              (128049162L, ItemGrade.Metals),
    RUTILE                              (128049163L, ItemGrade.Minerals),
    BAUXITE                             (128049165L, ItemGrade.Minerals),
    WATER                               (128049166L, ItemGrade.Chemicals),
    BERYLLIUM                           (128049168L, ItemGrade.Metals),
    INDIUM                              (128049169L, ItemGrade.Metals),
    GALLIUM                             (128049170L, ItemGrade.Metals),
    TANTALUM                            (128049171L, ItemGrade.Metals),
    URANIUM                             (128049172L, ItemGrade.Metals),
    LITHIUM                             (128049173L, ItemGrade.Metals),
    TITANIUM                            (128049174L, ItemGrade.Metals),
    COPPER                              (128049175L, ItemGrade.Metals),
    ALUMINIUM                           (128049176L, ItemGrade.Metals),
    ALGAE                               (128049177L, ItemGrade.Foods),
    FRUITANDVEGETABLES                  (128049178L, ItemGrade.Foods),
    GRAIN                               (128049180L, ItemGrade.Foods),
    ANIMALMEAT                          (128049182L, ItemGrade.Foods),
    FISH                                (128049183L, ItemGrade.Foods),
    FOODCARTRIDGES                      (128049184L, ItemGrade.Foods),
    SYNTHETICMEAT                       (128049185L, ItemGrade.Foods),
    TEA                                 (128049188L, ItemGrade.Foods),
    COFFEE                              (128049189L, ItemGrade.Foods),
    LEATHER                             (128049190L, ItemGrade.Textiles),
    NATURALFABRICS                      (128049191L, ItemGrade.Textiles),
    SYNTHETICFABRICS                    (128049193L, ItemGrade.Textiles),
    POLYMERS                            (128049197L, ItemGrade.IndustrialMaterials),
    SEMICONDUCTORS                      (128049199L, ItemGrade.IndustrialMaterials),
    SUPERCONDUCTORS                     (128049200L, ItemGrade.IndustrialMaterials),
    HYDROGENFUEL                        (128049202L, ItemGrade.Chemicals),
    MINERALOIL                          (128049203L, ItemGrade.Chemicals),
    EXPLOSIVES                          (128049204L, ItemGrade.Chemicals),
    PESTICIDES                          (128049205L, ItemGrade.Chemicals),
    AGRICULTURALMEDICINES               (128049208L, ItemGrade.Medicines),
    PERFORMANCEENHANCERS                (128049209L, ItemGrade.Medicines),
    BASICMEDICINES                      (128049210L, ItemGrade.Medicines),
    BASICNARCOTICS                      (128049212L, ItemGrade.LegalDrugs),
    TOBACCO                             (128049213L, ItemGrade.LegalDrugs),
    BEER                                (128049214L, ItemGrade.LegalDrugs),
    WINE                                (128049215L, ItemGrade.LegalDrugs),
    LIQUOR                              (128049216L, ItemGrade.LegalDrugs),
    POWERGENERATORS                     (128049217L, ItemGrade.Machinery),
    WATERPURIFIERS                      (128049218L, ItemGrade.Machinery),
    HELIOSTATICFURNACES                 (128049220L, ItemGrade.Machinery),
    MINERALEXTRACTORS                   (128049221L, ItemGrade.Machinery),
    CROPHARVESTERS                      (128049222L, ItemGrade.Machinery),
    MARINESUPPLIES                      (128049223L, ItemGrade.Machinery),
    COMPUTERCOMPONENTS                  (128049225L, ItemGrade.Technology),
    HAZARDOUSENVIRONMENTSUITS           (128049226L, ItemGrade.Technology),
    ROBOTICS                            (128049227L, ItemGrade.Technology),
    AUTOFABRICATORS                     (128049228L, ItemGrade.Technology),
    ANIMALMONITORS                      (128049229L, ItemGrade.Technology),
    AQUAPONICSYSTEMS                    (128049230L, ItemGrade.Technology),
    ADVANCEDCATALYSERS                  (128049231L, ItemGrade.Technology),
    TERRAINENRICHMENTSYSTEMS            (128049232L, ItemGrade.Technology),
    PERSONALWEAPONS                     (128049233L, ItemGrade.Weapons),
    BATTLEWEAPONS                       (128049234L, ItemGrade.Weapons),
    REACTIVEARMOUR                      (128049235L, ItemGrade.Weapons),
    NONLETHALWEAPONS                    (128049236L, ItemGrade.Weapons),
    DOMESTICAPPLIANCES                  (128049238L, ItemGrade.ConsumerItems),
    CONSUMERTECHNOLOGY                  (128049240L, ItemGrade.ConsumerItems),
    CLOTHING                            (128049241L, ItemGrade.ConsumerItems),
    SLAVES                              (128049243L, ItemGrade.Slavery),
    BIOWASTE                            (128049244L, ItemGrade.Waste),
    TOXICWASTE         /* unavailable*/ (128049245L, ItemGrade.Waste),
    CHEMICALWASTE      /* unavailable*/ (128049246L, ItemGrade.Waste),
    SCRAP                               (128049248L, ItemGrade.Waste),
    PROGENITORCELLS                     (128049669L, ItemGrade.Medicines),
    COMBATSTABILISERS                   (128049670L, ItemGrade.Medicines),
    RESONATINGSEPARATORS                (128049671L, ItemGrade.Technology),
    BIOREDUCINGLICHEN                   (128049672L, ItemGrade.Technology),
    ATMOSPHERICEXTRACTORS               (128064028L, ItemGrade.Machinery),
    DRONES                              (128066403L, ItemGrade.Drone),
    USSCARGOBLACKBOX                    (128666752L, ItemGrade.Salvage),
    USSCARGOTRADEDATA                   (128666754L, ItemGrade.Salvage),
    USSCARGOMILITARYPLANS               (128666755L, ItemGrade.Salvage),
    USSCARGOANCIENTARTEFACT             (128666756L, ItemGrade.Salvage),
    USSCARGORAREARTWORK                 (128666757L, ItemGrade.Salvage),
    USSCARGOEXPERIMENTALCHEMICALS       (128666758L, ItemGrade.Salvage),
    USSCARGOREBELTRANSMISSIONS          (128666759L, ItemGrade.Salvage),
    USSCARGOPROTOTYPETECH               (128666760L, ItemGrade.Salvage),
    USSCARGOTECHNICALBLUEPRINTS         (128666761L, ItemGrade.Salvage),
    IMPERIALSLAVES                      (128667728L, ItemGrade.Slavery),
    UNKNOWNARTIFACT                     (128668547L, ItemGrade.Salvage),
    AIRELICS                            (128668548L, ItemGrade.Salvage),
    HAFNIUM178         /* unavailable*/ (128668549L, ItemGrade.Metals),
    PAINITE                             (128668550L, ItemGrade.Minerals),
    ANTIQUITIES                         (128668551L, ItemGrade.Salvage),
    MILITARYINTELLIGENCE                (128668552L, ItemGrade.Salvage),
    OSMIUM                              (128671118L, ItemGrade.Metals),
    SAP8CORECONTAINER                   (128671443L, ItemGrade.Salvage),
    TRINKETSOFFORTUNE                   (128671444L, ItemGrade.ConsumerItems),
    WRECKAGECOMPONENTS                  (128672123L, ItemGrade.Salvage),
    ENCRIPTEDDATASTORAGE                (128672124L, ItemGrade.Salvage),
    OCCUPIEDCRYOPOD                     (128672125L, ItemGrade.Salvage),
    PERSONALEFFECTS                     (128672126L, ItemGrade.Salvage),
    COMERCIALSAMPLES                    (128672127L, ItemGrade.Salvage),
    TACTICALDATA                        (128672128L, ItemGrade.Salvage),
    ASSAULTPLANS                        (128672129L, ItemGrade.Salvage),
    ENCRYPTEDCORRESPONDENCE             (128672130L, ItemGrade.Salvage),
    DIPLOMATICBAG                       (128672131L, ItemGrade.Salvage),
    SCIENTIFICRESEARCH                  (128672132L, ItemGrade.Salvage),
    SCIENTIFICSAMPLES                   (128672133L, ItemGrade.Salvage),
    POLITICALPRISONER                   (128672134L, ItemGrade.Salvage),
    HOSTAGE                             (128672135L, ItemGrade.Salvage),
    LARGEEXPLORATIONDATACASH            (128672136L, ItemGrade.Salvage),
    SMALLEXPLORATIONDATACASH            (128672137L, ItemGrade.Salvage),
    ANTIQUEJEWELLERY                    (128672159L, ItemGrade.Salvage),
    PRECIOUSGEMS                        (128672160L, ItemGrade.Salvage),
    EARTHRELICS                         (128672161L, ItemGrade.Salvage),
    GENEBANK                            (128672162L, ItemGrade.Salvage),
    TIMECAPSULE                         (128672163L, ItemGrade.Salvage),
    CRYOLITE                            (128672294L, ItemGrade.Minerals),
    GOSLARITE                           (128672295L, ItemGrade.Minerals),
    MOISSANITE                          (128672296L, ItemGrade.Minerals),
    PYROPHYLLITE                        (128672297L, ItemGrade.Minerals),
    LANTHANUM                           (128672298L, ItemGrade.Metals),
    THALLIUM                            (128672299L, ItemGrade.Metals),
    BISMUTH                             (128672300L, ItemGrade.Metals),
    THORIUM                             (128672301L, ItemGrade.Metals),
    CERAMICCOMPOSITES                   (128672302L, ItemGrade.IndustrialMaterials),
    SYNTHETICREAGENTS                   (128672303L, ItemGrade.Chemicals),
    NERVEAGENTS                         (128672304L, ItemGrade.Chemicals),
    SURFACESTABILISERS                  (128672305L, ItemGrade.Chemicals),
    BOOTLEGLIQUOR      /* unavailable*/ (128672306L, ItemGrade.LegalDrugs),
    GEOLOGICALEQUIPMENT                 (128672307L, ItemGrade.Machinery),
    THERMALCOOLINGUNITS                 (128672308L, ItemGrade.Machinery),
    BUILDINGFABRICATORS                 (128672309L, ItemGrade.Machinery),
    MUTOMIMAGER                         (128672310L, ItemGrade.Technology),
    STRUCTURALREGULATORS                (128672311L, ItemGrade.Technology),
    LANDMINES                           (128672312L, ItemGrade.Weapons),
    SKIMERCOMPONENTS                    (128672313L, ItemGrade.Machinery),
    EVACUATIONSHELTER                   (128672314L, ItemGrade.ConsumerItems),
    GEOLOGICALSAMPLES                   (128672315L, ItemGrade.Salvage),
    METAALLOYS                          (128672701L, ItemGrade.IndustrialMaterials),
    TAAFFEITE                           (128672775L, ItemGrade.Minerals),
    JADEITE                             (128672776L, ItemGrade.Minerals),
    UNSTABLEDATACORE                    (128672810L, ItemGrade.Salvage),
    DAMAGEDESCAPEPOD                    (128672811L, ItemGrade.Salvage),
    PRASEODYMIUM                        (128673845L, ItemGrade.Metals),
    BROMELLITE                          (128673846L, ItemGrade.Minerals),
    SAMARIUM                            (128673847L, ItemGrade.Metals),
    LOWTEMPERATUREDIAMOND               (128673848L, ItemGrade.Minerals),
    HYDROGENPEROXIDE                    (128673850L, ItemGrade.Chemicals),
    LIQUIDOXYGEN                        (128673851L, ItemGrade.Chemicals),
    METHANOLMONOHYDRATECRYSTALS         (128673852L, ItemGrade.Minerals),
    LITHIUMHYDROXIDE                    (128673853L, ItemGrade.Minerals),
    METHANECLATHRATE                    (128673854L, ItemGrade.Minerals),
    INSULATINGMEMBRANE                  (128673855L, ItemGrade.IndustrialMaterials),
    CMMCOMPOSITE                        (128673856L, ItemGrade.IndustrialMaterials),
    COOLINGHOSES                        (128673857L, ItemGrade.IndustrialMaterials),
    NEOFABRICINSULATION                 (128673858L, ItemGrade.IndustrialMaterials),
    ARTICULATIONMOTORS                  (128673859L, ItemGrade.Machinery),
    HNSHOCKMOUNT                        (128673860L, ItemGrade.Machinery),
    EMERGENCYPOWERCELLS                 (128673861L, ItemGrade.Machinery),
    POWERCONVERTER                      (128673862L, ItemGrade.Machinery),
    POWERGRIDASSEMBLY                   (128673863L, ItemGrade.Machinery),
    POWERTRANSFERCONDUITS               (128673864L, ItemGrade.Machinery),
    RADIATIONBAFFLE                     (128673865L, ItemGrade.Machinery),
    EXHAUSTMANIFOLD                     (128673866L, ItemGrade.Machinery),
    REINFORCEDMOUNTINGPLATE             (128673867L, ItemGrade.Machinery),
    HEATSINKINTERLINK                   (128673868L, ItemGrade.Machinery),
    MAGNETICEMITTERCOIL                 (128673869L, ItemGrade.Machinery),
    MODULARTERMINALS                    (128673870L, ItemGrade.Machinery),
    NANOBREAKERS                        (128673871L, ItemGrade.Technology),
    TELEMETRYSUITE                      (128673872L, ItemGrade.Technology),
    MICROCONTROLLERS                    (128673873L, ItemGrade.Technology),
    IONDISTRIBUTOR                      (128673874L, ItemGrade.Machinery),
    DIAGNOSTICSENSOR                    (128673875L, ItemGrade.Technology),
    UNKNOWNARTIFACT2                    (128673876L, ItemGrade.Salvage),
    CONDUCTIVEFABRICS                   (128682044L, ItemGrade.Textiles),
    MILITARYGRADEFABRICS                (128682045L, ItemGrade.Textiles),
    ADVANCEDMEDICINES                   (128682046L, ItemGrade.Medicines),
    MEDICALDIAGNOSTICEQUIPMENT          (128682047L, ItemGrade.Technology),
    SURVIVALEQUIPMENT                   (128682048L, ItemGrade.ConsumerItems),
    DATACORE                            (128682049L, ItemGrade.Salvage),
    MYSTERIOUSIDOL                      (128682051L, ItemGrade.Salvage),
    PROHIBITEDRESEARCHMATERIALS         (128682052L, ItemGrade.Salvage),
    ANTIMATTERCONTAINMENTUNIT           (128682053L, ItemGrade.Salvage),
    SPACEPIONEERRELICS                  (128682054L, ItemGrade.Salvage),
    FOSSILREMNANTS                      (128682055L, ItemGrade.Salvage),
    ANCIENTRELIC                        (128732183L, ItemGrade.Salvage),
    ANCIENTORB                          (128732184L, ItemGrade.Salvage),
    ANCIENTCASKET                       (128732185L, ItemGrade.Salvage),
    ANCIENTTABLET                       (128732186L, ItemGrade.Salvage),
    ANCIENTURN                          (128732187L, ItemGrade.Salvage),
    ANCIENTTOTEM                        (128732188L, ItemGrade.Salvage),
    UNKNOWNRESIN                        (128737287L, ItemGrade.Salvage),
    UNKNOWNBIOLOGICALMATTER             (128737288L, ItemGrade.Salvage),
    UNKNOWNTECHNOLOGYSAMPLES            (128737289L, ItemGrade.Salvage),
    UNKNOWNARTIFACT3                    (128740752L, ItemGrade.Salvage),
    THARGOIDHEART                       (128793127L, ItemGrade.Salvage),
    THARGOIDTISSUESAMPLETYPE1           (128793128L, ItemGrade.Salvage),
    THARGOIDTISSUESAMPLETYPE2           (128793129L, ItemGrade.Salvage),
    THARGOIDTISSUESAMPLETYPE3           (128793130L, ItemGrade.Salvage),
    THARGOIDSCOUTTISSUESAMPLE           (128824468L, ItemGrade.Salvage),
    ANCIENTKEY                          (128888499L, ItemGrade.Salvage),
    THARGOIDTISSUESAMPLETYPE4           (128902652L, ItemGrade.Salvage),
    M_TISSUESAMPLE_FLUID                (128922517L, ItemGrade.Salvage),
    M_TISSUESAMPLE_SOFT                 (128922518L, ItemGrade.Salvage),
    M_TISSUESAMPLE_NERVES               (128922519L, ItemGrade.Salvage),
    S_TISSUESAMPLE_CELLS                (128922520L, ItemGrade.Salvage),
    S_TISSUESAMPLE_SURFACE              (128922521L, ItemGrade.Salvage),
    S_TISSUESAMPLE_CORE                 (128922522L, ItemGrade.Salvage),
    P_PARTICULATESAMPLE                 (128922523L, ItemGrade.Salvage),
    S9_TISSUESAMPLE_SHELL               (128922781L, ItemGrade.Salvage),
    M3_TISSUESAMPLE_MEMBRANE            (128922782L, ItemGrade.Salvage),
    M3_TISSUESAMPLE_MYCELIUM            (128922783L, ItemGrade.Salvage),
    M3_TISSUESAMPLE_SPORES              (128922784L, ItemGrade.Salvage),
    S6_TISSUESAMPLE_MESOGLEA            (128922785L, ItemGrade.Salvage),
    S6_TISSUESAMPLE_CELLS               (128922786L, ItemGrade.Salvage),
    S6_TISSUESAMPLE_COENOSARC           (128922787L, ItemGrade.Salvage),
    RHODPLUMSITE                        (128924325L, ItemGrade.Minerals),
    SERENDIBITE                         (128924326L, ItemGrade.Minerals),
    MONAZITE                            (128924327L, ItemGrade.Minerals),
    MUSGRAVITE                          (128924328L, ItemGrade.Minerals),
    BENITOITE                           (128924329L, ItemGrade.Minerals),
    GRANDIDIERITE                       (128924330L, ItemGrade.Minerals),
    ALEXANDRITE                         (128924331L, ItemGrade.Minerals),
    OPAL                                (128924332L, ItemGrade.Minerals),
    ROCKFORTHFERTILISER                 (128924333L, ItemGrade.Chemicals),
    AGRONOMICTREATMENT                  (128924334L, ItemGrade.Chemicals),
    TRITIUM                             (128961249L, ItemGrade.Chemicals),

    // Rare Commodities
    ERANINPEARLWHISKY                   (128666746L, 128001536L, ItemGrade.LegalDrugs),
    LAVIANBRANDY                        (128666747L, 128106744L, ItemGrade.LegalDrugs),
    HIP10175BUSHMEAT                    (128667019L, 3223234816L, ItemGrade.Foods),
    ALBINOQUECHUAMAMMOTH                (128667020L, 3222822912L, ItemGrade.Foods),
    UTGAROARMILLENIALEGGS               (128667021L, 128037120L, ItemGrade.Foods),
    WITCHHAULKOBEBEEF                   (128667022L, 3223358720L, ItemGrade.Foods),
    KARSUKILOCUSTS                      (128667023L, 3225028096L, ItemGrade.Foods),
    GIANTIRUKAMASNAILS                  (128667024L, 3225345792L, ItemGrade.Foods),
    BALTAHSINEVACUUMKRILL               (128667025L, 128088056L, ItemGrade.Foods),
    CETIRABBITS                         (128667026L, 3222560000L, ItemGrade.Foods),
    KACHIRIGINLEACHES                   (128667027L, 3221595648L, ItemGrade.Medicines),
    LYRAEWEED                           (128667028L, 3226417152L, ItemGrade.LegalDrugs),
    ONIONHEAD                           (128667029L, 128129272L, ItemGrade.LegalDrugs),
    TARACHTORSPICE                      (128667030L, 128041984L, ItemGrade.LegalDrugs),
    WOLF1301FESH                        (128667031L, 128084984L, ItemGrade.LegalDrugs),
    BORASETANIPATHOGENETICS             (128667032L, 3229638400L, ItemGrade.Weapons),
    HIP118311SWARM                      (128667033L, 3223177472L, ItemGrade.Weapons),
    KONGGAALE                           (128667034L, 3226978048L, ItemGrade.LegalDrugs),
    WUTHIELOKUFROTH                     (128667035L, 3222155776L, ItemGrade.LegalDrugs),
    ALACARAKMOSKINART                   (128667036L, 3231373824L, ItemGrade.ConsumerItems),
    ELEUTHERMALS                        (128667037L, 3230624768L, ItemGrade.ConsumerItems),
    ESHUUMBRELLAS                       (128667038L, 3222295552L, ItemGrade.ConsumerItems),
    KARETIICOUTURE                      (128667039L, 3227333120L, ItemGrade.ConsumerItems),
    NJANGARISADDLES                     (128667040L, 3222416896L, ItemGrade.ConsumerItems),
    ANYNACOFFEE                         (128667041L, 3229880064L, ItemGrade.Foods),
    CD75CATCOFFEE                       (128667042L, 3228566016L, ItemGrade.Foods),
    GOMANYAUPONCOFFEE                   (128667043L, 3224449792L, ItemGrade.Foods),
    VOLKHABBEEDRONES                    (128667044L, 3227831808L, ItemGrade.Machinery),
    KINAGOINSTRUMENTS                   (128667045L, 3227394304L, ItemGrade.ConsumerItems),
    NGUNAMODERNANTIQUES                 (128667046L, 3221538304L, ItemGrade.ConsumerItems),
    RAJUKRUSTOVES                       (128667047L, 3227512320L, ItemGrade.ConsumerItems),
    TIOLCEWASTE2PASTEUNITS              (128667048L, 3224141312L, ItemGrade.ConsumerItems),
    CHIERIDANIMARINEPASTE               (128667049L, 128128760L, ItemGrade.Foods),
    ESUSEKUCAVIAR                       (128667050L, 3226919680L, ItemGrade.Foods),
    LIVEHECATESEAWORMS                  (128667051L, 128042496L, ItemGrade.Foods),
    HELVETITJPEARLS                     (128667052L, 3231094528L, ItemGrade.Metals),
    HIP41181SQUID                       (128667053L, 3227995392L, ItemGrade.Foods),
    COQUIMSPONGIFORMVICTUALS            (128667054L, 3223832576L, ItemGrade.Foods),
    AERIALEDENAPPLE                     (128667055L, 128083448L, ItemGrade.Foods),
    NERITUSBERRIES                      (128667056L, 3228206080L, ItemGrade.Foods),
    OCHOENGCHILLIES                     (128667057L, 3226719232L, ItemGrade.Foods),
    DEURINGASTRUFFLES                   (128667058L, 3229713408L, ItemGrade.Foods),
    HR7221WHEAT                         (128667059L, 3226170880L, ItemGrade.Foods),
    JAROUARICE                          (128667060L, 3224698112L, ItemGrade.Foods),
    BELALANSRAYLEATHER                  (128667061L, 3223537152L, ItemGrade.Textiles),
    DAMNACARAPACES                      (128667062L, 3227751936L, ItemGrade.Textiles),
    RAPABAOSNAKESKINS                   (128667063L, 3222875648L, ItemGrade.Textiles),
    VANAYEQUIRHINOFUR                   (128667064L, 3227289856L, ItemGrade.Textiles),
    BASTSNAKEGIN                        (128667065L, 128086776L, ItemGrade.LegalDrugs),
    THRUTISCREAM                        (128667066L, 3226522368L, ItemGrade.LegalDrugs),
    WULPAHYPERBORESYSTEMS               (128667067L, 3221388032L, ItemGrade.Machinery),
    AGANIPPERUSH                        (128667068L, 128012800L, ItemGrade.Medicines),
    TERRAMATERBLOODBORES                (128667069L, 128051466L, ItemGrade.Medicines),
    HOLVADUELLINGBLADES                 (128667070L, 3222713088L, ItemGrade.Weapons),
    KAMORINHISTORICWEAPONS              (128667071L, 3221669632L, ItemGrade.Weapons),
    GILYASIGNATUREWEAPONS               (128667072L, 3226857216L, ItemGrade.Weapons),
    DELTAPHOENICISPALMS                 (128667073L, 128045312L, ItemGrade.Chemicals),
    TOXANDJIVIROCIDE                    (128667074L, 3230258688L, ItemGrade.Chemicals),
    XIHECOMPANIONS                      (128667075L, 3224133120L, ItemGrade.Technology),
    SANUMAMEAT                          (128667076L, 3230331136L, ItemGrade.Foods),
    ETHGREZETEABUDS                     (128667077L, 3229524992L, ItemGrade.Foods),
    CEREMONIALHEIKETEA                  (128667078L, 3227417856L, ItemGrade.Foods),
    TANMARKTRANQUILTEA                  (128667079L, 128057866L, ItemGrade.Foods),
    AZCANCRIFORMULA42                   (128667080L, 3228400128L, ItemGrade.Technology),
    KAMITRACIGARS                       (128667081L, 3225450752L, ItemGrade.LegalDrugs),
    RUSANIOLDSMOKEY                     (128667082L, 3229255680L, ItemGrade.LegalDrugs),
    YASOKONDILEAF                       (128667083L, 3223088640L, ItemGrade.LegalDrugs),
    CHATEAUDEAEGAEON                    (128667084L, 3228416768L, ItemGrade.LegalDrugs),
    WATERSOFSHINTARA                    (128667085L, 128666762L, ItemGrade.Medicines),
    OPHIUCHIEXINOARTEFACTS              (128667668L, 3228939264L, ItemGrade.ConsumerItems),
    BAKEDGREEBLES                       (128667669L, 3229378560L, ItemGrade.Foods),
    CETIAEPYORNISEGG                    (128667670L, 3222560256L, ItemGrade.Foods),
    SAXONWINE                           (128667671L, 3227986432L, ItemGrade.LegalDrugs),
    CENTAURIMEGAGIN                     (128667672L, 3228728832L, ItemGrade.LegalDrugs),
    ANDULIGAFIREWORKS                   (128667673L, 3230243584L, ItemGrade.ConsumerItems),
    BANKIAMPHIBIOUSLEATHER              (128667674L, 3228346112L, ItemGrade.Textiles),
    CHERBONESBLOODCRYSTALS              (128667675L, 3229594624L, ItemGrade.Metals),
    MOTRONAEXPERIENCEJELLY              (128667676L, 3229750528L, ItemGrade.LegalDrugs),
    GEAWENDANCEDUST                     (128667677L, 3230954752L, ItemGrade.LegalDrugs),
    GERASIANGUEUZEBEER                  (128667678L, 3228047360L, ItemGrade.LegalDrugs),
    HAIDNEBLACKBREW                     (128667679L, 3226557696L, ItemGrade.Foods),
    HAVASUPAIDREAMCATCHER               (128667680L, 3221438976L, ItemGrade.ConsumerItems),
    BURNHAMBILEDISTILLATE               (128667681L, 3230224384L, ItemGrade.LegalDrugs),
    HIPORGANOPHOSPHATES                 (128667682L, 3227036160L, ItemGrade.Chemicals),
    JARADHARREPUZZLEBOX                 (128667683L, 3230754816L, ItemGrade.ConsumerItems),
    KORROKUNGPELLETS                    (128667684L, 3228726272L, ItemGrade.Chemicals),
    LFTVOIDEXTRACTCOFFEE                (128667685L, 3229028864L, ItemGrade.Foods),
    HONESTYPILLS                        (128667686L, 3229561344L, ItemGrade.Medicines),
    NONEUCLIDIANEXOTANKS                (128667687L, 3224135424L, ItemGrade.Machinery),
    LTTHYPERSWEET                       (128667688L, 3224166400L, ItemGrade.Foods),
    MECHUCOSHIGHTEA                     (128667689L, 3228398848L, ItemGrade.Foods),
    MEDBSTARLUBE                        (128667690L, 3228762368L, ItemGrade.Chemicals),
    MOKOJINGBEASTFEAST                  (128667691L, 3229612800L, ItemGrade.Foods),
    MUKUSUBIICHITINOS                   (128667692L, 3221719296L, ItemGrade.Foods),
    MULACHIGIANTFUNGUS                  (128667693L, 3228892672L, ItemGrade.Foods),
    NGADANDARIFIREOPALS                 (128667694L, 3226127872L, ItemGrade.Metals),
    TIEGFRIESSYNTHSILK                  (128667695L, 3227726848L, ItemGrade.Textiles),
    UZUMOKULOWGWINGS                    (128667696L, 3226474496L, ItemGrade.ConsumerItems),
    VHERCULISBODYRUB                    (128667697L, 3228959232L, ItemGrade.Medicines),
    WHEEMETEWHEATCAKES                  (128667698L, 3225032704L, ItemGrade.Foods),
    VEGASLIMWEED                        (128667699L, 128149240L, ItemGrade.Medicines),
    ALTAIRIANSKIN                       (128667700L, 128151032L, ItemGrade.ConsumerItems),
    PAVONISEARGRUBS                     (128667701L, 128117240L, ItemGrade.LegalDrugs),
    JOTUNMOOKAH                         (128667702L, 128078840L, ItemGrade.Textiles),
    GIANTVERRIX                         (128667703L, 128121336L, ItemGrade.Machinery),
    INDIBOURBON                         (128667704L, 128118520L, ItemGrade.LegalDrugs),
    AROUCACONVENTUALSWEETS              (128667705L, 128098040L, ItemGrade.Foods),
    TAURICHIMES                         (128667706L, 128134648L, ItemGrade.ConsumerItems),
    ZEESSZEANTGLUE                      (128667707L, 128125432L, ItemGrade.ConsumerItems),
    PANTAAPRAYERSTICKS                  (128667708L, 3228824064L, ItemGrade.Medicines),
    FUJINTEA                            (128667709L, 128134392L, ItemGrade.Foods),
    CHAMELEONCLOTH                      (128667710L, 3223418880L, ItemGrade.Textiles),
    ORRERIANVICIOUSBREW                 (128667711L, 128166392L, ItemGrade.Foods),
    USZAIANTREEGRUB                     (128667712L, 128164856L, ItemGrade.Foods),
    MOMUSBOGSPANIEL                     (128667713L, 128075256L, ItemGrade.ConsumerItems),
    DISOMACORN                          (128667714L, 128161016L, ItemGrade.Foods),
    LEESTIANEVILJUICE                   (128667715L, 128639992L, ItemGrade.LegalDrugs),
    BLUEMILK                            (128667716L, 128639992L, ItemGrade.Foods),
    ALIENEGGS                           (128667717L, 128164088L, ItemGrade.ConsumerItems),
    ALYABODILYSOAP                      (128667718L, 3221638400L, ItemGrade.Medicines),
    VIDAVANTIANLACE                     (128667719L, 3231082240L, ItemGrade.ConsumerItems),
    TRANSGENICONIONHEAD                 (128667760L, 128057866L, ItemGrade.LegalDrugs),
    JAQUESQUINENTIANSTILL               (128668017L, 128667761L, ItemGrade.ConsumerItems),
    SOONTILLRELICS                      (128668018L, 3225348096L, ItemGrade.ConsumerItems),
    ADVERT1                             (128671119L, 3227172352L, ItemGrade.ConsumerItems),
    THEHUTTONMUG                        (128672121L, 3228728832L, ItemGrade.ConsumerItems),
    SOTHISCRYSTALLINEGOLD               (128672122L, 128668557L, ItemGrade.Metals),
    MASTERCHEFS                         (128672316L, 128123640L, ItemGrade.Slavery),
    PERSONALGIFTS                       (128672431L, 3223105792L, ItemGrade.Salvage),
    CRYSTALLINESPHERES                  (128672432L, 128059402L, ItemGrade.Salvage),
    ONIONHEADA                          (128672812L, 3226977024L, ItemGrade.LegalDrugs),
    ONIONHEADB                          (128673069L, 3223027200L, ItemGrade.LegalDrugs),
    GALACTICTRAVELGUIDE                 (128682050L, 128673074L, ItemGrade.Salvage),
    ANIMALEFFIGIES                      (128727921L, 3228463360L, ItemGrade.LegalDrugs),
    SHANSCHARISORCHID                   (128732551L, 128107768L, ItemGrade.ConsumerItems),
    BUCKYBALLBEERMATS                   (128748428L, 128745551L, ItemGrade.ConsumerItems),
    HARMASILVERSEARUM                   (128793113L, 3221575424L, ItemGrade.LegalDrugs),
    PLATINUMALOY                        (128793114L, 3223779840L, ItemGrade.Metals),
    NANOMEDICINES                       (128913661L, 3226651904L, ItemGrade.Medicines),
    DURADRIVES                          (128922524L, 3223453184L, ItemGrade.ConsumerItems),
    APAVIETII                           (128958679L, 128958681L, ItemGrade.LegalDrugs),


    // Powerplay Items
    AISLINGMEDIAMATERIALS               (ItemGrade.Faction),
    AISLINGMEDIARESOURCES               (ItemGrade.Faction),
    AISLINGPROMOTIONALMATERIALS         (ItemGrade.Faction),
    ALLIANCETRADEAGREEMENTS             (ItemGrade.Faction),
    ALLIANCELEGASLATIVECONTRACTS        (ItemGrade.Faction),
    ALLIANCELEGASLATIVERECORDS          (ItemGrade.Faction),
    LAVIGNYCORRUPTIONDOSSIERS           (ItemGrade.Faction),
    LAVIGNYFIELDSUPPLIES                (ItemGrade.Faction),
    LAVIGNYGARISONSUPPLIES              (ItemGrade.Faction),
    RESTRICTEDPACKAGE                   (ItemGrade.Faction),
    LIBERALCAMPAIGNMATERIALS            (ItemGrade.Faction),
    FEDERALAID                          (ItemGrade.Faction),
    FEDERALTRADECONTRACTS               (ItemGrade.Faction),
    LOANEDARMS                          (ItemGrade.Faction),
    PATREUSFIELDSUPPLIES                (ItemGrade.Faction),
    PATREUSGARISONSUPPLIES              (ItemGrade.Faction),
    RESTRICTEDINTEL                     (ItemGrade.Faction),
    REPUBLICANFIELDSUPPLIES             (ItemGrade.Faction),
    REPUBLICANGARISONSUPPLIES           (ItemGrade.Faction),
    SIRIUSFRANCHISEPACKAGE              (ItemGrade.Faction),
    SIRIUSCOMMERCIALCONTRACTS           (ItemGrade.Faction),
    SIRIUSINDUSTRIALEQUIPMENT           (ItemGrade.Faction),
    TORVALCOMMERCIALCONTRACTS           (ItemGrade.Faction),
    IMPERIALPRISONER                    (ItemGrade.Faction),
    UTOPIANPUBLICITY                    (ItemGrade.Faction),
    UTOPIANFIELDSUPPLIES                (ItemGrade.Faction),
    UTOPIANDISSIDENT                    (ItemGrade.Faction),
    ILLICITCONSIGNMENT                  (ItemGrade.Faction),
    UNMARKEDWEAPONS                     (ItemGrade.Faction),
    ONIONHEADSAMPLES                    (ItemGrade.Faction),
    COUNTERCULTURESUPPORT               (ItemGrade.Faction),
    MARKEDSLAVES                        (ItemGrade.Faction),
    TORVALDEEDS                         (ItemGrade.Faction),
    ONIONHEADDERIVATIVES                (ItemGrade.Faction),
    OUTOFDATEGOODS                      (ItemGrade.Faction),
    UNDERGROUNDSUPPORT                  (ItemGrade.Faction),
    GROMCOUNTERINTELLIGENCE             (ItemGrade.Faction),
    GROMWARTROPHIES                     (ItemGrade.Faction),

    ;

    public final long id;
    public final long homeMarket;
    private final ItemGrade grade;
    private String localizedName = name();
    private String locationInformation = "";
    private final List<TaskRecipe> associated = new ArrayList<>();

    Commodity(ItemGrade grade)
    {
        this.id = -1L;
        this.homeMarket = -1L;
        this.grade = grade;
    }

    Commodity(long id, ItemGrade grade)
    {
        this.id = id;
        this.homeMarket = -1;
        this.grade = grade;
    }

    Commodity(long id, long homeMarket, ItemGrade grade)
    {
        this.id = id;
        this.homeMarket = homeMarket;
        this.grade = grade;
    }

    @Override
    public String getLocationInformation()
    {
        return grade.getLocationDescription() + "\n" + locationInformation;
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

    public static Commodity findById(long itemId)
    {
        return Stream.of(values())
            .filter(item -> item.id == itemId)
            .findFirst()
            .orElse(null);
    }

    public static Optional<Commodity> findByName(String name)
    {
        try
        {
            return Optional.of(Commodity.valueOf(name));
        }
        catch (Exception e)
        {
            return Optional.empty();
        }
    }
}
