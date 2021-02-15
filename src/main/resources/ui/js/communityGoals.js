class CommunityGoals extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CommunityGoals');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('community-goals', CommunityGoals);