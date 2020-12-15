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
};

window.onload = (e) =>
{
    eventSource = new EventSource('/');
    Object.keys(eventListeners)
        .forEach(event => eventSource.addEventListener(event, eventListeners[event]));
};