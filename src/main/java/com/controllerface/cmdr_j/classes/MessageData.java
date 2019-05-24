package com.controllerface.cmdr_j.classes;

import com.controllerface.cmdr_j.threads.UserTransaction;

/**
 * Created by Stephen on 6/12/2018.
 */
public class MessageData
{
    private final String message;
    private final UserTransaction.MessageType messageType;

    public MessageData(String message, UserTransaction.MessageType messageType)
    {
        this.message = message;
        this.messageType = messageType;
    }

    public String getMessage()
    {
        return message;
    }

    public UserTransaction.MessageType getMessageType()
    {
        return messageType;
    }
}
