package com.controllerface.cmdr_j.classes.data;

import com.controllerface.cmdr_j.threads.UserTransaction;

/**
 * Created by Stephen on 6/12/2018.
 */
public class MessageData
{
    public final String message;
    public final UserTransaction.MessageType messageType;

    public MessageData(String message, UserTransaction.MessageType messageType)
    {
        this.message = message;
        this.messageType = messageType;
    }
}
