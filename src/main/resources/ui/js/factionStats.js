class FactionStats extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_FactionStats');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set federalNavy(value)
    {
        this.setAttribute('federalnavy', value);
    }

    get federalNavy()
    {
        return this.getAttribute('federalnavy');
    }

    set federalNavyProgress(value)
    {
        this.setAttribute('federalnavyprogress', value);
    }

    get federalNavyProgress()
    {
        return this.getAttribute('federalnavyprogress');
    }

    set imperialNavy(value)
    {
        this.setAttribute('imperialnavy', value);
    }

    get imperialNavy()
    {
        return this.getAttribute('imperialnavy');
    }

    set imperialNavyProgress(value)
    {
        this.setAttribute('imperialnavyprogress', value);
    }

    get imperialNavyProgress()
    {
        return this.getAttribute('imperialnavyprogress');
    }

    set federation(value)
    {
        this.setAttribute('federation', value);
    }

    get federation()
    {
        return this.getAttribute('federation');
    }

    set federationProgress(value)
    {
        this.setAttribute('federationprogress', value);
    }

    get federationProgress()
    {
        return this.getAttribute('federationprogress');
    }

    set empire(value)
    {
        this.setAttribute('empire', value);
    }

    get empire()
    {
        return this.getAttribute('empire');
    }

    set empireProgress(value)
    {
        this.setAttribute('empireprogress', value);
    }

    get empireProgress()
    {
        return this.getAttribute('empireprogress');
    }

    set alliance(value)
    {
        this.setAttribute('alliance', value);
    }

    get alliance()
    {
        return this.getAttribute('alliance');
    }

    set allianceProgress(value)
    {
        this.setAttribute('allianceprogress', value);
    }

    get allianceProgress()
    {
        return this.getAttribute('allianceprogress');
    }

    set independent(value)
    {
        this.setAttribute('independent', value);
    }

    get independent()
    {
        return this.getAttribute('independent');
    }

    set independentProgress(value)
    {
        this.setAttribute('independentprogress', value);
    }

    get independentProgress()
    {
        return this.getAttribute('independentprogress');
    }

    clearLocalFactions()
    {
        let factions = this.querySelectorAll('system-faction');
        if (factions)
        {
            factions.forEach((faction) =>
            {
                faction.parentElement.removeChild(faction);
            })
        }
    }

    static get observedAttributes()
    {
        return ['federalnavy',
                'federalnavyprogress',
                'imperialnavy',
                'imperialnavyprogress',
                'federation',
                'federationprogress',
                'empire',
                'empireprogress',
                'alliance',
                'allianceprogress',
                'independent',
                'independentprogress'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name.includes('progress'))
        {
            this.shadowRoot.getElementById('factionStats_' + name).value = newValue;
        }
        else
        {
            this.shadowRoot.getElementById('factionStats_' + name).textContent = newValue;
        }
    }
}

customElements.define('faction-stats', FactionStats);