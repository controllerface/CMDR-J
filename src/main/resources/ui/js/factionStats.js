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
        this.getAttribute('federalnavy');
    }

    set federalNavyProgress(value)
    {
        this.setAttribute('federalnavyprogress', value);
    }

    get federalNavyProgress()
    {
        this.getAttribute('federalnavyprogress');
    }

    set imperialNavy(value)
    {
        this.setAttribute('imperialnavy', value);
    }

    get imperialNavy()
    {
        this.getAttribute('imperialnavy');
    }

    set imperialNavyProgress(value)
    {
        this.setAttribute('imperialnavyprogress', value);
    }

    get imperialNavyProgress()
    {
        this.getAttribute('imperialnavyprogress');
    }

    set federation(value)
    {
        this.setAttribute('federation', value);
    }

    get federation()
    {
        this.getAttribute('federation');
    }

    set federationProgress(value)
    {
        this.setAttribute('federationprogress', value);
    }

    get federationProgress()
    {
        this.getAttribute('federationprogress');
    }

    set empire(value)
    {
        this.setAttribute('empire', value);
    }

    get empire()
    {
        this.getAttribute('empire');
    }

    set empireProgress(value)
    {
        this.setAttribute('empireprogress', value);
    }

    get empireProgress()
    {
        this.getAttribute('empireprogress');
    }

    set alliance(value)
    {
        this.setAttribute('alliance', value);
    }

    get alliance()
    {
        this.getAttribute('alliance');
    }

    set allianceProgress(value)
    {
        this.setAttribute('allianceprogress', value);
    }

    get allianceProgress()
    {
        this.getAttribute('allianceprogress');
    }

    set independent(value)
    {
        this.setAttribute('independent', value);
    }

    get independent()
    {
        this.getAttribute('independent');
    }

    set independentProgress(value)
    {
        this.setAttribute('independentprogress', value);
    }

    get independentProgress()
    {
        this.getAttribute('independentprogress');
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