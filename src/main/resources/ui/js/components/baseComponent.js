class BaseComponent extends HTMLElement
{
    constructor()
    {
        super();
    }

    set name(value)
    {
        this.setAttribute('name', value);
    }

    get name()
    {
        return this.getAttribute('name');
    }

    set value(value)
    {
        this.setAttribute('value', value);
    }

    get value()
    {
        return this.getAttribute('value');
    }

    static get observedAttributes()
    {
        return ['name', 'value'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        let target = this.locate(name);
        if (target)
        {
            target.textContent = newValue;
        }
    }

    loadTemplate(templateId)
    {
        this.attachShadow({mode: 'open'});
        let template = locate(templateId);
        this.shadowRoot.append(template.content.cloneNode(true));
        this.classPrefix = templateId.substring(2) + "_";
    }

    locate(name)
    {
        return this.shadowRoot.getElementById(this.classPrefix + name);
    }

    locateClass(className)
    {
        return this.shadowRoot.querySelectorAll('.' + className);
    }

    clear()
    {
        Array.from(this.children)
            .forEach(child => this.removeChild(child));
    }
}
