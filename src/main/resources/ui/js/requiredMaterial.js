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
            console.log(document.querySelectorAll('required-material'));
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
    }

    deselect()
    {
        this.shadowRoot.getElementById('requiredMaterial_details')
            .removeAttribute('open');
    }

    static get observedAttributes()
    {
        return ['materialname',
                'deficit'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('requiredMaterial_' + name).textContent = newValue;
    }
}

customElements.define('required-material', RequiredMaterial);