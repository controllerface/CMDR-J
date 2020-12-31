/*
Global EventSource object; On page load, this object holds the connection to the local server.
By convention, this connection should always be active as long as the local server is running.
*/
var eventSource;

/*
Mappings for various game data. Note that for each of these are arrays, and order is important.
The events contain numerical values which are used as an index into the appropriate array to
display the correct info in the UI.
*/

// Combat Ranks
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

// Trade Ranks
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

// Exploration Ranks
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

// CQC Ranks
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

// Federal Navy Ranks
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

// Imperial Navy Ranks
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

// Ship Models
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

/*
Called with an element ID and text value, which is set as the textContent property on the located
element. Note that the located DOM element is assumed to exist already in the DOM. If the element
is not present, an error will occur.
*/
function setElementText(id, text)
{
    document.getElementById(id).textContent = text;
}

/*
Called with an element ID and progress value, which is set as the value property on the located
element. Note that the located DOM element is assumed to be a <progress> element and to exist
already in the DOM. If the element is not present, an error will occur but if the element is
of some other type, the value will likely be ignored.
*/
function setElementProgress(id, progress)
{
    document.getElementById(id).value = progress;
}

/*
Called with an element ID and maximum value, which is set as the max property on the located
element. Note that the located DOM element is assumed to be a <progress> element and to exist
already in the DOM. If the element is not present, an error will occur but if the element is
of some other type, the max value will likely be ignored.
*/
function setElementProgressMax(id, max)
{
    document.getElementById(id).max = max;
}

/*
When material count events are received, this method is called with the material ID and
the current count, which are used to update the appropriate material count in the UI.
*/
function setMaterialCount(id, data)
{
    let materialBin = document.getElementById(id);
    let count = materialBin.querySelector('.binCount');
    let capacity = materialBin.querySelector('.binCapacity > progress');
    count.textContent = data;
    capacity.value = data;
}

/*
From the provided module data, updates the corresponding section of the UI to display the
information for each module.
*/
function updateModules(containerId, moduleData)
{
    console.log(moduleData);

    // get the UI tab for the appropriate module category
    let moduleTab = document.getElementById(containerId);

    // this clears out any elements that may already be present in the tab
    moduleTab.textContent = "";

    // create a new empty container element that will hold the module information
    let moduleContainer = document.createElement('div');
    moduleContainer.classList.add('moduleList');

    // get all the slot names and sort them
    let slots = Object.keys(moduleData);
    slots.sort((a, b) =>
    {
        /*
        The planetary approach suite is categorized as an optional internal module,
        though now that the Horizons expansion has been rolled into the main game,
        it will always be present. When modules like this have been made universal
        in the past (ex: discovery scanner) they eventually phased out the module
        altogether, and this may happen in the future. If it does, then this can
        be removed.
        */
        if (a === 'PlanetaryApproachSuite')
        {
            return 1;
        }
        if (b === 'PlanetaryApproachSuite')
        {
            return -1;
        }

        // fall back to the default string compare for all other modules
        return a.localeCompare(b);
    });

    for (let i = 0, len = slots.length; i < len; i++)
    {
        let slot = slots[i];
        let module = moduleData[slot];
        let slotName = document.createElement('div');
        let moduleElement = document.createElement('details');
        let moduleName = document.createElement('summary');
        moduleName.textContent = module['name'];
        moduleElement.appendChild(moduleName);

        if (module['effects'])
        {
            let effects = module['effects'];
            let statisticsElement = document.createElement('pre');

            let statistics = Object.keys(effects);
            let content = "";
            for (let j = 0, len = statistics.length; j < len; j++)
            {
                let stat = statistics[j];
                let info = effects[stat];
                content += stat + " : " + info['value'] + "\n"
            }
            statisticsElement.textContent = content;

            moduleElement.appendChild(statisticsElement);
        }
        slotName.textContent = slot;
        moduleElement.classList.add('module');
        moduleContainer.appendChild(slotName);
        moduleContainer.appendChild(moduleElement);
    }

    moduleTab.appendChild(moduleContainer);
}

