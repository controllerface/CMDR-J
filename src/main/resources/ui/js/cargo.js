class CargoBin extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CargoBin');
        this.shadowRoot.append(template.content.cloneNode(true));

        let marketCheckButton = this.shadowRoot.getElementById('cargoBin_pricecheck');
        marketCheckButton.addEventListener('click', (e) =>
        {
            let id = this.getAttribute('marketid');
            let type = 'import';
            let price = 0;
            let comparison = 'income';

            let tokens =
            {
                header: type + ' markets',
                transaction: 'buy price',
                quantity: 'demand',
                comparison: comparison,
            };

            makeMarketQuery(id, type, price, comparison, (data) =>
            {
                //console.log(data);
                this.handleQuery(data, tokens, true);
            });
        });
    }

    handleQuery(data, tokens, reverseSort)
    {
        let x = this.querySelectorAll('div[slot=priceCheck]');
        if (x)
        {
            Array.from(x).forEach(e=>this.removeChild(e));
        }
        if (data['results'])
        {
            let div = document.createElement('div');
            div.slot = 'priceCheck';
            div.classList.add('queryContainer');
            if (data['results'].length == 0)
            {
                div.textContent = 'No data';
            }
            else
            {
                let typeHeader =  document.createElement('div');
                typeHeader.slot = 'priceCheck';
                typeHeader.classList.add('queryHeaderType');
                typeHeader.textContent = tokens['header'];
                div.append(typeHeader);
                this.append(typeHeader);

                this.append(div);

                let header = this.createHeader(tokens['quantity'], tokens['transaction'], tokens['comparison']);
                div.append(header);

                let results = data['results'];
                results.sort((a, b)=>
                {
                    let aComp = a['comparison'];
                    let bComp = b['comparison'];
                    if (reverseSort)
                    {
                        return bComp - aComp;
                    }
                    else
                    {
                        return aComp - bComp;
                    }
                })

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
            this.shadowRoot.getElementById('cargoBin_commodity')
                .textContent = newValue;
        }

        else if (name === 'stock')
        {
            this.shadowRoot.getElementById('cargoBin_stock')
                .textContent = newValue;
        }

        else if (name === 'type')
        {
            let typeIcon = this.shadowRoot.getElementById('cargoBin_type');
            switch (newValue)
            {
                case 'planet':
                    typeIcon.src = 'planet.svg';
                    typeIcon.title = 'Planetary Ports';
                    break;

                // todo: add remaining types
                default:
                    console.log('Type: ' + newValue + ' has no icon yet');
            }
        }
    }
}

customElements.define('cargo-bin', CargoBin);