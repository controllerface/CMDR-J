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
            let idStart = selector.value.indexOf('[');
            let idEnd = selector.value.indexOf(']');
            if (idStart == -1 || idEnd == -1) return;

            let name = selector.value.substring(0, idStart).trim();
            let address = selector.value.substring(idStart + 1, idEnd);

            let list = this.shadowRoot.getElementById('systemCatalog_datalist');
            let option = list.querySelector('option[id="' + address + '"]');
            if (option)
            {
                selector.value = name;
                requestJsonEndpoint('/cartography?id=' + option.id, setCataloguedSystemData);
                let poiButton = this.shadowRoot.getElementById('systemCatalog_addbutton');
                poiButton.removeAttribute('disabled');
                poiButton.value = "Add POI for " + name;
                poiButton.setAttribute('address', option.getAttribute('id'));
            }
        });

        let clearButton = this.shadowRoot.getElementById('systemCatalog_clearbutton');
        clearButton.addEventListener('click', (e) => selector.value = '');

        let currentButton = this.shadowRoot.getElementById('systemCatalog_currentbutton');
        currentButton.addEventListener('click', (e) =>
        {
            let currentAddress = getCurrentSystemAddress();
            let list = this.shadowRoot.getElementById('systemCatalog_datalist');
            let option = list.querySelector('option[id="' + currentAddress + '"]');
            selector.value = option.value;
            let inputEvent = new InputEvent('input');
            selector.dispatchEvent(inputEvent);
        });

        let addPoiButton = this.shadowRoot.getElementById('systemCatalog_addbutton');
        addPoiButton.addEventListener('click', (e) =>
        {
            let poiTextArea = this.shadowRoot.getElementById('systemCatalog_poitext');
            let address = addPoiButton.getAttribute('address');

            let callback = (e) =>
            {
                // todo: only update if successful
                //console.log(e);
                let list = this.shadowRoot.getElementById('systemCatalog_datalist');
                let option = list.querySelector('option[id="' + address + '"]');
                selector.value = option.value;
                let inputEvent = new InputEvent('input');
                selector.dispatchEvent(inputEvent);
            }
            setPoi(address, poiTextArea.value, callback);
        });
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
            newEntry.value = name + " [" + address + "]";
            newEntry.id = address;
            list.prepend(newEntry);
        }
    }
}

customElements.define('system-catalog', SystemCatalog);