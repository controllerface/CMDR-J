class TaskData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_TaskData');
        this.shadowRoot.append(template.content.cloneNode(true));

        let addButton = this.shadowRoot.getElementById('taskData_addbutton');
        let subtractButton = this.shadowRoot.getElementById('taskData_subtractbutton');
        let deleteButton = this.shadowRoot.getElementById('taskData_deletebutton');
        addButton.addEventListener('click', (e) => adjustTask(this.key, 'add'));
        subtractButton.addEventListener('click', (e) => adjustTask(this.key, 'subtract'));
        deleteButton.addEventListener('click', (e) =>
        {
            let message = 'Do you really want to delete this task? : ' + this.taskName;
            if (confirm(message))
            {
                adjustTask(this.key, 'delete');
            }
        });

        let details = this.shadowRoot.getElementById('taskData_details');
        details.addEventListener('toggle', (e) =>
        {
            console.log(document.querySelectorAll('task-data'));
            if (e.target.hasAttribute('open'))
            {
                Array.from(document.querySelectorAll('task-data'))
                    .forEach(child =>
                    {
                        if (child !== this)
                        {
                            child.deselect();
                        }
                    });
            }
        });
    }

    set taskName(value)
    {
        this.setAttribute('taskname', value);
    }

    get taskName()
    {
        return this.getAttribute('taskname');
    }

    set key(value)
    {
        this.setAttribute('key', value);
    }

    get key()
    {
        return this.getAttribute('key');
    }

    set count(value)
    {
        this.setAttribute('count', value);
    }

    get count()
    {
        return this.getAttribute('count');
    }

    deselect()
    {
        this.shadowRoot.getElementById('taskData_details')
            .removeAttribute('open');
    }

    createTaskCosts(detailElement, costData)
    {
        let container = document.createElement('div');
        container.classList.add('taskCostData');
        costData.forEach(cost =>
        {
            let costRow = document.createElement('div');
            costRow.classList.add('taskCost');
            let amount = document.createElement('span');
            amount.textContent = cost['amount'];
            let unit = document.createElement('span');
            unit.classList.add('valueUnit');
            unit.textContent = cost['unit'];
            costRow.append(amount, unit);
            container.append(costRow);
        });
        detailElement.append(container);
    }

    createTaskEffects(detailElement, effectsData)
    {
        let container = document.createElement('div');
        container.classList.add('taskEffectData');
        effectsData.forEach(effect =>
        {
            let effectRow = document.createElement('div');
            effectRow.classList.add('taskEffect');
            let effectName = document.createElement('span');
            effectName.textContent = effect['effect'];
            effectName.classList.add('taskEffectName');
            let value = document.createElement('span');
            if (effect['value'] === '&infin;')
            {
                value.innerHTML = effect['value'];
            }
            else
            {
                value.textContent = effect['value'];
            }
            value.classList.add('taskEffectValue');
            let unit = document.createElement('span');
            unit.classList.add('valueUnit');
            if (effect['unit'] === '&deg;')
            {
                unit.innerHTML = effect['unit'];
            }
            else
            {
                unit.textContent = effect['unit'];
            }
            effectRow.append(effectName, value, unit);
            container.append(effectRow);
        });
        detailElement.append(container);
    }

    loadCostData(costData)
    {
        let d = this.shadowRoot.getElementById('taskData_details');
        this.createTaskCosts(d, costData);
    }

    loadEffectData(effectData)
    {
        let d = this.shadowRoot.getElementById('taskData_details');
        this.createTaskEffects(d, effectData);
    }

    static get observedAttributes()
    {
        return ['taskname', 'count'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('taskData_' + name).textContent = newValue;
    }
}

customElements.define('task-data', TaskData);