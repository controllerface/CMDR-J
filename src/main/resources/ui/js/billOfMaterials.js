class BillOfMaterials extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_BillOfMaterials');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('bill-of-materials', BillOfMaterials);