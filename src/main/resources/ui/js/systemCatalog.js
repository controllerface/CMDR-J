class SystemCatalog extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_SystemCatalog');
        this.shadowRoot.append(template.content.cloneNode(true));

        let selector = this.shadowRoot.getElementById('systemCatalog_systemselector');
        selector.addEventListener('input', (e)=>
        {
            let value  = selector.value;
            let list = this.shadowRoot.getElementById('systemCatalog_datalist');
            let option = list.querySelector('option[value="' + value + '"]');
            if (option)
            {
                requestJsonEndpoint('/cartography?id=' + option.id, setCataloguedSystemData);
            }
        });

        let clearButton = this.shadowRoot.getElementById('systemCatalog_clearbutton');
        clearButton.addEventListener('click', (e) => selector.value = '');
    }

    loadSystemData(system)
    {
        let name = system['name'];
        let address = system['address'];
        let list = this.shadowRoot.getElementById('systemCatalog_datalist');
        let option = list.querySelector('option[id="' + address + '"]');
        if (!option)
        {
            let newEntry = document.createElement('option');
            newEntry.value = name;
            newEntry.id = address;
            list.prepend(newEntry);
        }
    }
}

customElements.define('system-catalog', SystemCatalog);