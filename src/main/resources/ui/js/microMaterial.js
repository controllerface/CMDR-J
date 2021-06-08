class MicroMaterialBin extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

        let container = document.createElement('div');
        container.classList.add('microBinCategory');

        // material name and trade info drop down
        this.dropDown = document.createElement('details');
        this.dropDown.classList.add('binName');
        this.dropDown.textContent = "TODO: add trade data here";
        this.materialName = document.createElement('summary');
        this.dropDown.appendChild(this.materialName);

        // material stock count
        this.materialStock = document.createElement('div');
        this.materialStock.classList.add('binCapacity');
        this.materialStock.textContent = '0';

        // add the sections
        container.append(this.dropDown, this.materialStock);

        // stylesheet
        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'material.css');

        this.shadowRoot.append(styleSheet, container);
    }

    get material()
    {
        return this.getAttribute('material');
    }

    set material(value)
    {
        this.setAttribute('material', value);
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
        return ['material', 'stock'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'material')
        {
            this.materialName.textContent = newValue;
        }

        else if (name === 'stock')
        {
            this.materialStock.textContent = newValue;
        }
    }
}

customElements.define('micro-material-bin', MicroMaterialBin);