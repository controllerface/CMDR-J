package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.server.events.*;
import com.controllerface.cmdr_j.threads.UserTransaction;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;

/**
 * This enum defines all of the Journal API events that are currently supported. By convention, enum value names are
 * exact alphabetical matches for the JSON value string for the event it handles. This is a convenience that allows
 * support for an arbitrary event to be determined by using the valueOf() enum method. Internally, each enum value
 * contains the required processing logic for an event.
 *
 * Created by Controllerface on 4/16/2018.
 */

public enum JournalEventEX
{
    /*
    Factions
     */
    Progress(new ProgressEvent()),
    Rank(new RankEvent()),
    Reputation(new ReputationEvent()),

    /*
    Market
     */
//    Market(new MarketHandler()),

    /*
    Ship
     */
    RefuelAll(new RefuelAllEvent()),
//    Outfitting(new OutfittingHandler()),
//    Loadout(new LoadoutHandler()),
    SetUserShipName(new SetUserShipNameEvent()),
//    FuelScoop(new FuelScoopHandler()),
//    DiscoveryScan(new DiscoveryScanHandler()),
//    Scan(new ScanHandler()),
//    Shipyard(new ShipyardHandler()),
//    ShipyardBuy(new ShipyardBuyHandler()),
//    ShipyardSell(new ShipyardSellHandler()),
//    ShipyardTransfer(new ShipyardTransferHandler()),
//    ShipTargeted(new ShipTargetedHandler()),
//    StoredShips(new StoredShipsHandler()),
//    CarrierBuy(new CarrierBuyHandler()),
//    CarrierNameChange(new CarrierNameChangeHandler()),

    /*
    Startup
     */
//    Missions(new MissionsHandler()),
//    Powerplay(new PowerplayHandler()),
//    EngineerProgress(new EngineerProgressHandler()),
    Commander(new CommanderEvent()),
//    Cargo(new CargoHandler()),
    LoadGame(new LoadGameEvent()),
    Materials(new MaterialsEvent()),
//    SquadronStartup(new SquadronStartupHandler()),
//    Fileheader(context -> {}),

    /*
    Status
     */
//    Status(new StatusHandler()),
//    HeatWarning(new HeatWarningHandler()),
//    HullDamage(new HullDamageHandler()),
//    ShieldState(new ShieldStateHandler()),
//    UnderAttack(new UnderAttackHandler()),
//    LaunchSRV(new LaunchSRVHandler()),
//    DockSRV(new DockSRVHandler()),
//    ModuleInfo(new ModuleInfoHandler()),

    /*
    Exploration
     */
//    SAAScanComplete(new SAAScanCompleteHandler()),
//    FSSSignalDiscovered(new FSSSignalDiscoveredHandler()),
//    FSSDiscoveryScan(new FSSDiscoveryScanHandler()),
//    FSSAllBodiesFound(new FSSAllBodiesFoundHandler()),
//    CodexEntry(new CodexEntryHandler()),

    /*
    Travel
     */
//    DockingRequested(new DockingRequestedHandler()),
//    DockingGranted(new DockingGrantedHandler()),
//    DockingDenied(new DockingDeniedHandler()),
//    ApproachBody(new ApproachBodyHandler()),
//    ApproachSettlement(new ApproachSettlementHandler()),
//    Docked(new DockedHandler()),
//    FSDJump(new FSDJumpHandler()),
//    FSDTarget(new FSDTargetHandler()),
//    Location(new LocationHandler()),
//    NavRoute(new NavRouteHandler()),
//    StartJump(new StartJumpHandler()),
//    SupercruiseEntry(new SupercruiseEntryHandler()),
//    SupercruiseExit(new SupercruiseExitHandler()),
//    Undocked(new UndockedHandler()),
//    USSDrop(new USSDropHandler()),

    /*
    Bounties
     */
//    Bounty(new BountyHandler()),
//    FactionKillBond(new FactionKillBondHandler()),
//    CapShipBond(new CapShipBondHandler()),

