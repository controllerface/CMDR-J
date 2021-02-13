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


    /* Element Creation Methods */

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
        let hr = document.createElement('hr');
        details.append(summary, hr);
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
        let hr = document.createElement('hr');
        details.append(summary, hr);
        return details;
    }

    createTaskButton(label, value)
    {
        let button = document.createElement('button');
        button.classList.add('taskButton');
        button.textContent = label;
        button.value = value;
        button.addEventListener('click', (e) =>
        {
            adjustTask(e.target.value, 'add');
        });
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
        let hr = document.createElement('hr');
        details.append(summary, hr);
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

    createTaskEffects(detailElement, effectsData)
    {
        let container = document.createElement('div');
        container.classList.add('taskEffectData');
        effectsData.forEach(effect =>
        {
            let effectRow = document.createElement('div');
            effectRow.classList.add('taskEffect');
            let effectName = document.createElement('span');
            effectName.textContent = effect['effect'];
            effectName.classList.add('taskEffectName');
            let value = document.createElement('span');
            if (effect['impact'])
            {
                value.classList.add(effect['impact']);
            }
            if (effect['value'] === '&infin;')
            {
                value.innerHTML = effect['value'];
            }
            else
            {
                value.textContent = effect['value'];
            }
            value.classList.add('taskEffectValue');
            let unit = document.createElement('span');
            unit.classList.add('valueUnit');
            if (effect['unit'] === '&deg;')
            {
                unit.innerHTML = effect['unit'];
            }
            else
            {
                unit.textContent = effect['unit'];
            }
            effectRow.append(effectName, value, unit);
            container.append(effectRow);
        });
        detailElement.append(container);
    }

    createModuleTasks(containers, categoryElement)
    {
        let ships = Object.keys(containers);
        for (let i = 0, len = ships.length; i < len; i++)
        {
            let armourTypes = this.createSubCategoryElement(ships[i]);
            armourTypes.setAttribute('taskType', categoryElement.getAttribute('taskType'));
            this.createModulePurchaseElements(containers[ships[i]], armourTypes);
            categoryElement.append(armourTypes);
        }
    }

    createModulePurchaseElements(moduleData, categoryElement)
    {
        let taskType = categoryElement.getAttribute('taskType');
        moduleData.sort(this.moduleSort);
        moduleData.forEach(t =>
        {
            let moduleElement = this.createTaskElement(t['name'], t['key'], 'Plan This ' + taskType);
            moduleElement.setAttribute('taskType', categoryElement.getAttribute('taskType'));
            this.createTaskCosts(moduleElement, t['costs']);
            this.createTaskEffects(moduleElement, t['effects']);
            categoryElement.append(moduleElement);
        });
    }

    createModificationTask(moduleData, categoryElement)
    {
        let taskType = categoryElement.getAttribute('taskType');
        let moduleElement = this.createTaskElement(moduleData['name'], moduleData['key'], 'Plan This ' + taskType);
        moduleElement.setAttribute('taskType', categoryElement.getAttribute('taskType'));
        this.createTaskCosts(moduleElement, moduleData['costs']);
        this.createTaskEffects(moduleElement, moduleData['effects']);
        categoryElement.append(moduleElement);
    }


    /* Sorting Methods */

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


    /* Module Purchase Methods*/

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
        armourTypes.setAttribute('taskType', categoryElement.getAttribute('taskType'));
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
        limpetTypes.setAttribute('taskType', categoryElement.getAttribute('taskType'));
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
        let wakeScanner = [];
        let heatSink = [];
        let killWarrant = [];
        let manifest = [];
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


    /* Core Modification Methods */

    loadCategoryData(text, data, loader, category)
    {
        let element = this.createCategoryElement(text);
        element.setAttribute('taskType', category.getAttribute('taskType'));
        loader.call(this, data, element);
        category.append(element);
    }

    loadSubcategoryData(text, data, loader, category)
    {
        let element = this.createSubCategoryElement(text);
        element.setAttribute('taskType', category.getAttribute('taskType'));
        loader.call(this, data, element);
        category.append(element);
    }

    loadModificationGrades(modificationData, categoryElement)
    {
        let grades = Object.keys(modificationData);
        grades.sort((a, b) => modificationData[a]['sort'] - modificationData[b]['sort']);
        grades.forEach(grade => this.createModificationTask(modificationData[grade], categoryElement));
    }

    loadBulkheadModifications(modificationData, categoryElement)
    {

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Armour_Advanced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Blast Resistant',
                                 modificationData['Armour_Explosive'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Heavy Duty',
                                 modificationData['Armour_HeavyDuty'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Kinetic Resistant',
                                 modificationData['Armour_Kinetic'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Thermal Resistant',
                                 modificationData['Armour_Thermic'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadFsdModifications(modificationData, categoryElement)
    {

        this.loadSubcategoryData('Faster Boot Sequence',
                                 modificationData['FSD_FastBoot'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Increased Range',
                                 modificationData['FSD_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['FSD_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadLifeSupportModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadDistributorModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('High Charge Capacity',
                                 modificationData['PowerDistributor_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Charge Enhanced',
                                 modificationData['PowerDistributor_HighFrequency'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Engine Focused',
                                 modificationData['PowerDistributor_PriorityEngines'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('System Focused',
                                 modificationData['PowerDistributor_PrioritySystems'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Weapon Focused',
                                 modificationData['PowerDistributor_PriorityWeapons'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['PowerDistributor_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadPowerPlantModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Armoured',
                                 modificationData['PowerPlant_Armoured'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Low Emissions',
                                 modificationData['PowerPlant_Stealth'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['PowerPlant_Boosted'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadSensorModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Sensor_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Sensor_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Wide Angle',
                                 modificationData['Sensor_WideAngle'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadThrusterModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Clean',
                                 modificationData['Engine_Tuned'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Dirty',
                                 modificationData['Engine_Dirty'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Engine_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadCoreModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Bulkheads',
                                 modificationData['Bulkheads'],
                                 this.loadBulkheadModifications,
                                 categoryElement);

        this.loadSubcategoryData('Frame Shift Drives',
                                 modificationData['Frame_Shift_Drive'],
                                 this.loadFsdModifications,
                                 categoryElement);

        this.loadSubcategoryData('Life Support Systems',
                                 modificationData['Life_Support'],
                                 this.loadLifeSupportModifications,
                                 categoryElement);

        this.loadSubcategoryData('Power Distributors',
                                 modificationData['Power_Distributor'],
                                 this.loadDistributorModifications,
                                 categoryElement);

        this.loadSubcategoryData('Power Plants',
                                 modificationData['Power_Plant'],
                                 this.loadPowerPlantModifications,
                                 categoryElement);

        this.loadSubcategoryData('Sensor Suites',
                                 modificationData['Sensors'],
                                 this.loadSensorModifications,
                                 categoryElement);

        this.loadSubcategoryData('Thrusters',
                                 modificationData['Thrusters'],
                                 this.loadThrusterModifications,
                                 categoryElement);
    }


    /* Optional Modification Methods */

    loadAfmuModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadCollectorLimpetModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadSurfaceScannerModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Expanded Probe Radius',
                                 modificationData['Sensor_Expanded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadInterdictorModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Expanded Capture Arc',
                                 modificationData['FSDinterdictor_Expanded'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['FSDinterdictor_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadFuelScoopModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadFuelLimpetModifications(modificationData, categoryElement)
    {

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadHatchLimpetModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadHRPModifications(modificationData, categoryElement)
    {

        this.loadSubcategoryData('Lightweight',
                                 modificationData['HullReinforcement_Advanced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Blast Resistant',
                                 modificationData['HullReinforcement_Explosive'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Heavy Duty',
                                 modificationData['HullReinforcement_HeavyDuty'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Kinetic Resistant',
                                 modificationData['HullReinforcement_Kinetic'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Thermal Resistant',
                                 modificationData['HullReinforcement_Thermic'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadProspectLimpetModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadRefineryModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadShieldCellModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Rapid Charge',
                                 modificationData['ShieldCellBank_Rapid'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Specialised',
                                 modificationData['ShieldCellBank_Specialised'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadShieldGeneratorModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Kinetic Resistant',
                                 modificationData['ShieldGenerator_Kinetic'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Enhanced Low Power',
                                 modificationData['ShieldGenerator_Optimised'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['ShieldGenerator_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Thermal Resistant',
                                 modificationData['ShieldGenerator_Thermic'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadOptionalModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Auto Field Maintenance Units',
                                 modificationData['Auto_Field_Maintenence_Unit'],
                                 this.loadAfmuModifications,
                                 categoryElement);

        this.loadSubcategoryData('Collector Limpet Controllers',
                                 modificationData['Collector_Limpet_Controller'],
                                 this.loadCollectorLimpetModifications,
                                 categoryElement);

        this.loadSubcategoryData('Detailed Surface Scanners',
                                 modificationData['Detailed_Surface_Scanner'],
                                 this.loadSurfaceScannerModifications,
                                 categoryElement);

        this.loadSubcategoryData('Frame Shift Drive Interdictors',
                                 modificationData['Frame_Shift_Drive_Interdictor'],
                                 this.loadInterdictorModifications,
                                 categoryElement);

        this.loadSubcategoryData('Fuel Scoops',
                                 modificationData['Fuel_Scoop'],
                                 this.loadFuelScoopModifications,
                                 categoryElement);

        this.loadSubcategoryData('Fuel Transfer Limpets',
                                 modificationData['Fuel_Transfer_Limpet'],
                                 this.loadFuelLimpetModifications,
                                 categoryElement);

        this.loadSubcategoryData('Hatch Breaker Limpets',
                                 modificationData['Hatch_Breaker_Limpet'],
                                 this.loadHatchLimpetModifications,
                                 categoryElement);

        this.loadSubcategoryData('Hull Reinforcement Packages',
                                 modificationData['Hull_Reinforcement_Package'],
                                 this.loadHRPModifications,
                                 categoryElement);

        this.loadSubcategoryData('Prospector Limpet Controllers',
                                 modificationData['Prospector_Limpet_Controller'],
                                 this.loadProspectLimpetModifications,
                                 categoryElement);

        this.loadSubcategoryData('Refineries',
                                 modificationData['Refinery'],
                                 this.loadRefineryModifications,
                                 categoryElement);

        this.loadSubcategoryData('Shield Cell Banks',
                                 modificationData['Shield_Cell_Bank'],
                                 this.loadShieldCellModifications,
                                 categoryElement);

        this.loadSubcategoryData('Shield Generators',
                                 modificationData['Shield_Generator'],
                                 this.loadShieldGeneratorModifications,
                                 categoryElement);
    }


    /* Utility Modification Methods */

    loadChaffLauncherModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadECMModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadWakeScannerModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Fast Scan',
                                 modificationData['Sensor_WakeScanner_FastScan'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Sensor_WakeScanner_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Wide Angle',
                                 modificationData['Sensor_WakeScanner_WideAngle'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadHeatSinkModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Ammo Capacity',
                                 modificationData['HeatSinkLauncher_HeatSinkCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadKillScannerModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Long Range',
                                 modificationData['KillWarrantScanner_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Fast Scan',
                                 modificationData['Sensor_KillWarrantScanner_FastScan'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Wide Angle',
                                 modificationData['Sensor_KillWarrantScanner_WideAngle'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadManifestScannerModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Fast Scan',
                                 modificationData['Sensor_CargoScanner_FastScan'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Sensor_CargoScanner_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Wide Angle',
                                 modificationData['Sensor_CargoScanner_WideAngle'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadPointDefenseModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Ammo Capacity',
                                 modificationData['Misc_PointDefenseCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Misc_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Reinforced',
                                 modificationData['Misc_Reinforced'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shielded',
                                 modificationData['Misc_Shielded'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadShieldBoosterModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Blast Resistant',
                                 modificationData['ShieldBooster_Explosive'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('heavy Duty',
                                 modificationData['ShieldBooster_HeavyDuty'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Kinetic Resistant',
                                 modificationData['ShieldBooster_Kinetic'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Resistance Augmented',
                                 modificationData['ShieldBooster_Resistive'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Thermal Resistant',
                                 modificationData['ShieldBooster_Thermic'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadUtilityModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Chaff Launchers',
                                 modificationData['Chaff_Launcher'],
                                 this.loadChaffLauncherModifications,
                                 categoryElement);

        this.loadSubcategoryData('Electronic Countermeasures',
                                 modificationData['Electronic_Countermeasures'],
                                 this.loadECMModifications,
                                 categoryElement);

        this.loadSubcategoryData('Frame Shift Wake Scanners',
                                 modificationData['Frame_Shift_Wake_Scanner'],
                                 this.loadWakeScannerModifications,
                                 categoryElement);

        this.loadSubcategoryData('Heat Sink Launchers',
                                 modificationData['Heat_Sink_Launcher'],
                                 this.loadHeatSinkModifications,
                                 categoryElement);

        this.loadSubcategoryData('Kill Warrant Scanners',
                                 modificationData['Kill_Warrant_Scanner'],
                                 this.loadKillScannerModifications,
                                 categoryElement);

        this.loadSubcategoryData('Manifest Scanners',
                                 modificationData['Manifest_Scanner'],
                                 this.loadManifestScannerModifications,
                                 categoryElement);

        this.loadSubcategoryData('Point Defense Turrets',
                                 modificationData['Point_Defense'],
                                 this.loadPointDefenseModifications,
                                 categoryElement);

        this.loadSubcategoryData('Shield Boosters',
                                 modificationData['Shield_Booster'],
                                 this.loadShieldBoosterModifications,
                                 categoryElement);
    }


    /* Weapon Modification Methods */

    loadBeamLaserModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Efficient',
                                 modificationData['Weapon_Efficient'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Weapon_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['Weapon_Overcharged'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Short Range',
                                 modificationData['Weapon_ShortRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadBurstLaserModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Efficient',
                                 modificationData['Weapon_Efficient'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Focused',
                                 modificationData['Weapon_Focused'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Weapon_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['Weapon_Overcharged'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Short Range',
                                 modificationData['Weapon_ShortRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadCannonModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Efficient',
                                 modificationData['Weapon_Efficient'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('High Capacity',
                                 modificationData['Weapon_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Weapon_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['Weapon_Overcharged'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Short Range',
                                 modificationData['Weapon_ShortRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadFragCannonModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Double Shot',
                                 modificationData['Weapon_DoubleShot'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Efficient',
                                 modificationData['Weapon_Efficient'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('High Capacity',
                                 modificationData['Weapon_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['Weapon_Overcharged'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadMineModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('High Capacity',
                                 modificationData['Weapon_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadMissileModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('High Capacity',
                                 modificationData['Weapon_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadMultiCannonModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Efficient',
                                 modificationData['Weapon_Efficient'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('High Capacity',
                                 modificationData['Weapon_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Weapon_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['Weapon_Overcharged'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Short Range',
                                 modificationData['Weapon_ShortRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadPlasmaModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Efficient',
                                 modificationData['Weapon_Efficient'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Focused',
                                 modificationData['Weapon_Focused'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Weapon_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['Weapon_Overcharged'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Short Range',
                                 modificationData['Weapon_ShortRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadPulseLaserModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Efficient',
                                 modificationData['Weapon_Efficient'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Focused',
                                 modificationData['Weapon_Focused'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Weapon_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Overcharged',
                                 modificationData['Weapon_Overcharged'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Short Range',
                                 modificationData['Weapon_ShortRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadRailGunModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Weapon HighCapacity',
                                 modificationData['Weapon_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Long Range',
                                 modificationData['Weapon_LongRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Short Range',
                                 modificationData['Weapon_ShortRange'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadSeekerModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Weapon HighCapacity',
                                 modificationData['Weapon_HighCapacity'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rapid Fire',
                                 modificationData['Weapon_RapidFire'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadTorpedoModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Lightweight',
                                 modificationData['Weapon_LightWeight'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Sturdy',
                                 modificationData['Weapon_Sturdy'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadWeaponModifications(modificationData, categoryElement)
    {
        this.loadSubcategoryData('Beam Lasers',
                                 modificationData['Beam_Laser'],
                                 this.loadBeamLaserModifications,
                                 categoryElement);

        this.loadSubcategoryData('Burst Lasers',
                                 modificationData['Burst_Laser'],
                                 this.loadBurstLaserModifications,
                                 categoryElement);

        this.loadSubcategoryData('Cannon',
                                 modificationData['Cannon'],
                                 this.loadCannonModifications,
                                 categoryElement);

        this.loadSubcategoryData('Fragment Cannons',
                                 modificationData['Fragment_Cannon'],
                                 this.loadFragCannonModifications,
                                 categoryElement);

        this.loadSubcategoryData('Mine Launchers',
                                 modificationData['Mine_Launcher'],
                                 this.loadMineModifications,
                                 categoryElement);

        this.loadSubcategoryData('Missile Racks',
                                 modificationData['Missile_Rack'],
                                 this.loadMissileModifications,
                                 categoryElement);

        this.loadSubcategoryData('Multi-Cannons',
                                 modificationData['Multi_Cannon'],
                                 this.loadMultiCannonModifications,
                                 categoryElement);

        this.loadSubcategoryData('Plasma Accelerators',
                                 modificationData['Plasma_Accelerator'],
                                 this.loadPlasmaModifications,
                                 categoryElement);

        this.loadSubcategoryData('Pulse Lasers',
                                 modificationData['Pulse_Laser'],
                                 this.loadPulseLaserModifications,
                                 categoryElement);

        this.loadSubcategoryData('Rail Guns',
                                 modificationData['Rail_Gun'],
                                 this.loadRailGunModifications,
                                 categoryElement);

        this.loadSubcategoryData('Seeker Missile Racks',
                                 modificationData['Seeker_Missile_Rack'],
                                 this.loadSeekerModifications,
                                 categoryElement);

        this.loadSubcategoryData('Torpedo Pylons',
                                 modificationData['Torpedo_Pylon'],
                                 this.loadTorpedoModifications,
                                 categoryElement);
    }


    /* Experimental Effect Methods */

    loadCoreExperimental(experimentalData, categoryElement)
    {

        this.loadSubcategoryData('Bulkheads',
                                 experimentalData['Bulkheads'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Frame Shift Drives',
                                 experimentalData['Frame_Shift_Drive'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Power Distributors',
                                 experimentalData['Power_Distributor'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Power Plants',
                                 experimentalData['Power_Plant'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Thrusters',
                                 experimentalData['Thrusters'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadOptionalExperimental(experimentalData, categoryElement)
    {
        this.loadSubcategoryData('Hull Reinforcement Packages',
                                 experimentalData['Hull_Reinforcement_Package'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shield Cell Banks',
                                 experimentalData['Shield_Cell_Bank'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shield Generators',
                                 experimentalData['Shield_Generator'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadUtilityExperimental(experimentalData, categoryElement)
    {
        this.loadSubcategoryData('Shield Boosters',
                                 experimentalData['Shield_Booster'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadWeaponExperimental(experimentalData, categoryElement)
    {
        this.loadSubcategoryData('Beam Lasers',
                                 experimentalData['Beam_Laser'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Burst Lasers',
                                 experimentalData['Burst_Laser'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Cannon',
                                 experimentalData['Cannon'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Fragment Cannons',
                                 experimentalData['Fragment_Cannon'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Mine Launchers',
                                 experimentalData['Mine_Launcher'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Missile Racks',
                                 experimentalData['Missile_Rack'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Multi-Cannons',
                                 experimentalData['Multi_Cannon'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Plasma Accelerators',
                                 experimentalData['Plasma_Accelerator'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Pulse Lasers',
                                 experimentalData['Pulse_Laser'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Rail Guns',
                                 experimentalData['Rail_Gun'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Seeker Missile Racks',
                                 experimentalData['Seeker_Missile_Rack'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Torpedo Pylons',
                                 experimentalData['Torpedo_Pylon'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }


    /* Tech Broker Unlocks */

    loadHumanOptionalModules(techBrokerData, categoryElement)
    {
        this.loadSubcategoryData('Corrosion Resistant Cargo Rack',
                                 techBrokerData['Corrosion_Resistant_Cargo_Rack'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Meta Alloy Hull Reinforcement',
                                 techBrokerData['Meta_Alloy_Hull_Reinforcement'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadHumanWeapons(techBrokerData, categoryElement)
    {
        this.loadSubcategoryData('Enzyme Missile Rack',
                                 techBrokerData['Enzyme_Missile_Rack'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Remote Release Flechette Launcher',
                                 techBrokerData['Remote_Release_Flechette_Launcher'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shock Cannon',
                                 techBrokerData['Shock_Cannon'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadHumanTechBroker(techBrokerData, categoryElement)
    {
        this.loadSubcategoryData('Optional Internal Modules',
                                 techBrokerData['Human_Optional_Internal'],
                                 this.loadHumanOptionalModules,
                                 categoryElement);

        this.loadSubcategoryData('Weapons',
                                 techBrokerData['Human_Weapons'],
                                 this.loadHumanWeapons,
                                 categoryElement);
    }

    loadGuardianCoreModules(techBrokerData, categoryElement)
    {
        this.loadSubcategoryData('Hybrid Power Distributor',
                                 techBrokerData['Guardian_Hybrid_Power_Distributor'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Power Plant',
                                 techBrokerData['Guardian_Power_Plant'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadGuardianOptionalModules(techBrokerData, categoryElement)
    {
        this.loadSubcategoryData('FSD Booster',
                                 techBrokerData['Guardian_FSD_Booster'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Hull Reinforcement',
                                 techBrokerData['Guardian_Hull_Reinforcement'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Module Reinforcement',
                                 techBrokerData['Guardian_Module_Reinforcement'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shield Reinforcement',
                                 techBrokerData['Guardian_Shield_Booster'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadGuardianWeapons(techBrokerData, categoryElement)
    {
        this.loadSubcategoryData('Gauss Cannon',
                                 techBrokerData['Guardian_Gauss_Cannon'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Plasma Charger',
                                 techBrokerData['Guardian_Plasma_Charger'],
                                 this.loadModificationGrades,
                                 categoryElement);

        this.loadSubcategoryData('Shard Cannon',
                                 techBrokerData['Guardian_Shard_Cannon'],
                                 this.loadModificationGrades,
                                 categoryElement);
    }

    loadGuardianTechBroker(techBrokerData, categoryElement)
    {
        this.loadSubcategoryData('Core Internal Modules',
                                 techBrokerData['Guardian_Core_Internal'],
                                 this.loadGuardianCoreModules,
                                 categoryElement);

        this.loadSubcategoryData('Optional Internal Modules',
                                 techBrokerData['Guardian_Optional_Internal'],
                                 this.loadGuardianOptionalModules,
                                 categoryElement);

        this.loadSubcategoryData('Weapons',
                                 techBrokerData['Guardian_Weapons'],
                                 this.loadGuardianWeapons,
                                 categoryElement);
    }


    /* Material Trades */

    loadMaterialTrades(tradeData, categoryElement)
    {
        let material = Object.keys(tradeData);
        material.sort();
        material.forEach(type =>
        {
            //console.log(tradeData[type]['grade'] + " : " + type);
            this.loadSubcategoryData(type,
                                     tradeData[type],
                                     this.loadModificationGrades,
                                     categoryElement);
        });
    }

    loadTradeCategories(tradeData, categoryElement)
    {
        let subTypes = Object.keys(tradeData);
        subTypes.sort();
        subTypes.forEach(type =>
        {
            this.loadSubcategoryData(type.replaceAll('_', ' '),
                                     tradeData[type],
                                     this.loadMaterialTrades,
                                     categoryElement);
        });
    }


    /* Synthesis Tasks */

    loadSynthesisCategories(synthesisData, categoryElement)
    {
        let subTypes = Object.keys(synthesisData);
        subTypes.sort();
        subTypes.forEach(type =>
        {
            this.loadSubcategoryData(type.replaceAll('_', ' '),
                                     synthesisData[type],
                                     this.loadModificationGrades,
                                     categoryElement);
        });
    }

    loadMunitionsSynthesis(synthesisData, categoryElement)
    {
        this.loadCategoryData('Ammunition',
                              synthesisData['Ammunition'],
                              this.loadSynthesisCategories,
                              categoryElement);

        this.loadCategoryData('Anti-Xeno',
                              synthesisData['Anti_Xeno'],
                              this.loadSynthesisCategories,
                              categoryElement);

        this.loadCategoryData('Guardian Tech',
                              synthesisData['Guardian_Tech'],
                              this.loadSynthesisCategories,
                              categoryElement);

        this.loadCategoryData('Human Tech',
                              synthesisData['Human_Tech'],
                              this.loadSynthesisCategories,
                              categoryElement);
    }

    loadUtilitySynthesis(synthesisData, categoryElement)
    {
        this.loadCategoryData('SRV',
                              synthesisData['SRV'],
                              this.loadSynthesisCategories,
                              categoryElement);

        this.loadCategoryData('Ship',
                              synthesisData['Ship'],
                              this.loadSynthesisCategories,
                              categoryElement);
    }


    /* Main Category Loading Methods */

    loadModulePurchases(moduleData)
    {
        let moduleContainer = this.shadowRoot.getElementById('taskCatalog_modules');

        this.loadCategoryData('Core Internals',
                              moduleData['Core_Internal'],
                              this.loadCorePurchases,
                              moduleContainer);

        this.loadCategoryData('Optional Internals',
                              moduleData['Optional_Internal'],
                              this.loadOptionalPurchases,
                              moduleContainer);

        this.loadCategoryData('Utility Modules',
                              moduleData['Utility_Mounts'],
                              this.loadUtilityPurchases,
                              moduleContainer);

        this.loadCategoryData('Weapons',
                              moduleData['Weapon_Hardpoints'],
                              this.loadWeaponPurchases,
                              moduleContainer);
    }

    loadModifications(modificationData)
    {
        let modificationContainer = this.shadowRoot.getElementById('taskCatalog_modifications');

        this.loadCategoryData('Core Internals',
                              modificationData['Core_Internal'],
                              this.loadCoreModifications,
                              modificationContainer);

        this.loadCategoryData('Optional Internals',
                              modificationData['Optional_Internal'],
                              this.loadOptionalModifications,
                              modificationContainer);

        this.loadCategoryData('Utility Modules',
                              modificationData['Utility_Mounts'],
                              this.loadUtilityModifications,
                              modificationContainer);

        this.loadCategoryData('Weapons',
                              modificationData['Weapon_Hardpoints'],
                              this.loadWeaponModifications,
                              modificationContainer);
    }

    loadExperimentals(experimentalData)
    {
        let experimentalContainer = this.shadowRoot.getElementById('taskCatalog_experimentals');

        this.loadCategoryData('Core Internals',
                              experimentalData['Core_Internal'],
                              this.loadCoreExperimental,
                              experimentalContainer);

        this.loadCategoryData('Optional Internals',
                              experimentalData['Optional_Internal'],
                              this.loadOptionalExperimental,
                              experimentalContainer);

        this.loadCategoryData('Utility Modules',
                              experimentalData['Utility_Mounts'],
                              this.loadUtilityExperimental,
                              experimentalContainer);

        this.loadCategoryData('Weapons',
                              experimentalData['Weapon_Hardpoints'],
                              this.loadWeaponExperimental,
                              experimentalContainer);
    }

    loadTechBrokers(techBrokerData)
    {
        let techBrokerContainer = this.shadowRoot.getElementById('taskCatalog_techbrokers');

        this.loadCategoryData('Human',
                              techBrokerData['Human'],
                              this.loadHumanTechBroker,
                              techBrokerContainer);

        this.loadCategoryData('Guardian',
                              techBrokerData['Guardian'],
                              this.loadGuardianTechBroker,
                              techBrokerContainer);
    }

    loadTrades(tradeData)
    {
        let tradeContainer = this.shadowRoot.getElementById('taskCatalog_trades');

        this.loadCategoryData('Encoded Data',
                              tradeData['Encoded_Data'],
                              this.loadTradeCategories,
                              tradeContainer);

        this.loadCategoryData('Manufactured Materials',
                              tradeData['Manufactured_Materials'],
                              this.loadTradeCategories,
                              tradeContainer);

        this.loadCategoryData('Raw Elements',
                              tradeData['Raw_Elements'],
                              this.loadTradeCategories,
                              tradeContainer);
    }

    loadSynthesis(synthesisData)
    {
        let synthesisContainer = this.shadowRoot.getElementById('taskCatalog_synthesis');

        this.loadCategoryData('Munitions',
                              synthesisData['Munitions'],
                              this.loadMunitionsSynthesis,
                              synthesisContainer);

        this.loadCategoryData('Utility',
                              synthesisData['Utility'],
                              this.loadUtilitySynthesis,
                              synthesisContainer);
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