var eventSource;

// Mappings for various game data

const combatRanks =
[
    'Harmless',
    'Mostly Harmless',
    'Novice',
    'Competent',
    'Expert',
    'Master',
    'Dangerous',
    'Deadly',
    'Elite'
];

const tradeRanks =
[
    'Penniless',
    'Mostly Penniless',
    'Peddler',
    'Dealer',
    'Merchant',
    'Broker',
    'Entrepreneur',
    'Tycoon',
    'Elite'
];

const exploreRanks =
[
    'Aimless',
    'Mostly Aimless',
    'Scout',
    'Surveyor',
    'Trailblazer',
    'Pathfinder',
    'Ranger',
    'Pioneer',
    'Elite'
];

const cqcRanks =
[
    'Helpless',
    'Mostly Helpless',
    'Amateur',
    'Semi Professional',
    'Professional',
    'Champion',
    'Hero',
    'Legend',
    'Elite'
];

const federalRanks =
[
    'None',
    'Recruit',
    'Cadet',
    'Midshipman',
    'Petty Officer',
    'Chief Petty Officer',
    'Warrant Officer',
    'Ensign',
    'Lieutenant',
    'Lieutenant Commander',
    'Post Commander',
    'Post Captain',
    'Rear Admiral',
    'Vice Admiral',
    'Admiral'
];

const empireRanks =
[
    'None',
    'Outsider',
    'Serf',
    'Master',
    'Squire',
    'Knight',
    'Lord',
    'Baron',
    'Viscount',
    'Count',
    'Earl',
    'Marquis',
    'Duke',
    'Prince',
    'King'
];

const shipTypes =
{
    adder : "Adder",
    hauler : "Hauler",
    ferdelance : "Fer-De-Lance",
    mamba : "Mamba",
    sidewinder : "Sidewinder",
    cobramkiii : "Cobra MK III",
    cobramkiv : "Cobra MK IV",
    viper : "Viper MK III",
    viper_mkiv : "Viper MK IV",
    krait_mkii : "Krait MK II",
    krait_light : "Krait Phantom",
    python : "Python",
    anaconda : "Anaconda",
    diamondbackxl : "Diamondback Explorer",
    diamondback : "Diamondback Scout",
    asp : "Asp Explorer",
    asp_scout : "Asp Scout",
    independant_trader : "Keelback",
    type6 : "Type-6",
    type7 : "Type-7",
    type9 : "Type-9",
    type9_military : "Type-10",
    typex : "Chieftain",
    typex_2 : "Crusader",
    typex_3 : "Challenger",
    eagle : "Eagle",
    empire_eagle : "Imperial Eagle",
    vulture : "Vulture",
    federation_dropship_mkii : "Federal Assault Ship",
    federation_dropship : "Federal Dropship",
    federation_gunship : "Federal Gunship",
    federation_corvette : "Federal Corvette",
    dolphin : "Dolphin",
    orca : "Orca",
    belugaliner : "Beluga Liner",
    empire_trader : "Imperial Clipper",
    empire_courier : "Imperial Courier",
    cutter : "Imperial Cutter"
}


function setElementText(id, data)
{
    document.getElementById(id).textContent = data;
}

function setElementProgress(id, data)
{
    document.getElementById(id).value = data;
}

function setElementProgressMax(id, data)
{
    document.getElementById(id).max = data;
}

function setMaterialCount(id, data)
{
    let materialBin = document.getElementById(id);
    let count = materialBin.querySelector('.bin_count');
    let capacity = materialBin.querySelector('.bin_capacity > progress');
    count.textContent = data;
    capacity.value = data;
}

