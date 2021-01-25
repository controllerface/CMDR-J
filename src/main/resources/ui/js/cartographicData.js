class CartographicData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CartographicData');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set bodyType(value)
    {
        this.setAttribute('bodytype', value);
    }

    get bodyType()
    {
        this.getAttribute('bodytype');
    }

    set bodyName(value)
    {
        this.setAttribute('bodyname', value);
    }

    get bodyName()
    {
        this.getAttribute('bodyname');
    }

    formatName(name)
    {
        switch (name)
        {
            case 'stellar_body_id': return 'Body ID';
            case 'stellar_body_type': return 'Body Type';
            case 'stellar_body_name': return 'Body Name';
            case 'AtmosphereType': return 'Atmosphere Type';
            case 'AxialTilt': return 'Axial Tilt';
            case 'DistanceFromArrivalLS': return 'Distance From Arrival';
            case 'AxialTilt': return 'Axial Tilt';
            case 'MassEM': return 'Mass';
            case 'OrbitalInclination': return 'Orbital Inclination';
            case 'OrbitalPeriod': return 'Orbital Period';
            case 'PlanetClass': return 'Planet Class';
            case 'RotationPeriod': return 'Rotation Period';
            case 'ScanType': return 'Scan Type';
            case 'SemiMajorAxis': return 'Semi-Major Axis';
            case 'SurfaceGravity': return 'Surface Gravity';
            case 'SurfacePressure': return 'Surface Pressure';
            case 'SurfaceTemperature': return 'Surface Temperature';
            case 'TidalLock': return 'Tidal Lock';
            case 'MassEM': return 'Mass';

            default: return name;
        }
    }

    loadBodyData(body)
    {
        let statContainer = document.createElement('div');
        statContainer.classList.add('infoTable');

        let statistics = Object.keys(body);
        statistics.sort();

        for (let j = 0, len = statistics.length; j < len; j++)
        {
            let statRow = document.createElement('div');
            statRow.classList.add('infoRow');

            let stat = statistics[j];
            let value = body[stat];

            let statName = document.createElement('span');
            statName.classList.add('infoName');
            statName.textContent = this.formatName(stat);

            let statValue = document.createElement('span');
            statValue.classList.add('infoValue');
            statValue.textContent = value;
            statValue.textContent = statValue.textContent.replace(' volcanism', '');

            let statUnit = document.createElement('span');
            statUnit.classList.add('infoUnit');
            statUnit.textContent = "";
            let unitText = "";

            statRow.append(statName, statValue, statUnit);
            statContainer.append(statRow);
        }

        this.shadowRoot.getElementById('cartographicData_bodydata').append(statContainer);
    }

    static get observedAttributes()
    {
        return ['bodytype',
                'bodyname'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('cartographicData_' + name).textContent = newValue;
    }
}

customElements.define('cartographic-data', CartographicData);