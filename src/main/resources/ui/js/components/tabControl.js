class TabControl extends BaseComponent
{
    constructor()
    {
        super();
        this.loadTemplate('t_TabControl');
    }

    connectedCallback()
    {
        if (this.initialized) return;

        if (this.hasAttribute('vertical'))
        {
            window.requestAnimationFrame(() => this.setVertical());
            this.initialized = true;
        }
    }

    setVertical()
    {
        if (document.readyState === 'complete')
        {
            this.locate('container').classList.add('vertical');
            let divider = this.locate('divider');
            if (divider)
            {
                divider.parentElement.removeChild(divider);
            }
        }
        else
        {
            window.requestAnimationFrame(() => this.setVertical());
        }
    }

    borrowElement(element)
    {
        element.slot = 'active';
        this.append(element);
    }

    returnBorrowedElements()
    {
        if (this.lastTab)
        {
            this.lastTab.deselect(this.locate('contents').assignedElements());
        }
    }

    selectTab(tab)
    {
        if (this.lastTab === tab) return;
        this.returnBorrowedElements();
        this.lastTab = tab;
        tab.borrowElements().forEach(element => this.borrowElement(element));
    }
}

customElements.define('tab-control', TabControl);