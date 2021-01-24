class CartographicData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CartographicData');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set bodyType(value)
    {
        this.setAttribute('bodytype', value);
    }

    get bodyType()
    {
        this.getAttribute('bodytype');
    }

    set bodyName(value)
    {
        this.setAttribute('bodyname', value);
    }

    get bodyName()
    {
        this.getAttribute('bodyname');
    }

    static get observedAttributes()
    {
        return ['bodytype',
                'bodyname'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('cartographicData_' + name).textContent = newValue;
    }
}

customElements.define('cartographic-data', CartographicData);