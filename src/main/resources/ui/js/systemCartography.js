class SystemCartography extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_SystemCartography');
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

    set bodies(value)
    {
        this.setAttribute('bodies', value);
    }

    get bodies()
    {
        this.getAttribute('bodies');
    }

    static get observedAttributes()
    {
        return ['system',
                'bodies'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('systemCartography_' + name).textContent = newValue;
    }
}

customElements.define('system-cartography', SystemCartography);