class DefenseValue extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_DefenseValue');
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

    set reinforcement(value)
    {
        this.setAttribute('reinforcement', value);
    }

    get reinforcement()
    {
        this.getAttribute('reinforcement');
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
                'reinforcement',
                'raw',
                'minmax'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('defenseValue_' + name).textContent = newValue;
    }
}

customElements.define('defense-value', DefenseValue);