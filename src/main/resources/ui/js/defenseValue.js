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
        return this.getAttribute('statistic');
    }

    set statValue(value)
    {
        this.setAttribute('statvalue', value);
    }

    get statValue()
    {
        return this.getAttribute('statvalue');
    }

    set base(value)
    {
        this.setAttribute('base', value);
    }

    get base()
    {
        return this.getAttribute('base');
    }

    set reinforcement(value)
    {
        this.setAttribute('reinforcement', value);
    }

    get reinforcement()
    {
        return this.getAttribute('reinforcement');
    }

    set raw(value)
    {
        this.setAttribute('raw', value);
    }

    get raw()
    {
        return this.getAttribute('raw');
    }

    set minmax(value)
    {
        this.setAttribute('minmax', value);
    }

    get minmax()
    {
        return this.getAttribute('minmax');
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