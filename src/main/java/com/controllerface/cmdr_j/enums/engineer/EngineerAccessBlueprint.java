package com.controllerface.cmdr_j.enums.engineer;

import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskType;

import java.util.EnumSet;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 4/12/2018.
 */
public enum EngineerAccessBlueprint implements TaskBlueprint
{
    Domino_Green(EnumSet.of(EngineerAccessRecipe.DOMINO_GREEN_REFERRAL)),

    Hero_Ferrari(EnumSet.of(EngineerAccessRecipe.HERO_FERRARI_REFERRAL)),

    Jude_Navarro(EnumSet.of(EngineerAccessRecipe.JUDE_NAVARRO_REFERRAL)),

    Kit_Fowler(EnumSet.of(EngineerAccessRecipe.KIT_FOWLER_REFERRAL,
        EngineerAccessRecipe.KIT_FOWLER_INVITE)),

    Oden_Geiger(EnumSet.of(EngineerAccessRecipe.ODEN_GEIGER_INVITE)),

    Terra_Velasquez(EnumSet.of(EngineerAccessRecipe.TERRA_VELASQUEZ_REFERRAL)),

    Wellington_Beck(EnumSet.of(EngineerAccessRecipe.WELLINGTON_BECK_REFERRAL,
        EngineerAccessRecipe.WELLINGTON_BECK_INVITE)),

    Yarden_Bond(EnumSet.of(EngineerAccessRecipe.YARDEN_BOND_INVITE)),

    Baltanos(EnumSet.of(EngineerAccessRecipe.BALTANOS_REFERRAL)),

    Elanor_Bresa(EnumSet.of(EngineerAccessRecipe.ELANOR_BRESA_REFERRAL)),

    Rosa_Dayette(EnumSet.of(EngineerAccessRecipe.ROSA_DAYETTE_REFERRAL,
        EngineerAccessRecipe.ROSA_DAYETTE_INVITE)),

    Selene_Jean(EnumSet.of(EngineerAccessRecipe.SELENE_JEAN_UNLOCK)),

    Didi_Vatermann(EnumSet.of(EngineerAccessRecipe.DIDI_VATERMANN_UNLOCK)),

    Bill_Turner(EnumSet.of(EngineerAccessRecipe.BILL_TURNER_UNLOCK)),

    Broo_Tarquin(EnumSet.of(EngineerAccessRecipe.BROO_TARQUIN_UNLOCK)),

    Liz_Ryder(EnumSet.of(EngineerAccessRecipe.LIZ_RYDER_UNLOCK)),

    Hera_Tani(EnumSet.of(EngineerAccessRecipe.HERA_TANI_UNLOCK)),

    Tiana_Fortune(EnumSet.of(EngineerAccessRecipe.TIANA_FORTUNE_UNLOCK)),

    Felicity_Farseer(EnumSet.of(EngineerAccessRecipe.FELICITY_FARSEER_UNLOCK)),

    The_Sarge(EnumSet.of(EngineerAccessRecipe.THE_SARGE_UNLOCK)),

    Elvira_Martuuk(EnumSet.of(EngineerAccessRecipe.ELVIRA_MARTUUK_UNLOCK)),

    Lei_Cheung(EnumSet.of(EngineerAccessRecipe.LEI_CHEUNG_UNLOCK)),

    Marco_Qwent(EnumSet.of(EngineerAccessRecipe.MARCO_QWENT_UNLOCK)),

    Ishmael_Palin(EnumSet.of(EngineerAccessRecipe.ISHMAEL_PALIN_UNLOCK)),

    Zacariah_Nemo(EnumSet.of(EngineerAccessRecipe.ZACARIAH_NEMO_UNLOCK)),

    Lori_Jameson(EnumSet.of(EngineerAccessRecipe.LORI_JAMESON_UNLOCK)),

    Ram_Tah(EnumSet.of(EngineerAccessRecipe.RAM_TAH_UNLOCK)),

    Etienne_Dorn(EnumSet.of(EngineerAccessRecipe.ETIENNE_DORN_UNLOCK)),

    Marsha_Hicks(EnumSet.of(EngineerAccessRecipe.MARSHA_HICKS_UNLOCK)),

    Petra_Olmanova(EnumSet.of(EngineerAccessRecipe.PETRA_OLMANOVA_UNLOCK)),

    Chloe_Sedesi(EnumSet.of(EngineerAccessRecipe.CHLOE_SEDESI_UNLOCK)),

    ;

    private final EnumSet<EngineerAccessRecipe> recipes;

    EngineerAccessBlueprint(EnumSet<EngineerAccessRecipe> recipes)
    {
        this.recipes = recipes;
        recipeStream().forEach(r->r.setParentBlueprintName(this));
    }

    public Stream<EngineerAccessRecipe> recipeStream()
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
