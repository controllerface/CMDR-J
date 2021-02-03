class CommanderStat extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        this.nameElement = document.createElement('span');
        this.nameElement.classList.add('statName');
        this.valueElement = document.createElement('span');
        this.valueElement.classList.add('statValue');

        let row = document.createElement('div');
        row.classList.add('statRow');
        row.append(this.nameElement, this.valueElement);

        let styleSheet = document.createElement('link');
        styleSheet.setAttribute('rel', 'stylesheet');
        styleSheet.setAttribute('href', 'statistics.css');

        this.shadowRoot.append(styleSheet, row);
    }

    set statistic(value)
    {
        this.setAttribute('statistic', value);
    }

    get statistic()
    {
        return this.getAttribute('statistic');
    }

    set statValue(value)
    {
        this.setAttribute('statValue', value);
    }

    get statValue()
    {
        return this.getAttribute('statValue');
    }

    static get observedAttributes()
    {
        return ['statistic', 'statvalue'];
    }

    attributeChangedCallback(name, oldValue, newValue)
    {
        if (name === 'statistic')
        {
            this.nameElement.textContent = newValue;
        }

        if (name === 'statvalue')
        {
            if (newValue.includes(' '))
            {
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
                    this.valueElement.append(next);
                    unit = !unit;
                }
            }
            else
            {
                this.valueElement.textContent = newValue;
            }
        }
    }
}

customElements.define('commander-stat', CommanderStat);