    /*
    Commodities
     */
//    BuyDrones(new BuyDronesHandler()),
//    CargoDepot(new CargoDepotHandler()),
//    CollectCargo(new CollectCargoHandler()),
//    EjectCargo(new EjectCargoHandler()),
//    LaunchDrone(new LaunchDroneHandler()),
//    MarketBuy(new MarketBuyHandler()),
//    MarketSell(new MarketSellHandler()),
//    MiningRefined(new MiningRefinedHandler()),
//    SellDrones(new SellDronesHandler()),
//    BuyAmmo(new BuyAmmoHandler()),

    /*
    Engineers
     */
//    EngineerContribution(new EngineerContributionHandler()),
//    EngineerCraft(new EngineerCraftHandler()),
//    TechnologyBroker(new TechnologyBrokerHandler()),

    /*
    Materials
     */
//    MaterialCollected(new MaterialCollectedHandler()),
//    MaterialDiscarded(new MaterialDiscardedHandler()),
//    MaterialTrade(new MaterialTradeHandler()),
//    Synthesis(new SynthesisHandler()),

    /*
    Missions
     */
//    MissionCompleted(new MissionCompletedHandler()),
//    ScientificResearch(new ScientificResearchHandler()),
//    CommunityGoalReward(new CommunityGoalRewardHandler()),
//    SearchAndRescue(new SearchAndRescueHandler()),

    /*
    Modules
     */
//    ModuleBuy(new ModuleBuyHandler()),
//    ModuleRetrieve(new ModuleRetrieveHandler()),
//    ModuleSell(new ModuleSellHandler()),
//    ModuleSellRemote(new ModuleSellRemoteHandler()),
//    ModuleStore(new ModuleStoreHandler()),
//    StoredModules(new StoredModulesHandler()),

    /*
    PowerPlay
     */
//    PowerplayCollect(new PowerplayCollectHandler()),
//    PowerplayDeliver(new PowerplayDeliverHandler()),
//    PowerplaySalary(new PowerplaySalaryHandler()),

    /*
    Misc
     */
//    Music(new MusicHandler()),
//    Statistics(new StatisticsHandler()),
//    Resurrect(new ResurrectHandler()),
//    ReceiveText(new ReceiveTextHandler()),
//    NpcCrewPaidWage(new NpcCrewPaidWageHandler()),
//    SellShipOnRebuy(new SellShipOnRebuyHandler()),
//    DatalinkVoucher(new DatalinkVoucherHandler()),
//    SellExplorationData(new SellExplorationDataHandler()),
//    MultiSellExplorationData(new MultiSellExplorationDataHandler()),
//    ReservoirReplenished(new ReservoirReplenishedHandler()),

    ;

    /**
     * Stores the event processing logic for the corresponding event
     */
    private final BiConsumer<PlayerState, Map<String, Object>> handler;

    JournalEventEX(BiConsumer<PlayerState, Map<String, Object>> handler)
    {
        this.handler = handler;
    }

    public static Optional<JournalEventEX> withName(String eventName)
    {
        return Arrays.stream(JournalEventEX.values())
            .filter(eventType -> eventType.name().equals(eventName))
            .findFirst();
    }

    public void process(PlayerState playerState, Map<String, Object> event)
    {
        try
        {
            handler.accept(playerState, event);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static String extractString(Map<String, Object> event, String key)
    {
        return String.valueOf(event.get(key));
    }

    public static String extractStringStat(Map<String, Object> event, Statistic stat)
    {
        return stat.format(extractString(event, stat.getKey()));
    }


    // todo: maybe convert all calls to use this and make non-safe one private
    public static void tryCommanderStat(PlayerState playerState, Map<String, Object> event, Statistic stat)
    {
        Optional.ofNullable(event.get(stat.getKey()))
            .ifPresent((_e) -> setCommanderStat(playerState, event, stat));
    }

    public static void setCommanderStat(PlayerState playerState, Map<String, Object> event, Statistic stat)
    {
        playerState.setCommanderStat(stat, extractStringStat(event, stat));
    }

    public static void setShipStat(PlayerState playerState, Map<String, Object> event, Statistic stat)
    {
        playerState.setShipStat(stat, extractStringStat(event, stat));
    }





    public static void adjust(EventProcessingContext context, TaskCost cost, int count)
    {
        context.getTransactions().add(UserTransaction.type(UserTransaction.TransactionType.INVENTORY)
            .setTransactionAmount(count)
            .setInventoryItem(cost)
            .build());

    }
}
