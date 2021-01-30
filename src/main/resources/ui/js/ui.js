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

function determineReputation(status)
{
    if (status <= -90)
    {
        return "Hostile";
    }
    else if (status > -90 && status <= -35)
    {
        return "Unfriendly";
    }
    else if (status > -35 && status <= 4)
    {
        return "Neutral";
    }
    else if (status > 4 && status <= 35)
    {
        return "Cordial";
    }
    else if (status > 35 && status <= 90)
    {
        return "Friendly";
    }
    else if (status > 90)
    {
        return "Allied";
    }
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
    let target = document.getElementById(id)
    target.value = progress;
    let toolTip = progress + ' / ' + target.max;
    target.setAttribute('title', toolTip);
}

/*
Called with an element ID and maximum value, which is set as the max property on the located
element. Note that the located DOM element is assumed to be a <progress> element and to exist
already in the DOM. If the element is not present, an error will occur but if the element is
of some other type, the max value will likely be ignored.
*/
function setElementProgressMax(id, max)
{
    let target = document.getElementById(id)
    target.max = max;
    let toolTip = target.value + ' / ' + max;
    target.setAttribute('title', toolTip);
}

/*
When material count events are received, this method is called with the material ID and
the current count, which are used to update the appropriate material count in the UI.
*/
function setMaterialCount(id, data)
{
    let materialBin = document.getElementById(id);
    materialBin.stock = data;
}

/*
From the provided module data, updates the corresponding section of the UI to display the
information for each module.
*/
function updateModules(containerId, moduleData)
{
    // get the UI tab for the appropriate module category
    let moduleTab = document.getElementById(containerId);

    // this clears out any elements that may already be present in the tab
    moduleTab.textContent = "";

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

        if (a === 'ShipCockpit')
        {
            return -1;
        }
        if (b === 'ShipCockpit')
        {
            return 1;
        }

        // fall back to the default string compare for all other modules
        return a.localeCompare(b);
    });

    for (let i = 0, len = slots.length; i < len; i++)
    {
        let slot = slots[i];
        let module = moduleData[slot];

        let shipModule = document.createElement('ship-module');
        shipModule.slotName = slot;
        shipModule.loadModuleData(module);
        moduleTab.appendChild(shipModule);
    }
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

function setStatistics(data)
{
    let statData = data['statistics'];
    let statContainer = document.getElementById('extendedStatistics');
    let categories = Object.keys(statData);
    categories.sort();

    for (let i = 0, len = categories.length; i < len; i++)
    {
        let category = categories[i];
        let statistics = statData[category];

        let nextCategory = document.createElement('stat-category');
        nextCategory.category = category;

        let statNames = Object.keys(statistics);
        statNames.sort();

        for (let j = 0, statLen = statNames.length; j < statLen; j++)
        {
            let statName = statNames[j];
            let statValue = statistics[statName];

            let nextStat = document.createElement('commander-stat');
            nextStat.statistic = statName;
            nextStat.statValue = statValue;
            nextCategory.append(nextStat);
        }
        statContainer.append(nextCategory);
    }
}

