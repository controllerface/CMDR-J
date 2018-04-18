package com.controllerface.edeps.threads;

/**
 * Created by Stephen on 4/16/2018.
 */
public enum JournalEvent
{
    Cargo,
    Materials,

    // common events
    EngineerContribution,
    MissionCompleted,
    TechnologyBroker,

    // material specific events
    MaterialCollected,
    MaterialDiscarded,
    EngineerCraft,
    MaterialTrade,
    Synthesis,
    ScientificResearch,

    // cargo specific events
    CollectCargo,
    EjectCargo,
    MarketBuy,
    MarketSell,
    MiningRefined,
    CargoDepot,
    BuyDrones,
    SellDrones,
    LaunchDrone,
    PowerplayCollect,
    PowerplayDeliver,

    // stats
    LoadGame,
    Rank,
    Progress,
    Reputation,
    Loadout,

    ;
}
