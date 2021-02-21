class MarketQuery extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_MarketQuery');
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

    set comparison(value)
    {
        this.setAttribute('comparison', value);
    }

    get comparison()
    {
        return this.getAttribute('comparison');
    }

    set impact(value)
    {
        if (value !== '')
        {
            this.setAttribute('impact', value);
            this.shadowRoot.getElementById('marketQuery_comparison')
                .classList.add(value);
        }
    }

    get impact()
    {
        return this.getAttribute('impact');
    }

    static get observedAttributes()
    {
        return ['system',
                'market',
                'age',
                'quantity',
                'price',
                'distance',
                'comparison'];
    }

    setHeader()
    {
        this.setAttribute('header', true);
        this.shadowRoot.getElementById('marketQuery_row')
            .classList.add('queryResultHeader');

        this.shadowRoot.getElementById('marketQuery_lylabel')
            .textContent = '';
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'age' && !this.getAttribute('header'))
        {
            let element = this.shadowRoot.getElementById('marketQuery_' + name);
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
            this.shadowRoot.getElementById('marketQuery_' + name).textContent = value;
        }
    }
}

customElements.define('market-query', MarketQuery);