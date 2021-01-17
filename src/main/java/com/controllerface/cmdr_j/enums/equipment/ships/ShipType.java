package com.controllerface.cmdr_j.enums.equipment.ships;

import com.controllerface.cmdr_j.classes.BaseShipStats;
import com.controllerface.cmdr_j.classes.data.CoreModuleLayoutData;
import com.controllerface.cmdr_j.classes.data.HardPointLayoutData;
import com.controllerface.cmdr_j.classes.OptionalModuleLayoutData;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.ships.*;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/16/2018.
 */
public enum ShipType implements SpaceCraft
{
    // zorgon peterson

    adder(new Adder()),

    hauler(new Hauler()),

    ferdelance(new FDL()),

    mamba(new Mamba()),

    // faulcon delacy

    sidewinder(new Sidewinder()),

    cobramkiii(new CobraMK3()),
    cobramkiv(new CobraMK4()),

    viper(new ViperMK3()),
    viper_mkiv(new ViperMK4()),

    krait_mkii(new KraitMK2()),
    krait_light(new KraitPhantom()),

    python(new Python()),

    anaconda(new Anaconda()),


    // lakon

    diamondbackxl(new DBX()),
    diamondback(new DBScout()),

    asp(new AspX()),
    asp_scout(new AspScout()),

    independant_trader(new Keelback()),

    type6(new Type6()),
    type7(new Type7()),
    type9(new Type9()),
    type9_military(new Type10()),

    typex(new Chieftain()),
    typex_2(new Crusader()),
    typex_3(new Challenger()),


    // core dynamics

    eagle(new Eagle()),
    vulture(new Vulture()),

    federation_dropship_mkii(new FedAssault()),
    federation_dropship(new FedDropship()),
    federation_gunship(new FedGunship()),
    federation_corvette(new FedCorvette()),


    // saud kruger

    dolphin(new Dolphin()),
    orca(new Orca()),
    belugaliner(new Beluga()),


    // gutamaya

    empire_eagle(new IEagle()),
    empire_trader(new IClipper()),
    empire_courier(new ICourier()),
    cutter(new ICutter()),

    ;

    private final AbstractShip delegate;

    ShipType(AbstractShip delegate)
    {
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

    public static ShipType findShip(String shipName) throws Exception
    {
        Exception exception;
        try
        {
            return valueOf(shipName);
        }
        catch (Exception e)
        {
            exception = e;
            if (shipName == null || shipName.isEmpty())
            {
                throw exception;
            }
        }
        return Arrays.stream(ShipType.values())
                .filter(shipType -> shipType.name().toLowerCase().equals(shipName.toLowerCase()))
                .findFirst().orElseThrow(() -> exception);
    }
}
