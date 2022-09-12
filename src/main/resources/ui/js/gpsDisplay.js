class GPSDisplay extends HTMLElement
{
    constructor()
    {
        super();
        this.attachShadow({mode: 'open'});
        let template = document.getElementById('template_GPSDisplay');
        this.shadowRoot.append(template.content.cloneNode(true));

        /* Set up the important objects that will be needed to render the GPS. The main canvas and graphics
         context are stored in member vars just so it's easier to manipulate later.  There's also a few
         variables that need initialization here, like the rotation value needed for rendering map points,
         since it is static there's no need to calculate it every frame */

        this.currentWidth = 0;
        this.needColorInit = true;
        this.waypoints = {};
        this.GPS_rotation = -90 * Math.PI / 180;

        // The main container for the whole GPS display
        this.gps = this.shadowRoot.getElementById('gpsDisplay_gps');

        // This is the canvas element itself
        this.viewport = this.shadowRoot.getElementById('gpsDisplay_viewport');

        // 2D graphics context used to render everything
        this.ctx = this.viewport.getContext('2d');

        // Map scale slider
        this.scale = this.shadowRoot.getElementById('gpsDisplay_scale');

        // The waypoint button is set up here, allowing the user to create new waypoints
        let addWaypointButton = this.shadowRoot.getElementById('gpsDisplay_addwaypoint');
        addWaypointButton.addEventListener('click', (e) => createWaypoint());

        // Now that everything is ready, start the render loop
        requestAnimationFrame(() => this.render());
    }

    /* Colors must be loaded "lazily" since the CSS doesn't fully load until after the constructor completes */
    loadColors()
    {
        if (this.needColorInit)
        {
            /* The colors defined in the common CSS file are used to make it easier to "re-skin" the app later
             if desired. Aside from the central player indicator, the colors are pulled from the same set of
             custom colors used in the rest of the UI. */
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

    /* The viewport dimensions update every frame so the GPS display scales automatically if the window is resized */
    updateDimensions()
    {
        this.loadColors();

        // the viewport size is bound to the container element
        let gpsRect = this.gps.getBoundingClientRect();
        if (this.currentWidth != gpsRect.width)
        {
            this.currentWidth = gpsRect.width;
        }

        // there's 20px of margin on the sides of the container, so 40 px is subtracted from the computed width
        let w = gpsRect.width - 40;

        // This effectively sets a 4:3 aspect ratio
        this.viewport.width = w;
        this.viewport.height = w * 0.75;

        // calculate the center point, which is used for pretty much all rendering operations
        this.centerX = this.viewport.width / 2;
        this.centerY = this.viewport.height / 2;
    }

    /* Renders the background color and border of the GPS display*/
    renderBackground()
    {
        this.ctx.fillStyle = this.color_BG;
        this.ctx.fillRect(0, 0, this.viewport.width, this.viewport.height);
        this.ctx.strokeStyle = this.color_line;
        this.ctx.lineWidth = 5;
        this.ctx.strokeRect(0, 0, this.viewport.width, this.viewport.height);


        // todo: draw grid relative to player in fixed pixel lengths in meters, use
        //  offsets to calculate a scale, and render it in a separate element below
        //  the viewport

        if (this.coordinateData)
        {
            //console.log(this.coordinateData['xOffset'] + " : " + this.coordinateData['yOffset']);

            let xOffset = this.coordinateData['xOffset'];
            let yOffset = this.coordinateData['yOffset'];

            this.ctx.save();

            this.ctx.strokeWidth = 1;

            let x = (xOffset * 1.33 * 10) * this.scale.value;
            let x2 = (xOffset * 1.33 * 100) * this.scale.value;
            let x3 = (xOffset * 1.33 * 1000) * this.scale.value;

            let y = (yOffset * 10) * this.scale.value;
            let y2 = (yOffset * 100) * this.scale.value;
            let y3 = (yOffset * 1000) * this.scale.value;

// scaling circle
            this.ctx.strokeStyle = 'rgba(0, 255, 0, 0.5)';
            this.ctx.fillStyle = 'rgba(0, 75, 0, 0.1)';
            this.ctx.beginPath();
            this.ctx.ellipse(this.centerX, this.centerY, x3, y3, 0, 0, 2 * Math.PI);
            this.ctx.fill();

            this.ctx.strokeStyle = 'rgba(0, 255, 0, 0.5)';
            this.ctx.fillStyle = 'rgba(0, 175, 0, 0.1)';
            this.ctx.beginPath();
            this.ctx.ellipse(this.centerX, this.centerY, x2, y2, 0, 0, 2 * Math.PI);
            this.ctx.fill();

            this.ctx.strokeStyle = 'rgba(0, 0, 255, 0.5)';
            this.ctx.fillStyle = 'rgba(0, 0, 255, 0.1)';
            this.ctx.beginPath();
            this.ctx.ellipse(this.centerX, this.centerY, x, y, 0, 0, 2 * Math.PI);
            this.ctx.fill();



// horizontal scaling line
//            this.ctx.strokeStyle = 'green';
//            this.ctx.beginPath();
//            this.ctx.moveTo(this.centerX, this.centerY);
//            this.ctx.lineTo(this.centerX - x, this.centerY);
//            this.ctx.moveTo(this.centerX, this.centerY);
//            this.ctx.lineTo(this.centerX + x, this.centerY);
//            this.ctx.stroke();

            this.ctx.restore();
//console.log("Val: " + x);
        }

    }

    /* When off-planet, this simply renders some text saying so */
    renderOffPlanet()
    {
        this.ctx.save();
        this.ctx.fillStyle = this.color_line;
        this.ctx.textAlign = "center";
        this.ctx.font = '24px EUROCAPS';
        this.ctx.fillText("Off Planet", this.centerX, this.centerY);
        this.ctx.restore();
    }

    /* The GPS indicator for the player is a basic "arrow head" style icon, which points the direction the player
     is facing. This indicator is always rendered in the center of the screen, and all other points are calculated
     relative to the player's position. */
    renderPlayer()
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

        this.ctx.save();

        this.ctx.fillStyle = this.color_marker;

        /* It is important to ensure the context is translated to the center before performing the rotation based on
         the player's current heading. The game uses a scale from 0 to 359 with 0 DEG pointing up/north, 90 DEG
         pointing right/east, 180 DEG pointing down/south, and 270 DEG pointing left/west */
        this.ctx.translate(this.centerX, this.centerY);
        this.ctx.rotate(this.coordinateData['heading'] * Math.PI / 180);
        this.ctx.translate(-1 * this.centerX, -1 * this.centerY);

        this.ctx.beginPath();
        this.ctx.moveTo(this.centerX, topY);
        this.ctx.lineTo(rightX, rightY);
        this.ctx.lineTo(this.centerX, midY);
        this.ctx.lineTo(leftX, leftY);
        this.ctx.closePath();
        this.ctx.fill();

        this.ctx.restore();
    }

    /* Renders a point on the GPS display. Points translated from latitude/longitude coordinates to cartesian
     coordinates as offsets from the player, which is always rendered in the center of the view. Note that
     the map rendered is essentially a projection of a curved face (i.e. a planet's surface) to a flat plane.
     As such, when points are very far apart from each other, there will be some distortion in the "straight
     line" distances between any two points. This effect might be more pronounced on smaller planets */
    renderMapPoint(pointData, fillColor)
    {
        // All map points are translated to co-ordinates relative to the player
        let latOffset = this.coordinateData['latitude'] - pointData['latitude'];
        let lonOffset = this.coordinateData['longitude'] - pointData['longitude'];

        /* Scaling the values up or down effectively zooms the map in or out. It is worth noting that in general,
         even larger distances of several hundred KM equate to only a very small difference in latitude/longitude
         from the player. Because of this, the scale defaults to 1000 to make the distances noticeable at all.
         if unscaled (i.e. scale factor of 1) the map isn't very useful */
        latOffset = latOffset * this.scale.value;
        lonOffset = lonOffset * this.scale.value;

        let markX = this.centerX - latOffset;
        let markY = this.centerY - lonOffset;

        this.ctx.save();

        // If this point is the currently tracked destination, it is rendered with a pre-defined color
        if (pointData['isDestination'])
        {
            this.ctx.fillStyle = this.color_destination;
        }
        // Otherwise, the color that was provided is used
        else
        {
            this.ctx.fillStyle = fillColor;
        }

        this.ctx.translate(this.centerX, this.centerY);
        this.ctx.rotate(this.GPS_rotation);
        this.ctx.translate(-1 * this.centerX, -1 * this.centerY);

        this.ctx.beginPath();
        this.ctx.moveTo(markX - 3, markY - 3);
        this.ctx.lineTo(markX - 3, markY + 3);
        this.ctx.lineTo(markX + 3, markY + 3);
        this.ctx.lineTo(markX + 3, markY - 3);
        this.ctx.closePath();
        this.ctx.fill();

        let pointName = pointData['name'].toLowerCase();
        let pointDistance = pointData['distance'] + ' ' + pointData['unit'];

        let textX = markX - 4;

        this.ctx.fillStyle = this.color_text;

        this.ctx.translate(markX, markY);
        this.ctx.rotate(-1 * this.GPS_rotation);
        this.ctx.translate(-1 * markX, -1 * markY);

        this.ctx.font = '12px EUROCAPS';
        this.ctx.fillText(pointName, textX, markY + 14);
        this.ctx.fillStyle = this.color_line;
        this.ctx.fillText(pointDistance, textX, markY + 28);

        this.ctx.restore();
    }

    render()
    {
        this.updateDimensions();
        this.renderBackground();

        if (this.coordinateData)
        {
            if (this.coordinateData['nearPlanet'] == false)
            {
                this.renderOffPlanet();
            }
            else
            {
                if (this.settlementData)
                {
                    this.renderMapPoint(this.settlementData, this.color_line);
                }
                if (this.touchdownData)
                {
                    this.renderMapPoint(this.touchdownData, this.color_ship);
                }
                if (this.waypoints)
                {
                    let waypointIds = Object.keys(this.waypoints);
                    for (let i = 0, len = waypointIds.length; i < len; i++)
                    {
                        this.renderMapPoint(this.waypoints[waypointIds[i]], this.color_line);
                    }
                }
                this.renderPlayer();
            }
        }
        else
        {
            this.renderOffPlanet();
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
            let toRemove = this.waypoints[waypointData['waypointId']];
            let element = toRemove['element'];
            element.parentElement.removeChild(element);
            let waypoint = this.waypoints[toRemove['waypointId']];
            if (waypoint['isDestination']) this.clearDestination();
            delete this.waypoints[toRemove['waypointId']];
            return;
        }

        if (this.waypoints[waypointData['waypointId']])
        {
            let toUpdate = this.waypoints[waypointData['waypointId']];
            toUpdate['unit'] = waypointData['unit'];
            toUpdate['distance'] = waypointData['distance'];
            toUpdate['name'] = waypointData['name'];
        }
        else
        {
            this.waypoints[waypointData['waypointId']] = waypointData;
            let newWaypoint = document.createElement('waypoint-location');
            newWaypoint.setAttribute('slot', 'waypoint');
            newWaypoint.waypointName = waypointData['name'];
            newWaypoint.setAttribute('waypointId', waypointData['waypointId']);
            this.append(newWaypoint);
            this.waypoints[waypointData['waypointId']]['element'] = newWaypoint;
        }
    }

    clearWaypointData()
    {
        this.settlementData = null;
        let existingWaypoints = this.querySelectorAll('waypoint-location');
        if (existingWaypoints)
        {
            existingWaypoints.forEach((e) =>
            {
                e.parentElement.removeChild(e);
            });
        }
        if (this.waypoints)
        {
            this.waypoints = {};
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

    clearTouchdownData()
    {
        this.touchdownData = null;
        let existingTouchdowns = this.querySelectorAll('landing-point');
        if (existingTouchdowns)
        {
            existingTouchdowns.forEach((e) =>
            {
                e.parentElement.removeChild(e);
            });
        }
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
            if (this.settlementData)
            {
                if (this.settlementData['element'] == element)
                {
                    this.settlementData['isDestination'] = true;
                    setTrackedLocation('settlement');
                }
                else
                {
                    this.settlementData['isDestination'] = false;
                    this.settlementData['element'].toggleSelect(true);
                }
            }

            if (this.touchdownData)
            {
                if (this.touchdownData['element'] == element)
                {
                    this.touchdownData['isDestination'] = true;
                    setTrackedLocation('touchdown');
                }
                else
                {
                    this.touchdownData['isDestination'] = false;
                    this.touchdownData['element'].toggleSelect(true);
                }
            }

            if (this.waypoints)
            {
                let waypointIds = Object.keys(this.waypoints);
                for (let i = 0, len = waypointIds.length; i < len; i++)
                {
                    if (this.waypoints[waypointIds[i]]['element'] == element)
                    {
                        this.waypoints[waypointIds[i]]['isDestination'] = true;
                        setTrackedLocation(this.waypoints[waypointIds[i]]['waypointId']);
                    }
                    else
                    {
                        this.waypoints[waypointIds[i]]['isDestination'] = false;
                        this.waypoints[waypointIds[i]]['element'].toggleSelect(true);
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
                let waypointIds = Object.keys(this.waypoints);
                for (let i = 0, len = waypointIds.length; i < len; i++)
                {
                    this.waypoints[waypointIds[i]]['isDestination'] = false;
                    this.waypoints[waypointIds[i]]['element'].toggleSelect(true);
                }
            }
        });
    }
}

customElements.define('gps-display', GPSDisplay);