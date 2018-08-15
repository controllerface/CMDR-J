package com.controllerface.cmdr_j.structures.journal;

import com.controllerface.cmdr_j.EventProcessingContext;
import com.controllerface.cmdr_j.data.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.bounties.BountyHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.bounties.FactionKillBondHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.commodities.*;
import com.controllerface.cmdr_j.data.events.handlers.items.engineers.EngineerContributionHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.engineers.EngineerCraftHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.engineers.TechnologyBrokerHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.materials.MaterialCollectedHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.materials.MaterialDiscardedHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.materials.MaterialTradeHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.materials.SynthesisHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.missions.MissionCompletedHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.missions.ScientificResearchHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.modules.ModuleBuyHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.modules.ModuleRetrieveHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.modules.ModuleSellHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.modules.ModuleStoreHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.powerplay.PowerplayCollectHandler;
import com.controllerface.cmdr_j.data.events.handlers.items.powerplay.PowerplayDeliverHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.factions.ProgressHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.factions.RankHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.factions.ReputationHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.market.MarketHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.ship.LoadoutHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.ship.SetUserShipNameHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.startup.CargoHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.startup.LoadGameHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.startup.MaterialsHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.status.HeatWarningHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.status.HullDamageHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.status.ShieldStateHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.status.UnderAttackHandler;
import com.controllerface.cmdr_j.data.events.handlers.stats.travel.*;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logExplorationMessage;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logGeneralMessage;
import static com.controllerface.cmdr_j.data.events.JournalEventTransactions.logTravelMessage;

/**
 * This enum defines all of the Journal API events that are currently supported. By convention, enum value names are
 * exact alphabetical matches for the JSON value string for the event it handles. This is a convenience that allows
 * support for an arbitrary event to be determined by using the valueOf() enum method. Internally, each enum value
 * contains the required processing logic for an event by defining a EventProcessingContext consumer function that
 * is executed on calls to the process() method.
 *
 * For every supported event, the logic to process it is defined as a lambda implementation and passed as a constructor
 * parameter for each event. This configuration helps consolidate all journal API processing code in one central
 * location, making it easy to share functionality among different methods where possible. The intention is that, for
 * maintenance and addition of new events, the bulk of the work to support them would be contained in this one class.
 *
 * Created by Controllerface on 4/16/2018.
 */

@SuppressWarnings("unchecked")
public enum JournalEvent
{
    /*
    Factions
     */
    Progress(new ProgressHandler()),
    Rank(new RankHandler()),
    Reputation(new ReputationHandler()),

    /*
    Market
     */
    Market(new MarketHandler()),

    /*
    Ship
     */
    Loadout(new LoadoutHandler()),
    SetUserShipName(new SetUserShipNameHandler()),
    FuelScoop((JournalEventHandler) context ->
    {
        double scooped = ((double) context.getRawData().get("Scooped"));
        double total = ((double) context.getRawData().get("Total"));
        logGeneralMessage(context, "Scooped " + scooped + " Tons of fuel; Current Fuel Level:  " + total + " Tons");
    }),
    DiscoveryScan((JournalEventHandler) context ->
    {
        int bodies = ((int) context.getRawData().get("Bodies"));
        logExplorationMessage(context, "Discovery Scanner found " + bodies + (bodies > 1 ? " bodies" : " body"));
    }),

    Scan(new JournalEventHandler()
    {
        @Override
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
    }),

    /*
    Startup
     */
    Cargo(new CargoHandler()),
    LoadGame(new LoadGameHandler()),
    Materials(new MaterialsHandler()),
    Fileheader((JournalEventHandler) context -> {}),

    /*
    Status
     */
    HeatWarning(new HeatWarningHandler()),
    HullDamage(new HullDamageHandler()),
    ShieldState(new ShieldStateHandler()),
    UnderAttack(new UnderAttackHandler()),

    /*
    Travel
     */

    ApproachBody((JournalEventHandler) context ->
    {
        String system = ((String) context.getRawData().get("StarSystem"));
        String body = ((String) context.getRawData().get("Body"));
        logTravelMessage(context, "Aproaching " + body + " in " + system);
    }),

    Docked(new DockedHandler()),
    FSDJump(new FSDJumpHandler()),
    Location(new LocationHandler()),
    StartJump(new StartJumpHandler()),
    SupercruiseEntry(new SupercruiseEntryHandler()),
    SupercruiseExit(new SupercruiseExitHandler()),
    Undocked(new UndockedHandler()),
    USSDrop(new USSDropHandler()),

    /*
    Bounties
     */
    Bounty(new BountyHandler()),
    FactionKillBond(new FactionKillBondHandler()),

    /*
    Commodities
     */
    BuyDrones(new BuyDronesHandler()),
    CargoDepot(new CargoDepotHandler()),
    CollectCargo(new CollectCargoHandler()),
    EjectCargo(new EjectCargoHandler()),
    LaunchDrone(new LaunchDroneHandler()),
    MarketBuy(new MarketBuyHandler()),
    MarketSell(new MarketSellHandler()),
    MiningRefined(new MiningRefinedHandler()),
    SellDrones(new SellDronesHandler()),

    /*
    Engineers
     */
    EngineerContribution(new EngineerContributionHandler()),
    EngineerCraft(new EngineerCraftHandler()),
    TechnologyBroker(new TechnologyBrokerHandler()),

    /*
    Materials
     */
    MaterialCollected(new MaterialCollectedHandler()),
    MaterialDiscarded(new MaterialDiscardedHandler()),
    MaterialTrade(new MaterialTradeHandler()),
    Synthesis(new SynthesisHandler()),

    /*
    Missions
     */
    MissionCompleted(new MissionCompletedHandler()),
    ScientificResearch(new ScientificResearchHandler()),

    /*
    Modules
     */
    ModuleBuy(new ModuleBuyHandler()),
    ModuleRetrieve(new ModuleRetrieveHandler()),
    ModuleSell(new ModuleSellHandler()),
    ModuleStore(new ModuleStoreHandler()),

    /*
    PowerPlay
     */
    PowerplayCollect(new PowerplayCollectHandler()),
    PowerplayDeliver(new PowerplayDeliverHandler()),

    ;

    /**
     * Stores the event processing logic for the corresponding event
     */
    private final JournalEventHandler handler;

    JournalEvent(JournalEventHandler handler)
    {
        this.handler = handler;
    }

    /**
     * Executes a specified event consumer function containing the required processing logic for an event
     *
     * @param eventProcessingContext the current event processing context
     */
    public void process(EventProcessingContext eventProcessingContext)
    {
        handler.handle(eventProcessingContext);
    }
}
