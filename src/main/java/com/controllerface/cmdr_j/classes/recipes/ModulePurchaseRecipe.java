package com.controllerface.cmdr_j.classes.recipes;

import com.controllerface.cmdr_j.classes.ItemEffects;
import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.enums.costs.special.CreditCost;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.enums.equipment.modules.ModulePurchaseType;
import com.controllerface.cmdr_j.enums.equipment.modules.OptionalInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import com.controllerface.cmdr_j.ui.Icon;
import com.controllerface.cmdr_j.ui.UIFunctions;

import java.util.stream.Stream;

/**
 * Created by Controllerface on 5/19/2018.
 */
public class ModulePurchaseRecipe implements TaskRecipe
{
    private final CostData price;
    private final CostData product;
    private final String name;
    private final String label;
    private final String shortLabel;
    private final String enumName;
    private final Icon icon;

    public ModulePurchaseRecipe(ShipModule product)
    {

        if (product instanceof HardpointModule)
        {
            enumName = ((HardpointModule) product).name();
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

        icon = product.icons().isEmpty()
                ? UIFunctions.Icons.cargoIcon
                : product.icons().get(0);

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

        String yieldCost = yieldCost_ == 1
                ? product.cost.getLocalizedName()
                : yieldCost_ + " " + product.cost.getLocalizedName();

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

    public static ModulePurchaseRecipe deserializeRecipe(ModulePurchaseType procType, String enumName)
    {
        ModulePurchaseRecipe recipe = null;
        if (procType == ModulePurchaseType.Hardpoint)
        {
            recipe = new ModulePurchaseRecipe(HardpointModule.valueOf(enumName));
        }
        else if (procType == ModulePurchaseType.Optional)
        {
            recipe = new ModulePurchaseRecipe(OptionalInternalModule.valueOf(enumName));
        }
        else if (procType == ModulePurchaseType.Core)
        {
            recipe = new ModulePurchaseRecipe(CoreInternalModule.valueOf(enumName));
        }
        return recipe;
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
    public void setParentBlueprintName(String blueprintName)
    {

    }

    @Override
    public String toString()
    {
        return getName();
    }

    @Override
    public String getParentBlueprintName()
    {
        return "";
    }

    @Override
    public Icon getIcon()
    {
        return icon;
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
}
