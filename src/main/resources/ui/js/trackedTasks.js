class TrackedTasks extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_TrackedTasks');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('tracked-tasks', TrackedTasks);