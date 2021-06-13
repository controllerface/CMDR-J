package com.controllerface.cmdr_j.enums.craftable.upgrades;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.synthesis.*;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.artemis.Artemis_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.artemis.Artemis_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.artemis.Artemis_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.artemis.Artemis_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.dominator.Dominator_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.dominator.Dominator_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.dominator.Dominator_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.dominator.Dominator_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.maverick.Maverick_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.maverick.Maverick_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.maverick.Maverick_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.suits.maverick.Maverick_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.c44.Karma_C_44_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.c44.Karma_C_44_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.c44.Karma_C_44_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.c44.Karma_C_44_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.ar50.Karma_AR_50_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.ar50.Karma_AR_50_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.ar50.Karma_AR_50_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.ar50.Karma_AR_50_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.l6.Karma_L_6_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.l6.Karma_L_6_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.l6.Karma_L_6_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.l6.Karma_L_6_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.p15.Karma_P_15_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.p15.Karma_P_15_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.p15.Karma_P_15_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.karma.p15.Karma_P_15_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.executioner.Manticore_Executioner_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.executioner.Manticore_Executioner_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.executioner.Manticore_Executioner_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.executioner.Manticore_Executioner_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.intimidator.Manticore_Intimidator_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.intimidator.Manticore_Intimidator_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.intimidator.Manticore_Intimidator_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.intimidator.Manticore_Intimidator_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.oppressor.Manticore_Oppressor_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.oppressor.Manticore_Oppressor_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.oppressor.Manticore_Oppressor_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.oppressor.Manticore_Oppressor_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.tormentor.Manticore_Tormentor_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.tormentor.Manticore_Tormentor_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.tormentor.Manticore_Tormentor_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.manticore.tormentor.Manticore_Tormentor_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.aphelion.TK_Aphelion_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.aphelion.TK_Aphelion_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.aphelion.TK_Aphelion_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.aphelion.TK_Aphelion_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.eclipse.TK_Eclipse_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.eclipse.TK_Eclipse_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.eclipse.TK_Eclipse_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.eclipse.TK_Eclipse_Grade_5;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.zenith.TK_Zenith_Grade_2;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.zenith.TK_Zenith_Grade_3;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.zenith.TK_Zenith_Grade_4;
import com.controllerface.cmdr_j.classes.recipes.upgrades.weapons.tk.zenith.TK_Zenith_Grade_5;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;

import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */

public enum UpgradeRecipe implements TaskRecipe
{
    Dominator_Grade_2(new Dominator_Grade_2()),
    Dominator_Grade_3(new Dominator_Grade_3()),
    Dominator_Grade_4(new Dominator_Grade_4()),
    Dominator_Grade_5(new Dominator_Grade_5()),

    Maverick_Grade_2(new Maverick_Grade_2()),
    Maverick_Grade_3(new Maverick_Grade_3()),
    Maverick_Grade_4(new Maverick_Grade_4()),
    Maverick_Grade_5(new Maverick_Grade_5()),

    Artemis_Grade_2(new Artemis_Grade_2()),
    Artemis_Grade_3(new Artemis_Grade_3()),
    Artemis_Grade_4(new Artemis_Grade_4()),
    Artemis_Grade_5(new Artemis_Grade_5()),


    Karma_AR_50_Grade_2(new Karma_AR_50_Grade_2()),
    Karma_AR_50_Grade_3(new Karma_AR_50_Grade_3()),
    Karma_AR_50_Grade_4(new Karma_AR_50_Grade_4()),
    Karma_AR_50_Grade_5(new Karma_AR_50_Grade_5()),

    Karma_C_44_Grade_2(new Karma_C_44_Grade_2()),
    Karma_C_44_Grade_3(new Karma_C_44_Grade_3()),
    Karma_C_44_Grade_4(new Karma_C_44_Grade_4()),
    Karma_C_44_Grade_5(new Karma_C_44_Grade_5()),

