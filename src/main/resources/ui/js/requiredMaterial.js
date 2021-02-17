class RequiredMaterial extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_RequiredMaterial');
        this.shadowRoot.append(template.content.cloneNode(true));

        let details = this.shadowRoot.getElementById('requiredMaterial_details');
        details.addEventListener('toggle', (e) =>
        {
            if (e.target.hasAttribute('open'))
            {
                Array.from(document.querySelectorAll('required-material'))
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

    set materialName(value)
    {
        this.setAttribute('materialname', value);
    }

    get materialName()
    {
        return this.getAttribute('materialname');
    }

    set deficit(value)
    {
        this.setAttribute('deficit', value);
    }

    get deficit()
    {
        return this.getAttribute('deficit');
    }

    set pending(value)
    {
        let label = this.shadowRoot.getElementById('requiredMaterial_pendinglabel');
        let element = this.shadowRoot.getElementById('requiredMaterial_pending');
        let progress = this.shadowRoot.getElementById('requiredMaterial_progress');

        if (value === '')
        {
            label.classList.add('unused');
            label.classList.remove('materialDeficitLabel');

            element.classList.add('unused');
            element.classList.remove('materialDeficit');

            progress.classList.remove('progressPending');
        }
        else
        {
            label.classList.remove('unused');
            label.classList.add('materialDeficitLabel');

            element.classList.remove('unused');
            element.classList.add('materialDeficit');

            progress.classList.add('progressPending');
        }
        this.setAttribute('pending', value);
    }

    get pending()
    {
        return this.getAttribute('pending');
    }

    set needed(value)
    {
        this.setAttribute('needed', value);
    }

    get needed()
    {
        return this.getAttribute('needed');
    }

    loadData(materialData)
    {
        let progress = this.shadowRoot.getElementById('requiredMaterial_progress');
        let have = materialData['needed'] - materialData['deficit'];
        progress.max = materialData['needed'];
        progress.value = have;
        if (progress.max == progress.value)
        {
            progress.classList.add('progressComplete');
        }

        let relatedTasks = materialData['related'];
        let details = this.shadowRoot.getElementById('requiredMaterial_info');
        details.textContent = '';
        relatedTasks.sort();
        relatedTasks.forEach(task =>
        {
            let next = document.createElement('span');
            next.classList.add('materialTask');
            let count = document.createElement('span');
            count.classList.add('materialTaskCount');
            let name = document.createElement('span');
            count.textContent = task['count'] + 'x - ';
            name.textContent = task['name'];
            next.append(count, name);
            details.append(next);
        });

        if (materialData['stockTrade'])
        {
            let hr = document.createElement('hr');
            details.append(hr);

            let label = document.createElement('span');
            label.classList.add('category');
            label.textContent = 'Suggested Trades:';
            details.append(label);

            let row = document.createElement('div');
            row.classList.add('recommendedTradeRow');

            let typeLabel = document.createElement('span');
            typeLabel.textContent = 'Available Stock';
            typeLabel.classList.add('tradeType');
            let nameLabel = document.createElement('span');
            nameLabel.classList.add('tradeName');
            nameLabel.textContent = materialData['stockTrade']['name'];
            let button = document.createElement('button');
            button.value = materialData['stockTrade']['key'];
            button.textContent = 'Plan This Trade';
            button.classList.add('tradeButton');
            button.addEventListener('click', (e) =>
            {
                adjustTask(e.target.value, 'add');
            });

            row.append(typeLabel, nameLabel, button);

            details.append(row);
        }

        if (materialData['yieldTrade'])
        {
            let row = document.createElement('div');
            row.classList.add('recommendedTradeRow');

            let typeLabel = document.createElement('span');
            typeLabel.textContent = 'Best Yield';
            typeLabel.classList.add('tradeType');
            let nameLabel = document.createElement('span');
            nameLabel.classList.add('tradeName');
            nameLabel.textContent = materialData['yieldTrade']['name'];
            let button = document.createElement('button');
            button.value = materialData['yieldTrade']['key'];
            button.textContent = 'Plan This Trade';
            button.classList.add('tradeButton');
            button.addEventListener('click', (e) =>
            {
                adjustTask(e.target.value, 'add');
            });
            row.append(typeLabel, nameLabel, button);

            details.append(row);
        }
    }

    deselect()
    {
        this.shadowRoot.getElementById('requiredMaterial_details')
            .removeAttribute('open');
    }

    static get observedAttributes()
    {
        return ['materialname',
                'deficit',
                'pending',
                'needed'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        let text = newValue;
        if (name === 'deficit' || name === 'needed')
        {
            text = parseInt(newValue, 10).toLocaleString("en-US")
        }
        this.shadowRoot.getElementById('requiredMaterial_' + name).textContent = text;
    }
}

customElements.define('required-material', RequiredMaterial);