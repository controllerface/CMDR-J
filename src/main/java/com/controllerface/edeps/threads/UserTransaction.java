package com.controllerface.edeps.threads;

import com.controllerface.edeps.ProcurementCost;
import com.controllerface.edeps.ProcurementRecipe;
import com.controllerface.edeps.ProcurementType;
import javafx.util.Pair;

/**
 * Created by Controllerface on 5/5/2018.
 */
public class UserTransaction
{
    public enum Type
    {
        INVENTORY,
        BLUEPRINT
    }

    private final ProcurementCost inventoryItem;
    private final Pair<ProcurementType, ProcurementRecipe> blueprint;
    private final int transactionAmount;
    private final Type transactionType;

    public UserTransaction(int transactionAmount, ProcurementCost inventoryItem)
    {
        this.transactionType = Type.INVENTORY;
        this.inventoryItem = inventoryItem;
        this.transactionAmount = transactionAmount;
        this.blueprint = null;

    }

    public UserTransaction(int transactionAmount, Pair<ProcurementType, ProcurementRecipe> blueprint)
    {
        this.transactionType = Type.BLUEPRINT;
        this.transactionAmount = transactionAmount;
        this.blueprint = blueprint;
        this.inventoryItem = null;
    }

    public ProcurementCost getInventoryItem()
    {
        return inventoryItem;
    }

    public Pair<ProcurementType, ProcurementRecipe> getBlueprint()
    {
        return blueprint;
    }

    public int getTransactionAmount()
    {
        return transactionAmount;
    }

    public Type getTransactionType()
    {
        return transactionType;
    }
}
