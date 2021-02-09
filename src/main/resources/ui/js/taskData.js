class TaskData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_TaskData');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set taskName(value)
    {
        this.setAttribute('taskname', value);
    }

    get taskName()
    {
        return this.getAttribute('taskname');
    }

    set key(value)
    {
        this.setAttribute('key', value);
    }

    get key()
    {
        return this.getAttribute('key');
    }

    static get observedAttributes()
    {
        return ['taskname'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('taskData_' + name).textContent = newValue;
    }
}

customElements.define('task-data', TaskData);