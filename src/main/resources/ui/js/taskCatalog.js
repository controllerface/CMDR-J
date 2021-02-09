class TaskCatalog extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_TaskCatalog');
        this.shadowRoot.append(template.content.cloneNode(true));

        this.moduleSort = (a, b) => a['sort'] - b['sort'];
        this.shipSort = (a, b) => a['ship'].localeCompare(b['ship']);

    }

    createCategoryElement(label)
    {
        let details = document.createElement('details');
        details.addEventListener('toggle', (e) =>
        {
            let parent = e.target.parentElement;
            if (e.target.hasAttribute('open'))
            {
                Array.from(parent.children).forEach(child =>
                {

                    if (child !== e.target)
                    {
                        child.removeAttribute('open');
                    }
                });
            }
        });
        details.classList.add('taskCategoryDetails');
        let summary = document.createElement('summary');
        summary.textContent = label;
        details.append(summary);
        return details;
    }

    createSubCategoryElement(label)
    {
        let details = document.createElement('details');
        details.addEventListener('toggle', (e) =>
        {
            let parent = e.target.parentElement;
            if (e.target.hasAttribute('open'))
            {
                Array.from(parent.children).forEach(child =>
                {

                    if (child !== e.target)
                    {
                        child.removeAttribute('open');
                    }
                });
            }
        });
        details.classList.add('taskSubCategoryDetails');
        let summary = document.createElement('summary');
        summary.textContent = label;
        details.append(summary);
        return details;
    }

    createTaskButton(label, value)
    {
        let button = document.createElement('button');
        button.classList.add('taskButton');
        button.textContent = label;
        button.value = value;
        return button;
    }

    createTaskElement(label, key, buttonText)
    {
        let details = document.createElement('details');
        details.addEventListener('toggle', (e) =>
        {
            let parent = e.target.parentElement;
            if (e.target.hasAttribute('open'))
            {
                Array.from(parent.children).forEach(child =>
                {

                    if (child !== e.target)
                    {
                        child.removeAttribute('open');
                    }
                });
            }
        });
        details.classList.add('taskDetails');
        let summary = document.createElement('summary');
        let button = this.createTaskButton(buttonText, key);
        summary.textContent = label;
        summary.append(button);
        details.append(summary);
        return details;
    }

    createTaskCosts(detailElement, costData)
    {
        let container = document.createElement('div');
        container.classList.add('taskCostData');
        costData.forEach(cost =>
        {
            let costRow = document.createElement('div');
            costRow.classList.add('taskCost');
            let amount = document.createElement('span');
            amount.textContent = cost['amount'];
            let unit = document.createElement('span');
            unit.classList.add('valueUnit');
            unit.textContent = cost['unit'];
            costRow.append(amount, unit);
            container.append(costRow);
        });
        detailElement.append(container);
    }

    loadModulePurchaseData(moduleData, categoryElement)
    {
        moduleData.sort(this.moduleSort);
        moduleData.forEach(t =>
        {
            let moduleElement = this.createTaskElement(t['name'], t['key'], 'Plan This Purchase');
            this.createTaskCosts(moduleElement, t['costs']);
            categoryElement.append(moduleElement);
        });
    }

    sortModules(containers, moduleData)
    {
        let matchKeys = Object.keys(containers);
        let moduleNames = Object.keys(moduleData);
        for (let i = 0, len = moduleNames.length; i < len; i++)
        {
            let moduleName = moduleNames[i];
            let match = matchKeys.find(key => moduleName.includes(key));
            if (!match)
            {
                console.error('Unknown module:' + moduleName);
            }
            else
            {
                containers[match].push(moduleData[moduleName]);
            }
        }
    }

    sortModulesArray(containers, moduleArray)
    {
        let matchKeys = Object.keys(containers);
        for (let i = 0, len = moduleArray.length; i < len; i++)
        {
            let module = moduleArray[i];
            let match = matchKeys.find(key => module['name'].includes(key));
            if (!match)
            {
                console.error('Unknown module:' + module['name']);
            }
            else
            {
                containers[match].push(module);
            }
        }
    }

    createModuleTasks(containers, categoryElement)
    {
        let ships = Object.keys(containers);
        for (let i = 0, len = ships.length; i < len; i++)
        {
            let armourTypes = this.createSubCategoryElement(ships[i]);
            this.loadModulePurchaseData(containers[ships[i]], armourTypes);
            categoryElement.append(armourTypes);
        }
    }

    loadArmourPurchases(armourData, categoryElement)
    {
        armourData.sort(this.shipSort);
        let containers = {};
        armourData.forEach(armour =>
        {
            if (!containers[armour['ship']])
            {
                containers[armour['ship']] = [];
            }
        });

        this.sortModulesArray(containers, armourData);
        this.createModuleTasks(containers, categoryElement);
    }

    loadLimpetPurchases(limpetData, categoryElement)
    {
        let containers = {};
        containers['Collector Limpet Controller'] = [];
        containers['Decontamination Limpet Controller'] = [];
        containers['Fuel Transfer Limpet Controller'] = [];
        containers['Hatch Breaker Limpet Controller'] = [];
        containers['Prospector Limpet Controller'] = [];
        containers['Recon Limpet Controller'] = [];
        containers['Repair Limpet Controller'] = [];

        this.sortModulesArray(containers, limpetData);
        this.createModuleTasks(containers, categoryElement);
    }

    loadCorePurchases(moduleData, categoryElement)
    {
        let armourModules = [];
        let fsdModules = [];
        let fuelTanksModules = [];
        let lifeSupportModules = [];
        let distributorModules = [];
        let powerPlantModules = [];
        let sensorModules = [];
        let thrusterModules = [];

        let sortContainers =
        {
            armour           : armourModules,
            hyperdrive       : fsdModules,
            fueltank         : fuelTanksModules,
            lifesupport      : lifeSupportModules,
            powerdistributor : distributorModules,
            powerplant       : powerPlantModules,
            sensors          : sensorModules,
            engine           : thrusterModules
        };

        this.sortModules(sortContainers, moduleData);

        let armourTypes = this.createSubCategoryElement('Armour');
        this.loadArmourPurchases(armourModules, armourTypes);
        categoryElement.append(armourTypes);

        let typeContainers = {};
        typeContainers['Frame Shift Drives']   = fsdModules;
        typeContainers['Fuel Tanks']           = fuelTanksModules;
        typeContainers['Life Support Systems'] = lifeSupportModules;
        typeContainers['Power Distributors']   = distributorModules;
        typeContainers['Power Plants']         = powerPlantModules;
        typeContainers['Sensor Suites']        = sensorModules;
        typeContainers['Thrusters']            = thrusterModules;

        this.createModuleTasks(typeContainers, categoryElement);
    }

    loadOptionalPurchases(moduleData, categoryElement)
    {
        let afm = [];
        let cargoRacks = [];
        let surfaceScanners = [];
        let dockingComputers = [];
        let fighterBays = [];
        let fsdBoosters = [];
        let fsdInterdictors = [];
        let fuelScoops = [];
        let hrp = [];
        let limpetControllers = [];
        let mrp = [];
        let cabins = [];
        let srvBays = [];
        let refineries = [];
        let shieldCells = [];
        let shieldGenerators = [];
        let srp = [];
        let superCruiseAssist = [];

        let containers =
        {
            repairer               : afm,
            cargorack              : cargoRacks,
            detailedsurfacescanner : surfaceScanners,
            dockingcomputer        : dockingComputers,
            fighterbay             : fighterBays,
            fsdbooster             : fsdBoosters,
            fsdinterdictor         : fsdInterdictors,
            fuelscoop              : fuelScoops,
            hullreinforcement      : hrp,
            dronecontrol           : limpetControllers,
            modulereinforcement    : mrp,
            passengercabin         : cabins,
            buggybay               : srvBays,
            refinery               : refineries,
            shieldcellbank         : shieldCells,
            shieldgenerator        : shieldGenerators,
            shieldreinforcement    : srp,
            supercruiseassist      : superCruiseAssist
        };

        this.sortModules(containers, moduleData);

        let typeContainers = {};
        typeContainers['Automated Field Maintenance Units'] = afm;
        typeContainers['Cargo racks']                       = cargoRacks;
        typeContainers['Detailed Surface Scanners']         = surfaceScanners;
        typeContainers['Docking Computers']                 = dockingComputers;
        typeContainers['Fighter Hangars']                   = fighterBays;
        typeContainers['FSD Boosters']                      = fsdBoosters;
        typeContainers['FSD Interdictors']                  = fsdInterdictors;
        typeContainers['Fuel Scoops']                       = fuelScoops;
        typeContainers['Hull Reinforcement Packages']       = hrp;
        this.createModuleTasks(typeContainers, categoryElement);

        let limpetTypes = this.createSubCategoryElement('Limpet Controllers');
        this.loadLimpetPurchases(limpetControllers, limpetTypes);
        categoryElement.append(limpetTypes);

        typeContainers = {};
        typeContainers['Module Reinforcement Packages'] = mrp;
        typeContainers['Passenger Cabins']              = cabins;
        typeContainers['Planetary Vehicle Hangars']     = srvBays;
        typeContainers['Refineries']                    = refineries;
        typeContainers['Shield Cell banks']             = shieldCells;
        typeContainers['Shield Generators']             = shieldGenerators;
        typeContainers['Shield Reinforcement Packages'] = srp;
        typeContainers['Supercruise Assists']           = superCruiseAssist;
        this.createModuleTasks(typeContainers, categoryElement);
    }

    loadUtilityPurchases(moduleData, categoryElement)
    {
        let abrBlaster = [];
        let chafflauncher = [];
        let ecm = [];
        let wakeScanner = []; // FSD Wake
        let heatSink = [];
        let killWarrant = []; // kill
        let manifest = []; //manifest
        let miningLaser = [];
        let pointTurret = [];
        let pulseWave = [];
        let seismicCharge = [];
        let shieldBooster = [];
        let shutdownBarrier = [];
        let subMissile = [];
        let xenoScanner = [];

        let containers =
        {
            mining_abrblstr          : abrBlaster,
            chafflauncher            : chafflauncher,
            electroniccountermeasure : ecm,
            cloudscanner             : wakeScanner,
            heatsinklauncher         : heatSink,
            crimescanner             : killWarrant,
            cargoscanner             : manifest,
            mininglaser              : miningLaser,
            plasmapointdefence       : pointTurret,
            mrascanner               : pulseWave,
            mining_seismchrgwarhd    : seismicCharge,
            shieldbooster            : shieldBooster,
            antiunknownshutdown      : shutdownBarrier,
            mining_subsurfdispmisle  : subMissile,
            xenoscanner              : xenoScanner
        };

        this.sortModules(containers, moduleData);

        let typeContainers = {};
        typeContainers['Abrasion Blasters'] = abrBlaster;
        typeContainers['Chaff Launcher'] = chafflauncher;
        typeContainers['Electronic Countermeasures'] = ecm;
        typeContainers['FSD Wake Scanners'] = wakeScanner;
        typeContainers['Heat-Sink Launcher'] = heatSink;
        typeContainers['Kill Warrant Scanners'] = killWarrant;
        typeContainers['Manifest Scanners'] = manifest;
        typeContainers['Mining Lasers'] = miningLaser;
        typeContainers['Point Defense Turret'] = pointTurret;
        typeContainers['Pulse Wave Analyzer'] = pulseWave;
        typeContainers['Seismic Charge Launcher'] = seismicCharge;
        typeContainers['Shield Booster'] = shieldBooster;
        typeContainers['Shutdown Field Neutraliser'] = shutdownBarrier;
        typeContainers['Sub-Surface Displacement Missile'] = subMissile;
        typeContainers['Xeno Scanner'] = xenoScanner;

        this.createModuleTasks(typeContainers, categoryElement);
    }

    loadWeaponPurchases(moduleData, categoryElement)
    {
        let beamLaser = [];
        let burstLaser = [];
        let cannon = [];
        let fragCannon = [];
        let gaussCannon = [];
        let mines = [];
        let missiles = [];
        let multiCannons = [];
        let plasmaAccelerator = [];
        let plasmaCharger = [];
        let pulseLaser = [];
        let railguns = [];
        let flak = [];
        let flechette = [];
        let seekerMissiles = [];
        let shardCannon = [];
        let shockCannon = [];
        let torpedoes = [];

        let containers =
        {
            beamlaser: beamLaser,
            pulselaserburst: burstLaser,
            _cannon_: cannon,
            slugshot: fragCannon,
            gausscannon: gaussCannon,
            minelauncher: mines,
            dumbfiremissile: missiles,
            causticmissile: missiles,
            multicannon: multiCannons,
            plasmaaccelerator: plasmaAccelerator,
            plasmalauncher: plasmaCharger,
            pulselaser: pulseLaser,
            railgun: railguns,
            flakmortar: flak,
            flechettelauncher: flechette,
            basicmissile: seekerMissiles,
            drunkmissilerack: seekerMissiles,
            shardcannon: shardCannon,
            plasmashockcannon: shockCannon,
            advancedtorppylon: torpedoes
        };

        this.sortModules(containers, moduleData);

        let typeContainers = {};
        typeContainers['Beam Lasers'] = beamLaser;
        typeContainers['Burst Lasers'] = burstLaser;
        typeContainers['Cannons'] = cannon;
        typeContainers['Frag Cannons'] = fragCannon;
        typeContainers['Gauss Cannons'] = gaussCannon;
        typeContainers['Mine Launchers'] = mines;
        typeContainers['Missile Racks'] = missiles;
        typeContainers['Multi-Cannons'] = multiCannons;
        typeContainers['Plasma Accelerators'] = plasmaAccelerator;
        typeContainers['Plasma Chargers'] = plasmaCharger;
        typeContainers['Pulse Lasers'] = pulseLaser;
        typeContainers['Railguns'] = railguns;
        typeContainers['Remote Release Flak Launcher'] = flak;
        typeContainers['Remote Release Flechette Launcher'] = flechette;
        typeContainers['Seeker Missile Racks'] = seekerMissiles;
        typeContainers['Shard Cannons'] = shardCannon;
        typeContainers['Shock Cannons'] = shockCannon;
        typeContainers['Torpedo Pylons'] = torpedoes;

        this.createModuleTasks(typeContainers, categoryElement);
    }

    loadModulePurchases(moduleData)
    {
        let core = moduleData['Core_Internal'];
        let coreElement = this.createCategoryElement('Core Internals');
        this.loadCorePurchases(core, coreElement);

        let optional = moduleData['Optional_Internal'];
        let optionalElement = this.createCategoryElement('Optional Internals');
        this.loadOptionalPurchases(optional, optionalElement);

        let utility = moduleData['Utility_Mounts'];
        let utilityElement = this.createCategoryElement('Utility Modules');
        this.loadUtilityPurchases(utility, utilityElement);

        let weapons = moduleData['Weapon_Hardpoints'];
        let weaponsElement = this.createCategoryElement('Weapons');
        this.loadWeaponPurchases(weapons, weaponsElement);

        let moduleContainer  = this.shadowRoot.getElementById('taskCatalog_modules');
        moduleContainer.append(coreElement, optionalElement, utilityElement, weaponsElement);
    }

    loadModifications(modificationData)
    {
//        console.log(modificationData);
    }

    loadExperimentals(experimentalData)
    {
//        console.log(experimentalData);
    }

    loadTechBrokers(techBrokerData)
    {
//        console.log(techBrokerData);
    }

    loadTrades(tradeData)
    {
//        console.log(tradeData);
    }

    loadSynthesis(synthesisData)
    {
//        console.log(synthesisData);
    }

    loadTaskCatalog(catalogData)
    {
        this.loadModulePurchases(catalogData['modules']);
        this.loadModifications(catalogData['modifications']);
        this.loadExperimentals(catalogData['experimental']);
        this.loadTechBrokers(catalogData['technology']);
        this.loadTrades(catalogData['trades']);
        this.loadSynthesis(catalogData['synthesis']);
    }

    connectedCallback()
    {
        fetch("/tasks?type=catalog")
          .then(response => response.json())
          .then(data => this.loadTaskCatalog(data))
          .catch(error => console.error(error));
    }
}

customElements.define('task-catalog', TaskCatalog);