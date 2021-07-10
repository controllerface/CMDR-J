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

        this.associatedTasks = document.createElement('span');
        this.associatedTasks.textContent = "No Known Uses";

        this.dropDown.append(this.associatedTasks);

        this.materialName = document.createElement('summary');
        this.dropDown.appendChild(this.materialName);

        // material use count
        this.useCount = document.createElement('div');
        this.useCount.classList.add('binUses');
        this.useCount.textContent = '0';

        // material stock count
        this.materialStock = document.createElement('div');
        this.materialStock.classList.add('binCapacity');
        this.materialStock.textContent = '0';

        // add the sections
        container.append(this.dropDown, this.useCount, this.materialStock);

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
            if (newValue < 1)
            {
                this.style = 'display: none';
            }
            else
            {
                this.style = 'display: initial';
            }
        }
    }

    connectedCallback()
    {
       if (this.materialStock.textContent == '0')
       {
           this.style = 'display: none';
       }
    }

    loadAssociated(taskData)
    {
        this.associatedTasks.textContent = "";

        let tasks = Object.keys(taskData);
        if (tasks.length == 0)
        {
            this.useCount.textContent = 0;
            this.associatedTasks.textContent = "No Known Uses";
            return;
        }

        tasks.sort((a, b) =>
        {
            let aName = taskData[a];
            let bName = taskData[b];
            return aName.localeCompare(bName);
        });

        this.useCount.textContent = tasks.length;

        let L = document.createElement('div');
        L.textContent = "Associated Tasks";
        L.classList.add('usesHeader');
        this.associatedTasks.append(L);

        for (let i = 0, len = tasks.length; i < len; i++)
        {
            let n = document.createElement('div');
            n.textContent = taskData[tasks[i]];
            this.associatedTasks.append(n);
        }
    }
}

customElements.define('micro-material-bin', MicroMaterialBin);