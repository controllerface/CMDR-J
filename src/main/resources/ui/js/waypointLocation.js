class WaypointLocation extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_WaypointLocation');
        this.shadowRoot.append(template.content.cloneNode(true));

        let removeButton = this.shadowRoot.getElementById('waypointLocation_removebutton');
        removeButton.addEventListener('click',
            (e) => removeWaypoint(this.waypointName, this.getAttribute('waypointId')));

        let renameButton = this.shadowRoot.getElementById('waypointLocation_renamebutton');
        renameButton.addEventListener('click', (e) =>
            renameWaypoint(this.waypointName, this.getAttribute('waypointId'),
                (newName) => this.waypointName = newName));

        this.gotoButton = this.shadowRoot.getElementById('waypointLocation_gotobutton');
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
            if (!forceOff)
            {
                let gpsDisplay = document.getElementById('gpsDisplay');
                gpsDisplay.clearDestination();
            }
            let container = this.shadowRoot.getElementById('waypointLocation_container');
            container.classList.remove('selectedWaypoint');
        }
        else
        {
            this.selected = true;
            this.gotoButton.value = "untrack";
            let gpsDisplay = document.getElementById('gpsDisplay');
            gpsDisplay.setDestination(this);
            let container = this.shadowRoot.getElementById('waypointLocation_container');
            container.classList.add('selectedWaypoint');
        }
    }

    set waypointName(value)
    {
        this.setAttribute('waypointname', value);
    }

    get waypointName()
    {
        return this.getAttribute('waypointname');
    }

    static get observedAttributes()
    {
        return ['waypointname'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('waypointLocation_' + name).textContent = newValue;
    }
}

customElements.define('waypoint-location', WaypointLocation);