/*
When loadout data is successfully retrieved, it is passed to this method which separates
it into individual categories before updating each of the matching categories' sections
in the UI.
*/
function setLoadout(data)
{
    let coreModules = {};
    let optionalModules = {};
    let hardPoints = {};
    let slots = Object.keys(data);

    for (let i = 0, len = slots.length; i < len; i++)
    {
        let slot = slots[i];
        if (slot.includes('Hardpoint'))
        {
            hardPoints[slot] = data[slot];
        }
        else if (slot.includes('_Size') || slot === 'PlanetaryApproachSuite')
        {
            optionalModules[slot] = data[slot];
        }
        else
        {
            coreModules[slot] = data[slot];
        }
    }

    updateModules('coreInternals', coreModules);
    updateModules('optionalInternals', optionalModules);
    updateModules('hardpoints', hardPoints);
}

/*
When the player's loadout is updated, this method requests that data from the local server.
*/
function requestLoadout()
{
    fetch('/loadout')
      .then(response => response.json())
      .then(data => setLoadout(data))
      .catch(error => console.error(error));
}

/*
This object contains event listener functions that will be bound to the local event source
on page load. For each key listed below, the mapped function is bound to an event with the
exact name of the key itself, so the key must exactly match an event that will be sent over
the event source connection.
*/
const eventListeners =
{
    // The player's commander name
    Commander: (e) => setElementText("Commander", e.data),

    // Current game mode
    Game_Mode: (e) => setElementText("Game_Mode", e.data),

    // If in a private group, the name of that group
    Private_Group: (e) => setElementText("Private_Group", e.data),

    // Current ship info; the ship model name, and the player controlled ship name and ID
    Ship: (e) => setElementText("Ship", shipTypes[e.data.toLowerCase()]),
    Ship_Name: (e) => setElementText("Ship_Name", e.data),
    Ship_Ident: (e) => setElementText("Ship_Ident", e.data.toUpperCase()),

    // Current fuel level data; max and current level
    Fuel_Capacity: (e) => setElementProgressMax("Fuel_Capacity", e.data),
    Fuel_Level: (e) =>
    {
        setElementText("Fuel_Level", e.data),
        setElementProgress("Fuel_Capacity", e.data)
    },

    // Monetary info; current balance, and current loan amount if any
    Credits: (e) => setElementText("Credits", parseInt(e.data, 10).toLocaleString("en-US")),
    Loan: (e) => setElementText("Loan", parseInt(e.data, 10).toLocaleString("en-US")),

    // Current career ranks
    Rank_Combat: (e) => setElementText("Rank_Combat", combatRanks[e.data]),
    Rank_Trade: (e) => setElementText("Rank_Trade", tradeRanks[e.data]),
    Rank_Explore: (e) => setElementText("Rank_Explore", exploreRanks[e.data]),
    Rank_CQC: (e) => setElementText("Rank_CQC", cqcRanks[e.data]),

    // Career rank progress
    Progress_Combat: (e) => setElementProgress("Progress_Combat", e.data),
    Progress_Trade: (e) => setElementProgress("Progress_Trade", e.data),
    Progress_Explore: (e) => setElementProgress("Progress_Explore", e.data),
    Progress_CQC: (e) => setElementProgress("Progress_CQC", e.data),

    // Federal naval rank and reputation
    Rank_Federation: (e) => setElementText("Rank_Federation", federalRanks[e.data]),
    Progress_Federation: (e) => setElementProgress("Progress_Federation", e.data),
    Reputation_Federation: (e) => setElementProgress("Reputation_Federation", e.data),

    // Imperial navy rank and reputation
    Rank_Empire: (e) => setElementText("Rank_Empire", empireRanks[e.data]),
    Progress_Empire: (e) => setElementProgress("Progress_Empire", e.data),
    Reputation_Empire: (e) => setElementProgress("Reputation_Empire", e.data),

    // Alliance reputation
    Reputation_Alliance: (e) => setElementProgress("Reputation_Alliance", e.data),

    // Independent (non-allied) reputation
    Reputation_Independent: (e) => setElementProgress("Reputation_Independent", e.data),

    // Raw materials
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

    // Manufactured materials
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

    // Encoded materials
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

    // Signals the player's ship loadout has changed
    Loadout: (e) => requestLoadout(),
};

window.onload = (e) =>
{
    eventSource = new EventSource('/');
    Object.keys(eventListeners)
        .forEach(event => eventSource.addEventListener(event, eventListeners[event]));
};