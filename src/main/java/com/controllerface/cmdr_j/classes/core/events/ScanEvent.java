package com.controllerface.cmdr_j.classes.core.events;

import com.controllerface.cmdr_j.classes.data.ScannedBody;
import com.controllerface.cmdr_j.classes.data.StellarBody;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.enums.journal.JournalEvent;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ScanEvent implements BiConsumer<GameState, Map<String, Object>>
{
    @Override
    public void accept(GameState gameState, Map<String, Object> event)
    {
        var bodyType = JournalEvent.determineBodyType(event);
        var bodyName = ((String) event.remove("BodyName"));
        var bodyId = ((Number) event.remove("BodyID")).intValue();
        var address = ((Number) event.remove("SystemAddress")).longValue();

        event.remove("event");
        event.remove("WasDiscovered");
        event.remove("WasMapped");
        event.remove("StarSystem");

        var scannedBody = new ScannedBody(bodyType, bodyName, bodyId, address, event);

        gameState.discoverStellarBody(scannedBody);
        gameState.emitCartographyData();
    }
}
