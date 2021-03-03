class MarketSearch extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_MarketSearch');
        this.shadowRoot.append(template.content.cloneNode(true));


        let selector = this.shadowRoot.getElementById('marketSearch_itemselector');
        selector.addEventListener('input', (e)=>
        {
            let idStart = selector.value.indexOf('[');
            let idEnd = selector.value.indexOf(']');
            if (idStart == -1 || idEnd == -1) return;

            let name = selector.value.substring(0, idStart).trim();
            let address = selector.value.substring(idStart + 1, idEnd);

            let list = this.shadowRoot.getElementById('marketSearch_datalist');
            let option = list.querySelector('option[id="' + address + '"]');
            if (option)
            {
                selector.value = name;
                requestJsonEndpoint('/market?type=search&id=' + option.id, setMarketItemList);
            }
        });
    }

    loadListingData(listingData)
    {
        let dataList = this.shadowRoot.getElementById('marketSearch_datalist');
        dataList.textContent = "";

        let itemIds = Object.keys(listingData);
        itemIds.sort((a, b) =>
        {
            let aName = listingData[a];
            let bName = listingData[b];
            return aName.localeCompare(bName);
        });

        for (let i = 0, len = itemIds.length; i < len; i++)
        {
            let id = itemIds[i];
            let option = document.createElement('option');
            option.id = id;
            option.value = listingData[id];
            dataList.append(option);
        }
    }
}

customElements.define('market-search', MarketSearch);