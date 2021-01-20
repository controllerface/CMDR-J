class DefenseResistance extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_DefenseResistance');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set statistic(value)
    {
        this.setAttribute('statistic', value);
    }

    get statistic()
    {
        this.getAttribute('statistic');
    }

    set statValue(value)
    {
        this.setAttribute('statvalue', value);
    }

    get statValue()
    {
        this.getAttribute('statvalue');
    }

    set base(value)
    {
        this.setAttribute('base', value);
    }

    get base()
    {
        this.getAttribute('base');
    }

    set baseMultiplier(value)
    {
        this.setAttribute('basemultiplier', value);
    }

    get baseMultiplier()
    {
        this.getAttribute('basemultiplier');
    }

    set boost(value)
    {
        this.setAttribute('boost', value);
    }

    get boost()
    {
        this.getAttribute('boost');
    }

    set boostMultiplier(value)
    {
        this.setAttribute('boostmultiplier', value);
    }

    get boostMultiplier()
    {
        this.getAttribute('boostmultiplier');
    }

    set raw(value)
    {
        this.setAttribute('raw', value);
    }

    get raw()
    {
        this.getAttribute('raw');
    }

    set minmax(value)
    {
        this.setAttribute('minmax', value);
    }

    get minmax()
    {
        this.getAttribute('minmax');
    }

    static get observedAttributes()
    {
        return ['statistic',
                'statvalue',
                'base',
                'basemultiplier',
                'boost',
                'boostmultiplier',
                'raw',
                'minmax'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('defenseResist_' + name).textContent = newValue;
    }
}

customElements.define('defense-resistance', DefenseResistance);