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
        this.currentWidth = 0;
        this.needColorInit = true;

        requestAnimationFrame(()=>this.render());
    }

    loadColors()
    {
        if (this.needColorInit)
        {
            let computedStyle = getComputedStyle(document.documentElement);
            this.color_BG = computedStyle.getPropertyValue('--gps-background');
            this.color_line = computedStyle.getPropertyValue('--gps-line');
            this.needColorInit = false;
        }
    }

    updateDimensions()
    {
        let gpsRect = this.gps.getBoundingClientRect();
        if (this.currentWidth != gpsRect.width)
        {
            console.log("width:" + gpsRect.width);
            this.currentWidth = gpsRect.width;
        }
        let w = gpsRect.width - 40;
        this.viewport.width = w;
        this.viewport.height = w / 2;
    }

    render()
    {
        this.loadColors();
        this.updateDimensions();

        var ctx = this.viewport.getContext('2d');
        ctx.fillStyle = this.color_BG;
        ctx.fillRect(0, 0, this.viewport.width, this.viewport.height);

        ctx.strokeStyle = this.color_line;
        ctx.lineWidth = 5;
        ctx.strokeRect(0, 0, this.viewport.width, this.viewport.height)

        if (this.coordinateData)
        {
            ctx.fillStyle = this.color_line;
            // find where the center of the arrow icon will be

            let canvasCenterX = this.viewport.width / 2;
            let canvasCenterY = this.viewport.height / 2;

            let centerX = this.viewport.width / 2;
            let centerY = this.viewport.height / 2;

            // define a y off-set for the "tip" of the arrow. Will re use the center X
            let topY = centerY - 10;

            // define a point for the "left fletching" of the arrow
            let leftX = centerX - 5;
            let leftY = centerY + 10;

            // define a y off-set for the "nock" of the arrow. Will re use the center X
            let midY = centerY + 5;

            // define a point for the "right fletching" of the arrow
            let rightX = centerX + 5;
            let rightY = centerY + 10;

            ctx.save();
            let rot = this.coordinateData['heading'] * Math.PI / 180;
            let antiRot = -90 * Math.PI / 180;
            ctx.translate(canvasCenterX, canvasCenterY);
            ctx.rotate(rot);
            ctx.translate(-1 * canvasCenterX, -1 * canvasCenterY);
            ctx.beginPath();
            ctx.moveTo(centerX, topY);
            ctx.lineTo(rightX, rightY);
            ctx.lineTo(centerX, midY);
            ctx.lineTo(leftX, leftY);
            ctx.closePath();
            ctx.fill();
            ctx.restore();

            if (this.settlementData)
            {
                let latOffset = this.coordinateData['latitude'] - this.settlementData['latitude'];
                latOffset = latOffset * 1000;
                let lonOffset = this.coordinateData['longitude'] - this.settlementData['longitude'];
                lonOffset = lonOffset * 1000;

                let markX = centerX - latOffset;
                let markY = centerY - lonOffset;




//        new double[]{markX - 3, markX - 3, markX + 3, markX + 3},
//        new double[]{markY - 3, markY + 3, markY + 3, markY - 3}, 4);


                ctx.save();
            ctx.translate(canvasCenterX, canvasCenterY);
            ctx.rotate(antiRot);
            ctx.translate(-1 * canvasCenterX, -1 * canvasCenterY);
                ctx.moveTo(markX - 3, markY - 3);
                ctx.lineTo(markX - 3, markY + 3);
                ctx.lineTo(markX + 3, markY + 3);
                ctx.lineTo(markX + 3, markY - 3);
                ctx.closePath();
                ctx.fill();
                ctx.restore();

                //console.log('la: ' + latOffset + ' lo: ' + lonOffset);
            }
        }

        requestAnimationFrame(()=>this.render());
    }

    loadCoordinateData(coordinateData)
    {
        this.coordinateData = coordinateData;
    }

    loadSettlementData(settlementData)
    {
        this.settlementData = settlementData;
    }
}

customElements.define('gps-display', GPSDisplay);