function setMarketData(data)
{
    if (Object.keys(data).length === 0)
    {
        return
    }

    let market = document.getElementById('marketInfo');
    market.textContent = "";
    market.station = data['name'];
    market.type = data['type'];
    market.system = data['system'];

    let imports = data['imports'];
    let exports = data['exports'];

    let importTypes = Object.keys(imports);
    let exportTypes = Object.keys(exports);

    importTypes.sort();
    exportTypes.sort();

    for (let i = 0, len = importTypes.length; i < len; i++)
    {
        let category = importTypes[i];
        let categoryElement = document.createElement('span');
        categoryElement.classList.add('binCategoryHeader');
        categoryElement.setAttribute('slot', 'imports');
        categoryElement.textContent = category;
        market.append(categoryElement);

        let items = imports[category];
        let itemTypes = Object.keys(items);
        itemTypes.sort();

        for (let it = 0, itLen = itemTypes.length; it < itLen; it++)
        {
            let itemName = itemTypes[it];
            let item = items[itemName];
            let nextItem = document.createElement('market-entry');
            nextItem.setAttribute('slot', 'imports');
            nextItem.commodity = itemName;
            nextItem.quantity = item['quantity'];
            nextItem.price = item['price'];
            nextItem.mean = item['mean'];
            nextItem.profit = item['profit'];
            market.append(nextItem);
        }

    }

    for (let e = 0, len = exportTypes.length; e < len; e++)
    {
        let category = exportTypes[e];
        let categoryElement = document.createElement('h4');
        categoryElement.classList.add('binCategoryHeader');
        categoryElement.setAttribute('slot', 'exports');
        categoryElement.textContent = category;
        market.append(categoryElement);

        let items = exports[category];
        let itemTypes = Object.keys(items);
        itemTypes.sort();

        for (let it = 0, itLen = itemTypes.length; it < itLen; it++)
        {
            let itemName = itemTypes[it];
            let item = items[itemName];
            let nextItem = document.createElement('market-entry');
            nextItem.setAttribute('slot', 'exports');
            nextItem.commodity = itemName;
            nextItem.quantity = item['quantity'];
            nextItem.price = item['price'];
            nextItem.mean = item['mean'];
            nextItem.profit = item['profit'];
            market.append(nextItem);
        }
    }

}

/*
Called when a complex JSON event trigger is detected. Requests the endpoint
of the complex object and passes the data to the provided callback.
*/
function requestJsonEndpoint(endpoint, callback)
{
    fetch(endpoint)
      .then(response => response.json())
      .then(data => callback(data))
      .catch(error => console.error(error));
}

function handleMaterial(e)
{
    let data = JSON.parse(e);
    let name = data['name'];
    let count = data['count'];
    setMaterialCount(name, count);
}

/*
Called when the cargo event comes in. When the initial event is received it
triggers a clearing of the last known values, then the current values are
received immediately after.
*/
function handleCargo(e)
{
    let cargoContainer = document.getElementById('tradeCargo');
    if (e === 'Clear')
    {
        let existingBins = cargoContainer.querySelectorAll('cargo-bin');
        for (let i = 0, len = existingBins.length; i < len; i++)
        {
            cargoContainer.removeChild(existingBins[i]);
        }
    }
    else
    {
        let cargoData = JSON.parse(e);
        let cargoBin = document.createElement('cargo-bin');
        cargoBin.commodity = cargoData['name'];
        cargoBin.stock = cargoData['count'];
        cargoBin.type = cargoData['type'];
        cargoContainer.append(cargoBin);
    }
}

