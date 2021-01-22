class EngineerStats extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_EngineerStats');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('engineer-stats', EngineerStats);