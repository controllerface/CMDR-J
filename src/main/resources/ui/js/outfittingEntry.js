class OutfittingEntry extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_OutfittingEntry');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set itemId(value)
    {
        this.setAttribute('itemid', value);
    }

    get itemId()
    {
        return this.getAttribute('itemid');
    }

    set name(value)
    {
        this.setAttribute('name', value);
    }

    get name()
    {
        return this.getAttribute('name');
    }

    set price(value)
    {
        this.setAttribute('price', value);
    }

    get price()
    {
        return this.getAttribute('price');
    }

    static get observedAttributes()
    {
        return ['name',
                'price'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        var value = newValue
        if (!isNaN(value))
        {
            value = parseInt(value, 10).toLocaleString("en-US")
        }
        this.shadowRoot.getElementById('outfittingEntry_' + name).textContent = value;
    }
}

customElements.define('outfitting-entry', OutfittingEntry);