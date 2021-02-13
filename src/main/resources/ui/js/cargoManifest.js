class CargoManifest extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CargoManifest');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('cargo-manifest', CargoManifest);