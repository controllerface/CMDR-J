package com.controllerface.cmdr_j.server;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerMain
{
    public static void main(String[] args)
    {
        ExecutorService journalSync = Executors.newSingleThreadExecutor();

        JournalServlet journalServlet = new JournalServlet();

        journalSync.submit(new JournalSyncTaskEX(journalServlet.getGameState()));

        JournalServer.withServlet(journalServlet).port(9000).start().join();

        journalSync.shutdownNow();
    }
}
