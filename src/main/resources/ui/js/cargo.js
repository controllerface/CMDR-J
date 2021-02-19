class CargoBin extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

        let container = document.createElement('div');
        container.classList.add('binCategory');

        // commodity name and info drop down
        this.dropDown = document.createElement('details');
        this.dropDown.classList.add('binName');
        this.dropDown.textContent = "TODO: add info here";
        this.commodityName = document.createElement('summary');
        this.dropDown.appendChild(this.commodityName);

        // commodity type icon
        let gradeContainer = document.createElement('div');
        gradeContainer.classList.add('binType');
        this.commodityType = document.createElement('img');
        this.commodityType.classList.add('typeIcon');
        gradeContainer.appendChild(this.commodityType);

        // commodity stock count
        this.commodityStock = document.createElement('div');
        this.commodityStock.classList.add('binCount');
        this.commodityStock.textContent = '0';

        container.append(this.dropDown, gradeContainer, this.commodityStock);

        // stylesheet
        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'cargo.css');

        this.shadowRoot.append(styleSheet, container);
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
            this.commodityName.textContent = newValue;
        }

        else if (name === 'stock')
        {
            this.commodityStock.textContent = newValue;
        }

        else if (name === 'type')
        {
            switch (newValue)
            {
                case 'planet':
                    this.commodityType.src = 'planet.svg';
                    this.commodityType.title = 'Planetary Ports';
                    break;

                // todo: add remaining types
                default:
                    console.error('Unknown Type: ' + newValue);
            }
        }
    }
}

customElements.define('cargo-bin', CargoBin);