class POIForm extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_POIForm');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('poi-form', POIForm);