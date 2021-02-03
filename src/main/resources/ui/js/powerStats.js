class PowerStats extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_PowerStats');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set capacity(value)
    {
        this.setAttribute('capacity', value);
    }

    get capacity()
    {
        return this.getAttribute('capacity');
    }

    set draw(value)
    {
        this.setAttribute('draw', value);
    }

    get draw()
    {
        return this.getAttribute('draw');
    }

    set retracted(value)
    {
        this.setAttribute('retracted', value);
    }

    get retracted()
    {
        return this.getAttribute('retracted');
    }

    static get observedAttributes()
    {
        return ['capacity',
                'draw',
                'retracted'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('powerStat_' + name).textContent = newValue;
    }
}

customElements.define('power-stats', PowerStats);