function handleShipData(data)
{
    let layout = JSON.parse(data);

    let baseStats = layout['baseStats'];
    let coreSlots = layout['coreSlots'];
    let optionalSlots = layout['optionalSlots'];
    let hardpointSlots = layout['hardpointSlots'];

    let shipStats = document.getElementById('shipStats');

    // base stats

    shipStats.manufacturer = baseStats['manufacturer'];
    shipStats.model = baseStats['displayName'];
    shipStats.shipSize = baseStats['shipSize'];
    shipStats.baseCost = parseInt(baseStats['baseCost'], 10).toLocaleString("en-US");
    shipStats.crewSeats = baseStats['crewSeats'];
    shipStats.slf = baseStats['slfCapable'];
    shipStats.baseHull = baseStats['hullMass'];
    shipStats.massLock = baseStats['massLockFactor'];
    shipStats.baseAgility = baseStats['agility'];
    shipStats.speed = baseStats['speed'];
    shipStats.maxSpeed = baseStats['maxSpeed'];
    shipStats.boost = baseStats['boostSpeed'];
    shipStats.maxBoost = baseStats['maxBoostSpeed'];

    // core internals

    shipStats.frameShiftDrive = coreSlots['frameShiftDrive'];
    shipStats.fuelTank = coreSlots['fuelTank'];
    shipStats.lifeSupport = coreSlots['lifeSupport'];
    shipStats.powerDistributor = coreSlots['powerDistributor'];
    shipStats.powerPlant = coreSlots['powerPlant'];
    shipStats.sensors = coreSlots['sensors'];
    shipStats.thrusters = coreSlots['thrusters'];

    // optional internals

    if (optionalSlots['SIZE_1'])
    {
        shipStats.size_1 = optionalSlots['SIZE_1'];
    }

    if (optionalSlots['SIZE_2'])
    {
        shipStats.size_2 = optionalSlots['SIZE_2'];
    }

    if (optionalSlots['MILITARY_SIZE_2'])
    {
        shipStats.military_size_2 = optionalSlots['MILITARY_SIZE_2'];
    }

    if (optionalSlots['SIZE_3'])
    {
        shipStats.size_3 = optionalSlots['SIZE_3'];
    }

    if (optionalSlots['MILITARY_SIZE_3'])
    {
        shipStats.military_size_3 = optionalSlots['MILITARY_SIZE_3'];
    }

    if (optionalSlots['SIZE_4'])
    {
        shipStats.size_4 = optionalSlots['SIZE_4'];
    }

    if (optionalSlots['MILITARY_SIZE_4'])
    {
        shipStats.military_size_4 = optionalSlots['MILITARY_SIZE_4'];
    }

    if (optionalSlots['SIZE_5'])
    {
        shipStats.size_5 = optionalSlots['SIZE_5'];
    }

    if (optionalSlots['MILITARY_SIZE_5'])
    {
        shipStats.military_size_5 = optionalSlots['MILITARY_SIZE_5'];
    }

    if (optionalSlots['SIZE_6'])
    {
        shipStats.size_6 = optionalSlots['SIZE_6'];
    }

    if (optionalSlots['SIZE_7'])
    {
        shipStats.size_7 = optionalSlots['SIZE_7'];
    }

    if (optionalSlots['SIZE_8'])
    {
        shipStats.size_8 = optionalSlots['SIZE_8'];
    }

    // hardpoint slots

    if (hardpointSlots['Tiny'])
    {
        shipStats.size_tiny = hardpointSlots['Tiny'];
    }

    if (hardpointSlots['Small'])
    {
        shipStats.size_small = hardpointSlots['Small'];
    }

    if (hardpointSlots['Medium'])
    {
        shipStats.size_medium = hardpointSlots['Medium'];
    }

    if (hardpointSlots['Large'])
    {
        shipStats.size_large = hardpointSlots['Large'];
    }

    if (hardpointSlots['Huge'])
    {
        shipStats.size_huge = hardpointSlots['Huge'];
    }
}

function handleMassData(property, data)
{
    let agilityStats = document.getElementById('agilityStats');
    agilityStats[property] = data;
}

function handleShipValueData(property, data)
{
    let shipStats = document.getElementById('shipStats');
    shipStats[property] = data;
}

function handlePowerData(data)
{
    let powerData = JSON.parse(data);

    let powerStats = document.getElementById('powerStats');
    powerStats.textContent = "";
    powerStats.capacity = powerData['capacity'];
    powerStats.draw = powerData['powerDraw'];
    powerStats.retracted = powerData['retractedDraw'];

    let moduleData = powerData['modules'];
    let moduleNames = Object.keys(moduleData);
    moduleNames.sort((a, b) =>
    {
        let drawA = moduleData[a]['draw'];
        let drawB = moduleData[b]['draw'];
        return drawB - drawA;
    })

    for (let i = 0, len = moduleNames.length; i < len; i++)
    {
        let module = moduleNames[i];
        let nextModule = document.createElement('power-module');
        nextModule.moduleName = module;
        nextModule.draw = moduleData[module]['draw'];
        nextModule.load = moduleData[module]['share'];
        nextModule.priority = moduleData[module]['priority'];
        nextModule.powered = moduleData[module]['powered'];
        powerStats.append(nextModule);
    }
}