const eventListeners =
{
    Commander: (e) => setElementText("Commander", e.data),

    Game_Mode: (e) => setElementText("Game_Mode", e.data),
    Private_Group: (e) => setElementText("Private_Group", e.data),

    Ship: (e) => setElementText("Ship", shipTypes[e.data.toLowerCase()]),
    Ship_Name: (e) => setElementText("Ship_Name", e.data),
    Ship_Ident: (e) => setElementText("Ship_Ident", e.data.toUpperCase()),

    Fuel_Level: (e) =>
    {
        setElementText("Fuel_Level", e.data),
        setElementProgress("Fuel_Capacity", e.data)
    },

    Fuel_Capacity: (e) => setElementProgressMax("Fuel_Capacity", e.data),

    Credits: (e) => setElementText("Credits", parseInt(e.data, 10).toLocaleString("en-US")),
    Loan: (e) => setElementText("Loan", parseInt(e.data, 10).toLocaleString("en-US")),

    Rank_Combat: (e) => setElementText("Rank_Combat", combatRanks[e.data]),
    Rank_Trade: (e) => setElementText("Rank_Trade", tradeRanks[e.data]),
    Rank_Explore: (e) => setElementText("Rank_Explore", exploreRanks[e.data]),
    Rank_CQC: (e) => setElementText("Rank_CQC", cqcRanks[e.data]),

    Progress_Combat: (e) => setElementProgress("Progress_Combat", e.data),
    Progress_Trade: (e) => setElementProgress("Progress_Trade", e.data),
    Progress_Explore: (e) => setElementProgress("Progress_Explore", e.data),
    Progress_CQC: (e) => setElementProgress("Progress_CQC", e.data),

    Rank_Federation: (e) => setElementText("Rank_Federation", federalRanks[e.data]),
    Progress_Federation: (e) => setElementProgress("Progress_Federation", e.data),
    Reputation_Federation: (e) => setElementProgress("Reputation_Federation", e.data),

    Rank_Empire: (e) => setElementText("Rank_Empire", empireRanks[e.data]),
    Progress_Empire: (e) => setElementProgress("Progress_Empire", e.data),
    Reputation_Empire: (e) => setElementProgress("Reputation_Empire", e.data),

    Reputation_Alliance: (e) => setElementProgress("Reputation_Alliance", e.data),

    Reputation_Independent: (e) => setElementProgress("Reputation_Independent", e.data),

    // Material events
    CARBON: (e) => setMaterialCount("CARBON", e.data),
    VANADIUM: (e) => setMaterialCount("VANADIUM", e.data),
    NIOBIUM: (e) => setMaterialCount("NIOBIUM", e.data),
    YTTRIUM: (e) => setMaterialCount("YTTRIUM", e.data),
    PHOSPHORUS: (e) => setMaterialCount("PHOSPHORUS", e.data),
    CHROMIUM: (e) => setMaterialCount("CHROMIUM", e.data),
    MOLYBDENUM: (e) => setMaterialCount("MOLYBDENUM", e.data),
    TECHNETIUM: (e) => setMaterialCount("TECHNETIUM", e.data),
    SULPHUR: (e) => setMaterialCount("SULPHUR", e.data),
    MANGANESE: (e) => setMaterialCount("MANGANESE", e.data),
    CADMIUM: (e) => setMaterialCount("CADMIUM", e.data),
    RUTHENIUM: (e) => setMaterialCount("RUTHENIUM", e.data),
    IRON: (e) => setMaterialCount("IRON", e.data),
    ZINC: (e) => setMaterialCount("ZINC", e.data),
    TIN: (e) => setMaterialCount("TIN", e.data),
    SELENIUM: (e) => setMaterialCount("SELENIUM", e.data),
    NICKEL: (e) => setMaterialCount("NICKEL", e.data),
    GERMANIUM: (e) => setMaterialCount("GERMANIUM", e.data),
    TUNGSTEN: (e) => setMaterialCount("TUNGSTEN", e.data),
    TELLURIUM: (e) => setMaterialCount("TELLURIUM", e.data),
    RHENIUM: (e) => setMaterialCount("RHENIUM", e.data),
    ARSENIC: (e) => setMaterialCount("ARSENIC", e.data),
    MERCURY: (e) => setMaterialCount("MERCURY", e.data),
    POLONIUM: (e) => setMaterialCount("POLONIUM", e.data),
    LEAD: (e) => setMaterialCount("LEAD", e.data),
    ZIRCONIUM: (e) => setMaterialCount("ZIRCONIUM", e.data),
    BORON: (e) => setMaterialCount("BORON", e.data),
    ANTIMONY: (e) => setMaterialCount("ANTIMONY", e.data),
    SALVAGEDALLOYS: (e) => setMaterialCount("SALVAGEDALLOYS", e.data),
    GALVANISINGALLOYS: (e) => setMaterialCount("GALVANISINGALLOYS", e.data),
    PHASEALLOYS: (e) => setMaterialCount("PHASEALLOYS", e.data),
    PROTOLIGHTALLOYS: (e) => setMaterialCount("PROTOLIGHTALLOYS", e.data),
    PROTORADIOLICALLOYS: (e) => setMaterialCount("PROTORADIOLICALLOYS", e.data),
    GRIDRESISTORS: (e) => setMaterialCount("GRIDRESISTORS", e.data),
    HYBRIDCAPACITORS: (e) => setMaterialCount("HYBRIDCAPACITORS", e.data),
    ELECTROCHEMICALARRAYS: (e) => setMaterialCount("ELECTROCHEMICALARRAYS", e.data),
    POLYMERCAPACITORS: (e) => setMaterialCount("POLYMERCAPACITORS", e.data),
    MILITARYSUPERCAPACITORS: (e) => setMaterialCount("MILITARYSUPERCAPACITORS", e.data),
    CHEMICALSTORAGEUNITS: (e) => setMaterialCount("CHEMICALSTORAGEUNITS", e.data),
    CHEMICALPROCESSORS: (e) => setMaterialCount("CHEMICALPROCESSORS", e.data),
    CHEMICALDISTILLERY: (e) => setMaterialCount("CHEMICALDISTILLERY", e.data),
    CHEMICALMANIPULATORS: (e) => setMaterialCount("CHEMICALMANIPULATORS", e.data),
    PHARMACEUTICALISOLATORS: (e) => setMaterialCount("PHARMACEUTICALISOLATORS", e.data),
    COMPACTCOMPOSITES: (e) => setMaterialCount("COMPACTCOMPOSITES", e.data),
    FILAMENTCOMPOSITES: (e) => setMaterialCount("FILAMENTCOMPOSITES", e.data),
    HIGHDENSITYCOMPOSITES: (e) => setMaterialCount("HIGHDENSITYCOMPOSITES", e.data),
    FEDPROPRIETARYCOMPOSITES: (e) => setMaterialCount("FEDPROPRIETARYCOMPOSITES", e.data),
    FEDCORECOMPOSITES: (e) => setMaterialCount("FEDCORECOMPOSITES", e.data),
    BASICCONDUCTORS: (e) => setMaterialCount("BASICCONDUCTORS", e.data),
    CONDUCTIVECOMPONENTS: (e) => setMaterialCount("CONDUCTIVECOMPONENTS", e.data),
    CONDUCTIVECERAMICS: (e) => setMaterialCount("CONDUCTIVECERAMICS", e.data),
    CONDUCTIVEPOLYMERS: (e) => setMaterialCount("CONDUCTIVEPOLYMERS", e.data),
    BIOTECHCONDUCTORS: (e) => setMaterialCount("BIOTECHCONDUCTORS", e.data),
    CRYSTALSHARDS: (e) => setMaterialCount("CRYSTALSHARDS", e.data),
    UNCUTFOCUSCRYSTALS: (e) => setMaterialCount("UNCUTFOCUSCRYSTALS", e.data),
    FOCUSCRYSTALS: (e) => setMaterialCount("FOCUSCRYSTALS", e.data),
    REFINEDFOCUSCRYSTALS: (e) => setMaterialCount("REFINEDFOCUSCRYSTALS", e.data),
    EXQUISITEFOCUSCRYSTALS: (e) => setMaterialCount("EXQUISITEFOCUSCRYSTALS", e.data),
    HEATCONDUCTIONWIRING: (e) => setMaterialCount("HEATCONDUCTIONWIRING", e.data),
    HEATDISPERSIONPLATE: (e) => setMaterialCount("HEATDISPERSIONPLATE", e.data),
    HEATEXCHANGERS: (e) => setMaterialCount("HEATEXCHANGERS", e.data),
    HEATVANES: (e) => setMaterialCount("HEATVANES", e.data),
    PROTOHEATRADIATORS: (e) => setMaterialCount("PROTOHEATRADIATORS", e.data),
    MECHANICALSCRAP: (e) => setMaterialCount("MECHANICALSCRAP", e.data),
    MECHANICALEQUIPMENT: (e) => setMaterialCount("MECHANICALEQUIPMENT", e.data),
    MECHANICALCOMPONENTS: (e) => setMaterialCount("MECHANICALCOMPONENTS", e.data),
    CONFIGURABLECOMPONENTS: (e) => setMaterialCount("CONFIGURABLECOMPONENTS", e.data),
    IMPROVISEDCOMPONENTS: (e) => setMaterialCount("IMPROVISEDCOMPONENTS", e.data),
    WORNSHIELDEMITTERS: (e) => setMaterialCount("WORNSHIELDEMITTERS", e.data),
    SHIELDEMITTERS: (e) => setMaterialCount("SHIELDEMITTERS", e.data),
    SHIELDINGSENSORS: (e) => setMaterialCount("SHIELDINGSENSORS", e.data),
    COMPOUNDSHIELDING: (e) => setMaterialCount("COMPOUNDSHIELDING", e.data),
    IMPERIALSHIELDING: (e) => setMaterialCount("IMPERIALSHIELDING", e.data),
    TEMPEREDALLOYS: (e) => setMaterialCount("TEMPEREDALLOYS", e.data),
    HEATRESISTANTCERAMICS: (e) => setMaterialCount("HEATRESISTANTCERAMICS", e.data),
    PRECIPITATEDALLOYS: (e) => setMaterialCount("PRECIPITATEDALLOYS", e.data),
    THERMICALLOYS: (e) => setMaterialCount("THERMICALLOYS", e.data),
    MILITARYGRADEALLOYS: (e) => setMaterialCount("MILITARYGRADEALLOYS", e.data),
    UNKNOWNCARAPACE: (e) => setMaterialCount("UNKNOWNCARAPACE", e.data),
    UNKNOWNENERGYCELL: (e) => setMaterialCount("UNKNOWNENERGYCELL", e.data),
    UNKNOWNTECHNOLOGYCOMPONENTS: (e) => setMaterialCount("UNKNOWNTECHNOLOGYCOMPONENTS", e.data),
    UNKNOWNENERGYSOURCE: (e) => setMaterialCount("UNKNOWNENERGYSOURCE", e.data),
    UNKNOWNORGANICCIRCUITRY: (e) => setMaterialCount("UNKNOWNORGANICCIRCUITRY", e.data),
    TG_BIOMECHANICALCONDUITS: (e) => setMaterialCount("TG_BIOMECHANICALCONDUITS", e.data),
    TG_PROPULSIONELEMENT: (e) => setMaterialCount("TG_PROPULSIONELEMENT", e.data),
    TG_WEAPONPARTS: (e) => setMaterialCount("TG_WEAPONPARTS", e.data),
    TG_WRECKAGECOMPONENTS: (e) => setMaterialCount("TG_WRECKAGECOMPONENTS", e.data),
    GUARDIAN_POWERCELL: (e) => setMaterialCount("GUARDIAN_POWERCELL", e.data),
    GUARDIAN_SENTINEL_WRECKAGECOMPONENTS: (e) => setMaterialCount("GUARDIAN_SENTINEL_WRECKAGECOMPONENTS", e.data),
    GUARDIAN_POWERCONDUIT: (e) => setMaterialCount("GUARDIAN_POWERCONDUIT", e.data),
    GUARDIAN_SENTINEL_WEAPONPARTS: (e) => setMaterialCount("GUARDIAN_SENTINEL_WEAPONPARTS", e.data),
    GUARDIAN_TECHCOMPONENT: (e) => setMaterialCount("GUARDIAN_TECHCOMPONENT", e.data),
    BULKSCANDATA: (e) => setMaterialCount("BULKSCANDATA", e.data),
    SCANARCHIVES: (e) => setMaterialCount("SCANARCHIVES", e.data),
    SCANDATABANKS: (e) => setMaterialCount("SCANDATABANKS", e.data),
    ENCODEDSCANDATA: (e) => setMaterialCount("ENCODEDSCANDATA", e.data),
    CLASSIFIEDSCANDATA: (e) => setMaterialCount("CLASSIFIEDSCANDATA", e.data),
    SCRAMBLEDEMISSIONDATA: (e) => setMaterialCount("SCRAMBLEDEMISSIONDATA", e.data),
    ARCHIVEDEMISSIONDATA: (e) => setMaterialCount("ARCHIVEDEMISSIONDATA", e.data),
    EMISSIONDATA: (e) => setMaterialCount("EMISSIONDATA", e.data),
    DECODEDEMISSIONDATA: (e) => setMaterialCount("DECODEDEMISSIONDATA", e.data),
    COMPACTEMISSIONSDATA: (e) => setMaterialCount("COMPACTEMISSIONSDATA", e.data),
    LEGACYFIRMWARE: (e) => setMaterialCount("LEGACYFIRMWARE", e.data),
    CONSUMERFIRMWARE: (e) => setMaterialCount("CONSUMERFIRMWARE", e.data),
    INDUSTRIALFIRMWARE: (e) => setMaterialCount("INDUSTRIALFIRMWARE", e.data),
    SECURITYFIRMWARE: (e) => setMaterialCount("SECURITYFIRMWARE", e.data),
    EMBEDDEDFIRMWARE: (e) => setMaterialCount("EMBEDDEDFIRMWARE", e.data),
    ENCRYPTEDFILES: (e) => setMaterialCount("ENCRYPTEDFILES", e.data),
    ENCRYPTIONCODES: (e) => setMaterialCount("ENCRYPTIONCODES", e.data),
    SYMMETRICKEYS: (e) => setMaterialCount("SYMMETRICKEYS", e.data),
    ENCRYPTIONARCHIVES: (e) => setMaterialCount("ENCRYPTIONARCHIVES", e.data),
    ADAPTIVEENCRYPTORS: (e) => setMaterialCount("ADAPTIVEENCRYPTORS", e.data),
    SHIELDCYCLERECORDINGS: (e) => setMaterialCount("SHIELDCYCLERECORDINGS", e.data),
    SHIELDSOAKANALYSIS: (e) => setMaterialCount("SHIELDSOAKANALYSIS", e.data),
    SHIELDDENSITYREPORTS: (e) => setMaterialCount("SHIELDDENSITYREPORTS", e.data),
    SHIELDPATTERNANALYSIS: (e) => setMaterialCount("SHIELDPATTERNANALYSIS", e.data),
    SHIELDFREQUENCYDATA: (e) => setMaterialCount("SHIELDFREQUENCYDATA", e.data),
    DISRUPTEDWAKEECHOES: (e) => setMaterialCount("DISRUPTEDWAKEECHOES", e.data),
    FSDTELEMETRY: (e) => setMaterialCount("FSDTELEMETRY", e.data),
    WAKESOLUTIONS: (e) => setMaterialCount("WAKESOLUTIONS", e.data),
    HYPERSPACETRAJECTORIES: (e) => setMaterialCount("HYPERSPACETRAJECTORIES", e.data),
    DATAMINEDWAKE: (e) => setMaterialCount("DATAMINEDWAKE", e.data),
    UNKNOWNSHIPSIGNATURE: (e) => setMaterialCount("UNKNOWNSHIPSIGNATURE", e.data),
    UNKNOWNWAKEDATA: (e) => setMaterialCount("UNKNOWNWAKEDATA", e.data),
    TG_STRUCTURALDATA: (e) => setMaterialCount("TG_STRUCTURALDATA", e.data),
    TG_SHIPFLIGHTDATA: (e) => setMaterialCount("TG_SHIPFLIGHTDATA", e.data),
    TG_SHIPSYSTEMSDATA: (e) => setMaterialCount("TG_SHIPSYSTEMSDATA", e.data),
    TG_COMPOSITIONDATA: (e) => setMaterialCount("TG_COMPOSITIONDATA", e.data),
    TG_RESIDUEDATA: (e) => setMaterialCount("TG_RESIDUEDATA", e.data),
    GUARDIAN_MODULEBLUEPRINT: (e) => setMaterialCount("GUARDIAN_MODULEBLUEPRINT", e.data),
    GUARDIAN_VESSELBLUEPRINT: (e) => setMaterialCount("GUARDIAN_VESSELBLUEPRINT", e.data),
    GUARDIAN_WEAPONBLUEPRINT: (e) => setMaterialCount("GUARDIAN_WEAPONBLUEPRINT", e.data),
    ANCIENTHISTORICALDATA: (e) => setMaterialCount("ANCIENTHISTORICALDATA", e.data),
    ANCIENTCULTURALDATA: (e) => setMaterialCount("ANCIENTCULTURALDATA", e.data),
    ANCIENTBIOLOGICALDATA: (e) => setMaterialCount("ANCIENTBIOLOGICALDATA", e.data),
    ANCIENTLANGUAGEDATA: (e) => setMaterialCount("ANCIENTLANGUAGEDATA", e.data),
    ANCIENTTECHNOLOGICALDATA: (e) => setMaterialCount("ANCIENTTECHNOLOGICALDATA", e.data),
};

window.onload = (e) =>
{
    eventSource = new EventSource('/');
    Object.keys(eventListeners)
        .forEach(event => eventSource.addEventListener(event, eventListeners[event]));
};