class DefenseStats extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_DefenseStats');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set shieldRegen(value)
    {
        this.setAttribute('shieldregen', value);
    }

    get shieldRegen()
    {
        return this.getAttribute('shieldregen');
    }

    set brokenRegenRate(value)
    {
        this.setAttribute('brokenregen', value);
    }

    get brokenRegen()
    {
        return this.getAttribute('brokenregen');
    }

    static get observedAttributes()
    {
        return ['shieldregen',
                'brokenregen'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('defenseStat_' + name).textContent = newValue;
    }
}

customElements.define('defense-stats', DefenseStats);