function handleOffenseData(data)
{
    let offenseData = JSON.parse(data);

    let offenseStats = document.getElementById('offenseStats');
    offenseStats.textContent = "";

    offenseStats.total = offenseData['totalDPS'];
    offenseStats.thermal = offenseData['totalThermal'];
    offenseStats.kinetic = offenseData['totalKinetic'];
    offenseStats.explosive = offenseData['totalExplosive'];
    offenseStats.absolute = offenseData['totalAbsolute'];

    if (offenseData['weapons'])
    {
        let weaponData = offenseData['weapons'];

        for (let i = 0, len = weaponData.length; i < len; i++)
        {
            let nextWeapon = weaponData[i];
            let weaponName = Object.keys(nextWeapon)[0];
            let data = nextWeapon[weaponName];
            let weaponElement = document.createElement('offense-module');
            weaponElement.setAttribute('slot', 'weapons');
            weaponElement.module = weaponName;
            weaponElement.total = data['total'];
            weaponElement.thermal = data['thermal'];
            weaponElement.kinetic = data['kinetic'];
            weaponElement.explosive = data['explosive'];
            weaponElement.absolute = data['absolute'];
            offenseStats.append(weaponElement);
        }
    }

    if (offenseData['defenseTurrets'])
    {
        let turretData = offenseData['defenseTurrets'];

        for (let i = 0, len = turretData.length; i < len; i++)
        {
            let nextTurret = turretData[i];
            let turretName = Object.keys(nextTurret)[0];
            let data = nextTurret[turretName];
            let turretElement = document.createElement('offense-turret');
            turretElement.setAttribute('slot', 'turrets');
            turretElement.module = turretName;
            turretElement.total = data;
            turretElement.type = 'Kinetic';
            offenseStats.append(turretElement);
        }
    }

}

