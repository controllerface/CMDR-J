class CartographicData extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CartographicData');
        this.shadowRoot.append(template.content.cloneNode(true));
        this.ignoredServices = new Set();
        this.ignoredServices.add('dock');
        this.ignoredServices.add('autodock');
        this.ignoredServices.add('contacts');
        this.ignoredServices.add('crewlounge');
        this.ignoredServices.add('tuning');
        this.ignoredServices.add('missions');
        this.ignoredServices.add('missionsgenerated');
        this.ignoredServices.add('flightcontroller');
        this.ignoredServices.add('stationoperations');
        this.ignoredServices.add('powerplay');
        this.ignoredServices.add('stationMenu');
        this.ignoredServices.add('shop');
        this.ignoredServices.add('engineer');
    }

    set bodyType(value)
    {
        this.setAttribute('bodytype', value);
    }

    get bodyType()
    {
        return this.getAttribute('bodytype');
    }

    set bodyName(value)
    {
        this.setAttribute('bodyname', value);
    }

    get bodyName()
    {
        return this.getAttribute('bodyname');
    }

    formatName(name)
    {
        switch (name)
        {
            case 'AbsoluteMagnitude': return 'Absolute Magnitude';
            case 'Age_MY': return 'Age';
            case 'AtmosphereType': return 'Atmosphere Type';
            case 'AtmosphereComposition': return 'Atmosphere Composition';
            case 'AxialTilt': return 'Axial Tilt';
            case 'commodities': return 'Commodity Market';
            case 'Composition': return 'Basic Composition';
            case 'DistanceFromArrivalLS': return 'Distance From Arrival';
            case 'DistFromStarLS': return 'Distance From Star';
            case 'exploration': return 'Universal Cartographics';
            case 'MarketID': return 'Market ID';
            case 'Materials': return 'Material Composition';
            case 'materialtrader': return 'Material Trader';
            case 'MassEM': return 'Mass';
            case 'OrbitalInclination': return 'Orbital Inclination';
            case 'OrbitalPeriod': return 'Orbital Period';
            case 'PlanetClass': return 'Planet Class';
            case 'ReserveLevel': return 'Reserve Level';
            case 'RotationPeriod': return 'Rotation Period';
            case 'ScanType': return 'Scan Type';
            case 'searchrescue': return 'Search and Rescue';
            case 'SemiMajorAxis': return 'Semi-Major Axis';
            case 'StarType': return 'Star Type';
            case 'StationEconomy': return 'Primary Economy';
            case 'StationEconomies' : return 'Economies';
            case 'StationServices': return 'Station Services';
            case 'StationFaction': return 'Controlling Faction';
            case 'StationAllegiance': return 'Station Allegiance';
            case 'StationGovernment': return 'Government';
            case 'StationType': return 'Station Type';
            case 'stellar_body_id': return 'Body ID';
            case 'stellar_body_type': return 'Body Type';
            case 'stellar_body_name': return 'Body Name';
            case 'StellarMass': return 'Stellar Mass';
            case 'SurfaceGravity': return 'Surface Gravity';
            case 'SurfacePressure': return 'Surface Pressure';
            case 'SurfaceTemperature': return 'Surface Temperature';
            case 'TerraformState': return 'Terraform State';
            case 'TidalLock': return 'Tidal Lock';
            case 'timestamp': return 'Last Updated';

            default: return name;
        }
    }

    formatValue(value)
    {
        if (isNaN(value) || typeof value === 'boolean')
        {
            switch (value)
            {
                case 'NavBeaconDetail': return 'NavBeacon Detail';
                case 'AsteroidCluster': return 'Asteroid Cluster';
                case 'CarbonDioxide': return 'Carbon Dioxide';
                case 'BlackHole': return 'Black Hole';
                case 'CraterOutpost': return 'Crater Outpost';
                default: return value;
            }
        }
        else if (Number.isInteger(value))
        {
            return parseInt(value, 10).toLocaleString("en-US")
        }
        else
        {
            return parseFloat(value).toLocaleString("en-US")
        }
    }

    determineUnit(name)
    {
        switch (name)
        {
            case 'Age_MY': return 'Million Years';
            case 'AxialTilt': return '&deg;';
            case 'DistanceFromArrivalLS': return 'LS';
            case 'DistFromStarLS': return 'LS';
            case 'OrbitalInclination': return '&deg;';
            case 'Periapsis': return '&deg;';
            case 'OrbitalPeriod': return 'Days';
            case 'RotationPeriod': return 'Days';
            case 'SemiMajorAxis': return 'AU';
            case 'StellarMass': return 'Solar Masses';
            case 'SurfaceGravity': return 'G';
            case 'SurfacePressure': return 'ATM';
            case 'SurfaceTemperature': return 'K';
            case 'Radius': return 'KM';
            case 'MassEM': return 'Earth Masses';

            default: return "";
        }
    }

    createExpandedStatContainer(summary)
    {
        let ringDetails = document.createElement('details');
        let ringSummary = document.createElement('summary');
        ringSummary.textContent = summary;
        ringSummary.classList.add('expandedSummary');
        ringDetails.append(ringSummary);
        let ringContainer = document.createElement('div');
        ringContainer.classList.add('expandedData');
        ringDetails.append(ringContainer);
        return [ringDetails, ringContainer];
    }

    createExpandedStatEntry(name, value)
    {
        let nextRingEntry = document.createElement('div');
        nextRingEntry.classList.add('expandedEntry');
        let nextRingName = document.createElement('span');
        nextRingName.classList.add('expandedName');
        let nextRingType = document.createElement('span');
        nextRingType.classList.add('expandedValue');
        nextRingName.textContent = name;
        nextRingType.textContent = value;
        nextRingEntry.append(nextRingName, nextRingType);
        return nextRingEntry;
    }

    loadBodyData(body)
    {
        let statContainer = document.createElement('div');
        statContainer.classList.add('infoTable');

        if (body['Landable'] === true)
        {
            this.shadowRoot.getElementById('cartographicData_bodyname')
                .classList.add('positive');
        }

        if (body['TerraformState'])
        {
            let terraformState = body['TerraformState'];

            if (terraformState === 'Terraformable')
            {
                this.shadowRoot.getElementById('cartographicData_bodyname')
                    .classList.add('antixeno');
            }
        }

        if (body['PlanetClass'])
        {
            let planetClass = body['PlanetClass'];
            let colorClass = '';
            if (planetClass === 'Ammonia world')
            {
                colorClass = 'ammoniaWorld';
            }
            else if (planetClass === 'Earthlike body')
            {
                colorClass = 'earthLikeWorld';
            }
            else if (planetClass === 'Water world')
            {
                colorClass = 'waterWorld';
            }

            if (colorClass !== '')
            {
                this.shadowRoot.getElementById('cartographicData_bodytype')
                    .classList.add(colorClass);
            }
        }

        if (body['stellar_body_type'] === 'Star'
            || body['stellar_body_type'] === 'BlackHole')
        {
            let starType = body['StarType'];
            let colorClass = 'star';

            if (starType)
            {
                colorClass = determineStarStyle(starType);

                let subClass = body['Subclass'];

                let formattedType = starType
                    .replace('M_RedGiant', '(Red Giant) M')
                    .replace('M_RedSuperGiant', '(Red Super-Giant) M')
                    .replace('K_OrangeGiant', '(Orange Giant) K');

                let classElement = document.createElement('span');
                classElement.textContent = '[' + formattedType + subClass + ']';
                classElement.classList.add('starType');

                this.shadowRoot.getElementById('cartographicData_bodyname')
                    .append(classElement);
            }

            this.shadowRoot.getElementById('cartographicData_bodytype')
                .classList.add(colorClass);
        }

        if (body['stellar_body_mapped'])
        {
            let mappedElement = document.createElement('span');
            mappedElement.textContent = '[MAPPED]';
            mappedElement.classList.add('mappedIndicator');

            this.shadowRoot.getElementById('cartographicData_bodyname')
                .append(mappedElement);
        }

        let statistics = Object.keys(body);
        statistics.sort((a, b) =>
        {
            let aObject = typeof body[a] === 'object';
            let bObject = typeof body[b] === 'object';

            if (aObject != bObject)
            {
                if (aObject)
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            }

            return a.localeCompare(b);
        });

        for (let j = 0, len = statistics.length; j < len; j++)
        {
            let stat = statistics[j];
            let value = body[stat];

            if (stat === 'Parents'
                || stat === 'AtmosphereType'
                || stat === 'stellar_body_mapped'
                || stat === 'stellar_body_name'
                || stat === 'planetary_settlement_name')
            {
                continue;
            }

            let statRow = document.createElement('div');
            statRow.classList.add('infoRow');

            let statName = document.createElement('span');
            statName.classList.add('infoName');
            statName.textContent = this.formatName(stat);

            let statValue = document.createElement('span');
            statValue.classList.add('infoValue');

            if (stat === 'StationType')
            {
                let isStation = this.bodyType === 'Station';
                let isOutpost = value === 'Outpost';
                let formatted = this.formatValue(value);
                if (isStation && !isOutpost)
                {
                    formatted += ' Station';
                }
                else if (isOutpost)
                {
                    formatted = 'Orbital ' + formatted;
                }
                this.bodyType = this.formatValue(formatted);
            }

            if (stat === 'timestamp')
            {
                let date = new Date(value);
                statValue.textContent = date.toLocaleString();
            }
            else if (stat === 'MarketID')
            {
                statValue.textContent = value;
            }
            else if (stat === 'SemiMajorAxis')
            {
                // convert from meters to astronomical units (AU)
                let conversion = (value / 1000) / 150000000;
                statValue.textContent = this.formatValue(conversion);
            }
            else if (stat === 'Radius')
            {
                // convert from meters to kilometers
                let conversion = (value / 1000);
                statValue.textContent = this.formatValue(conversion);
            }
            else if (stat === 'OrbitalPeriod' || stat === 'RotationPeriod')
            {
                // convert from seconds to days
                let conversion = (value * parseFloat('1.15741e-5'));
                statValue.textContent = this.formatValue(conversion);
            }
            else if (stat === 'SurfaceGravity')
            {
                // convert from 1/10th atmospheres
                let conversion = value / 10;
                statValue.textContent = this.formatValue(conversion);
            }
            else if (stat === 'StationServices')
            {
                let detailData = this.createExpandedStatContainer('Services Offered');
                for (let i = 0, len = value.length; i < len; i++)
                {
                    let nextService = value[i];
                    if (this.ignoredServices.has(nextService))
                    {
                        continue;
                    }
                    nextService = this.formatName(nextService);

                    let nextServiceEntry = this.createExpandedStatEntry('', nextService);
                    detailData[1].append(nextServiceEntry);
                }
                statValue.append(detailData[0]);
            }
            else if (stat === 'Signals')
            {
                let bodyType = body['stellar_body_type'];
                let text = 'Notable Signals';
                if (bodyType === 'PlanetaryRing')
                {
                    text = 'Material Hotspots'
                }
                let detailData = this.createExpandedStatContainer(text);
                for (let i = 0, len = value.length; i < len; i++)
                {
                    //console.log(value[i]);
                    let nextSignal = value[i];
                    let signalType = nextSignal['Type'];
                    if (nextSignal['Type_Localised'])
                    {
                        signalType = nextSignal['Type_Localised'];
                    }
                    let signalCount = nextSignal['Count'];
                    let nextSignalEntry = this.createExpandedStatEntry(signalType, signalCount);
                    detailData[1].append(nextSignalEntry);
                }
                statValue.append(detailData[0]);
            }
            else if (stat === 'StationEconomies')
            {
                let detailData = this.createExpandedStatContainer('Economy Data');
                for (let i = 0, len = value.length; i < len; i++)
                {
                    let nextEconomy = value[i];
                    let economyName = nextEconomy['Name'];
                    let economyShare = nextEconomy['Proportion'] * 100 + " %";
                    let nextEconomyEntry = this.createExpandedStatEntry(economyName, economyShare);
                    detailData[1].append(nextEconomyEntry);
                }
                statValue.append(detailData[0]);
            }
            else if (stat === 'StationFaction')
            {
                let detailData = this.createExpandedStatContainer('Faction Data');
                let nameEntry = this.createExpandedStatEntry("", value['Name']);
                let stateEntry = this.createExpandedStatEntry("Current State", value['FactionState']);
                detailData[1].append(nameEntry, stateEntry);
                statValue.append(detailData[0]);
            }
            else if (stat === 'Composition')
            {
                let detailData = this.createExpandedStatContainer('Composition Data');
                let types = Object.keys(value);
                types.sort();

                for (let i = 0, len = types.length; i < len; i++)
                {
                    let materialName = types[i];
                    let materialPercent = (value[materialName] * 100).toFixed(2) + ' %';
                    let nextMaterialEntry = this.createExpandedStatEntry(materialName, materialPercent);
                    detailData[1].append(nextMaterialEntry);
                }
                statValue.append(detailData[0]);
            }
            else if (stat === 'Rings')
            {
                let detailData = this.createExpandedStatContainer('Ring Data');
                for (let i = 0, len = value.length; i < len; i++)
                {
                    let nextRing = value[i];
                    let ringName = nextRing['Name'].replace(this.getAttribute('bodyname'), '');
                    let ringValue = nextRing['RingClass'].replace('eRingClass_', '');
                    let nextRingEntry = this.createExpandedStatEntry(ringName, ringValue);
                    detailData[1].append(nextRingEntry);
                }
                statValue.append(detailData[0]);
            }
            else if (stat === 'Materials')
            {
                let detailData = this.createExpandedStatContainer('Material Data');
                for (let i = 0, len = value.length; i < len; i++)
                {
                    let nextMaterial = value[i];
                    let materialName = nextMaterial['Name'];
                    let materialPercent = nextMaterial['Percent'].toFixed(2) + ' %';
                    let nextMaterialEntry = this.createExpandedStatEntry(materialName, materialPercent);
                    detailData[1].append(nextMaterialEntry);
                }
                statValue.append(detailData[0]);
            }
            else if (stat === 'AtmosphereComposition')
            {
                let detailData = this.createExpandedStatContainer('Atmosphere Data');
                for (let i = 0, len = value.length; i < len; i++)
                {
                    let nextElement = value[i];
                    let elementName = nextElement['Name'];
                    let elementPercent = nextElement['Percent'].toFixed(2) + ' %';
                    let nextElementEntry = this.createExpandedStatEntry(elementName, elementPercent);
                    detailData[1].append(nextElementEntry);
                }
                statValue.append(detailData[0]);
            }
            else
            {
                statValue.textContent = this.formatValue(value);
                statValue.textContent = statValue.textContent
                    .replace(' volcanism', '')
                    .replace('Resources', '');
            }

            let statUnit = document.createElement('span');
            statUnit.classList.add('infoUnit');
            let unitText = this.determineUnit(stat);
            if (unitText === '&deg;')
            {
                statUnit.innerHTML = unitText;
            }
            else
            {
                statUnit.textContent = unitText;
            }

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

    formatType(type)
    {
        switch (type)
        {
            case 'AsteroidCluster': return 'Asteroid Cluster';
            case 'PlanetaryRing': return 'Planetary Ring';
            case 'StellarRing': return 'Stellar Ring';
            case 'BlackHole': return 'Black Hole';
            default: return type;
        }
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        let text = newValue;
        if (name === 'bodytype')
        {
            text = this.formatType(newValue);
        }

        this.shadowRoot.getElementById('cartographicData_' + name).textContent = text;
    }
}

customElements.define('cartographic-data', CartographicData);