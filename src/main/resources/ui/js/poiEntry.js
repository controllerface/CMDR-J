class POIEntry extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_POIEntry');
        this.shadowRoot.append(template.content.cloneNode(true));

        let deleteButton = this.shadowRoot.getElementById('poiEntry_delete');
        deleteButton.addEventListener('click', (e) =>
        {
            let address = this.getAttribute('address');
            let id = this.getAttribute('poi');
            removePoi(address, id);
        });
    }

    set poi(value)
    {
        this.setAttribute('poi', value);
    }

    get poi()
    {
        return this.setAttribute('poi');
    }

    set address(value)
    {
        this.setAttribute('address', value);
    }

    get address()
    {
        return this.setAttribute('address');
    }

    set text(value)
    {
        this.shadowRoot.getElementById('poiEntry_text').textContent = value;
    }

    get text()
    {
        return this.shadowRoot.getElementById('poiEntry_text').textContent;
    }
}

customElements.define('poi-entry', POIEntry);