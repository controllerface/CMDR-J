class OffenseModule extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_OffenseModule');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set module(value)
    {
        this.setAttribute('module', value);
    }

    get module()
    {
        return this.getAttribute('module');
    }

    set total(value)
    {
        this.setAttribute('total', value);
    }

    get total()
    {
        return this.getAttribute('total');
    }

    set thermal(value)
    {
        this.setAttribute('thermal', value);
    }

    get thermal()
    {
        return this.getAttribute('thermal');
    }

    set kinetic(value)
    {
        this.setAttribute('kinetic', value);
    }

    get kinetic()
    {
        return this.getAttribute('kinetic');
    }

    set explosive(value)
    {
        this.setAttribute('explosive', value);
    }

    get explosive()
    {
        return this.getAttribute('explosive');
    }

    set absolute(value)
    {
        this.setAttribute('absolute', value);
    }

    get absolute()
    {
        return this.getAttribute('absolute');
    }

    static get observedAttributes()
    {
        return ['module',
                'total',
                'thermal',
                'kinetic',
                'explosive',
                'absolute'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('offenseModule_' + name).textContent = newValue;
    }
}

customElements.define('offense-module', OffenseModule);
