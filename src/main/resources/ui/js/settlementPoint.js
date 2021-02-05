class SettlementPoint extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_SettlementPoint');
        this.shadowRoot.append(template.content.cloneNode(true));

        this.gotoButton = this.shadowRoot.getElementById('settlementPoint_gotobutton');
        this.gotoButton.addEventListener('click', (e) =>
        {
            this.toggleSelect(false);
        });
    }

    toggleSelect(forceOff)
    {
        if (this.selected || forceOff)
        {
            this.selected = false;
            this.gotoButton.value = "track";
            let gpsDisplay = document.getElementById('gpsDisplay');

            if (!forceOff)
            {
                gpsDisplay.clearDestination();
            }

            let container = this.shadowRoot.getElementById('settlementPoint_container');
            container.classList.remove('selectedWaypoint');
        }
        else
        {
            this.selected = true;
            this.gotoButton.value = "clear";
            let gpsDisplay = document.getElementById('gpsDisplay');
            gpsDisplay.setDestination(this);
            let container = this.shadowRoot.getElementById('settlementPoint_container');
            container.classList.add('selectedWaypoint');
        }
    }

    set settlementName(value)
    {
        this.setAttribute('settlementname', value);
    }

    get settlementName()
    {
        return this.getAttribute('settlementname');
    }

    static get observedAttributes()
    {
        return ['settlementname'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('settlementPoint_' + name).textContent = newValue;
    }
}

customElements.define('settlement-point', SettlementPoint);