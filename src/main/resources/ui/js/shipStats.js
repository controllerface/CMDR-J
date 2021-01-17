class ShipStats extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_ShipStats');
        this.shadowRoot.append(template.content.cloneNode(true));
    }


    set cargoCapacity(value)
    {
        this.setAttribute('cargocapacity', value);
    }

    get cargoCapacity()
    {
        this.getAttribute('cargocapacity');
    }

    set fuelCapacity(value)
    {
        this.setAttribute('fuelcapacity', value);
    }

    get fuelCapacity()
    {
        this.getAttribute('fuelcapacity');
    }

    set resevoirCapacity(value)
    {
        this.setAttribute('resevoircapacity', value);
    }

    get resevoirCapacity()
    {
        this.getAttribute('resevoircapacity');
    }

    set crewSeats(value)
    {
        this.setAttribute('crewseats', value);
    }

    get crewSeats()
    {
        this.getAttribute('crewseats');
    }

    set slf(value)
    {
        this.setAttribute('slf', value);
    }

    get slf()
    {
        this.getAttribute('slf');
    }

    set manufacturer(value)
    {
        this.setAttribute('manufacturer', value);
    }

    get manufacturer()
    {
        this.getAttribute('manufacturer');
    }

    set model(value)
    {
        this.setAttribute('model', value);
    }

    get model()
    {
        this.getAttribute('model');
    }

    set shipSize(value)
    {
        this.setAttribute('shipsize', value);
    }

    get shipSize()
    {
        this.getAttribute('shipsize');
    }

    set baseCost(value)
    {
        this.setAttribute('basecost', value);
    }

    get baseCost()
    {
        this.getAttribute('basecost');
    }

    set hullValue(value)
    {
        this.setAttribute('hullvalue', value);
    }

    get hullValue()
    {
        this.getAttribute('hullvalue');
    }

    set moduleValue(value)
    {
        this.setAttribute('modulevalue', value);
    }

    get moduleValue()
    {
        this.getAttribute('modulevalue');
    }

    set baseHull(value)
    {
        this.setAttribute('basehull', value);
    }

    get baseHull()
    {
        this.getAttribute('basehull');
    }

    set maxRange(value)
    {
        this.setAttribute('maxrange', value);
    }

    get maxRange()
    {
        this.getAttribute('maxrange');
    }

    set unladenMass(value)
    {
        this.setAttribute('unladenmass', value);
    }

    get unladenMass()
    {
        this.getAttribute('unladenmass');
    }

    set currentMass(value)
    {
        this.setAttribute('currentmass', value);
    }

    get currentMass()
    {
        this.getAttribute('currentmass');
    }

    set massLock(value)
    {
        this.setAttribute('masslock', value);
    }

    get massLock()
    {
        this.getAttribute('masslock');
    }

    set baseAgility(value)
    {
        this.setAttribute('baseagility', value);
    }

    get baseAgility()
    {
        this.getAttribute('baseagility');
    }

    set speed(value)
    {
        this.setAttribute('speed', value);
    }

    get speed()
    {
        this.getAttribute('speed');
    }

    set maxSpeed(value)
    {
        this.setAttribute('maxspeed', value);
    }

    get maxSpeed()
    {
        this.getAttribute('maxspeed');
    }

    set boost(value)
    {
        this.setAttribute('boost', value);
    }

    get boost()
    {
        this.getAttribute('boost');
    }

    set maxBoost(value)
    {
        this.setAttribute('maxboost', value);
    }

    get maxBoost()
    {
        this.getAttribute('maxboost');
    }

    static get observedAttributes()
    {
        return ['cargocapacity',
                'fuelcapacity',
                'resevoircapacity',
                'crewseats',
                'slf',
                'manufacturer',
                'model',
                'shipsize',
                'basecost',
                'hullvalue',
                'modulevalue',
                'basehull',
                'maxrange',
                'unladenmass',
                'currentmass',
                'masslock',
                'baseagility',
                'speed',
                'maxspeed',
                'boost',
                'maxboost'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('shipStat_' + name).textContent = newValue;
    }
}

customElements.define('ship-stats', ShipStats);