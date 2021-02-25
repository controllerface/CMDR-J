class OutfittingInfo extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_OutfittingInfo');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set station(value)
    {
        this.setAttribute('station', value);
    }

    get station()
    {
        return this.getAttribute('station');
    }

    set system(value)
    {
        this.setAttribute('system', value);
    }

    get system()
    {
        return this.getAttribute('system');
    }

    static get observedAttributes()
    {
        return ['station', 'system'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('outfittingInfo_' + name).textContent = newValue;
    }
}

customElements.define('outfitting-info', OutfittingInfo);