class CurrentMissions extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CurrentMissions');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('current-missions', CurrentMissions);