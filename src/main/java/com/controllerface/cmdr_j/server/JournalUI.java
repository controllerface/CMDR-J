package com.controllerface.cmdr_j.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class JournalUI
{
    @FunctionalInterface
    public interface EndpointHandler
    {
        void respond(HttpServletRequest request, HttpServletResponse response, GameState gameState);
    }

    public enum EndpointType
    {
        GET,
        POST,
        ANY
    }

    public static final Map<String, StaticAsset> staticAssets = Map.ofEntries
        (
            /* HTML */
            Map.entry("/", StaticAsset.make("/ui/html/ui.html")),
            Map.entry("/ui.html", StaticAsset.make("/ui/html/ui.html")),

            /* Fonts */
            Map.entry("/EUROCAPS.ttf", StaticAsset.make("/ui/font/EUROCAPS.ttf")),

            /* CSS */
            Map.entry("/cargo.css", StaticAsset.make("/ui/css/cargo.css")),
            Map.entry("/common.css", StaticAsset.make("/ui/css/common.css")),
            Map.entry("/gps.css", StaticAsset.make("/ui/css/gps.css")),
            Map.entry("/market.css", StaticAsset.make("/ui/css/market.css")),
            Map.entry("/material.css", StaticAsset.make("/ui/css/material.css")),
            Map.entry("/module.css", StaticAsset.make("/ui/css/module.css")),
            Map.entry("/statistics.css", StaticAsset.make("/ui/css/statistics.css")),
            Map.entry("/ui.css", StaticAsset.make("/ui/css/ui.css")),

            /* Javascript */
            Map.entry("/cargo.js", StaticAsset.make("/ui/js/cargo.js")),
            Map.entry("/cartographicData.js", StaticAsset.make("/ui/js/cartographicData.js")),
            Map.entry("/commanderStat.js", StaticAsset.make("/ui/js/commanderStat.js")),
            Map.entry("/conflictData.js", StaticAsset.make("/ui/js/conflictData.js")),
            Map.entry("/currentMissions.js", StaticAsset.make("/ui/js/currentMissions.js")),
            Map.entry("/defenseResistance.js", StaticAsset.make("/ui/js/defenseResistance.js")),
            Map.entry("/defenseStats.js", StaticAsset.make("/ui/js/defenseStats.js")),
            Map.entry("/defenseValue.js", StaticAsset.make("/ui/js/defenseValue.js")),
            Map.entry("/engineerData.js", StaticAsset.make("/ui/js/engineerData.js")),
            Map.entry("/engineerStats.js", StaticAsset.make("/ui/js/engineerStats.js")),
            Map.entry("/factionStats.js", StaticAsset.make("/ui/js/factionStats.js")),
            Map.entry("/gpsDisplay.js", StaticAsset.make("/ui/js/gpsDisplay.js")),
            Map.entry("/landingPoint.js", StaticAsset.make("/ui/js/landingPoint.js")),
            Map.entry("/localConflict.js", StaticAsset.make("/ui/js/localConflict.js")),
            Map.entry("/market.js", StaticAsset.make("/ui/js/market.js")),
            Map.entry("/marketEntry.js", StaticAsset.make("/ui/js/marketEntry.js")),
            Map.entry("/material.js", StaticAsset.make("/ui/js/material.js")),
            Map.entry("/missionData.js", StaticAsset.make("/ui/js/missionData.js")),
            Map.entry("/moduleBay.js", StaticAsset.make("/ui/js/moduleBay.js")),
            Map.entry("/navigationRoute.js", StaticAsset.make("/ui/js/navigationRoute.js")),
            Map.entry("/offenseStats.js", StaticAsset.make("/ui/js/offenseStats.js")),
            Map.entry("/offenseModule.js", StaticAsset.make("/ui/js/offenseModule.js")),
            Map.entry("/offenseTurret.js", StaticAsset.make("/ui/js/offenseTurret.js")),
            Map.entry("/poiEntry.js", StaticAsset.make("/ui/js/poiEntry.js")),
            Map.entry("/powerModule.js", StaticAsset.make("/ui/js/powerModule.js")),
            Map.entry("/powerStats.js", StaticAsset.make("/ui/js/powerStats.js")),
            Map.entry("/routeEntry.js", StaticAsset.make("/ui/js/routeEntry.js")),
            Map.entry("/settlementPoint.js", StaticAsset.make("/ui/js/settlementPoint.js")),
            Map.entry("/shipModule.js", StaticAsset.make("/ui/js/shipModule.js")),
            Map.entry("/shipStats.js", StaticAsset.make("/ui/js/shipStats.js")),
            Map.entry("/statCategory.js", StaticAsset.make("/ui/js/statCategory.js")),
            Map.entry("/systemCartography.js", StaticAsset.make("/ui/js/systemCartography.js")),
            Map.entry("/systemCatalog.js", StaticAsset.make("/ui/js/systemCatalog.js")),
            Map.entry("/systemFaction.js", StaticAsset.make("/ui/js/systemFaction.js")),
            Map.entry("/ui.js", StaticAsset.make("/ui/js/ui.js")),
            Map.entry("/waypointLocation.js", StaticAsset.make("/ui/js/waypointLocation.js")),

            /* Images */
            Map.entry("/grade-1.svg", StaticAsset.make("/ui/img/grade-1.svg")),
            Map.entry("/grade-2.svg", StaticAsset.make("/ui/img/grade-2.svg")),
            Map.entry("/grade-3.svg", StaticAsset.make("/ui/img/grade-3.svg")),
            Map.entry("/grade-4.svg", StaticAsset.make("/ui/img/grade-4.svg")),
            Map.entry("/grade-5.svg", StaticAsset.make("/ui/img/grade-5.svg")),
            Map.entry("/planet.svg", StaticAsset.make("/ui/img/planet.svg"))
        );
}
