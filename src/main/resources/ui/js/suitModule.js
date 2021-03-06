class SuitModule extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

        let container = document.createElement('div');
        container.classList.add('moduleList');

        this.slotNameElement = document.createElement('div');
        this.slotNameElement.classList.add('slotName');
        this.moduleElement = document.createElement('details');
        this.moduleElement.classList.add('module');
        this.moduleNameElement = document.createElement('summary');
        this.moduleNameElement.setAttribute('tabindex','0');
        this.moduleElement.appendChild(this.moduleNameElement);

        container.append(this.slotNameElement, this.moduleElement);

        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'module.css');

        this.shadowRoot.append(styleSheet, container);
    }

    set moduleName(value)
    {
        this.setAttribute('modulename', value);
    }

    get moduleName()
    {
        return this.getAttribute('modulename');
    }

    set slotName(value)
    {
        this.setAttribute('slotname', value);
    }

    get slotName()
    {
        return this.getAttribute('slotname');
    }

    loadModuleData(module)
    {
        let moduleName = document.createElement('span');
        moduleName.textContent = module['name'];

        let moduleSize;
        let moduleClass;

        if (this.getAttribute('slotname') !== 'Armour'
            && this.getAttribute('slotname') !== 'ShipCockpit'
            && this.getAttribute('slotname') !== 'CargoHatch'
            && module['name'] !== '[Empty]')
        {
            moduleSize = document.createElement('span');
            moduleSize.classList.add('moduleSize');

            moduleClass = document.createElement('span');
            moduleClass.classList.add('moduleClass');

            this.moduleNameElement.append(moduleSize, moduleClass);
        }

        this.moduleNameElement.append(moduleName);

        if (module['health'])
        {
            let health = module['health'];
            let moduleHealth = document.createElement('span');
            moduleHealth.textContent = '[' + health + ']';
            moduleHealth.classList.add('moduleHealth');
            moduleHealth.setAttribute('title', 'Module Health');
            if (health == 100)
            {
                moduleHealth.classList.add('moduleHealthFull');
            }
            else if (health > 50)
            {
                moduleHealth.classList.add('moduleHealthHalf');
            }
            else
            {
                moduleHealth.classList.add('moduleHealthLow');
            }
            this.moduleNameElement.append(moduleHealth);
        }

        if (module['effects'])
        {
            let effects = module['effects'];

            if (effects['power play'])
            {
                delete effects['power play'];
                moduleName.classList.add('powerPlayClass');
            }

            if (effects['guardian'])
            {
                delete effects['guardian'];
                moduleName.classList.add('guardian');
            }

            if (effects['human'])
            {
                delete effects['human'];
                moduleName.classList.add('humantech');
            }

            if (effects['experimental'])
            {
                delete effects['experimental'];
                moduleName.classList.add('aegistech');
            }

            if (module['ammoInClip'])
            {
                effects['Ammo in Clip'] = {value: module['ammoInClip']};
            }

            if (module['ammoInHopper'])
            {
                effects['Ammo in Hopper'] = {value: module['ammoInHopper']};
            }

            let statContainer = document.createElement('div');
            statContainer.classList.add('infoTable');

            if (module['modification'])
            {
                moduleName.classList.add('modification');

                let statRow = document.createElement('div');
                statRow.classList.add('infoRow');

                let statName = document.createElement('span');
                statName.classList.add('infoName');
                statName.classList.add('modification');
                statName.textContent = 'Modification';

                let statValue = document.createElement('span');
                statValue.classList.add('infoValue');
                statValue.classList.add('modification');
                statValue.textContent = module['modification'];

                let statUnit = document.createElement('span');
                statUnit.classList.add('infoUnit');

                let modGrade = document.createElement('span');
                let modProgress = document.createElement('progress');
                modProgress.classList.add('modificationProgress');
                modProgress.max = 1;
                modProgress.value = module['modQuality'];
                let toolTip = 'Modification Progress: ' + (module['modQuality'] * 100) + '%';
                modProgress.setAttribute('title', toolTip);
                modGrade.textContent = "G" + module['modLevel'];
                statUnit.append(modGrade, modProgress);

                statRow.append(statName, statValue, statUnit);
                statContainer.append(statRow);
            }

            if (module['experimental'])
            {
                moduleName.classList.add('experimental');

                let statRow = document.createElement('div');
                statRow.classList.add('infoRow');

                let statName = document.createElement('span');
                statName.classList.add('infoName');
                statName.classList.add('experimental');
                statName.textContent = 'Experimental Effect';

                let statValue = document.createElement('span');
                statValue.classList.add('infoValue');
                statValue.classList.add('experimental');
                statValue.textContent = module['experimental'];

                let statUnit = document.createElement('span');
                statUnit.classList.add('infoUnit');

                statRow.append(statName, statValue, statUnit);
                statContainer.append(statRow);
            }

            let statistics = Object.keys(effects);
            statistics.sort((a, b) =>
            {
                if (a === 'Size')
                {
                    return -1;
                }
                if (b === 'Size')
                {
                    return 1;
                }

                if (a === 'Class')
                {
                    if (b === 'Size')
                    {
                        return 1;
                    }
                    else return -1;
                }
                if (b === 'Class')
                {
                    if (a === 'Size')
                    {
                        return -1;
                    }
                    else return 1;
                }

                // fall back to the default string compare for all other modules
                return a.localeCompare(b);
            });

            for (let j = 0, len = statistics.length; j < len; j++)
            {
                let statRow = document.createElement('div');
                statRow.classList.add('infoRow');

                let stat = statistics[j];
                let info = effects[stat];

                if (stat === 'Size')
                {
                    moduleSize.textContent = info['value'];
                }

                if (stat === 'Class')
                {
                    moduleClass.textContent = info['value'];
                }

                let statName = document.createElement('span');
                statName.classList.add('infoName');
                statName.textContent = stat;

                if (info['effectType'] !== 'standard')
                {
                    statName.classList.add(info['effectType']);
                }

                let statValue = document.createElement('span');

                if (stat === 'Damage Type' && info['value'].includes('/AX'))
                {
                    statName.classList.add('antixeno');
                }

                statValue.classList.add('infoValue');

                let valueText = info['value'];
                if (valueText === '&infin;')
                {
                    statValue.innerHTML = info['value'];
                }
                else
                {
                    statValue.textContent = info['value'];
                }

                if (info['originalValue'])
                {
                    let toolTip = "Original Value: " + info['originalValue'];
                    statValue.setAttribute('title', toolTip);
                }

                if (info['impact'])
                {
                    statValue.classList.add(info['impact']);
                }

                let statUnit = document.createElement('span');
                statUnit.classList.add('infoUnit');

                let unitText = info['unit'];
                if (unitText)
                {
                    if (unitText === '&deg;' || unitText === '&infin;')
                    {
                        statUnit.innerHTML = unitText;
                    }
                    else
                    {
                        statUnit.textContent = unitText;
                    }
                }

                statRow.append(statName, statValue, statUnit);
                statContainer.append(statRow);
            }

            this.moduleElement.appendChild(statContainer);
        }
    }

    static get observedAttributes()
    {
        return ['slotname'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'slotname')
        {
            this.slotNameElement.textContent = newValue;
        }
    }
}

customElements.define('suit-module', SuitModule);