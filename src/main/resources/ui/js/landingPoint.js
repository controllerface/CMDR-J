class LandingPoint extends WaypointLocation
{
    constructor()
    {
        super();

        let removeButton = this.shadowRoot.getElementById('waypointLocation_removebutton');
        removeButton.parentElement.removeChild(removeButton);
        let renameButton = this.shadowRoot.getElementById('waypointLocation_renamebutton');
        renameButton.parentElement.removeChild(renameButton);

        this.shadowRoot.getElementById('waypointLocation_title').textContent = "Ship";
    }
}

customElements.define('landing-point', LandingPoint);