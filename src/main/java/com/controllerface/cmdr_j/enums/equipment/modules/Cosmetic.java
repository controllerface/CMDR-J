package com.controllerface.cmdr_j.enums.equipment.modules;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;

import java.util.Arrays;

/**
 * Created by Controllerface on 4/25/2018.
 */
public enum Cosmetic implements ShipModule
{
    /**
     * Paint Jobs
     */
    PaintJob_Vulture_BlackFriday_01,
    PaintJob_Vulture_Bartecki_Bartecki,
    PaintJob_Python_Pax_East_Pax_East,

    /**
     * Decals
     */
    Decal_Combat_Master,
    Decal_Combat_Expert,

    Decal_Explorer_Trailblazer,

    Decal_Trade_Elite,

    /**
     * Weapon Colors
     */
    WeaponCustomisation_Blue,

    /**
     * Engine Colors
     */
    EngineCustomisation_Blue,

    /**
     * Nameplates
     */
    Nameplate_ShipName_White,

    Nameplate_ShipName_Worn_White,

    /**
     * Ship kits
     */

    Python_Shipkit1_Spoiler1,

    Python_Shipkit1_Wings1,

    Python_Shipkit1_Tail2,

    /**
     * Voice Packs
     */
    VoicePack_Verity,

    ;

    private final String displaytext;

    Cosmetic()
    {
        displaytext = name();
    }

    @Override
    public ProcurementType modificationType()
    {
        return null;
    }

    @Override
    public ProcurementType experimentalType()
    {
        return null;
    }

    @Override
    public String displayText()
    {
        return displaytext;
    }

    @Override
    public ItemEffects itemEffects()
    {
        return ItemEffects.EMPTY;
    }

    public static ShipModule findCosmetic(String cosmeticName) throws Exception
    {
        final Exception exception;
        try
        {
            return valueOf(cosmeticName);
        }
        catch (Exception e)
        {
            exception = e;
            if (cosmeticName == null || cosmeticName.isEmpty()) throw e;
        }

        return Arrays.stream(Cosmetic.values())
                .filter(v->v.name().toLowerCase().equals(cosmeticName.toLowerCase()))
                .findFirst().orElseThrow(()->exception);
    }
}