function handleDefenseData(data)
{
    let defenseData = JSON.parse(data);
    let defenseStats = document.getElementById('defenseStats');
    defenseStats.textContent = '';

    defenseStats.shieldRegen = defenseData['regen'];
    defenseStats.brokenRegenRate = defenseData['brokenRegen'];

    let shieldData = defenseData['Shield Strength'];
    let hullData = defenseData['Hull Strength'];
    let shieldExplosiveData = defenseData['Shield Explosive'];
    let shieldKineticData = defenseData['Shield Kinetic'];
    let shieldThermalData = defenseData['Shield Thermal'];
    let hullExplosiveData = defenseData['Hull Explosive'];
    let hullKineticData = defenseData['Hull Kinetic'];
    let hullThermalData = defenseData['Hull Thermal'];
    let hullCausticData = defenseData['Hull Caustic'];

    let shieldStrength = document.createElement('defense-value');
    shieldStrength.setAttribute('slot', 'hullShield');
    shieldStrength.statistic = 'Shield Strength';
    shieldStrength.statValue = shieldData['value'];
    shieldStrength.base = shieldData['base'];
    shieldStrength.reinforcement = shieldData['reinforcement'];
    shieldStrength.raw = shieldData['raw'];
    shieldStrength.minmax = shieldData['minmax'];

    let hullStrength = document.createElement('defense-value');
    hullStrength.setAttribute('slot', 'hullShield');
    hullStrength.statistic = 'Hull Strength';
    hullStrength.statValue = hullData['value'];
    hullStrength.base = hullData['base'];
    hullStrength.reinforcement = hullData['reinforcement'];
    hullStrength.raw = hullData['raw'];
    hullStrength.minmax = '-';

    let shieldExplosive = document.createElement('defense-resistance');
    shieldExplosive.setAttribute('slot', 'resistance');
    shieldExplosive.statistic = 'Shield Explosive';
    shieldExplosive.statValue = shieldExplosiveData['value'];
    shieldExplosive.base = shieldExplosiveData['base'];
    shieldExplosive.baseMultiplier = shieldExplosiveData['baseMultiplier'];
    shieldExplosive.boost = shieldExplosiveData['boost'];
    shieldExplosive.boostMultiplier = shieldExplosiveData['boostMultiplier'];
    shieldExplosive.raw = shieldExplosiveData['raw'];
    shieldExplosive.minmax = shieldExplosiveData['minmax'];

    let shieldKinetic = document.createElement('defense-resistance');
    shieldKinetic.setAttribute('slot', 'resistance');
    shieldKinetic.statistic = 'Shield Kinetic';
    shieldKinetic.statValue = shieldKineticData['value'];
    shieldKinetic.base = shieldKineticData['base'];
    shieldKinetic.baseMultiplier = shieldKineticData['baseMultiplier'];
    shieldKinetic.boost = shieldKineticData['boost'];
    shieldKinetic.boostMultiplier = shieldKineticData['boostMultiplier'];
    shieldKinetic.raw = shieldKineticData['raw'];
    shieldKinetic.minmax = shieldKineticData['minmax'];

    let shieldThermal = document.createElement('defense-resistance');
    shieldThermal.setAttribute('slot', 'resistance');
    shieldThermal.statistic = 'Shield Thermal';
    shieldThermal.statValue = shieldThermalData['value'];
    shieldThermal.base = shieldThermalData['base'];
    shieldThermal.baseMultiplier = shieldThermalData['baseMultiplier'];
    shieldThermal.boost = shieldThermalData['boost'];
    shieldThermal.boostMultiplier = shieldThermalData['boostMultiplier'];
    shieldThermal.raw = shieldThermalData['raw'];
    shieldThermal.minmax = shieldThermalData['minmax'];

    let hullExplosive = document.createElement('defense-resistance');
    hullExplosive.setAttribute('slot', 'resistance');
    hullExplosive.statistic = 'Armour Explosive';
    hullExplosive.statValue = hullExplosiveData['value'];
    hullExplosive.base = hullExplosiveData['base'];
    hullExplosive.baseMultiplier = hullExplosiveData['baseMultiplier'];
    hullExplosive.boost = hullExplosiveData['boost'];
    hullExplosive.boostMultiplier = hullExplosiveData['boostMultiplier'];
    hullExplosive.raw = hullExplosiveData['raw'];
    hullExplosive.minmax = hullExplosiveData['minmax'];

    let hullKinetic = document.createElement('defense-resistance');
    hullKinetic.setAttribute('slot', 'resistance');
    hullKinetic.statistic = 'Armour Kinetic';
    hullKinetic.statValue = hullKineticData['value'];
    hullKinetic.base = hullKineticData['base'];
    hullKinetic.baseMultiplier = hullKineticData['baseMultiplier'];
    hullKinetic.boost = hullKineticData['boost'];
    hullKinetic.boostMultiplier = hullKineticData['boostMultiplier'];
    hullKinetic.raw = hullKineticData['raw'];
    hullKinetic.minmax = hullKineticData['minmax'];

    let hullThermal = document.createElement('defense-resistance');
    hullThermal.setAttribute('slot', 'resistance');
    hullThermal.statistic = 'Armour Thermal';
    hullThermal.statValue = hullThermalData['value'];
    hullThermal.base = hullThermalData['base'];
    hullThermal.baseMultiplier = hullThermalData['baseMultiplier'];
    hullThermal.boost = hullThermalData['boost'];
    hullThermal.boostMultiplier = hullThermalData['boostMultiplier'];
    hullThermal.raw = hullThermalData['raw'];
    hullThermal.minmax = hullThermalData['minmax'];

    let hullCaustic = document.createElement('defense-resistance');
    hullCaustic.setAttribute('slot', 'resistance');
    hullCaustic.statistic = 'Armour Caustic';
    hullCaustic.statValue = hullCausticData['value'];
    hullCaustic.base = hullCausticData['base'];
    hullCaustic.baseMultiplier = hullCausticData['baseMultiplier'];
    hullCaustic.boost = hullCausticData['boost'];
    hullCaustic.boostMultiplier = hullCausticData['boostMultiplier'];
    hullCaustic.raw = hullCausticData['raw'];
    hullCaustic.minmax = hullCausticData['minmax'];

    defenseStats.append(shieldStrength,
                        hullStrength,
                        shieldExplosive,
                        shieldKinetic,
                        shieldThermal,
                        hullExplosive,
                        hullKinetic,
                        hullThermal,
                        hullCaustic);
}

