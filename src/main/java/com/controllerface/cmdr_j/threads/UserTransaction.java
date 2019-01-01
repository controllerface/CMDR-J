package com.controllerface.cmdr_j.threads;

import com.controllerface.cmdr_j.ProcurementCost;
import com.controllerface.cmdr_j.ProcurementRecipe;
import com.controllerface.cmdr_j.ProcurementType;
import javafx.util.Pair;

import java.util.Map;

/**
 * Created by Controllerface on 5/5/2018.
 */
public class UserTransaction
{
    public enum TransactionType
    {
        STATUS,
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
        TRAVEL,
        EXPLORATION
    }

    private final ProcurementCost inventoryItem;
    private final Pair<ProcurementType, ProcurementRecipe> blueprint;
    private final int transactionAmount;
    private final Map<String, Object> statusObject;
    private final TransactionType transactionType;
    private final String message;
    private final MessageType messageType;


    public UserTransaction(int transactionAmount, ProcurementCost inventoryItem)
    {
        this.transactionType = TransactionType.INVENTORY;
        this.inventoryItem = inventoryItem;
        this.transactionAmount = transactionAmount;
        this.statusObject = null;
        this.blueprint = null;
        this.message = null;
        this.messageType = null;
    }

    public UserTransaction(int transactionAmount, Pair<ProcurementType, ProcurementRecipe> blueprint)
    {
        this.transactionType = TransactionType.BLUEPRINT;
        this.transactionAmount = transactionAmount;
        this.blueprint = blueprint;
        this.statusObject = null;
        this.inventoryItem = null;
        this.message = null;
        this.messageType = null;
    }

    public UserTransaction(MessageType messageType, String message)
    {
        this.transactionType = TransactionType.MESSAGE;
        this.messageType = messageType;
        this.message = message;
        this.transactionAmount = 0;
        this.statusObject = null;
        this.inventoryItem = null;
        this.blueprint = null;
    }

    public UserTransaction(Map<String, Object> statusObject)
    {
        this.transactionType = TransactionType.STATUS;
        this.statusObject = statusObject;
        this.messageType = null;
        this.message = null;
        this.transactionAmount = 0;
        this.inventoryItem = null;
        this.blueprint = null;
    }

    public Map<String, Object> getStatusObject()
    {
        return statusObject;
    }

    public ProcurementCost getInventoryItem()
    {
        return inventoryItem;
    }

    public Pair<ProcurementType, ProcurementRecipe> getBlueprint()
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

    public int getTransactionAmount()
    {
        return transactionAmount;
    }

    public TransactionType getTransactionType()
    {
        return transactionType;
    }
}
