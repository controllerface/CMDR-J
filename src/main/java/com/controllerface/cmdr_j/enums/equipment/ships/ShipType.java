package com.controllerface.cmdr_j.enums.equipment.ships;

import com.controllerface.cmdr_j.classes.data.BaseShipStats;
import com.controllerface.cmdr_j.classes.data.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.interfaces.commander.ShipModule;
import com.controllerface.cmdr_j.classes.data.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.HardPointLayoutData;
import com.controllerface.cmdr_j.classes.ships.*;

import java.util.Optional;

/**
 * Created by Controllerface on 4/16/2018.
 */
public enum ShipType
{
    // zorgon peterson

    adder                       (128049267L, new Adder()),
    hauler                      (128049261L, new Hauler()),
    ferdelance                  (128049351L, new FDL()),
    mamba                       (128915979L, new Mamba()),

    // faulcon delacy

    sidewinder                  (128049249L, new Sidewinder()),
    cobramkiii                  (128049279L, new CobraMK3()),
    cobramkiv                   (128672262L, new CobraMK4()),
    viper                       (128049273L, new ViperMK3()),
    viper_mkiv                  (128672255L, new ViperMK4()),
    krait_mkii                  (128816567L, new KraitMK2()),
    krait_light                 (128839281L, new KraitPhantom()),
    python                      (128049339L, new Python()),
    anaconda                    (128049363L, new Anaconda()),

    // lakon

    diamondbackxl               (128671831L, new DBX()),
    diamondback                 (128671217L, new DBScout()),
    asp                         (128049303L, new AspX()),
    asp_scout                   (128672276L, new AspScout()),
    independant_trader          (128672269L, new Keelback()),
    type6                       (128049285L, new Type6()),
    type7                       (128049297L, new Type7()),
    type9                       (128049333L, new Type9()),
    type9_military              (128785619L, new Type10()),
    typex                       (128816574L, new Chieftain()),
    typex_2                     (128816581L, new Crusader()),
    typex_3                     (128816588L, new Challenger()),

    // core dynamics

    eagle                       (128049255L, new Eagle()),
    vulture                     (128049309L, new Vulture()),
    federation_dropship_mkii    (128672145L, new FedAssault()),
    federation_dropship         (128049321L, new FedDropship()),
    federation_gunship          (128672152L, new FedGunship()),
    federation_corvette         (128049369L, new FedCorvette()),

    // saud kruger

    dolphin                     (128049291L, new Dolphin()),
    orca                        (128049327L, new Orca()),
    belugaliner                 (128049345L, new Beluga()),

    // gutamaya

    empire_eagle                (128672138L, new IEagle()),
    empire_trader               (128049315L, new IClipper()),
    empire_courier              (128671223L, new ICourier()),
    cutter                      (128049375L, new ICutter()),

    ;

    public final long id;
    private final AbstractShip delegate;

    ShipType(long id, AbstractShip delegate)
    {
        this.id = id;
        this.delegate = delegate;
    }

    public BaseShipStats getBaseShipStats()
    {
        return delegate.baseShipStats;
    }

    public CoreModuleLayoutData getCoreModules()
    {
        return delegate.coreModules;
    }

    public HardPointLayoutData getHardpoints()
    {
        return delegate.hardpoints;
    }

    public OptionalModuleLayoutData getInternals()
    {
        return delegate.internals;
    }

    public ShipModule[] getArmorModules()
    {
        return delegate.armorModules;
    }

    public String toJson()
    {
        return delegate.toJson();
    }

    public static Optional<ShipType> findShip(String shipName)
    {
        try
        {
            var foundShip = valueOf(shipName.toLowerCase());
            return Optional.of(foundShip);
        }
        catch (Exception e)
        {
            return Optional.empty();
        }
    }
}
