package com.controllerface.cmdr_j.server;

public class ServerMain
{
    public static void main(String[] args)
    {
        JournalServer.withServlet(new JournalServlet())
            .port(9000)
            .start()
            .join();
    }
}
