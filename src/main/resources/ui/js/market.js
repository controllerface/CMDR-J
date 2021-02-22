class MarketInfo extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_MarketInfo');
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

    set type(value)
    {
        this.setAttribute('type', value);
    }

    get type()
    {
        return this.getAttribute('type');
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
        return ['station', 'type', 'system'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        let text =  newValue;
        if (name === 'type')
        {
            text = '[' + newValue + ']';
        }
        this.shadowRoot.getElementById('marketInfo_' + name).textContent = text;
    }
}

customElements.define('market-info', MarketInfo);