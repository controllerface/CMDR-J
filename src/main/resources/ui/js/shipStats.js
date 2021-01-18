class ShipStats extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_ShipStats');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set frameShiftDrive(value)
    {
        this.setAttribute('frameshiftdrive', value);
    }

    get frameShiftDrive()
    {
        this.getAttribute('frameshiftdrive');
    }

    set fuelTank(value)
    {
        this.setAttribute('fueltank', value);
    }

    get fuelTank()
    {
        this.getAttribute('fueltank');
    }

    set lifeSupport(value)
    {
        this.setAttribute('lifesupport', value);
    }

    get lifeSupport()
    {
        this.getAttribute('lifesupport');
    }

    set powerDistributor(value)
    {
        this.setAttribute('powerdistributor', value);
    }

    get powerDistributor()
    {
        this.getAttribute('powerdistributor');
    }

    set powerPlant(value)
    {
        this.setAttribute('powerplant', value);
    }

    get powerPlant()
    {
        this.getAttribute('powerplant');
    }

    set sensors(value)
    {
        this.setAttribute('sensors', value);
    }

    get sensors()
    {
        this.getAttribute('sensors');
    }

    set thrusters(value)
    {
        this.setAttribute('thrusters', value);
    }

    get thrusters()
    {
        this.getAttribute('thrusters');
    }

    set size_1(value)
    {
        this.setAttribute('size_1', value);
    }

    get size_1()
    {
        this.getAttribute('size_1');
    }

    set size_2(value)
    {
        this.setAttribute('size_2', value);
    }

    get size_2()
    {
        this.getAttribute('size_2');
    }

    set military_size_2(value)
    {
        this.setAttribute('military_size_2', value);
    }

    get military_size_2()
    {
        this.getAttribute('military_size_2');
    }

    set size_3(value)
    {
        this.setAttribute('size_3', value);
    }

    get size_3()
    {
        this.getAttribute('size_3');
    }

    set military_size_3(value)
    {
        this.setAttribute('military_size_3', value);
    }

    get military_size_3()
    {
        this.getAttribute('military_size_3');
    }

    set size_4(value)
    {
        this.setAttribute('size_4', value);
    }

    get size_4()
    {
        this.getAttribute('size_4');
    }

    set military_size_4(value)
    {
        this.setAttribute('military_size_4', value);
    }

    get military_size_4()
    {
        this.getAttribute('military_size_4');
    }

    set size_5(value)
    {
        this.setAttribute('size_5', value);
    }

    get size_5()
    {
        this.getAttribute('size_5');
    }

    set military_size_5(value)
    {
        this.setAttribute('military_size_5', value);
    }

    get military_size_5()
    {
        this.getAttribute('military_size_5');
    }

    set size_6(value)
    {
        this.setAttribute('size_6', value);
    }

    get size_6()
    {
        this.getAttribute('size_6');
    }

    set size_7(value)
    {
        this.setAttribute('size_7', value);
    }

    get size_7()
    {
        this.getAttribute('size_7');
    }

    set size_8(value)
    {
        this.setAttribute('size_8', value);
    }

    get size_8()
    {
        this.getAttribute('size_8');
    }

    set size_tiny(value)
    {
        this.setAttribute('size_tiny', value);
    }

    get size_tiny()
    {
        this.getAttribute('size_tiny');
    }

    set size_small(value)
    {
        this.setAttribute('size_small', value);
    }

    get size_small()
    {
        this.getAttribute('size_small');
    }

    set size_medium(value)
    {
        this.setAttribute('size_medium', value);
    }

    get size_medium()
    {
        this.getAttribute('size_medium');
    }

    set size_large(value)
    {
        this.setAttribute('size_large', value);
    }

    get size_large()
    {
        this.getAttribute('size_large');
    }

    set size_huge(value)
    {
        this.setAttribute('size_huge', value);
    }

    get size_huge()
    {
        this.getAttribute('size_huge');
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
        return ['frameshiftdrive',
                'fueltank',
                'lifesupport',
                'powerdistributor',
                'powerplant',
                'sensors',
                'thrusters',
                'size_1',
                'size_2',
                'military_size_2',
                'size_3',
                'military_size_3',
                'size_4',
                'military_size_4',
                'size_5',
                'military_size_5',
                'size_6',
                'size_7',
                'size_8',
                'size_tiny',
                'size_small',
                'size_medium',
                'size_large',
                'size_huge',
                'cargocapacity',
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
        if (name.includes('size_'))
        {
            this.shadowRoot.getElementById('shipStat_' + name)
                .parentElement
                .parentElement
                .classList.remove('unused');
        }
    }
}

customElements.define('ship-stats', ShipStats);