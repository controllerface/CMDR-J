class MissionData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_MissionData');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set missionID(value)
    {
        this.setAttribute('missionid', value);
    }

    get missionID()
    {
        return this.getAttribute('missionid');
    }

    set title(value)
    {
        this.setAttribute('title', value);
    }

    get title()
    {
        return this.getAttribute('title');
    }

    set faction(value)
    {
        this.setAttribute('faction', value);
    }

    get faction()
    {
        return this.getAttribute('faction');
    }

    set reward(value)
    {
        this.setAttribute('reward', value);
    }

    get reward()
    {
        return this.getAttribute('reward');
    }

    set influence(value)
    {
        this.setAttribute('influence', value);
    }

    get influence()
    {
        return this.getAttribute('influence');
    }

    set reputation(value)
    {
        this.setAttribute('reputation', value);
    }

    get reputation()
    {
        return this.getAttribute('reputation');
    }

    formatName(name)
    {
        switch (name)
        {
            case 'TargetType': return 'Target Type';
            case 'TargetFaction': return 'Target Faction';
            case 'KillCount': return 'Kill Count';
            case 'DestinationSystem': return 'Destination System';
            case 'DestinationStation': return 'Destination Station';
            case 'NewDestinationSystem': return 'Redirected System';
            case 'NewDestinationStation': return 'Redirected Station';
            case 'PassengerCount': return 'Passenger Count';
            case 'PassengerVIPs': return 'Passenger VIPs';
            case 'PassengerWanted': return 'Passenger Wanted';
            case 'PassengerType': return 'Passenger Type';
            case 'Wing': return 'Wing Mission';
            default: return name;
        }
    }

    setDetails(details)
    {
        let keys = Object.keys(details);
        keys.sort();
        this.textContent = '';
        for (let i = 0, len = keys.length; i < len; i++)
        {
            let name = keys[i];
            let value = details[name];

            if (name === 'Expiry')
            {
                let date = new Date(value);
                value = date.toLocaleString();
            }

            let row = document.createElement('div');
            row.classList.add('missionDetailRow');
            let nameElement = document.createElement('span');
            nameElement.classList.add('slottedName');
            nameElement.textContent = this.formatName(name);
            let valueElement = document.createElement('span');
            valueElement.classList.add('slottedValue');
            valueElement.textContent = value;
            row.append(nameElement, valueElement);
            this.append(row);
        }
    }

    static get observedAttributes()
    {
        return ['title',
                'faction',
                'reward',
                'influence',
                'reputation',];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('missionData_' + name).textContent = newValue;
    }
}

customElements.define('mission-data', MissionData);