    Karma_L_6_Grade_2(new Karma_L_6_Grade_2()),
    Karma_L_6_Grade_3(new Karma_L_6_Grade_3()),
    Karma_L_6_Grade_4(new Karma_L_6_Grade_4()),
    Karma_L_6_Grade_5(new Karma_L_6_Grade_5()),

    Karma_P_15_Grade_2(new Karma_P_15_Grade_2()),
    Karma_P_15_Grade_3(new Karma_P_15_Grade_3()),
    Karma_P_15_Grade_4(new Karma_P_15_Grade_4()),
    Karma_P_15_Grade_5(new Karma_P_15_Grade_5()),


    TK_Aphelion_Grade_2(new TK_Aphelion_Grade_2()),
    TK_Aphelion_Grade_3(new TK_Aphelion_Grade_3()),
    TK_Aphelion_Grade_4(new TK_Aphelion_Grade_4()),
    TK_Aphelion_Grade_5(new TK_Aphelion_Grade_5()),

    TK_Eclipse_Grade_2(new TK_Eclipse_Grade_2()),
    TK_Eclipse_Grade_3(new TK_Eclipse_Grade_3()),
    TK_Eclipse_Grade_4(new TK_Eclipse_Grade_4()),
    TK_Eclipse_Grade_5(new TK_Eclipse_Grade_5()),

    TK_Zenith_Grade_2(new TK_Zenith_Grade_2()),
    TK_Zenith_Grade_3(new TK_Zenith_Grade_3()),
    TK_Zenith_Grade_4(new TK_Zenith_Grade_4()),
    TK_Zenith_Grade_5(new TK_Zenith_Grade_5()),


    Manticore_Tormentor_Grade_2(new Manticore_Tormentor_Grade_2()),
    Manticore_Tormentor_Grade_3(new Manticore_Tormentor_Grade_3()),
    Manticore_Tormentor_Grade_4(new Manticore_Tormentor_Grade_4()),
    Manticore_Tormentor_Grade_5(new Manticore_Tormentor_Grade_5()),

    Manticore_Executioner_Grade_2(new Manticore_Executioner_Grade_2()),
    Manticore_Executioner_Grade_3(new Manticore_Executioner_Grade_3()),
    Manticore_Executioner_Grade_4(new Manticore_Executioner_Grade_4()),
    Manticore_Executioner_Grade_5(new Manticore_Executioner_Grade_5()),

    Manticore_Intimidator_Grade_2(new Manticore_Intimidator_Grade_2()),
    Manticore_Intimidator_Grade_3(new Manticore_Intimidator_Grade_3()),
    Manticore_Intimidator_Grade_4(new Manticore_Intimidator_Grade_4()),
    Manticore_Intimidator_Grade_5(new Manticore_Intimidator_Grade_5()),

    Manticore_Oppressor_Grade_2(new Manticore_Oppressor_Grade_2()),
    Manticore_Oppressor_Grade_3(new Manticore_Oppressor_Grade_3()),
    Manticore_Oppressor_Grade_4(new Manticore_Oppressor_Grade_4()),
    Manticore_Oppressor_Grade_5(new Manticore_Oppressor_Grade_5()),

    ;

    private final TaskRecipe delegate;

    UpgradeRecipe(TaskRecipe delgate)
    {
        this.delegate = delgate;
        delgate.costStream().forEach(c->c.cost.associate(this));
    }

    @Override
    public ItemGrade getGrade()
    {
        return delegate.getGrade();
    }

    public Stream<CostData> costStream()
    {
        return delegate.costStream();
    }

    public ItemEffects effects()
    {
        return delegate.effects();
    }

    @Override
    public void setParentBlueprintName(TaskBlueprint blueprint)
    {
        delegate.setParentBlueprintName(blueprint);
    }

    @Override
    public TaskBlueprint getParentBlueprint()
    {
        return delegate.getParentBlueprint();
    }

    @Override
    public String toString()
    {
        return super.toString().replace("_"," ");
    }

    @Override
    public String getShortLabel()
    {
        return delegate.getShortLabel();
    }

    @Override
    public String getDisplayLabel()
    {
        return delegate.getDisplayLabel();
    }

    @Override
    public String getName()
    {
        return name();
    }
}

