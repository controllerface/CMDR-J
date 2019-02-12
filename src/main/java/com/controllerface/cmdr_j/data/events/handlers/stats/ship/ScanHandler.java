package com.controllerface.cmdr_j.data.events.handlers.stats.ship;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.ui.UIFunctions;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logExplorationMessage;

/**
 * Scan event:
 *
 * Created by Stephen on 7/18/2018.
 */
public class ScanHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        String body = ((String) context.getRawData().get("BodyName"));
        logExplorationMessage(context, "Scanned " + body);

        String scanType = ((String) context.getRawData().get("ScanType"));
        String planetClass = ((String) context.getRawData().get("PlanetClass"));

        if (scanType.equalsIgnoreCase("Detailed"))
        {
            logExplorationMessage(context, "Detailed Scan Information :");

            // star
            if (planetClass == null)
            {
                String starType = ((String) context.getRawData().get("StarType"));
                Double stellarMass = ((Double) context.getRawData().get("StellarMass"));
                Double radius = ((Double) context.getRawData().get("Radius"));
                Double surfaceTemperature = ((Double) context.getRawData().get("SurfaceTemperature"));


                logExplorationMessage(context, " - Class " + starType + " Star");
                logExplorationMessage(context, " - Solar Masses: " + stellarMass);
                logExplorationMessage(context, " - Radius: " + radius);
                logExplorationMessage(context, " - Surface Temperature: " + surfaceTemperature);


            }

            // planet or moon
            else
            {
                logExplorationMessage(context, " - World Type :  " + planetClass);
            }

            Double rotationPeriod = ((Double) context.getRawData().get("RotationPeriod"));
            if (rotationPeriod != null)
            {
                Double axialTilt = ((Double) context.getRawData().get("AxialTilt"));
                logExplorationMessage(context, " - Rotational Period: " + rotationPeriod + " Sec.");
                logExplorationMessage(context, " - Axial Tilt: " + axialTilt + " " + UIFunctions.Symbols.DEGREES);
            }



            Double semiMajorAxis = ((Double) context.getRawData().get("SemiMajorAxis"));
            // main star
            if (semiMajorAxis == null)
            {
                logExplorationMessage(context, " - Single-Star System");

            }
            else
            {
                Double eccentricity = ((Double) context.getRawData().get("Eccentricity"));
                Double orbitalInclination = ((Double) context.getRawData().get("OrbitalInclination"));
                Double periapsis = ((Double) context.getRawData().get("Periapsis"));
                Double orbitalPeriod = ((Double) context.getRawData().get("OrbitalPeriod"));

                logExplorationMessage(context, " - Semi-Major Axis: " + semiMajorAxis + " km");
                logExplorationMessage(context, " - Eccentricity: " + eccentricity);
                logExplorationMessage(context, " - Orbital Inclination: " + orbitalInclination);
                logExplorationMessage(context, " - Periapsis: " + periapsis);
                logExplorationMessage(context, " - Orbital Period: " + orbitalPeriod);
            }

        }
    }
}
