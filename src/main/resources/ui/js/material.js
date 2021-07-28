class MaterialBin extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

        let template = document.getElementById('template_MaterialBin');
        this.shadowRoot.append(template.content.cloneNode(true));

        this.dropDown = this.shadowRoot.getElementById("materialBin_name");
        this.associatedTasks = this.shadowRoot.getElementById("materialBin_tasks");
        this.materialName = this.shadowRoot.getElementById("materialBin_summary");
        this.useCount = this.shadowRoot.getElementById("materialBin_uses");
        this.materialGrade = this.shadowRoot.getElementById("materialBin_grade");
        this.materialStock = this.shadowRoot.getElementById("materialBin_stock");
        this.capacity = this.shadowRoot.getElementById("materialBin_capacity");
    }

    get material()
    {
        return this.getAttribute('material');
    }

    set material(value)
    {
        this.setAttribute('material', value);
    }

    get grade()
    {
        return this.getAttribute('grade');
    }

    set grade(value)
    {
        this.setAttribute('grade', value);
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
        return ['material', 'grade', 'stock'];
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
            this.capacity.value = newValue;
            if (newValue < 1)
            {
                this.style = 'display: none';
            }
            else
            {
                this.style = 'display: initial';
            }
        }

        else if (name === 'grade')
        {
            switch (newValue)
            {
                case '1':
                    this.materialGrade.src = 'grade-1.svg';
                    this.materialGrade.title = 'Very Common';
                    this.capacity.max = 300;
                    break;

                case '2':
                    this.materialGrade.src = 'grade-2.svg';
                    this.materialGrade.title = 'Common';
                    this.capacity.max = 250;
                    break;

                case '3':
                    this.materialGrade.src = 'grade-3.svg';
                    this.materialGrade.title = 'Standard';
                    this.capacity.max = 200;
                    break;

                case '4':
                    this.materialGrade.src = 'grade-4.svg';
                    this.materialGrade.title = 'Rare';
                    this.capacity.max = 150;
                    break;

                case '5':
                    this.materialGrade.src = 'grade-5.svg';
                    this.materialGrade.title = 'Very Rare';
                    this.capacity.max = 100;
                    break;

                default:
                    console.error('Unknown Grade: ' + newValue);
            }

            let toolTip = 'Max Capacity: ' + this.capacity.max;
            this.capacity.title = toolTip;
        }
    }

    connectedCallback()
    {
       if (this.capacity.value < 1)
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

customElements.define('material-bin', MaterialBin);