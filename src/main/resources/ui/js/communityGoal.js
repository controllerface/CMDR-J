class CommunityGoal extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_CommunityGoal');
        this.shadowRoot.append(template.content.cloneNode(true));
    }

    set name(value)
    {
        this.setAttribute('name', value);
    }

    get name()
    {
        return this.getAttribute('name');
    }

    set system(value)
    {
        this.setAttribute('system', value);
    }

    get system()
    {
        return this.getAttribute('system');
    }

    set location(value)
    {
        this.setAttribute('location', value);
    }

    get location()
    {
        return this.getAttribute('location');
    }

    set expiry(value)
    {
        this.setAttribute('expiry', value);
    }

    get expiry()
    {
        return this.getAttribute('expiry');
    }

    set tier(value)
    {
        this.setAttribute('tier', value);
    }

    get tier()
    {
        return this.getAttribute('tier');
    }

    set complete(value)
    {
        this.setAttribute('complete', value);
    }

    get complete()
    {
        return this.getAttribute('complete');
    }

    set total(value)
    {
        this.setAttribute('total', value);
    }

    get total()
    {
        return this.getAttribute('total');
    }

    set contribution(value)
    {
        this.setAttribute('contribution', value);
    }

    get contribution()
    {
        return this.getAttribute('contribution');
    }

    set contributors(value)
    {
        this.setAttribute('contributors', value);
    }

    get contributors()
    {
        return this.getAttribute('contributors');
    }

    set percentile(value)
    {
        this.setAttribute('percentile', value);
    }

    get percentile()
    {
        return this.getAttribute('percentile');
    }

    set bonus(value)
    {
        this.setAttribute('bonus', value);
    }

    get bonus()
    {
        return this.getAttribute('bonus');
    }

    static get observedAttributes()
    {
        return ['name',
                'system',
                'location',
                'expiry',
                'tier',
                'complete',
                'total',
                'contribution',
                'contributors',
                'percentile',
                'bonus'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        this.shadowRoot.getElementById('communityGoal_' + name).textContent = newValue;
    }
}

customElements.define('community-goal', CommunityGoal);