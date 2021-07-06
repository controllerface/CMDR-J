class MaterialBin extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

        let container = document.createElement('div');
        container.classList.add('binCategory');

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
        this.useCount.classList.add('binCount');
        this.useCount.textContent = '0';

        // material grade icon
        let gradeContainer = document.createElement('div');
        gradeContainer.classList.add('binGrade');
        this.materialGrade = document.createElement('img');
        this.materialGrade.classList.add('gradeIcon');
        gradeContainer.appendChild(this.materialGrade);

        // material stock count
        this.materialStock = document.createElement('div');
        this.materialStock.classList.add('binCount');
        this.materialStock.textContent = '0';

        // capacity gauge
        let capacityContainer = document.createElement('div');
        capacityContainer.classList.add('binCapacity');
        this.capacity = document.createElement('progress');
        capacityContainer.appendChild(this.capacity);

        // add the sections
        container.append(this.dropDown, this.useCount, gradeContainer, this.materialStock, capacityContainer);

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
            this.associatedTasks.textContent = "No Known Tasks";
            return;
        }

        tasks.sort((a, b) =>
        {
            let aName = taskData[a];
            let bName = taskData[b];
            return aName.localeCompare(bName);
        });

        this.useCount.textContent = tasks.length;
        for (let i = 0, len = tasks.length; i < len; i++)
        {
            let n = document.createElement('div');
            n.textContent = taskData[tasks[i]];
            this.associatedTasks.append(n);
        }
    }
}

customElements.define('material-bin', MaterialBin);