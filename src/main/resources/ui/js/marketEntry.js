class MarketEntry extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

        let entry = document.createElement('div');
        entry.classList.add('marketData');

        this.commodityName = document.createElement('span');
        this.commodityName.classList.add('marketName')
        this.tradeQuantity = document.createElement('span');
        this.tradeQuantity.classList.add('marketQuantity')
        this.marketPrice = document.createElement('span');
        this.marketPrice.classList.add('marketPrice')
        this.galacticMean = document.createElement('span');
        this.galacticMean.classList.add('marketPrice')
        this.tradeProfit = document.createElement('span');
        this.tradeProfit.classList.add('marketProfit')

        entry.append(this.commodityName,
            this.tradeQuantity,
            this.marketPrice,
            this.galacticMean,
            this.tradeProfit);

        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'market.css');

        this.shadowRoot.append(styleSheet, entry);
    }

    set commodity(value)
    {
        this.setAttribute('commodity', value);
    }

    get commodity()
    {
        return this.getAttribute('commodity');
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

    set mean(value)
    {
        this.setAttribute('mean', value);
    }

    get mean()
    {
        return this.getAttribute('mean');
    }

    set profit(value)
    {
        this.setAttribute('profit', value);
    }

    get profit()
    {
        return this.getAttribute('profit');
    }

    static get observedAttributes()
    {
        return ['commodity', 'quantity', 'price', 'mean', 'profit'];
    }

    determineTarget(name)
    {
        switch (name)
        {
            case 'commodity': return this.commodityName;
            case 'quantity': return this.tradeQuantity;
            case 'price': return this.marketPrice;
            case 'mean': return this.galacticMean;
            case 'profit': return this.tradeProfit;
        }
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        let target = this.determineTarget(name);
        if (target)
        {
            target.textContent = newValue;
        }
    }
}

customElements.define('market-entry', MarketEntry);