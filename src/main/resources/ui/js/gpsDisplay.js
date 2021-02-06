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
        this.waypoints = {};

        let addWaypointButton = this.shadowRoot.getElementById('gpsDisplay_addwaypoint');
        addWaypointButton.addEventListener('click', (e) =>
        {
            createWaypoint();
        })

        requestAnimationFrame(() => this.render());
    }

    loadColors()
    {
        if (this.needColorInit)
        {
            let computedStyle = getComputedStyle(document.documentElement);
            this.color_BG = computedStyle.getPropertyValue('--default-background');
            this.color_marker = computedStyle.getPropertyValue('--gps-marker');
            this.color_line = computedStyle.getPropertyValue('--default-color');
            this.color_text = computedStyle.getPropertyValue('--default-text');
            this.color_destination = computedStyle.getPropertyValue('--positive-color');
            this.color_ship = computedStyle.getPropertyValue('--anti-xeno-color');
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
        this.viewport.height = w * 0.75; //w / 2;
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

        ctx.fillStyle = this.color_marker;
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





    renderMapPoint(ctx, pointData, fillColor)
    {
        let latOffset = this.coordinateData['latitude'] - pointData['latitude'];
        latOffset = latOffset * this.scale.value;
        let lonOffset = this.coordinateData['longitude'] - pointData['longitude'];
        lonOffset = lonOffset * this.scale.value;

        let markX = this.centerX - latOffset;
        let markY = this.centerY - lonOffset;

        ctx.save();

        if (pointData['isDestination'])
        {
            ctx.fillStyle = this.color_destination;
        }
        else
        {
            ctx.fillStyle = fillColor;
        }

        ctx.translate(this.centerX, this.centerY);
        ctx.rotate(this.GPS_rotation);
        ctx.translate(-1 * this.centerX, -1 * this.centerY);

        ctx.beginPath();
        ctx.moveTo(markX - 3, markY - 3);
        ctx.lineTo(markX - 3, markY + 3);
        ctx.lineTo(markX + 3, markY + 3);
        ctx.lineTo(markX + 3, markY - 3);
        ctx.closePath();
        ctx.fill();

        let pointName = pointData['name'].toLowerCase();
        let pointDistance = pointData['distance'] + ' ' + pointData['unit'];

        let textX = markX - 4;

        ctx.fillStyle = this.color_text;
        ctx.translate(markX, markY);
        ctx.rotate(-1 * this.GPS_rotation);
        ctx.translate(-1 * markX, -1 * markY);
        ctx.font = '12px EUROCAPS';
        ctx.fillText(pointName, textX, markY + 14);
        ctx.fillStyle = this.color_line;
        ctx.fillText(pointDistance, textX, markY + 28);

        ctx.restore();
    }

    renderOffPlanet(ctx)
    {
        ctx.save();
        ctx.fillStyle = this.color_line;
        ctx.textAlign = "center";
        ctx.font = '24px EUROCAPS';
        ctx.fillText("Off PLanet", this.centerX, this.centerY);
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
            if (this.coordinateData['nearPlanet'] == false)
            {
                this.renderOffPlanet(ctx);
            }
            else
            {
                if (this.settlementData)
                {
                    this.renderMapPoint(ctx, this.settlementData, this.color_line);
                }
                if (this.touchdownData)
                {
                    this.renderMapPoint(ctx, this.touchdownData, this.color_ship);
                }
                if (this.waypoints)
                {
                    let ids = Object.keys(this.waypoints);
                    for (let i = 0, len = ids.length; i < len; i++)
                    {
                        this.renderMapPoint(ctx, this.waypoints[ids[i]], this.color_line);
                    }
                }
                this.renderPlayer(ctx);
            }
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
        if (this.settlementData && this.settlementData['name'] === settlementData['name'])
        {
            this.settlementData['unit'] = settlementData['unit'];
            this.settlementData['distance'] = settlementData['distance'];
            return;
        }

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
        newSettlement.waypointName = settlementData['name'];
        this.append(newSettlement);
        this.settlementData['element'] = newSettlement;
    }

    clearSettlementData()
    {
        this.settlementData = null;
        let existingSettlements = this.querySelectorAll('settlement-point');
        if (existingSettlements)
        {
            existingSettlements.forEach((e) =>
            {
                e.parentElement.removeChild(e);
            });
        }
    }

    loadWaypointData(waypointData)
    {
        if (waypointData['remove'])
        {
            // remove
            let toRemove = this.waypoints[waypointData['waypointId']];
            let element = toRemove['element'];
            element.parentElement.removeChild(element);
            delete this.waypoints[toRemove['waypointId']];
            // todo: what if currently tracked?
            return;
        }

        if (this.waypoints[waypointData['waypointId']])
        {
            // update
            let toUpdate = this.waypoints[waypointData['waypointId']];
            toUpdate['unit'] = waypointData['unit'];
            toUpdate['distance'] = waypointData['distance'];
            toUpdate['name'] = waypointData['name'];
        }
        else
        {
            // add
            this.waypoints[waypointData['waypointId']] = waypointData;
            let newWaypoint = document.createElement('waypoint-location');
            newWaypoint.setAttribute('slot', 'waypoint');
            newWaypoint.waypointName = waypointData['name'];
            newWaypoint.setAttribute('waypointId', waypointData['waypointId']);
            this.append(newWaypoint);
            this.waypoints[waypointData['waypointId']]['element'] = newWaypoint;
        }
    }

    loadTouchdownData(touchdownData)
    {
        this.touchdownData = touchdownData;
        let existingPoints = this.querySelectorAll('landing-point');
        if (existingPoints)
        {
            existingPoints.forEach((e) =>
            {
                e.parentElement.removeChild(e);
            });
        }
        let newLanding = document.createElement('landing-point');
        newLanding.setAttribute('slot', 'settlement');
        newLanding.waypointName = touchdownData['name'];
        this.append(newLanding);
        this.touchdownData['element'] = newLanding;
    }

    set bodyData(bodyData)
    {
        let bodyElement = this.shadowRoot.getElementById('gpsDisplay_body');
        bodyElement.textContent = bodyData['name'];
        bodyElement.setAttribute('bodyId', bodyData['id']);
        bodyElement.setAttribute('address', bodyData['address']);
    }

    set bearing(value)
    {
        this.shadowRoot.getElementById('gpsDisplay_destination').textContent = value;
    }

    setDestination(element)
    {
        setTrackedLocation('clear', () =>
        {
            // clear
            if (this.settlementData)
            {
               this.settlementData['isDestination'] = false;
               if (this.settlementData['element'] != element)
               {
                   this.settlementData['element'].toggleSelect(true);
               }
            }

            if (this.touchdownData)
            {
               this.touchdownData['isDestination'] = false;
               if (this.touchdownData['element'] != element)
               {
                   this.touchdownData['element'].toggleSelect(true);
               }
            }

            if (this.waypoints)
            {
               let ids = Object.keys(this.waypoints);
               for (let i = 0, len = ids.length; i < len; i++)
               {
                   this.waypoints[ids[i]]['isDestination'] = false;
                   if (this.waypoints[ids[i]]['element'] != element)
                   {
                       this.waypoints[ids[i]]['element'].toggleSelect(true);
                   }
               }
            }


            if (this.settlementData && this.settlementData['element'] === element)
            {
               this.settlementData['isDestination'] = true;
               setTrackedLocation('settlement');
               return;
            }

            if (this.touchdownData && this.touchdownData['element'] === element)
            {
               this.touchdownData['isDestination'] = true;
               setTrackedLocation('touchdown');
               return;
            }

            if (this.waypoints)
            {
                let ids = Object.keys(this.waypoints);
                for (let i = 0, len = ids.length; i < len; i++)
                {
                    if (this.waypoints[ids[i]]['element'] === element)
                    {
                        this.waypoints[ids[i]]['isDestination'] = true;
                        setTrackedLocation(this.waypoints[ids[i]]['waypointId']);
                        return;
                    }
                }
            }
        });
    }

    clearDestination()
    {
        setTrackedLocation('clear', () =>
        {
            if (this.settlementData)
            {
                this.settlementData['isDestination'] = false;
                this.settlementData['element'].toggleSelect(true);
            }

            if (this.touchdownData)
            {
                this.touchdownData['isDestination'] = false;
                this.touchdownData['element'].toggleSelect(true);
            }

            if (this.waypoints)
            {
                let ids = Object.keys(this.waypoints);
                for (let i = 0, len = ids.length; i < len; i++)
                {
                    this.waypoints[ids[i]]['isDestination'] = false;
                    this.waypoints[ids[i]]['element'].toggleSelect(true);
                }
            }
        });
    }
}

customElements.define('gps-display', GPSDisplay);