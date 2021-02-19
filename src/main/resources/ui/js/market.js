class MarketInfo extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

        let header = document.createElement('div');
        header.setAttribute('id', 'marketHeader');
        let stationRow = document.createElement('div');
        stationRow.classList.add('marketHeaderRow');
        let stationLabel = document.createElement('span');
        stationLabel.textContent = "Station";
        stationLabel.classList.add('marketHeaderName');
        this.stationName = document.createElement('span');
        this.stationName.classList.add('marketHeaderValue');
        this.stationType = document.createElement('span');
        this.stationType.classList.add('marketTypeValue');
        stationRow.append(stationLabel, this.stationName, this.stationType);

        let systemRow = document.createElement('div');
        systemRow.classList.add('marketHeaderRow');
        let systemLabel = document.createElement('span');
        systemLabel.textContent = "Star System";
        systemLabel.classList.add('marketHeaderName');
        this.systemName = document.createElement('span');
        this.systemName.classList.add('marketHeaderValue');
        systemRow.append(systemLabel, this.systemName);

        header.append(stationRow, systemRow);

        this.imports = document.createElement('div');

        let importHeader = document.createElement('div');
        importHeader.classList.add('marketData');

        let importName = document.createElement('div');
        importName.textContent = 'Imports';
        importName.classList.add('marketNameHeader');

        let importDemand = document.createElement('div');
        importDemand.textContent = 'Demand';
        importDemand.setAttribute('title', 'Current demand at this market')
        importDemand.classList.add('marketQuantityHeader');

        let importSell = document.createElement('div');
        importSell.textContent = 'Sell Price';
        importSell.setAttribute('title', 'Amount the commodity sells for at this market')
        importSell.classList.add('marketPriceHeader');

        let importMean = document.createElement('div');
        importMean.textContent = 'Mean Price';
        importMean.setAttribute('title', 'The galactic average price for this commodity')
        importMean.classList.add('marketPriceHeader');

        let importProfit = document.createElement('div');
        importProfit.textContent = 'Profit';
        importProfit.setAttribute('title', 'Profit estimate, based on galactic average, if this commodity is sold here.');
        importProfit.classList.add('marketProfitHeader');

        importHeader.append(importName, importDemand, importSell, importMean, importProfit);

        let importSlot = document.createElement('slot');
        importSlot.setAttribute('name', 'imports');
        let importPlaceholder = document.createElement('div');
        importPlaceholder.classList.add('marketPlaceholder');
        importPlaceholder.textContent = "Visit a market to see import commodities"
        importSlot.append(importPlaceholder);

        this.imports.append(importHeader, importSlot);

        this.exports = document.createElement('div');

        let exportHeader = document.createElement('div');
        exportHeader.classList.add('marketData');

        let exportName = document.createElement('div');
        exportName.textContent = 'Exports';
        exportName.classList.add('marketNameHeader');

        let exportStock = document.createElement('div');
        exportStock.textContent = 'Stock';
        exportStock.setAttribute('title', 'Current stock at this market')
        exportStock.classList.add('marketQuantityHeader');

        let exportBuy = document.createElement('div');
        exportBuy.textContent = 'Buy Price';
        exportBuy.setAttribute('title', 'Cost to purchase the commodity from this market')
        exportBuy.classList.add('marketPriceHeader');

        let exportMean = document.createElement('div');
        exportMean.textContent = 'Mean Price';
        exportMean.setAttribute('title', 'The galactic average price for this commodity')
        exportMean.classList.add('marketPriceHeader');

        let exportProfit = document.createElement('div');
        exportProfit.textContent = 'Profit';
        exportProfit.setAttribute('title', 'Profit estimate, based on galactic average, if this commodity is purchased here, and sold elsewhere. \nActual profit may vary based on market prices at point of sale.');
        exportProfit.classList.add('marketProfitHeader');

        exportHeader.append(exportName, exportStock, exportBuy, exportMean, exportProfit);

        let exportSlot = document.createElement('slot');
        exportSlot.setAttribute('name', 'exports');
        let exportPlaceholder = document.createElement('div');
        exportPlaceholder.classList.add('marketPlaceholder');
        exportPlaceholder.textContent = "Visit a market to see export commodities"
        exportSlot.append(exportPlaceholder);

        this.exports.append(exportHeader, exportSlot);

        this.rares = document.createElement('div');

        let rareHeader = document.createElement('div');
        rareHeader.classList.add('marketData');

        let rareName = document.createElement('div');
        rareName.textContent = 'Rare Commodities';
        rareName.classList.add('marketNameHeader');

        let rareStock = document.createElement('div');
        rareStock.textContent = 'Stock';
        rareStock.setAttribute('title', 'Current stock at this market')
        rareStock.classList.add('marketQuantityHeader');

        let rareBuy = document.createElement('div');
        rareBuy.textContent = 'Buy Price';
        rareBuy.setAttribute('title', 'Cost to purchase the commodity from this market')
        rareBuy.classList.add('marketPriceHeader');

        let rareMean = document.createElement('div');
        rareMean.textContent = 'Mean Price';
        rareMean.setAttribute('title', 'The galactic average price for this commodity')
        rareMean.classList.add('marketPriceHeader');

        let rareProfit = document.createElement('div');
        rareProfit.textContent = 'Profit';
        rareProfit.setAttribute('title', 'Profit estimate, based on galactic average, if this commodity is purchased here, and sold elsewhere. \nActual profit may vary based on market prices at point of sale.');
        rareProfit.classList.add('marketProfitHeader');

        rareHeader.append(rareName, rareStock, rareBuy, rareMean, rareProfit);

        let rareSlot = document.createElement('slot');
        rareSlot.setAttribute('name', 'rares');
        let rarePlaceholder = document.createElement('div');
        rarePlaceholder.classList.add('marketPlaceholder');
        rarePlaceholder.textContent = "No rare commodities"
        rareSlot.append(rarePlaceholder);

        this.rares.append(rareHeader, rareSlot);

        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'market.css');

        this.shadowRoot.append(styleSheet, header, this.rares, this.imports, this.exports);
    }

    set station(value)
    {
        this.setAttribute('station', value);
    }

    get station()
    {
        return this.getAttribute('station');
    }

    set type(value)
    {
        this.setAttribute('type', value);
    }

    get type()
    {
        return this.getAttribute('type');
    }

    set system(value)
    {
        this.setAttribute('system', value);
    }

    get system()
    {
        return this.getAttribute('system');
    }

    static get observedAttributes()
    {
        return ['station', 'type', 'system'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'station')
        {
            this.stationName.textContent = newValue;
        }
        else if (name === 'type')
        {
            this.stationType.textContent = '[' + newValue + ']';
        }
        else if (name === 'system')
        {
            this.systemName.textContent = newValue;
        }
    }
}

customElements.define('market-info', MarketInfo);