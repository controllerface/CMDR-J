class OffenseTurret extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_OffenseTurret');
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

    set type(value)
    {
        this.setAttribute('type', value);
    }

    get type()
    {
        return this.getAttribute('type');
    }

    static get observedAttributes()
    {
        return ['module',
                'total',
                'type'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('offenseTurret_' + name).textContent = newValue;
    }
}

customElements.define('offense-turret', OffenseTurret);
