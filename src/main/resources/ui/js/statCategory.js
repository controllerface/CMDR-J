class StatCategory extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({ mode: 'open' });
        this.nameElement = document.createElement('div');
        this.nameElement.classList.add('category');

        let container = document.createElement('div');
        let slot = document.createElement('slot');
        container.append(this.nameElement, slot);

        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'statistics.css');

        this.shadowRoot.append(styleSheet, container);
    }

    set category(value)
    {
        this.setAttribute('category', value);
    }

    get category()
    {
        return this.getAttribute('category');
    }

    static get observedAttributes()
    {
        return ['category'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'category')
        {
            this.nameElement.textContent = newValue;
        }
    }
}

customElements.define('stat-category', StatCategory);