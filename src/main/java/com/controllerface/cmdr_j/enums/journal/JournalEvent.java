package com.controllerface.cmdr_j.enums.journal;

import com.controllerface.cmdr_j.classes.data.StellarBody;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.interfaces.commander.Statistic;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationBlueprint;
import com.controllerface.cmdr_j.enums.equipment.modules.*;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CosmeticSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.HardpointSlot;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.OptionalInternalSlot;
import com.controllerface.cmdr_j.classes.core.GameState;
import com.controllerface.cmdr_j.classes.core.events.*;

import java.util.Arrays;
import java.util.List;
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

public enum JournalEvent
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
    RefuelPartial(new RefuelPartialEvent()),
    RepairAll(new RepairAllEvent()),
    Repair(new RepairEvent()),
    RestockVehicle(new RestockVehicleEvent()),
    Outfitting(new OutfittingEvent()),
    Loadout(new LoadoutEvent()),
    SetUserShipName(new SetUserShipNameEvent()),
    FuelScoop(new FuelScoopEvent()),
//    DiscoveryScan(new DiscoveryScanHandler()),                // informational
    Scan(new ScanEvent()),
    Shipyard(new ShipyardEvent()),
    ShipyardBuy(new ShipyardBuyEvent()),
    ShipyardSell(new ShipyardSellEvent()),
    ShipyardTransfer(new ShipyardTransferEvent()),
//    ShipTargeted(new ShipTargetedHandler()),                  // informational
//    StoredShips(new StoredShipsHandler()),                    // informational
    CarrierBuy(new CarrierBuyEvent()),
    CarrierBankTransfer(new CarrierBankTransferEvent()),
    CarrierShipPack(new CarrierShipPackEvent()),
    CarrierModulePack(new CarrierModulePackEvent()),
//    CarrierNameChange(new CarrierNameChangeHandler()),        // informational

    /*
    Startup
     */
    EngineerProgress(new EngineerProgressEvent()),
    Commander(new CommanderEvent()),
    Cargo(new CargoEvent()),
    LoadGame(new LoadGameEvent()),
    Materials(new MaterialsEvent()),
    ShipLockerMaterials(new ShipLockerMaterialsEvent()),
    ShipLocker(new ShipLockerMaterialsEvent()),

//    SquadronStartup(new SquadronStartupHandler()),            // informational
//    Fileheader(context -> {}),                                // informational

    /*
    Status
     */
    Status(new StatusEvent()),
//    HeatWarning(new HeatWarningHandler()),                    // informational
//    HullDamage(new HullDamageHandler()),                      // informational
//    ShieldState(new ShieldStateHandler()),                    // informational
//    UnderAttack(new UnderAttackHandler()),                    // informational
//    LaunchSRV(new LaunchSRVHandler()),                        // informational
//    DockSRV(new DockSRVHandler()),                            // informational
//    ModuleInfo(new ModuleInfoHandler()),                      // informational

    /*
    Exploration
     */
    SAAScanComplete(new SAAScanCompleteEvent()),
    SAASignalsFound(new SAASignalsFoundEvent()),
//    FSSSignalDiscovered(new FSSSignalDiscoveredHandler()),    // informational
    FSSDiscoveryScan(new FSSDiscoveryScanEvent()),
    FSSAllBodiesFound(new FSSAllBodiesFoundEvent()),
//    CodexEntry(new CodexEntryHandler()),                      // informational

    /*
    Travel
     */
//    DockingRequested(new DockingRequestedHandler()),          // informational
//    DockingGranted(new DockingGrantedHandler()),              // informational
//    DockingDenied(new DockingDeniedHandler()),                // informational
    ApproachBody(new ApproachBodyEvent()),
    LeaveBody(new LeaveBodyEvent()),
    ApproachSettlement(new ApproachSettlementEvent()),
    Docked(new DockedEvent()),
    FSDJump(new FSDJumpEvent()),
