package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.commander.Statistic;
import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.Cosmetic;
import com.controllerface.cmdr_j.enums.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.enums.equipment.modules.OptionalInternalModule;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.OptionalInternalSlot;
import com.controllerface.cmdr_j.server.events.*;
import com.controllerface.cmdr_j.threads.UserTransaction;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    Market(new MarketEvent()),

    /*
    Ship
     */
    RefuelAll(new RefuelAllEvent()),
//    Outfitting(new OutfittingHandler()),
    Loadout(new LoadoutEvent()),
    SetUserShipName(new SetUserShipNameEvent()),
//    FuelScoop(new FuelScoopHandler()),
//    DiscoveryScan(new DiscoveryScanHandler()),
    Scan(new ScanEvent()),
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
    EngineerProgress(new EngineerProgressEvent()),
    Commander(new CommanderEvent()),
    Cargo(new CargoEvent()),
    LoadGame(new LoadGameEvent()),
    Materials(new MaterialsEvent()),
//    SquadronStartup(new SquadronStartupHandler()),
//    Fileheader(context -> {}),

    /*
    Status
     */
    Status(new StatusEvent()),
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
    SAAScanComplete(new SAAScanCompleteEvent()),
//    FSSSignalDiscovered(new FSSSignalDiscoveredHandler()),
    FSSDiscoveryScan(new FSSDiscoveryScanEvent()),
    FSSAllBodiesFound(new FSSAllBodiesFoundEvent()),
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
    FSDJump(new FSDJumpEvent()),
//    FSDTarget(new FSDTargetHandler()),
    Location(new LocationEvent()),
    NavRoute(new NavRouteEvent()),
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
    Statistics(new StatisticsEvent()),
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




    /**
     * Determines what statistic type is being represented by a given String name, and returns the matching object, or
     * null if the name is not recognized.
     *
     * @param statName the String name of a Statistic enum type
     * @return the Statistic enum value matching the provided name, or null if the name is not valid
     */
    public static Statistic determineStatType(String statName)
    {
        Statistic statistic;

        try {statistic = CoreInternalSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        if (statistic != null) return statistic;

        try {statistic = CosmeticSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        if (statistic != null) return statistic;

        try {statistic = HardpointSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        if (statistic != null) return statistic;

        try {statistic = OptionalInternalSlot.valueOf(statName);}
        catch (Exception e) {statistic = null;}
        return statistic;
    }

    public static ShipModule determineModuleType(String moduleName)
    {
        ShipModule module;

        try { module = HardpointModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = CoreInternalModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = OptionalInternalModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = Cosmetic.findCosmetic(moduleName); }
        catch (Exception e) { module = null; }
        return module;
    }

    public static ModificationBlueprint determineModificationBlueprint(String modname)
    {
        try { return ModificationBlueprint.valueOf(modname); }
        catch (Exception e) { return null; }
    }

    public static ExperimentalRecipe determineExperimentalRecipe(String expname)
    {
        try { return ExperimentalRecipe.valueOf(expname); }
        catch (Exception e) { return null; }
    }

}
