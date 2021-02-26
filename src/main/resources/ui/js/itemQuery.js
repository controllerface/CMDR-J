class ItemQuery extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_ItemQuery');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set system(value)
    {
        this.setAttribute('system', value);
    }

    get system()
    {
        return this.getAttribute('system');
    }

    set market(value)
    {
        this.setAttribute('market', value);
    }

    get market()
    {
        return this.getAttribute('market');
    }

    set age(value)
    {
        this.setAttribute('age', value);
    }

    get age()
    {
        return this.getAttribute('age');
    }

    set quantity(value)
    {
        this.setAttribute('quantity', value);
    }

    get quantity()
    {
        return this.getAttribute('quantity');
    }

    set price(value)
    {
        this.setAttribute('price', value);
    }

    get price()
    {
        return this.getAttribute('price');
    }

    set distance(value)
    {
        this.setAttribute('distance', value);
    }

    get distance()
    {
        return this.getAttribute('distance');
    }

    setHeader()
    {
        this.setAttribute('header', true);
        this.shadowRoot.getElementById('itemQuery_row')
            .classList.add('queryResultHeader');

        this.shadowRoot.getElementById('itemQuery_lylabel')
            .textContent = '';
    }

    static get observedAttributes()
    {
        return ['system',
                'market',
                'age',
                'quantity',
                'price',
                'distance'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'age' && !this.getAttribute('header'))
        {
            let element = this.shadowRoot.getElementById('itemQuery_' + name);
            element.textContent = '';
            let tokens = newValue.split(' ');
            let unit = false;
            for (let i = 0; i < tokens.length; i++)
            {
                let next = document.createElement('span');
                next.textContent = tokens[i];
                if (unit)
                {
                    next.classList.add('valueUnit');
                }
                element.append(next);
                unit = !unit;
            }
        }
        else
        {
            var value = newValue
            if (!isNaN(value))
            {
                value = parseInt(value, 10).toLocaleString("en-US")
            }
            this.shadowRoot.getElementById('itemQuery_' + name).textContent = value;
        }
    }
}

customElements.define('item-query', ItemQuery);