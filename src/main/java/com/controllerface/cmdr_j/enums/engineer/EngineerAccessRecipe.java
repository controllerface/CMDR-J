package com.controllerface.cmdr_j.enums.engineer;

import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.classes.recipes.engineer.*;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;

import java.util.stream.Stream;

public enum EngineerAccessRecipe implements TaskRecipe
{
    // ground engineers

    HERO_FERRARI_REFERRAL(new HeroFerrariReferral()),

    DOMINO_GREEN_REFERRAL(new DominoGreenReferral()),

    JUDE_NAVARRO_REFERRAL(new JudeNavarroReferral()),

    KIT_FOWLER_REFERRAL(new KitFowlerReferral()),
    KIT_FOWLER_INVITE(new KitFowlerInvite()),

    ODEN_GEIGER_INVITE(new OdenGeigerInvite()),

    TERRA_VELASQUEZ_REFERRAL(new TerraVelasquezReferral()),

    WELLINGTON_BECK_REFERRAL(new WellingtonBeckReferral()),
    WELLINGTON_BECK_INVITE(new WellingtonBeckInvite()),

    YARDEN_BOND_INVITE(new YardenBondInvite()),

    BALTANOS_REFERRAL(new BaltanosReferral()),

    ELANOR_BRESA_REFERRAL(new ElanorBresaReferral()),

    ROSA_DAYETTE_REFERRAL(new RosaDayetteReferral()),

    ROSA_DAYETTE_INVITE(new RosaDayetteInvite()),

    // ship engineers

    SELENE_JEAN_UNLOCK(new SeleneJeanUnlock()),

    DIDI_VATERMANN_UNLOCK(new DidiVatermannUnlock()),

    BILL_TURNER_UNLOCK(new BillTurnerUnlock()),

    BROO_TARQUIN_UNLOCK(new BrooTarquinUnlock()),

    LIZ_RYDER_UNLOCK(new LizRyderUnlock()),

    HERA_TANI_UNLOCK(new HeraTaniUnlock()),

    TIANA_FORTUNE_UNLOCK(new TianaFortuneUnlock()),

    FELICITY_FARSEER_UNLOCK(new FelicityFarseerUnlock()),

    THE_SARGE_UNLOCK(new TheSargeUnlock()),

    ELVIRA_MARTUUK_UNLOCK(new ElviraMartuukUnlock()),

    LEI_CHEUNG_UNLOCK(new LeiCheungUnlock()),

    MARCO_QWENT_UNLOCK(new MarcoQwentUnlock()),

    ISHMAEL_PALIN_UNLOCK(new IshmaelPalinUnlock()),

    ZACARIAH_NEMO_UNLOCK(new ZacariahNemoUnlock()),

    LORI_JAMESON_UNLOCK(new LoriJamesonUnlock()),

    RAM_TAH_UNLOCK(new RamTahUnlock()),

    ETIENNE_DORN_UNLOCK(new EtienneDornUnlock()),

    MARSHA_HICKS_UNLOCK(new MarshaHicksUnlock()),

    PETRA_OLMANOVA_UNLOCK(new PetraOlmanovaUnlock()),

    CHLOE_SEDESI_UNLOCK(new ChloeSedesiUnlock()),

    ;

    private final TaskRecipe delegate;

    EngineerAccessRecipe(TaskRecipe delegate)
    {
        this.delegate = delegate;
        delegate.costStream()
            .forEach(c->c.cost.associate(this));
    }

    @Override
    public ItemGrade getGrade()
    {
        return delegate.getGrade();
    }

    @Override
    public Stream<CostData> costStream()
    {
        return delegate.costStream();
    }

    @Override
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
        return delegate.toString();
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
        return delegate.getName();
    }
}
