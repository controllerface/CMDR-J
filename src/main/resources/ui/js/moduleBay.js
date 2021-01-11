class ModuleBay extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let slot = document.createElement('slot');
        this.shadowRoot.append(slot);
    }
}

customElements.define('module-bay', ModuleBay);