package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.data.GenericBody;
import com.controllerface.cmdr_j.classes.data.StarSystem;
import com.controllerface.cmdr_j.classes.data.StellarBody;
import com.controllerface.cmdr_j.classes.core.GameState;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

public class LocationEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    @SuppressWarnings("unchecked")
    public void accept(GameState gameState, Map<String, Object> event)
    {
        boolean inSrv = Optional.ofNullable(event.get("InSRV"))
            .map(v-> ((Boolean) v))
            .orElse(false);

        boolean onFoot = Optional.ofNullable(event.get("OnFoot"))
            .map(v-> ((Boolean) v))
            .orElse(false);

        if (inSrv)
        {
            gameState.setVehicleState(GameState.VehicleState.SRV);
        }
        else if (onFoot)
        {
            gameState.setVehicleState(GameState.VehicleState.SPACESUIT);
        }
        else
        {
            gameState.setVehicleState(GameState.VehicleState.STARSHIP);
        }

        var name = ((String) event.get("StarSystem"));
        var address = ((Number) event.get("SystemAddress")).longValue();
        var coordinates = ((List<Double>) event.get("StarPos"));
        var system = new StarSystem(name, coordinates.get(0), coordinates.get(2), coordinates.get(1), address);

        gameState.setLocation(system);
        gameState.emitEngineerData();

        var bodyID = ((Number) event.get("BodyID")).intValue();
        var bodyName = ((String) event.get("Body"));
        var bodyType = StellarBody.BodyType.determineType(((String) event.get("BodyType")));
        var body = new GenericBody(bodyType, bodyName, bodyID, address);

        gameState.discoverStellarBody(body);
        gameState.emitCartographyData();

        if (bodyType == StellarBody.BodyType.Planet)
        {
            gameState.approachBody(body);
        }
        else
        {
            gameState.leaveBody();
        }

        var factions = ((List<Map<String, Object>>) event.get("Factions"));
        if (factions == null || factions.isEmpty())
        {
            gameState.clearFactionData();
        }
        else
        {
            gameState.acceptFactionData(factions);
        }

        var conflicts = ((List<Map<String, Object>>) event.get("Conflicts"));
        if (conflicts == null || conflicts.isEmpty())
        {
            gameState.clearConflictData();
        }
        else
        {
            gameState.acceptConflictData(conflicts);
        }
    }
}
