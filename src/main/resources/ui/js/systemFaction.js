class SystemFaction extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_SystemFaction');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set factionName(value)
    {
        this.setAttribute('factionname', value);
    }

    get factionName()
    {
        return this.getAttribute('factionname');
    }

    set reputation(value)
    {
        this.setAttribute('reputation', value);
    }

    get reputation()
    {
        return this.getAttribute('reputation');
    }

    set progress(value)
    {
        this.setAttribute('progress', value);
    }

    get progress()
    {
        return this.getAttribute('progress');
    }

    set influence(value)
    {
        this.setAttribute('influence', value);
    }

    get influence()
    {
        return this.getAttribute('influence');
    }

    set state(value)
    {
        this.setAttribute('state', value);
    }

    get state()
    {
        return this.getAttribute('state');
    }

    set allegiance(value)
    {
        this.setAttribute('allegiance', value);
    }

    get allegiance()
    {
        return this.getAttribute('allegiance');
    }

    set government(value)
    {
        this.setAttribute('government', value);
    }

    get government()
    {
        return this.getAttribute('government');
    }

    set happiness(value)
    {
        this.setAttribute('happiness', value);
    }

    get happiness()
    {
        return this.getAttribute('happiness');
    }

    static get observedAttributes()
    {
        return ['factionname',
                'reputation',
                'progress',
                'influence',
                'state',
                'allegiance',
                'government',
                'happiness'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name.includes('progress') || name.includes('influence'))
        {
            this.shadowRoot.getElementById('systemFaction_' + name).value = newValue;
        }
        else
        {
            this.shadowRoot.getElementById('systemFaction_' + name).textContent = newValue;
        }
    }
}

customElements.define('system-faction', SystemFaction);