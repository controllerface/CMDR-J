class TabPanel extends BaseComponent
{
    constructor()
    {
        super();
        this.loadTemplate('t_TabPanel');
        this.locate('name').addEventListener('click', event => this.select());
    }

    connectedCallback()
    {
        if (this.initialized) return;

        this.locate('name').classList.add('deselected');

        if (this.hasAttribute('default'))
        {
            window.requestAnimationFrame(() => this.selectDefault());
        }

        if (this.hasAttribute('vertical'))
        {
            window.requestAnimationFrame(() => this.setVertical());
        }
        else
        {
            this.locate('name').setAttribute('horizontal','horizontal');
        }

        this.initialized = true;
    }

    borrowElements()
    {
        return this.locate('contents').assignedElements();
    }

    returnElement(element)
    {
        element.slot = '';
        this.append(element);
    }

    selectDefault()
    {
        if (document.readyState === 'complete')
        {
            this.select();
        }
        else
        {
            window.requestAnimationFrame(() => this.selectDefault());
        }
    }

    setVertical()
    {
        if (document.readyState === 'complete')
        {
            this.locate('horizontalIndicator').classList.add('disabled');
            this.locate('verticalIndicator').classList.remove('disabled');
        }
        else
        {
            window.requestAnimationFrame(() => this.setVertical());
        }
    }

    select()
    {
        this.locate('name').classList.remove('deselected');
        this.locate('name').classList.add('selected');

        this.locateClass('indicator').forEach(i =>
        {
            i.classList.remove('deselected');
            i.classList.add('selected');
        });

        this.parentElement.selectTab(this);
    }

    deselect(returnedElements)
    {
        this.locate('name').classList.remove('selected');
        this.locate('name').classList.add('deselected');

        this.locateClass('indicator').forEach(i =>
        {
            i.classList.remove('selected');
            i.classList.add('deselected');
        });

        returnedElements.forEach(element => this.returnElement(element));
    }

    static get observedAttributes()
    {
        let observedAttributes = super.observedAttributes;
        observedAttributes.push('small');
        return observedAttributes;
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'small')
        {
            this.locate('name').classList.add('panelNameSmall');
            this.locate('horizontalIndicator').classList.add('horizontalIndicatorSmall');
            this.locate('verticalIndicator').classList.add('verticalIndicatorSmall');
        }
        else
        {
            super.attributeChangedCallback(name, oldValue, newValue);
        }
    }
}

customElements.define('tab-panel', TabPanel);