function handleEngineerData(data)
{
    let engineerData = JSON.parse(data);
    let engineerStats = document.getElementById('engineerStats');
    engineerStats.textContent = "";

    let engineers = Object.keys(engineerData);
    engineers.sort();

    for (let i = 0, len = engineers.length; i < len; i++)
    {
        let engineer = engineers[i];
        let engineerInfo = engineerData[engineer];
        let nextEngineer = document.createElement('engineer-data');
        nextEngineer.engineer = engineerInfo['name'];
        nextEngineer.system = engineerInfo['system'];
        nextEngineer.location = engineerInfo['location'];
        nextEngineer.distance = (engineerInfo['distance'] === -1)
            ? '???'
            : parseInt(engineerInfo['distance'], 10).toLocaleString("en-US");
        nextEngineer.status = engineerInfo['status'];
        nextEngineer.rank = engineerInfo['rank'];
        nextEngineer.progress = (engineerInfo['rank'] === 5) ? '-' : engineerInfo['progress'];
        engineerStats.append(nextEngineer);
    }
}

function handleFactionData(statistic, data)
{
    let factionStats = document.getElementById('factionStats');
    factionStats[statistic] = data;
}

function handleRouteData(data)
{
    let route = JSON.parse(data)['route'];

    let navigationRoute = document.getElementById('navigationRoute');
    navigationRoute.textContent = "";
    navigationRoute.destination = route[route.length - 1]['name'];
    navigationRoute.distance = route[route.length - 1]['distance'];

    for (let i = 0, len = route.length; i < len; i++)
    {
        let nextSystem = route[i];
        let nextEntry = document.createElement('route-entry');
        nextEntry.system = nextSystem['name'];
        nextEntry.distance = nextSystem['distance'];
        navigationRoute.append(nextEntry);
    }
}

function setCartographyData(data, id)
{
    let systemCartography = document.getElementById(id);
    systemCartography.textContent = "";
    systemCartography.system = data['star_system'];

    if (data['star_system_body_count'])
    {
        systemCartography.bodies = data['star_system_body_count'];
    }

    if (data['bodies'])
    {
        let bodies = data['bodies'];

        systemCartography.scannedBodies = bodies.length;

        for (let i = 0, len = bodies.length; i < len; i++)
        {
            let body = bodies[i];
            let nextEntry = document.createElement('cartographic-data');
            nextEntry.bodyType = body['stellar_body_type'];
            nextEntry.bodyName = body['stellar_body_name'];
            nextEntry.loadBodyData(body);
            systemCartography.append(nextEntry);
        }
    }
}

function setSystemCartographyData(data)
{
    setCartographyData(data, 'systemCartography');
}

function setCataloguedSystemData(data)
{
    setCartographyData(data, 'catalogCartography');
}

