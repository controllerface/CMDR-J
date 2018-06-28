package com.controllerface.cmdr_j.threads;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.ProcurementType;
import javafx.util.Pair;

/**
 * Created by Controllerface on 5/5/2018.
 */
public class UserTransaction
{
    public enum TransactionType
    {
        INVENTORY,
        BLUEPRINT,
        MESSAGE
    }

    public enum MessageType
    {
        GENERAL,
        INVENTORY,
        LOADOUT,
        ENGINEERING,
        COMBAT,
        TRAVEL
    }

    private final ProcurementCost inventoryItem;
    private final Pair<ProcurementType, ProcurementRecipe> blueprint;
    private final int transactionAmount;
    private final TransactionType transactionType;
    private final String message;
    private final MessageType messageType;


    public UserTransaction(int transactionAmount, ProcurementCost inventoryItem)
    {
        this.transactionType = TransactionType.INVENTORY;
        this.inventoryItem = inventoryItem;
        this.transactionAmount = transactionAmount;
        this.blueprint = null;
        this.message = null;
        this.messageType = null;
    }

    public UserTransaction(int transactionAmount, Pair<ProcurementType, ProcurementRecipe> blueprint)
    {
        this.transactionType = TransactionType.BLUEPRINT;
        this.transactionAmount = transactionAmount;
        this.blueprint = blueprint;
        this.inventoryItem = null;
        this.message = null;
        this.messageType = null;
    }

    public UserTransaction(MessageType messageType, String message)
    {
        this.transactionType = TransactionType.MESSAGE;
        this.messageType = messageType;
        this.message = message;
        this.inventoryItem = null;
        this.transactionAmount = 0;
        this.blueprint = null;
    }

    ProcurementCost getInventoryItem()
    {
        return inventoryItem;
    }

    Pair<ProcurementType, ProcurementRecipe> getBlueprint()
    {
        return blueprint;
    }

    public String getMessage()
    {
        return message;
    }

    public MessageType getMessageType()
    {
        return messageType;
    }

    int getTransactionAmount()
    {
        return transactionAmount;
    }

    TransactionType getTransactionType()
    {
        return transactionType;
    }
}
