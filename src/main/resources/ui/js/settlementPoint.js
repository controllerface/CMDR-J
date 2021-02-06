class SettlementPoint extends LandingPoint
{
    constructor()
    {
        super();
        this.shadowRoot.getElementById('waypointLocation_title').textContent = "Settlement";
    }
}

customElements.define('settlement-point', SettlementPoint);