function setSystemCatalog(data)
{
    let entries = data['entries'];
    entries.sort((a,b) =>
    {
        let aName = a['name'];
        let bName = b['name'];
        return bName.localeCompare(aName);
    })
    let catalog = document.getElementById('systemCatalog');
    for (let i = 0, len = entries.length; i < len; i++)
    {
        let nextSystem = entries[i];
        catalog.loadSystemData(nextSystem);
    }
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

    // The player's current location
    Location: (e) => setElementText("Location", e.data),

    // Current game mode
    Game_Mode: (e) => setElementText("Game_Mode", e.data),

    // If in a private group, the name of that group
    Private_Group: (e) => setElementText("Private_Group", e.data),

    // Current ship info; the ship model name, and the player controlled ship name and ID
    Ship: (e) => setElementText("Ship", shipTypes[e.data.toLowerCase()]),
    Ship_Name: (e) => setElementText("Ship_Name", e.data),
    Ship_Ident: (e) => setElementText("Ship_Ident", '[' + e.data.toUpperCase() + ']'),
    Ship_Data: (e) => handleShipData(e.data),

    // Current fuel level data; max and current level
    Fuel_Capacity: (e) =>
    {
        setElementProgressMax("Fuel_Capacity", e.data);
        handleShipValueData('fuelCapacity', e.data)
    },
    Fuel_Level: (e) =>
    {
        setElementProgress("Fuel_Capacity", e.data);
    },
    ReserveCapacity: (e) => handleShipValueData('resevoirCapacity', e.data),

    // Monetary info; current balance, insurance costs, and current loan amount if any
    Credits: (e) => setElementText("Credits", parseInt(e.data, 10).toLocaleString("en-US")),
    Rebuy: (e) => setElementText("Rebuy", parseInt(e.data, 10).toLocaleString("en-US")),
    Loan: (e) => setElementText("Loan", parseInt(e.data, 10).toLocaleString("en-US")),

    CargoCapacity: (e) => handleShipValueData('cargoCapacity', e.data),
    UnladenMass: (e) => handleShipValueData('unladenMass', e.data),
    CurrentMass: (e) => handleShipValueData('currentMass', e.data),
    MaxJumpRange: (e) => handleShipValueData('maxRange', e.data),
    HullValue: (e) => handleShipValueData('hullValue', parseInt(e.data, 10).toLocaleString("en-US")),
    ModulesValue: (e) => handleShipValueData('moduleValue', parseInt(e.data, 10).toLocaleString("en-US")),

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

    // Naval ranks
    Rank_Federation: (e) => handleFactionData("federalNavy", federalRanks[e.data]),
    Progress_Federation: (e) => handleFactionData("federalNavyProgress", e.data),
    Rank_Empire: (e) => handleFactionData("imperialNavy", empireRanks[e.data]),
    Progress_Empire: (e) => handleFactionData("imperialNavyProgress", e.data),

    // Faction reputations
    Reputation_Federation: (e) =>
    {
        handleFactionData("federation", determineReputation(e.data));
        handleFactionData("federationProgress", e.data);
    },
    Reputation_Empire: (e) =>
    {
        handleFactionData("empire", determineReputation(e.data));
        handleFactionData("empireProgress", e.data);
    },
    Reputation_Alliance: (e) =>
    {
        handleFactionData("alliance", determineReputation(e.data));
        handleFactionData("allianceProgress", e.data);
    },
    Reputation_Independent: (e) =>
    {
        handleFactionData("independent", determineReputation(e.data));
        handleFactionData("independentProgress", e.data);
    },

    // Signals the player's ship loadout has changed
    Loadout: (e) => requestJsonEndpoint('/loadout', setLoadout),

    // Extended player stats (total time played, etc.)
    Statistics: (e) => requestJsonEndpoint('/statistics', setStatistics),

    // Information about the most recently visited commodity market
    Market: (e) => requestJsonEndpoint('/market', setMarketData),

    // Contains information about current power usage on the player's ship
    PowerStats: (e) => handlePowerData(e.data),

    // Offensive information about the player's current ship loadout
    OffenseStats: (e) => handleOffenseData(e.data),

    // Defensive information about the player's current ship loadout
    DefenseStats: (e) => handleDefenseData(e.data),

    // Engineer progress information
    Engineers: (e) => handleEngineerData(e.data),

    // Called when the player's cargo manifest changes, contains info about each item
    Cargo: (e) => handleCargo(e.data),

    // Called when the player's crafting material counts change
    Material: (e) => handleMaterial(e.data),

    // Contains the player's currently planned navigation route
    Route: (e) => handleRouteData(e.data),

    Cartography: (e) => requestJsonEndpoint('/cartography?id=' + e.data, setSystemCartographyData),

    Catalog: (e) => requestJsonEndpoint('/catalog', setSystemCatalog),
};

window.onload = (e) =>
{
    eventSource = new EventSource('/');
    Object.keys(eventListeners)
        .forEach(event => eventSource.addEventListener(event, eventListeners[event]));
};