class PledgedPower extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_PledgedPower');
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

    set rank(value)
    {
        this.setAttribute('rank', value);
    }

    get rank()
    {
        return this.getAttribute('rank');
    }

    set votes(value)
    {
        this.setAttribute('votes', value);
    }

    get votes()
    {
        return this.getAttribute('votes');
    }

    set merits(value)
    {
        this.setAttribute('merits', value);
    }

    get merits()
    {
        return this.getAttribute('merits');
    }

    set time(value)
    {
        this.setAttribute('time', value);
    }

    get time()
    {
        return this.getAttribute('time');
    }


    static get observedAttributes()
    {
        return ['name',
                'rank',
                'votes',
                'merits',
                'time'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'time')
        {
            let element = this.shadowRoot.getElementById('pledgedPower_' + name);
            element.textContent = '';
            let tokens = newValue.split(' ');
            let unit = false;
            for (let i = 0; i < tokens.length; i++)
            {
                let next = document.createElement('span');
                next.textContent = tokens[i];
                if (unit)
                {
                    next.classList.add('valueUnit');
                }
                element.append(next);
                unit = !unit;
            }
        }
        else
        {
            this.shadowRoot.getElementById('pledgedPower_' + name).textContent = newValue;
        }
    }
}

customElements.define('pledged-power', PledgedPower);