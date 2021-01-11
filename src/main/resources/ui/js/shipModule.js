class ShipModule extends HTMLElement
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
        this.getAttribute('modulename');
    }

    set slotName(value)
    {
        this.setAttribute('slotname', value);
    }

    get slotName()
    {
        this.getAttribute('slotname');
    }

    loadModuleData(module)
    {
        this.moduleNameElement.textContent = module['name'];
        if (module['effects'])
        {
            console.log(module);
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

            this.moduleElement.appendChild(statisticsElement);
        }
    }

    formatSlotName(rawSlot)
    {
        if (rawSlot === 'PlanetaryApproachSuite')
        {
            return 'Planetary Approach Suite';
        }
        else if (rawSlot.includes('Hardpoint'))
        {
            if (rawSlot.includes('Huge'))
            {
                return 'Huge Hardpoint';
            }
            else if (rawSlot.includes('Large'))
            {
                return 'Large Hardpoint';
            }
            else if (rawSlot.includes('Medium'))
            {
                return 'Medium Hardpoint';
            }
            else if (rawSlot.includes('Small'))
            {
                return 'Small Hardpoint';
            }
            else if (rawSlot.includes('Tiny'))
            {
                return 'Utility Mount';
            }
        }
        else if (rawSlot.includes('_Size'))
        {
            // todo: handle military modules
            let sizeStart = rawSlot.indexOf('_Size');
            let size = rawSlot.substring(sizeStart + 5);
            return 'Standard Size ' + size;
        }
        else if (rawSlot.includes('_'))
        {
            let sizeStart = rawSlot.indexOf('_');
            let size = rawSlot.substring(sizeStart + 1);
            let type = rawSlot.substring(0, sizeStart);
            if (type.includes('FrameShift'))
            {
                type = 'Hyper Drive';
            }
            else if (type.includes('FuelTank'))
            {
                type = 'Fuel Tank';
            }
            else if (type.includes('LifeSupport'))
            {
                type = 'Life Support';
            }
            else if (type.includes('MainEngines'))
            {
                type = 'Main Engines';
            }
            else if (type.includes('Distributor'))
            {
                type = 'Power Coupling';
            }
            else if (type.includes('PowerPlant'))
            {
                type = 'Reactor Bay';
            }
            else if (type.includes('Radar'))
            {
                type = 'Sensor Suite';
            }
            return type + " [Size " + size + "]";
        }
        else return rawSlot;
    }

    static get observedAttributes()
    {
        return ['modulename', 'slotname'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'modulename')
        {
            this.moduleNameElement.textContent = newValue;
        }
        else if (name === 'slotname')
        {
            this.slotNameElement.textContent = this.formatSlotName(newValue);
        }
    }
}

customElements.define('ship-module', ShipModule);