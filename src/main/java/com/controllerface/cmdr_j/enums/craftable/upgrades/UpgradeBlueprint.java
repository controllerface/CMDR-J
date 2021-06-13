package com.controllerface.cmdr_j.enums.craftable.upgrades;

import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum UpgradeBlueprint implements TaskBlueprint
{
    // Standard
    Dominator_Suit(EnumSet.of(UpgradeRecipe.Dominator_Grade_2,
        UpgradeRecipe.Dominator_Grade_3,
        UpgradeRecipe.Dominator_Grade_4,
        UpgradeRecipe.Dominator_Grade_5)),

    Maverick_Suit(EnumSet.of(UpgradeRecipe.Maverick_Grade_2,
        UpgradeRecipe.Maverick_Grade_3,
        UpgradeRecipe.Maverick_Grade_4,
        UpgradeRecipe.Maverick_Grade_5)),

    Artemis_Suit(EnumSet.of(UpgradeRecipe.Artemis_Grade_2,
        UpgradeRecipe.Artemis_Grade_3,
        UpgradeRecipe.Artemis_Grade_4,
        UpgradeRecipe.Artemis_Grade_5)),


    Karma_AR_50(EnumSet.of(UpgradeRecipe.Karma_AR_50_Grade_2,
        UpgradeRecipe.Karma_AR_50_Grade_3,
        UpgradeRecipe.Karma_AR_50_Grade_4,
        UpgradeRecipe.Karma_AR_50_Grade_5)),

    Karma_C_44(EnumSet.of(UpgradeRecipe.Karma_C_44_Grade_2,
        UpgradeRecipe.Karma_C_44_Grade_3,
        UpgradeRecipe.Karma_C_44_Grade_4,
        UpgradeRecipe.Karma_C_44_Grade_5)),

    Karma_L_6(EnumSet.of(UpgradeRecipe.Karma_L_6_Grade_2,
        UpgradeRecipe.Karma_L_6_Grade_3,
        UpgradeRecipe.Karma_L_6_Grade_4,
        UpgradeRecipe.Karma_L_6_Grade_5)),

    Karma_P_15(EnumSet.of(UpgradeRecipe.Karma_P_15_Grade_2,
        UpgradeRecipe.Karma_P_15_Grade_3,
        UpgradeRecipe.Karma_P_15_Grade_4,
        UpgradeRecipe.Karma_P_15_Grade_5)),


    TK_Aphelion(EnumSet.of(UpgradeRecipe.TK_Aphelion_Grade_2,
        UpgradeRecipe.TK_Aphelion_Grade_3,
        UpgradeRecipe.TK_Aphelion_Grade_4,
        UpgradeRecipe.TK_Aphelion_Grade_5)),

    TK_Eclipse(EnumSet.of(UpgradeRecipe.TK_Eclipse_Grade_2,
        UpgradeRecipe.TK_Eclipse_Grade_3,
        UpgradeRecipe.TK_Eclipse_Grade_4,
        UpgradeRecipe.TK_Eclipse_Grade_5)),

    TK_Zenith(EnumSet.of(UpgradeRecipe.TK_Zenith_Grade_2,
        UpgradeRecipe.TK_Zenith_Grade_3,
        UpgradeRecipe.TK_Zenith_Grade_4,
        UpgradeRecipe.TK_Zenith_Grade_5)),


    Manticore_Tormentor(EnumSet.of(UpgradeRecipe.Manticore_Tormentor_Grade_2,
        UpgradeRecipe.Manticore_Tormentor_Grade_3,
        UpgradeRecipe.Manticore_Tormentor_Grade_4,
        UpgradeRecipe.Manticore_Tormentor_Grade_5)),

    Manticore_Executioner(EnumSet.of(UpgradeRecipe.Manticore_Executioner_Grade_2,
        UpgradeRecipe.Manticore_Executioner_Grade_3,
        UpgradeRecipe.Manticore_Executioner_Grade_4,
        UpgradeRecipe.Manticore_Executioner_Grade_5)),

    Manticore_Intimidator(EnumSet.of(UpgradeRecipe.Manticore_Intimidator_Grade_2,
        UpgradeRecipe.Manticore_Intimidator_Grade_3,
        UpgradeRecipe.Manticore_Intimidator_Grade_4,
        UpgradeRecipe.Manticore_Intimidator_Grade_5)),

    Manticore_Oppressor(EnumSet.of(UpgradeRecipe.Manticore_Oppressor_Grade_2,
        UpgradeRecipe.Manticore_Oppressor_Grade_3,
        UpgradeRecipe.Manticore_Oppressor_Grade_4,
        UpgradeRecipe.Manticore_Oppressor_Grade_5)),

    ;

    private final EnumSet<UpgradeRecipe> recipes;

    UpgradeBlueprint(EnumSet<UpgradeRecipe> recipes)
    {
        this.recipes = recipes;
    }

    public Stream<UpgradeRecipe> recipeStream()
    {
        return recipes.stream();
    }

    @Override
    public void setParentType(TaskType type)
    {

    }

    @Override
    public TaskType getParentType()
    {
        return null;
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_", " ");
    }
}
