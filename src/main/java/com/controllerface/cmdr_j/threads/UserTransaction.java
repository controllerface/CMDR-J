package com.controllerface.cmdr_j.threads;

import com.controllerface.cmdr_j.classes.procurements.ProcurementCost;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.procurements.ProcurementType;
import javafx.scene.paint.Color;
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
        ARRIVAL,
        MARKET,
        INVENTORY,
        BLUEPRINT,
        MESSAGE,
        VEHICLE,
    }

    public enum MessageType
    {
        GENERAL(Color.BLACK),
        INVENTORY(Color.web("#4d804d")),
        LOADOUT(Color.web("#0034ff")),
        ENGINEERING(Color.web("#ffb366")),
        COMBAT(Color.web("#b31a1a")),
        TRAVEL(Color.web("#999999")),
        EXPLORATION(Color.web("#7345ff")),

        ;

        final Color color;

        MessageType(Color color)
        {
            this.color = color;
        }

        public Color getColor()
        {
            return color;
        }
    }

    private final TransactionType transactionType;

    private final boolean inSRV;
    private final int transactionAmount;
    private final String message;
    private final MessageType messageType;
    private final ProcurementCost inventoryItem;
    private final Map<String, Object> statusObject;
    private final Pair<ProcurementType, ProcurementRecipe> blueprint;


    private UserTransaction(Builder builder)
    {
        this.inSRV = builder.inSRV;
        this.transactionType = builder.transactionType;
        this.transactionAmount = builder.transactionAmount;
        this.message = builder.message;
        this.messageType = builder.messageType;
        this.inventoryItem = builder.inventoryItem;
        this.statusObject = builder.statusObject;
        this.blueprint = builder.blueprint;
    }

    public static Builder start(TransactionType transactionType)
    {
        return new Builder(transactionType);
    }

    public TransactionType getTransactionType()
    {
        return transactionType;
    }

    public boolean isInSRV()
    {
        return inSRV;
    }

    public int getTransactionAmount()
    {
        return transactionAmount;
    }

    public String getMessage()
    {
        return message;
    }

    public MessageType getMessageType()
    {
        return messageType;
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




    public static class Builder
    {
        private final TransactionType transactionType;
        private boolean inSRV;
        private int transactionAmount;
        private String message;
        private MessageType messageType;
        private ProcurementCost inventoryItem;
        private Map<String, Object> statusObject;
        private Pair<ProcurementType, ProcurementRecipe> blueprint;


        public Builder(TransactionType transactionType)
        {
            this.transactionType = transactionType;
        }

        public Builder setInSRV(boolean inSRV)
        {
            this.inSRV = inSRV;
            return this;
        }

        public Builder setTransactionAmount(int transactionAmount)
        {
            this.transactionAmount = transactionAmount;
            return this;
        }

        public Builder setMessage(String message)
        {
            this.message = message;
            return this;
        }

        public Builder setMessageType(MessageType messageType)
        {
            this.messageType = messageType;
            return this;
        }

        public Builder setInventoryItem(ProcurementCost inventoryItem)
        {
            this.inventoryItem = inventoryItem;
            return this;
        }

        public Builder setStatusObject(Map<String, Object> statusObject)
        {
            this.statusObject = statusObject;
            return this;
        }

        public Builder setBlueprint(Pair<ProcurementType, ProcurementRecipe> blueprint)
        {
            this.blueprint = blueprint;
            return this;
        }

        public UserTransaction build()
        {
            return new UserTransaction(this);
        }
    }
}
