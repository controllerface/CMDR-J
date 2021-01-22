class EngineerData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_EngineerData');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set engineer(value)
    {
        this.setAttribute('engineer', value);
    }

    get engineer()
    {
        this.getAttribute('engineer');
    }

    set system(value)
    {
        this.setAttribute('system', value);
    }

    get system()
    {
        this.getAttribute('system');
    }

    set location(value)
    {
        this.setAttribute('location', value);
    }

    get location()
    {
        this.getAttribute('location');
    }

    set distance(value)
    {
        this.setAttribute('distance', value);
    }

    get distance()
    {
        this.getAttribute('distance');
    }

    set status(value)
    {
        this.setAttribute('status', value);
    }

    get status()
    {
        this.getAttribute('status');
    }

    set rank(value)
    {
        this.setAttribute('rank', value);
    }

    get rank()
    {
        this.getAttribute('rank');
    }

    set progress(value)
    {
        this.setAttribute('progress', value);
    }

    get progress()
    {
        this.getAttribute('progress');
    }

    static get observedAttributes()
    {
        return ['engineer',
                'system',
                'location',
                'distance',
                'status',
                'rank',
                'progress'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('engineerData_' + name).textContent = newValue;
    }
}

customElements.define('engineer-data', EngineerData);