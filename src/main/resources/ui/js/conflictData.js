class ConflictData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_ConflictData');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set type(value)
    {
        this.setAttribute('type', value);
    }

    get type()
    {
        return this.getAttribute('type');
    }

    set status(value)
    {
        let text = value;
        if (value === '')
        {
            text = 'Cease Fire';
        }
        this.setAttribute('status', text);
    }

    get status()
    {
        return this.getAttribute('status');
    }

    set faction1(value)
    {
        this.setAttribute('faction1', value);
    }

    get faction1()
    {
        return this.getAttribute('faction1');
    }

    set faction2(value)
    {
        this.setAttribute('faction2', value);
    }

    get faction2()
    {
        return this.getAttribute('faction2');
    }

    set stake1(value)
    {
        let text = value;
        if (value === '')
        {
            text = 'System Control';
        }
        this.setAttribute('stake1', text);
    }

    get stake1()
    {
        return this.getAttribute('stake1');
    }

    set stake2(value)
    {
        let text = value;
        if (value === '')
        {
            text = 'System Control';
        }
        this.setAttribute('stake2', text);
    }

    get stake2()
    {
        return this.getAttribute('stake2');
    }

    set days1(value)
    {
        this.setAttribute('days1', value);
    }

    get days1()
    {
        return this.getAttribute('days1');
    }

    set days2(value)
    {
        this.setAttribute('days2', value);
    }

    get days2()
    {
        return this.getAttribute('days2');
    }

    static get observedAttributes()
    {
        return ['type',
                'status',
                'faction1',
                'faction2',
                'stake1',
                'stake2',
                'days1',
                'days2'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('conflictData_' + name).textContent = newValue;
    }
}

customElements.define('conflict-data', ConflictData);