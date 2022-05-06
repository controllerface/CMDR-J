class StorageBin extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_StorageBin');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    get marketId()
    {
        return this.getAttribute('marketid');
    }

    set marketId(value)
    {
        this.setAttribute('marketid', value);
    }

    get commodity()
    {
        return this.getAttribute('commodity');
    }

    set commodity(value)
    {
        this.setAttribute('commodity', value);
    }

    get type()
    {
        return this.getAttribute('type');
    }

    set type(value)
    {
        this.setAttribute('type', value);
    }

    get stock()
    {
        return this.getAttribute('stock');
    }

    set stock(value)
    {
        this.setAttribute('stock', value);
    }

    static get observedAttributes()
    {
        return ['commodity', 'type', 'stock'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'commodity')
        {
            this.shadowRoot.getElementById('storageBin_commodity')
                .textContent = newValue;
        }

        else if (name === 'stock')
        {
            this.shadowRoot.getElementById('storageBin_stock')
                .textContent = newValue;
        }

        else if (name === 'type')
        {
            let typeIcon = this.shadowRoot.getElementById('storageBin_type');
            switch (newValue)
            {
                case 'planet':
                    typeIcon.src = 'planet.svg';
                    typeIcon.title = 'Planetary Ports';
                    break;

                // todo: add remaining types
                default:
                    typeIcon.src = 'cargo.svg';
                    typeIcon.title = newValue;
                    //console.log('Type: ' + newValue + ' has no icon yet');
            }
        }
    }
}

customElements.define('storage-bin', StorageBin);