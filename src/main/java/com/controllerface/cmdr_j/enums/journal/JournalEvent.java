package com.controllerface.cmdr_j.enums.journal;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.classes.events.handlers.bounties.BountyHandler;
import com.controllerface.cmdr_j.classes.events.handlers.bounties.CapShipBondHandler;
import com.controllerface.cmdr_j.classes.events.handlers.bounties.FactionKillBondHandler;
import com.controllerface.cmdr_j.classes.events.handlers.commodities.*;
import com.controllerface.cmdr_j.classes.events.handlers.engineers.EngineerContributionHandler;
import com.controllerface.cmdr_j.classes.events.handlers.engineers.EngineerCraftHandler;
import com.controllerface.cmdr_j.classes.events.handlers.engineers.EngineerProgressHandler;
import com.controllerface.cmdr_j.classes.events.handlers.engineers.TechnologyBrokerHandler;
import com.controllerface.cmdr_j.classes.events.handlers.exploration.*;
import com.controllerface.cmdr_j.classes.events.handlers.materials.MaterialCollectedHandler;
import com.controllerface.cmdr_j.classes.events.handlers.materials.MaterialDiscardedHandler;
import com.controllerface.cmdr_j.classes.events.handlers.materials.MaterialTradeHandler;
import com.controllerface.cmdr_j.classes.events.handlers.materials.SynthesisHandler;
import com.controllerface.cmdr_j.classes.events.handlers.missions.*;
import com.controllerface.cmdr_j.classes.events.handlers.modules.*;
import com.controllerface.cmdr_j.classes.events.handlers.powerplay.PowerplayCollectHandler;
import com.controllerface.cmdr_j.classes.events.handlers.powerplay.PowerplayDeliverHandler;
import com.controllerface.cmdr_j.classes.events.handlers.powerplay.PowerplayHandler;
import com.controllerface.cmdr_j.classes.events.handlers.powerplay.PowerplaySalaryHandler;
import com.controllerface.cmdr_j.classes.events.handlers.factions.ProgressHandler;
import com.controllerface.cmdr_j.classes.events.handlers.factions.RankHandler;
import com.controllerface.cmdr_j.classes.events.handlers.factions.ReputationHandler;
import com.controllerface.cmdr_j.classes.events.handlers.commodities.MarketHandler;
import com.controllerface.cmdr_j.classes.events.handlers.ship.*;
import com.controllerface.cmdr_j.classes.events.handlers.startup.*;
import com.controllerface.cmdr_j.classes.events.handlers.status.*;
import com.controllerface.cmdr_j.classes.events.handlers.travel.*;

/**
 * This enum defines all of the Journal API events that are currently supported. By convention, enum value names are
 * exact alphabetical matches for the JSON value string for the event it handles. This is a convenience that allows
 * support for an arbitrary event to be determined by using the valueOf() enum method. Internally, each enum value
 * contains the required processing logic for an event.
 *
 * Created by Controllerface on 4/16/2018.
 */

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
    RefuelAll(new RefuelAllHandler()),
    Outfitting(new OutfittingHandler()),
    Loadout(new LoadoutHandler()),
    SetUserShipName(new SetUserShipNameHandler()),
    FuelScoop(new FuelScoopHandler()),
    DiscoveryScan(new DiscoveryScanHandler()),
    Scan(new ScanHandler()),
    Shipyard(new ShipyardHandler()),
    ShipyardBuy(new ShipyardBuyHandler()),
    ShipyardSell(new ShipyardSellHandler()),
    ShipyardTransfer(new ShipyardTransferHandler()),
    ShipTargeted(new ShipTargetedHandler()),
    StoredShips(new StoredShipsHandler()),
    CarrierBuy(new CarrierBuyHandler()),
    CarrierNameChange(new CarrierNameChangeHandler()),

    /*
    Startup
     */
    Missions(new MissionsHandler()),
    Powerplay(new PowerplayHandler()),
    EngineerProgress(new EngineerProgressHandler()),
    Commander(new CommanderHandler()),
    Cargo(new CargoHandler()),
    LoadGame(new LoadGameHandler()),
    Materials(new MaterialsHandler()),
    SquadronStartup(new SquadronStartupHandler()),
    Fileheader(context -> {}),

    /*
    Status
     */
    Status(new StatusHandler()),
    HeatWarning(new HeatWarningHandler()),
    HullDamage(new HullDamageHandler()),
    ShieldState(new ShieldStateHandler()),
    UnderAttack(new UnderAttackHandler()),
    LaunchSRV(new LaunchSRVHandler()),
    DockSRV(new DockSRVHandler()),
    ModuleInfo(new ModuleInfoHandler()),

    /*
    Exploration
     */
    SAAScanComplete(new SAAScanCompleteHandler()),
    FSSSignalDiscovered(new FSSSignalDiscoveredHandler()),
    FSSDiscoveryScan(new FSSDiscoveryScanHandler()),
    FSSAllBodiesFound(new FSSAllBodiesFoundHandler()),
    CodexEntry(new CodexEntryHandler()),

    /*
    Travel
     */
    DockingRequested(new DockingRequestedHandler()),
    DockingGranted(new DockingGrantedHandler()),
    DockingDenied(new DockingDeniedHandler()),
    ApproachBody(new ApproachBodyHandler()),
    ApproachSettlement(new ApproachSettlementHandler()),
    Docked(new DockedHandler()),
    FSDJump(new FSDJumpHandler()),
    FSDTarget(new FSDTargetHandler()),
    Location(new LocationHandler()),
    NavRoute(new NavRouteHandler()),
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
    CapShipBond(new CapShipBondHandler()),

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
    BuyAmmo(new BuyAmmoHandler()),

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
    CommunityGoalReward(new CommunityGoalRewardHandler()),
    SearchAndRescue(new SearchAndRescueHandler()),

    /*
    Modules
     */
    ModuleBuy(new ModuleBuyHandler()),
    ModuleRetrieve(new ModuleRetrieveHandler()),
    ModuleSell(new ModuleSellHandler()),
    ModuleSellRemote(new ModuleSellRemoteHandler()),
    ModuleStore(new ModuleStoreHandler()),
    StoredModules(new StoredModulesHandler()),

    /*
    PowerPlay
     */
    PowerplayCollect(new PowerplayCollectHandler()),
    PowerplayDeliver(new PowerplayDeliverHandler()),
    PowerplaySalary(new PowerplaySalaryHandler()),

    /*
    Misc
     */
    Music(new MusicHandler()),
    Statistics(new StatisticsHandler()),
    Resurrect(new ResurrectHandler()),
    ReceiveText(new ReceiveTextHandler()),
    NpcCrewPaidWage(new NpcCrewPaidWageHandler()),
    SellShipOnRebuy(new SellShipOnRebuyHandler()),
    DatalinkVoucher(new DatalinkVoucherHandler()),
    SellExplorationData(new SellExplorationDataHandler()),
    MultiSellExplorationData(new MultiSellExplorationDataHandler()),
    ReservoirReplenished(new ReservoirReplenishedHandler()),

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
        try
        {
            handler.handle(eventProcessingContext);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
