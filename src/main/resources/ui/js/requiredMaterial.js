class RequiredMaterial extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_RequiredMaterial');
        this.shadowRoot.append(template.content.cloneNode(true));

        let details = this.shadowRoot.getElementById('requiredMaterial_details');
        details.addEventListener('toggle', (e) =>
        {
            if (e.target.hasAttribute('open'))
            {
                Array.from(document.querySelectorAll('required-material'))
                    .forEach(child =>
                    {
                        if (child !== this)
                        {
                            child.deselect();
                        }
                    });
            }
        });
    }

    set materialName(value)
    {
        this.setAttribute('materialname', value);
    }

    get materialName()
    {
        return this.getAttribute('materialname');
    }

    set deficit(value)
    {
        this.setAttribute('deficit', value);
    }

    get deficit()
    {
        return this.getAttribute('deficit');
    }

    set needed(value)
    {
        this.setAttribute('needed', value);
    }

    get needed()
    {
        return this.getAttribute('needed');
    }

    loadData(materialData)
    {
        let progress = this.shadowRoot.getElementById('requiredMaterial_progress');
        let have = materialData['needed'] - materialData['deficit'];
        progress.max = materialData['needed'];
        progress.value = have;
        if (progress.max == progress.value)
        {
            progress.classList.add('progressComplete');
        }

        let relatedTasks = materialData['related'];
        let details = this.shadowRoot.getElementById('requiredMaterial_details');
        relatedTasks.sort();
        relatedTasks.forEach(task =>
        {
            let next = document.createElement('span');
            next.textContent = task;
            next.classList.add('materialTask');
            details.append(next);
        });
    }

    deselect()
    {
        this.shadowRoot.getElementById('requiredMaterial_details')
            .removeAttribute('open');
    }

    static get observedAttributes()
    {
        return ['materialname',
                'deficit',
                'needed'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        let text = newValue;
        if (name === 'deficit' || name === 'needed')
        {
            text = parseInt(newValue, 10).toLocaleString("en-US")
        }
        this.shadowRoot.getElementById('requiredMaterial_' + name).textContent = text;
    }
}

customElements.define('required-material', RequiredMaterial);