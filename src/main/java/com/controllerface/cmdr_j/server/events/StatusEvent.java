package com.controllerface.cmdr_j.server.events;

import com.controllerface.cmdr_j.server.LocalCoordinates;
import com.controllerface.cmdr_j.server.GameState;
import com.controllerface.cmdr_j.server.StatusFlags;

import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class StatusEvent implements BiConsumer<GameState, Map<String, Object>>
{

    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var flags = ((Number) event.get("Flags")).longValue();
        if (flags == 0L) return;

        var fuel = ((Map<String, Object>) event.get("Fuel"));
        var mainFuel = ((Number) fuel.get("FuelMain")).doubleValue();
        var reservoirFuel = ((Number) fuel.get("FuelReservoir")).doubleValue();

        gameState.updateFuelLevels(mainFuel, reservoirFuel);

        var flagSet = StatusFlags.extractFlags(flags)
            .collect(Collectors.toSet());
        var nearPlanet = flagSet.contains(StatusFlags.HAS_LAT_LONG);

        double latitude = 0d;
        double longitude = 0d;
        double altitude = 0d;
        double heading = 0d;
        double radius = 0d;

        if (nearPlanet)
        {
            latitude = ((Number) event.get("Latitude")).doubleValue();
            longitude = ((Number) event.get("Longitude")).doubleValue();
            altitude = ((Number) event.get("Altitude")).doubleValue();
            heading = ((Number) event.get("Heading")).doubleValue();
            radius = ((Number) event.get("PlanetRadius")).doubleValue();
        }

        var localCoordinates = new LocalCoordinates(nearPlanet, latitude, longitude, altitude, heading, radius);
        gameState.setLocalCoordinates(localCoordinates);

        // todo: use these?
//        var cargoTonnage = ((Number) event.get("Cargo")).doubleValue();
//        var fireGroup = ((Number) event.get("FireGroup")).intValue();
//        var guiFocus = ((Number) event.get("GuiFocus")).intValue();
//        var legalState = ((String) event.get("LegalState"));
//        var pips = ((List<Integer>) event.get("Fuel"));


    }
}
