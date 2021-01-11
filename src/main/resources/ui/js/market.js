class MarketInfo extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});

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

        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'market.css');

        this.shadowRoot.append(styleSheet, this.imports, this.exports);
    }
}

customElements.define('market-info', MarketInfo);