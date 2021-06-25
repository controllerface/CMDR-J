package com.controllerface.cmdr_j.classes.core;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
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

    private static Map<String, StaticAsset> makeStaticAssets()
    {
        var assetMap = new HashMap<String, StaticAsset>();

        /* HTML */
        assetMap.put("/",                       StaticAsset.make("/ui/html/ui.html"));
        assetMap.put("/ui.html",                StaticAsset.make("/ui/html/ui.html"));

        /* Fonts */
        assetMap.put("/EUROCAPS.ttf",           StaticAsset.make("/ui/font/EUROCAPS.ttf"));

        /* CSS */
        assetMap.put("/cargo.css",              StaticAsset.make("/ui/css/cargo.css"));
        assetMap.put("/common.css",             StaticAsset.make("/ui/css/common.css"));
        assetMap.put("/gps.css",                StaticAsset.make("/ui/css/gps.css"));
        assetMap.put("/market.css",             StaticAsset.make("/ui/css/market.css"));
        assetMap.put("/material.css",           StaticAsset.make("/ui/css/material.css"));
        assetMap.put("/module.css",             StaticAsset.make("/ui/css/module.css"));
        assetMap.put("/statistics.css",         StaticAsset.make("/ui/css/statistics.css"));
        assetMap.put("/tasks.css",              StaticAsset.make("/ui/css/tasks.css"));
        assetMap.put("/ui.css",                 StaticAsset.make("/ui/css/ui.css"));

        /* Javascript */
        assetMap.put("/billOfMaterials.js",     StaticAsset.make("/ui/js/billOfMaterials.js"));
        assetMap.put("/cargo.js",               StaticAsset.make("/ui/js/cargo.js"));
        assetMap.put("/cargoManifest.js",       StaticAsset.make("/ui/js/cargoManifest.js"));
        assetMap.put("/cartographicData.js",    StaticAsset.make("/ui/js/cartographicData.js"));
        assetMap.put("/commanderStat.js",       StaticAsset.make("/ui/js/commanderStat.js"));
        assetMap.put("/communityGoal.js",       StaticAsset.make("/ui/js/communityGoal.js"));
        assetMap.put("/communityGoals.js",      StaticAsset.make("/ui/js/communityGoals.js"));
        assetMap.put("/conflictData.js",        StaticAsset.make("/ui/js/conflictData.js"));
        assetMap.put("/consumableManifest.js",  StaticAsset.make("/ui/js/consumableManifest.js"));
        assetMap.put("/currentMissions.js",     StaticAsset.make("/ui/js/currentMissions.js"));
        assetMap.put("/defenseResistance.js",   StaticAsset.make("/ui/js/defenseResistance.js"));
        assetMap.put("/defenseStats.js",        StaticAsset.make("/ui/js/defenseStats.js"));
        assetMap.put("/defenseValue.js",        StaticAsset.make("/ui/js/defenseValue.js"));
        assetMap.put("/engineerData.js",        StaticAsset.make("/ui/js/engineerData.js"));
        assetMap.put("/engineerStats.js",       StaticAsset.make("/ui/js/engineerStats.js"));
        assetMap.put("/factionStats.js",        StaticAsset.make("/ui/js/factionStats.js"));
        assetMap.put("/gpsDisplay.js",          StaticAsset.make("/ui/js/gpsDisplay.js"));
        assetMap.put("/itemQuery.js",           StaticAsset.make("/ui/js/itemQuery.js"));
        assetMap.put("/landingPoint.js",        StaticAsset.make("/ui/js/landingPoint.js"));
        assetMap.put("/localConflict.js",       StaticAsset.make("/ui/js/localConflict.js"));
        assetMap.put("/market.js",              StaticAsset.make("/ui/js/market.js"));
        assetMap.put("/marketEntry.js",         StaticAsset.make("/ui/js/marketEntry.js"));
        assetMap.put("/marketQuery.js",         StaticAsset.make("/ui/js/marketQuery.js"));
        assetMap.put("/marketSearch.js",        StaticAsset.make("/ui/js/marketSearch.js"));
        assetMap.put("/material.js",            StaticAsset.make("/ui/js/material.js"));
        assetMap.put("/microMaterial.js",       StaticAsset.make("/ui/js/microMaterial.js"));
        assetMap.put("/missionData.js",         StaticAsset.make("/ui/js/missionData.js"));
        assetMap.put("/moduleBay.js",           StaticAsset.make("/ui/js/moduleBay.js"));
        assetMap.put("/navigationRoute.js",     StaticAsset.make("/ui/js/navigationRoute.js"));
        assetMap.put("/offenseStats.js",        StaticAsset.make("/ui/js/offenseStats.js"));
        assetMap.put("/offenseModule.js",       StaticAsset.make("/ui/js/offenseModule.js"));
        assetMap.put("/offenseTurret.js",       StaticAsset.make("/ui/js/offenseTurret.js"));
        assetMap.put("/outfitting.js",          StaticAsset.make("/ui/js/outfitting.js"));
        assetMap.put("/outfittingEntry.js",     StaticAsset.make("/ui/js/outfittingEntry.js"));
        assetMap.put("/pledgedPower.js",        StaticAsset.make("/ui/js/pledgedPower.js"));
        assetMap.put("/poiEntry.js",            StaticAsset.make("/ui/js/poiEntry.js"));
        assetMap.put("/powerModule.js",         StaticAsset.make("/ui/js/powerModule.js"));
        assetMap.put("/powerPlay.js",           StaticAsset.make("/ui/js/powerPlay.js"));
        assetMap.put("/powerStats.js",          StaticAsset.make("/ui/js/powerStats.js"));
        assetMap.put("/requiredMaterial.js",    StaticAsset.make("/ui/js/requiredMaterial.js"));
        assetMap.put("/routeEntry.js",          StaticAsset.make("/ui/js/routeEntry.js"));
        assetMap.put("/settlementPoint.js",     StaticAsset.make("/ui/js/settlementPoint.js"));
        assetMap.put("/shipModule.js",          StaticAsset.make("/ui/js/shipModule.js"));
        assetMap.put("/shipStats.js",           StaticAsset.make("/ui/js/shipStats.js"));
        assetMap.put("/shipyard.js",            StaticAsset.make("/ui/js/shipyard.js"));
        assetMap.put("/shipyardEntry.js",       StaticAsset.make("/ui/js/shipyardEntry.js"));
        assetMap.put("/statCategory.js",        StaticAsset.make("/ui/js/statCategory.js"));
        assetMap.put("/storageBin.js",          StaticAsset.make("/ui/js/storageBin.js"));
        assetMap.put("/suitModule.js",          StaticAsset.make("/ui/js/suitModule.js"));
        assetMap.put("/systemCartography.js",   StaticAsset.make("/ui/js/systemCartography.js"));
        assetMap.put("/systemCatalog.js",       StaticAsset.make("/ui/js/systemCatalog.js"));
        assetMap.put("/systemFaction.js",       StaticAsset.make("/ui/js/systemFaction.js"));
        assetMap.put("/taskCatalog.js",         StaticAsset.make("/ui/js/taskCatalog.js"));
        assetMap.put("/taskData.js",            StaticAsset.make("/ui/js/taskData.js"));
        assetMap.put("/trackedTasks.js",        StaticAsset.make("/ui/js/trackedTasks.js"));
        assetMap.put("/ui.js",                  StaticAsset.make("/ui/js/ui.js"));
        assetMap.put("/waypointLocation.js",    StaticAsset.make("/ui/js/waypointLocation.js"));


        /* Components */
        assetMap.put("/js/components/baseComponent.js", StaticAsset.make("/ui/js/components/baseComponent.js"));
        assetMap.put("/css/ui_common.css",              StaticAsset.make("/ui/css/common.css"));

        assetMap.put("/js/components/tabControl.js",    StaticAsset.make("/ui/js/components/tabControl.js"));
        assetMap.put("/css/components/tabControl.css",  StaticAsset.make("/ui/css/components/tabControl.css"));

        assetMap.put("/js/components/tabPanel.js",      StaticAsset.make("/ui/js/components/tabPanel.js"));
        assetMap.put("/css/components/tabPanel.css",    StaticAsset.make("/ui/css/components/tabPanel.css"));

        /* Images */
        assetMap.put("/grade-1.svg",            StaticAsset.make("/ui/img/grade-1.svg"));
        assetMap.put("/grade-2.svg",            StaticAsset.make("/ui/img/grade-2.svg"));
        assetMap.put("/grade-3.svg",            StaticAsset.make("/ui/img/grade-3.svg"));
        assetMap.put("/grade-4.svg",            StaticAsset.make("/ui/img/grade-4.svg"));
        assetMap.put("/grade-5.svg",            StaticAsset.make("/ui/img/grade-5.svg"));
        assetMap.put("/planet.svg",             StaticAsset.make("/ui/img/planet.svg"));

        return assetMap;
    }

    public static final Map<String, StaticAsset> staticAssets = makeStaticAssets();
}
