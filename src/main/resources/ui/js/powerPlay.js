class PowerPlay extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_PowerPlay');
        this.shadowRoot.append(template.content.cloneNode(true));
    }
}

customElements.define('power-play', PowerPlay);