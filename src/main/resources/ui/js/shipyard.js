class ShipyardInfo extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_ShipyardInfo');
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
        this.shadowRoot.getElementById('shipyardInfo_' + name).textContent = newValue;
    }
}

customElements.define('shipyard-info', ShipyardInfo);