package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.data.ItemEffects;
import com.controllerface.cmdr_j.interfaces.commander.OwnableModule;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.interfaces.tasks.TaskBlueprint;
import com.controllerface.cmdr_j.interfaces.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.*;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;

import java.util.Objects;
import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class ModulePurchaseRecipe implements TaskRecipe
{
    public final CostData price;
    public final CostData product;
    private final String name;
    private final String label;
    private final String shortLabel;
    private final String enumName;

    public ModulePurchaseRecipe(OwnableModule product)
    {

        if (product instanceof HardpointModule)
        {
            enumName = ((HardpointModule) product).name();
        }
        else if (product instanceof UtilityModule)
        {
            enumName = ((UtilityModule) product).name();
        }
        else if (product instanceof OptionalInternalModule)
        {
            enumName = ((OptionalInternalModule) product).name();
        }
        else if (product instanceof CoreInternalModule)
        {
            enumName = ((CoreInternalModule) product).name();
        }
        else enumName = "";

        CostData x = new CostData(CreditCost.CREDIT_COST, product.price());
        CostData y = new CostData(product, -1);

        this.price = x;
        this.product = y;

        name = product.displayText();
        label = generateDisplayLabel(this.price, this.product);
        shortLabel = product.displayText();
    }

    public String getEnumName()
    {
        return enumName;
    }

    private static String generateDisplayLabel(CostData price, CostData product)
    {
        String priceCost = String.format("%,8d%n", price.quantity).trim() + " " + price.cost.getLocalizedName();

        double yieldCost_ = Math.abs(product.quantity);

        var size = ((OwnableModule) product.cost).itemEffects()
            .effectByName(ItemEffect.Size)
            .map(d->d.doubleValue)
            .map(Double::intValue)
            .orElse(-1);

        var grade = ((OwnableModule) product.cost).itemEffects()
            .effectByName(ItemEffect.Class)
            .map(d->d.stringValue)
            .orElse("");

        var classifier = size == -1
            ? ""
            : size + grade + " ";

        String yieldCost = yieldCost_ == 1
                ? classifier + product.cost.getLocalizedName()
                : yieldCost_ + " " + classifier + product.cost.getLocalizedName();

        return priceCost + " for " + yieldCost;
    }

    @Override
    public Stream<CostData> costStream()
    {
        return Stream.of(price, product);
    }

    @Override
    public String getShortLabel()
    {
        return shortLabel;
    }

    @Override
    public String getDisplayLabel()
    {
        return label;
    }

    @Override
    public ItemEffects effects()
    {
        return ItemEffects.EMPTY;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public ItemGrade getGrade()
    {
        return ItemGrade.MaterialTrade;
    }

    @Override
    public void setParentBlueprintName(TaskBlueprint blueprint)
    {

    }

    @Override
    public String toString()
    {
        return getName();
    }

    @Override
    public TaskBlueprint getParentBlueprint()
    {
        return null;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj instanceof ModulePurchaseRecipe)
        {
            ModulePurchaseRecipe other = ((ModulePurchaseRecipe) obj);
            return (other.price.cost == this.price.cost
                    && other.product.cost == this.product.cost
                    && other.price.quantity == this.price.quantity
                    && other.product.quantity == this.product.quantity);
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(enumName);
    }
}
