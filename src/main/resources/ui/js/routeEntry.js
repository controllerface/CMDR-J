class RouteEntry extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_RouteEntry');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set system(value)
    {
        this.setAttribute('system', value);
    }

    get system()
    {
        this.getAttribute('system');
    }

    set distance(value)
    {
        this.setAttribute('distance', value);
    }

    get distance()
    {
        this.getAttribute('distance');
    }

    static get observedAttributes()
    {
        return ['system',
                'distance'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('routeEntry_' + name).textContent = newValue;
    }
}

customElements.define('route-entry', RouteEntry);