//    FSDTarget(new FSDTargetHandler()),                        // informational
    Location(new LocationEvent()),
    NavRoute(new NavRouteEvent()),
    Touchdown(new TouchdownEvent()),
    Liftoff(new LiftoffEvent()),
//    StartJump(new StartJumpHandler()),                        // location info
//    SupercruiseEntry(new SupercruiseEntryHandler()),          // informational
    SupercruiseExit(new SupercruiseExitEvent()),
    Undocked(new UndockedEvent()),
//    USSDrop(new USSDropHandler()),                            // informational

    /*
    Bounties
     */
    Bounty(new BountyEvent()),
    FactionKillBond(new FactionKillBondEvent()),
    CapShipBond(new CapShipBondEvent()),

    /*
    Commodities
     */
    BuyDrones(new BuyDronesEvent()),
    CargoDepot(new CargoDepotEvent()),
    CollectCargo(new CollectCargoEvent()),
    EjectCargo(new EjectCargoEvent()),
    LaunchDrone(new LaunchDroneEvent()),
    MarketBuy(new MarketBuyEvent()),
    MarketSell(new MarketSellEvent()),
    MiningRefined(new MiningRefinedEvent()),
    SellDrones(new SellDronesEvent()),
    BuyAmmo(new BuyAmmoEvent()),

    /*
    Engineers
     */
    EngineerContribution(new EngineerContributionEvent()),
    EngineerCraft(new EngineerCraftEvent()),
    TechnologyBroker(new TechnologyBrokerEvent()),

    /*
    Materials
     */
    MaterialCollected(new MaterialCollectedEvent()),
    MaterialDiscarded(new MaterialDiscardedEvent()),
    MaterialTrade(new MaterialTradeEvent()),
    SellMicroResources(new SellMicroResourcesEvent()),
    TradeMicroResources(new TradeMicroResourcesEvent()),
    Synthesis(new SynthesisEvent()),

    /*
    Missions
     */
    Missions(new MissionsEvent()),
    MissionAccepted(new MissionAcceptedEvent()),
    MissionRedirected(new MissionRedirectedEvent()),
    MissionCompleted(new MissionCompletedEvent()),
    MissionFailed(new MissionFailedEvent()),
    MissionAbandoned(new MissionAbandonedEvent()),
    ScientificResearch(new ScientificResearchEvent()),
    CommunityGoal(new CommunityGoalEvent()),
    CommunityGoalReward(new CommunityGoalRewardEvent()),
    CommunityGoalDiscard(new CommunityGoalDiscardEvent()),
    SearchAndRescue(new SearchAndRescueEvent()),

    /*
    Modules
     */
    FetchRemoteModule(new FetchRemoteModuleEvent()),
    ModuleBuy(new ModuleBuyEvent()),
//    ModuleRetrieve(new ModuleRetrieveHandler()),              // module install
    ModuleSell(new ModuleSellEvent()),
    ModuleSellRemote(new ModuleSellRemoteEvent()),
    ModuleStore(new ModuleStoreEvent()),
//    StoredModules(new StoredModulesHandler()),
    BuyWeapon(new BuyWeaponEvent()),

    SuitLoadout(new SuitLoadoutEvent()),

    /*
    PowerPlay
     */
    Powerplay(new PowerPlayEvent()),
    PowerplayCollect(new PowerplayCollectEvent()),
    PowerplayDefect(new PowerPlayDefectEvent()),
    PowerplayDeliver(new PowerplayDeliverEvent()),
    PowerplayJoin(new PowerPlayJoinEvent()),
    PowerplayLeave(new PowerPlayLeaveEvent()),
    PowerplaySalary(new PowerplaySalaryEvent()),
    PowerplayFastTrack(new PowerplayFastTrackEvent()),

    /*
    Misc
     */
//    Music(new MusicHandler()),
    BuyExplorationData(new BuyExplorationDataEvent()),
    Statistics(new StatisticsEvent()),
    RedeemVoucher(new RedeemVoucherEvent()),
    Resurrect(new ResurrectEvent()),
    PayBounties(new PayBountiesEvent()),
    PayFines(new PayFinesEvent()),
