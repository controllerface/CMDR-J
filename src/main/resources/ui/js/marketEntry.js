class MarketEntry extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_MarketEntry');
        this.shadowRoot.append(template.content.cloneNode(true));

        let priceCheckButton = this.shadowRoot.getElementById('marketEntry_pricecheck');
        priceCheckButton.addEventListener('click', (e) =>
        {
            let id = this.getAttribute('itemid');
            let type = this.getAttribute('type');
            let price = this.price;
            let comparison = 'difference';

            let tokens =
            {
                header: type + ' price comparison',
                transaction: this.determineTransactionType(type),
                quantity: this.determineQuantityType(type),
                comparison: comparison,
            };

            makeMarketQuery(id, type, price, comparison, (data) =>
            {
                this.handleQuery(data, tokens);
            });
        });

        let marketCheckButton = this.shadowRoot.getElementById('marketEntry_marketcheck');
        marketCheckButton.addEventListener('click', (e) =>
        {
            let id = this.getAttribute('itemid');
            let type = this.getAttribute('type');
            let price = this.price;
            let comparison = 'income';

            if (type === 'export')
            {
                type = 'import';
            }
            else
            {
                type = 'export';
            }

            let tokens =
            {
                header: type + ' markets',
                transaction: this.determineTransactionType(type),
                quantity: this.determineQuantityType(type),
                comparison: comparison,
            };

            makeMarketQuery(id, type, price, comparison, (data) =>
            {
                this.handleQuery(data, tokens);
            });
        });
    }

    determineTransactionType(type)
    {
        let transactionType = type === 'import'
            ? 'sell'
            : 'buy';

        transactionType += ' price';

        return transactionType;
    }

    determineQuantityType(type)
    {
        let quantityType = type === 'import'
                        ? 'demand'
                        : 'stock';

        return quantityType;
    }

    handleQuery(data, tokens)
    {
        this.textContent = "";
        if (data['results'])
        {
            console.log(data['results']);
            let div = document.createElement('div');
            div.classList.add('queryContainer');
            if (data['results'].length == 0)
            {
                div.textContent = 'No data';
            }
            else
            {
                let typeHeader =  document.createElement('div');
                typeHeader.classList.add('queryHeaderType');
                typeHeader.textContent = tokens['header'];
                div.append(typeHeader);
                this.append(typeHeader);

                this.append(div);

                let header = this.createHeader(tokens['quantity'], tokens['transaction'], tokens['comparison']);
                div.append(header);
                data['results'].forEach(result =>
                {
                    let row = this.createQueryResult(result);
                    div.append(row);
                });
            }
            this.append(div);
        }
    }

    createHeader(quantityType, priceType, comparison)
    {
        let queryHeader = document.createElement('market-query');
        queryHeader.setHeader();
        queryHeader.system = 'system';
        queryHeader.market = 'market';
        queryHeader.age = 'last updated';
        queryHeader.distance = 'distance';
        queryHeader.quantity = quantityType;
        queryHeader.price = priceType;
        queryHeader.comparison = comparison;
        return queryHeader;
    }

    createQueryResult(result)
    {
        let queryResult = document.createElement('market-query');
        queryResult.system = result['system'];
        queryResult.market = result['market'];
        queryResult.age = result['age'];
        queryResult.quantity = result['quantity'];
        queryResult.price = result['price'];
        queryResult.distance = result['distance'];
        queryResult.comparison = result['comparison'];
        queryResult.impact = result['impact'];
        return queryResult;
    }

    set itemId(value)
    {
        this.setAttribute('itemid', value);
    }

    get itemId()
    {
        return this.getAttribute('itemid');
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
        return ['commodity',
                'quantity',
                'price',
                'mean',
                'profit'];
    }

    set type(value)
    {
        if (value === 'export' ||  value === 'import')
        {
            let text = 'exporters';
            if (value === 'export')
            {
                text = 'importers';
            }

            let priceButton = this.shadowRoot.getElementById('marketEntry_pricecheck');
            let marketButton = this.shadowRoot.getElementById('marketEntry_marketcheck');
            priceButton.classList.remove('disabled');
            marketButton.classList.remove('disabled');
            marketButton.textContent = 'Find ' + text;
            this.setAttribute('type', value);
        }
    }

    get type()
    {
        return this.getAttribute('type');
    }

    setRare(isRare)
    {
        this.setAttribute('rare', isRare);
        if (isRare)
        {
            this.shadowRoot.getElementById('marketEntry_commodity').classList.add('rareName');
        }
        else
        {
            this.shadowRoot.getElementById('marketEntry_commodity').classList.remove('rareName');
        }
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        var value = newValue
        if (!isNaN(value))
        {
            value = parseInt(value, 10).toLocaleString("en-US")
        }
        this.shadowRoot.getElementById('marketEntry_' + name).textContent = value;
    }
}

customElements.define('market-entry', MarketEntry);