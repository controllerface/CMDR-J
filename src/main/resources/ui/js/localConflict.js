class LocalConflict extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_LocalConflict');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('local-conflict', LocalConflict);