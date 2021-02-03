class PowerModule extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_PowerModule');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set moduleName(value)
    {
        this.setAttribute('modulename', value);
    }

    get moduleName()
    {
        return this.getAttribute('modulename');
    }

    set draw(value)
    {
        this.setAttribute('draw', value);
    }

    get draw()
    {
        return this.getAttribute('draw');
    }

    set load(value)
    {
        this.setAttribute('load', value);
    }

    get load()
    {
        return this.getAttribute('load');
    }

    set priority(value)
    {
        this.setAttribute('priority', value);
    }

    get priority()
    {
        return this.getAttribute('priority');
    }

    set powered(value)
    {
        this.setAttribute('powered', value);
    }

    get powered()
    {
        return this.getAttribute('powered');
    }

    static get observedAttributes()
    {
        return ['modulename',
                'draw',
                'load',
                'priority',
                'powered'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('powerModule_' + name).textContent = newValue;
    }
}

customElements.define('power-module', PowerModule);
