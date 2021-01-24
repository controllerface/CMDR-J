class NavigationRoute extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_NavigationRoute');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set destination(value)
    {
        this.setAttribute('destination', value);
    }

    get destination()
    {
        this.getAttribute('destination');
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
        return ['destination',
                'distance'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('navigationRoute_' + name).textContent = newValue;
    }
}

customElements.define('navigation-route', NavigationRoute);