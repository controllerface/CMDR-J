class GPSDisplay extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_GPSDisplay');
        this.shadowRoot.append(template.content.cloneNode(true));
        this.gps = this.shadowRoot.getElementById('gpsDisplay_gps');
        this.viewport = this.shadowRoot.getElementById('gpsDisplay_viewport');
        this.scale = this.shadowRoot.getElementById('gpsDisplay_scale');
        this.currentWidth = 0;
        this.needColorInit = true;
        this.GPS_rotation = -90 * Math.PI / 180;

        requestAnimationFrame(() => this.render());
    }

    loadColors()
    {
        if (this.needColorInit)
        {
            let computedStyle = getComputedStyle(document.documentElement);
            this.color_BG = computedStyle.getPropertyValue('--default-background');
            this.color_line = computedStyle.getPropertyValue('--default-color');
            this.color_text = computedStyle.getPropertyValue('--default-text');
            this.color_destination = computedStyle.getPropertyValue('--positive-color');
            this.needColorInit = false;
        }
    }

    updateDimensions()
    {
        let gpsRect = this.gps.getBoundingClientRect();
        if (this.currentWidth != gpsRect.width)
        {
            this.currentWidth = gpsRect.width;
        }
        let w = gpsRect.width - 40;
        this.viewport.width = w;
        this.viewport.height = w / 2;
        this.centerX = this.viewport.width / 2;
        this.centerY = this.viewport.height / 2;
    }

    renderBackground(ctx)
    {
        ctx.fillStyle = this.color_BG;
        ctx.fillRect(0, 0, this.viewport.width, this.viewport.height);
        ctx.strokeStyle = this.color_line;
        ctx.lineWidth = 5;
        ctx.strokeRect(0, 0, this.viewport.width, this.viewport.height)
    }

    renderPlayer(ctx)
    {
        // define a y off-set for the "tip" of the arrow. Will re use the center X
        let topY = this.centerY - 10;

        // define a point for the "left fletching" of the arrow
        let leftX = this.centerX - 5;
        let leftY = this.centerY + 10;

        // define a y off-set for the "nock" of the arrow. Will re use the center X
        let midY = this.centerY + 5;

        // define a point for the "right fletching" of the arrow
        let rightX = this.centerX + 5;
        let rightY = this.centerY + 10;

        ctx.save();

        ctx.fillStyle = this.color_line;
        let rot = this.coordinateData['heading'] * Math.PI / 180;
        let antiRot = -90 * Math.PI / 180;
        ctx.translate(this.centerX, this.centerY);
        ctx.rotate(rot);
        ctx.translate(-1 * this.centerX, -1 * this.centerY);
        ctx.beginPath();
        ctx.moveTo(this.centerX, topY);
        ctx.lineTo(rightX, rightY);
        ctx.lineTo(this.centerX, midY);
        ctx.lineTo(leftX, leftY);
        ctx.closePath();
        ctx.fill();

        ctx.restore();
    }

    renderSettlement(ctx)
    {
        let latOffset = this.coordinateData['latitude'] - this.settlementData['latitude'];
        latOffset = latOffset * this.scale.value;
        let lonOffset = this.coordinateData['longitude'] - this.settlementData['longitude'];
        lonOffset = lonOffset * this.scale.value;

        let markX = this.centerX - latOffset;
        let markY = this.centerY - lonOffset;

        ctx.save();

        if (this.settlementData['isDestination'])
        {
            ctx.fillStyle = this.color_destination;
        }
        else
        {
            ctx.fillStyle = this.color_line;
        }

        ctx.translate(this.centerX, this.centerY);
        ctx.rotate(this.GPS_rotation);
        ctx.translate(-1 * this.centerX, -1 * this.centerY);
        ctx.moveTo(markX - 3, markY - 3);
        ctx.lineTo(markX - 3, markY + 3);
        ctx.lineTo(markX + 3, markY + 3);
        ctx.lineTo(markX + 3, markY - 3);
        ctx.closePath();
        ctx.fill();

        let settlementName = this.settlementData['name'].toLowerCase();
        let settlementDistance = this.settlementData['distance']
            + ' ' + this.settlementData['unit'];

        let textX = markX - 4;

        ctx.fillStyle = this.color_text;
        ctx.translate(markX, markY);
        ctx.rotate(-1 * this.GPS_rotation);
        ctx.translate(-1 * markX, -1 * markY);
        ctx.font = '12px EUROCAPS';
        ctx.fillText(settlementName, textX, markY + 14);
        ctx.fillStyle = this.color_line;
        ctx.fillText(settlementDistance, textX, markY + 28);

        ctx.restore();
    }

    render()
    {
        this.loadColors();
        this.updateDimensions();

        var ctx = this.viewport.getContext('2d');

        this.renderBackground(ctx);

        if (this.coordinateData)
        {
            if (this.settlementData)
            {
                this.renderSettlement(ctx);
            }
            this.renderPlayer(ctx);
        }

        requestAnimationFrame(() => this.render());
    }

    loadCoordinateData(coordinateData)
    {
        this.coordinateData = coordinateData;
        this.shadowRoot.getElementById('gpsDisplay_latitude').textContent = coordinateData['latitude'];
        this.shadowRoot.getElementById('gpsDisplay_longitude').textContent = coordinateData['longitude'];
        this.shadowRoot.getElementById('gpsDisplay_altitude').textContent = coordinateData['altitude'];
        this.shadowRoot.getElementById('gpsDisplay_heading').textContent = coordinateData['heading'];
    }

    loadSettlementData(settlementData)
    {
        this.settlementData = settlementData;
        let existingSettlements = this.querySelectorAll('settlement-point');
        if (existingSettlements)
        {
            existingSettlements.forEach((e) =>
            {
                e.parentElement.removeChild(e);
            });
        }
        let newSettlement = document.createElement('settlement-point');
        newSettlement.setAttribute('slot', 'settlement');
        newSettlement.settlementName = settlementData['name'];
        this.append(newSettlement);
        this.settlementData['element'] = newSettlement;
    }

    set bodyName(value)
    {
        this.shadowRoot.getElementById('gpsDisplay_body').textContent = value;
    }

    set bearing(value)
    {
        this.shadowRoot.getElementById('gpsDisplay_destination').textContent = value;
    }

    setDestination(element)
    {
        if (this.settlementData['element'] === element)
        {
            this.settlementData['isDestination'] = true;
            setTrackedLocation('settlement');
        }

        // todo: add waypoints
    }

    clearDestination()
    {
        this.settlementData['isDestination'] = false;
        setTrackedLocation('clear');
        // todo: add waypoints
    }
}

customElements.define('gps-display', GPSDisplay);