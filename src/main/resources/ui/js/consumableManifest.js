class ConsumableManifest extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_ConsumableManifest');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('consumable-manifest', ConsumableManifest);