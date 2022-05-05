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

        if (!module['name'].includes('- Grade'))
        {
            moduleName.textContent = module['name'] + ' - Grade ' + module['modLevel'];
        }

        let moduleSize;
        let moduleClass;

        //console.log(module);

//        if (this.getAttribute('slotname') !== 'Armour'
//            && this.getAttribute('slotname') !== 'ShipCockpit'
//            && this.getAttribute('slotname') !== 'CargoHatch'
//            && module['name'] !== '[Empty]')
//        {
//            moduleSize = document.createElement('span');
//            moduleSize.classList.add('moduleSize');
//
//            moduleClass = document.createElement('span');
//            moduleClass.classList.add('moduleClass');
//
//            this.moduleNameElement.append(moduleSize, moduleClass);
//        }

        this.moduleNameElement.append(moduleName);

        if (module['modLevel'] > 1)
        {
            let count = module['modCount'];
            let possible = module['modLevel'] - 1;
            let empty = possible - count;
            let iconEntities = ''

            for (let i = 0; i < empty; i++)
            {
                iconEntities += '&#9633;';
            }
            for (let j = 0; j < count; j++)
            {
                iconEntities += '&#9632;';
            }
            let icons = document.createElement('span');
            icons.innerHTML = iconEntities;
            icons.classList.add('moduleSlots');
            icons.setAttribute('title', 'Modification Slots');
            icons.classList.add('modification');
            this.moduleNameElement.append(icons);
        }

        if (module['effects'])
        {
            let effects = module['effects'];

            let statContainer = document.createElement('div');
            statContainer.classList.add('infoTable');
            let statistics = Object.keys(effects);

            for (let j = 0, len = statistics.length; j < len; j++)
            {
                let statRow = document.createElement('div');
                statRow.classList.add('infoRow');

                let stat = statistics[j];
                let info = effects[stat];

                let statName = document.createElement('span');
                statName.classList.add('infoName');
                statName.textContent = stat;

                if (info['effectType'] !== 'standard')
                {
                    statName.classList.add(info['effectType']);
                }

                let statValue = document.createElement('span');

//                if (stat === 'Damage Type' && info['value'].includes('/AX'))
//                {
//                    statName.classList.add('antixeno');
//                }

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