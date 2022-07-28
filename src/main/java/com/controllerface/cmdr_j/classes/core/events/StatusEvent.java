package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.data.LocalCoordinates;
import com.controllerface.cmdr_j.enums.journal.StatusFlag;

import java.util.Map;
import java.util.Optional;
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

        var mainFuel = Optional.ofNullable(fuel)
            .map(f -> f.get("FuelMain"))
            .map(n-> ((Number) n))
            .map(Number::longValue)
            .orElse(0L);

        var reservoirFuel = Optional.ofNullable(fuel)
            .map(f -> f.get("FuelReservoir"))
            .map(n-> ((Number) n))
            .map(Number::longValue)
            .orElse(0L);

        gameState.updateFuelLevels(mainFuel, reservoirFuel);

        var flagSet = StatusFlag.extractFlags(flags)
            .collect(Collectors.toSet());
        var nearPlanet = flagSet.contains(StatusFlag.HAS_LAT_LONG);

        double latitude = 0d;
        double longitude = 0d;
        double altitude = 0d;
        double heading = 0d;
        double radius = 0d;

        if (nearPlanet)
        {
            latitude = ((Number) event.get("Latitude")).doubleValue();
            longitude = ((Number) event.get("Longitude")).doubleValue();

            altitude = Optional.ofNullable(event.get("Altitude"))
                .map(n-> ((Number) n).doubleValue())
                .orElse(0d);

            heading = ((Number) event.get("Heading")).doubleValue();

            radius = Optional.ofNullable(event.get("PlanetRadius"))
                .map(n-> ((Number) n).doubleValue())
                .orElse(0d);
        }

        if (radius <= 0.0d)
        {
            radius = gameState.getNearestBodyRadius();
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