//    ReceiveText(new ReceiveTextHandler()),
    NpcCrewPaidWage(new NpcCrewPaidWageEvent()),
    CrewHire(new CrewHireEvent()),
    SellShipOnRebuy(new SellShipOnRebuyEvent()),
    DatalinkVoucher(new DatalinkVoucherEvent()),
    SellExplorationData(new SellExplorationDataEvent()),
    MultiSellExplorationData(new MultiSellExplorationDataEvent()),
    ReservoirReplenished(new ReservoirReplenishedEvent()),
    UpgradeWeapon(new UpgradeWeaponEvent()),
    UpgradeSuit(new UpgradeSuitEvent()),

    ;

    /**
     * Stores the event processing logic for the corresponding event
     */
    private final BiConsumer<GameState, Map<String, Object>> handler;

    JournalEvent(BiConsumer<GameState, Map<String, Object>> handler)
    {
        this.handler = handler;
    }

    public static Optional<JournalEvent> withName(String eventName)
    {
        return Arrays.stream(JournalEvent.values())
            .filter(eventType -> eventType.name().equals(eventName))
            .findFirst();
    }

    public void process(GameState gameState, Map<String, Object> event)
    {
        try
        {
            handler.accept(gameState, event);
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
    public static void tryCommanderStat(GameState gameState, Map<String, Object> event, Statistic stat)
    {
        Optional.ofNullable(event.get(stat.getKey()))
            .ifPresent((_e) -> setCommanderStat(gameState, event, stat));
    }

    public static void setCommanderStat(GameState gameState, Map<String, Object> event, Statistic stat)
    {
        gameState.setCommanderStat(stat, extractStringStat(event, stat));
    }

    public static void setShipStat(GameState gameState, Map<String, Object> event, Statistic stat)
    {
        gameState.setShipStat(stat, extractStringStat(event, stat));
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

    public static OwnableModule determineModuleType(String moduleName)
    {
        OwnableModule module;

        try { module = HardpointModule.findModule(moduleName); }
        catch (Exception e) { module = null; }
        if (module != null) return module;

        try { module = UtilityModule.findModule(moduleName); }
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

    @SuppressWarnings("unchecked")
    public static StellarBody.BodyType determineBodyType(Map<String, Object> event)
    {
        // star type is the simplest
        if (event.get("StarType") != null)
        {
            if (event.get("StarType").equals("H"))
            {
                return StellarBody.BodyType.BlackHole;
            }
            else return StellarBody.BodyType.Star;
        }

        var parents = ((List<Map<String, Object>>) event.get("Parents"));

//        // this is a guess for sure, have not see a rogue planet in game, may not actually exist
//        if (parents == null)
//        {
//            return StellarBody.BodyType.RoguePlanet;
//        }

        var bodyName = ((String) event.get("BodyName"));
        var systemName = ((String) event.get("StarSystem"));
        if (systemName == null)
        {
            if (bodyName.contains("Ring"))
            {
                return StellarBody.BodyType.PlanetaryRing;
            }
            else return StellarBody.BodyType.Planet;
        }

        if (event.get("PlanetClass") != null)
        {
            if (parents.get(0).get("Planet") != null)
            {
                return StellarBody.BodyType.Moon;
            }
            else
            {
                return StellarBody.BodyType.Planet;
            }
        }
        else
        {
            if (bodyName.contains("Cluster"))
            {
                return StellarBody.BodyType.AsteroidCluster;
            }
            else if (bodyName.contains(systemName) && bodyName.contains("Ring"))
            {
                if (parents.get(0).get("Planet") != null)
                {
                    return StellarBody.BodyType.PlanetaryRing;
                }
                else
                {
                    return StellarBody.BodyType.StellarRing;
                }
            }
            else
            {
                // todo: might be others to account for (Null/barycentre, Station)
                return StellarBody.BodyType.Unknown;
            }
        }
    }

}
