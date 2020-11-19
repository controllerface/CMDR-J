package com.controllerface.cmdr_j.server;

public class ServerMain
{
    public static void main(String[] args)
    {
        JournalServer server = JournalServer.fromServlet(new JournalServlet());
        server.start();
        server.join();
    }
}
