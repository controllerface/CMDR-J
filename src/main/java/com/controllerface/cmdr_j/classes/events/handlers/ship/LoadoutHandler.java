package com.controllerface.cmdr_j.classes.events.handlers.ship;

import com.controllerface.cmdr_j.classes.events.handlers.EventProcessingContext;
import com.controllerface.cmdr_j.classes.events.handlers.JournalEventHandler;
import com.controllerface.cmdr_j.enums.commander.ShipStat;
import com.controllerface.cmdr_j.enums.equipment.ships.ShipType;
import com.controllerface.cmdr_j.enums.equipment.ships.moduleslots.CoreInternalSlot;
import com.controllerface.cmdr_j.threads.JournalSyncTask;

import java.util.List;
import java.util.Map;

import static com.controllerface.cmdr_j.classes.events.JournalEventTransactions.*;

/**
 * Loadout event: written at startup, when loading from main menu, and after being destroyed in an SRV and
 * teleporting back to your ship.
 *
 * Created by Stephen on 7/18/2018.
 */
public class LoadoutHandler implements JournalEventHandler
{
    @Override
    @SuppressWarnings("unchecked")
    public void handle(EventProcessingContext context)
    {
        logLoadoutMessage(context, "Entering Star Ship");

        JournalSyncTask.shipStats.forEach(context.getCommander()::removeStat);

        setStatFromData(context, ShipStat.Ship);
        setStatFromData(context, ShipStat.Ship_Name);
        setStatFromData(context, ShipStat.Ship_Ident);

        String shipName = context.getCommander().getStat(ShipStat.Ship);
        ShipType shipType;
        try
        {
            shipType = ShipType.findShip(shipName);
            logLoadoutMessage(context, "Ship Type: " + shipType.getBaseShipStats().displayName);
            context.getCommander().starShip.setShipType(shipType);
            context.getCommander().starShip
                    .setGivenName(extractStatString(context, ShipStat.Ship_Name));
            context.getCommander().starShip
                    .setShipID(extractStatString(context, ShipStat.Ship_Ident));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        ((List<Map<String, Object>>) context.getRawData().get("Modules"))
                .forEach(module -> setSlotFromLoadout(context, module));

        context.getCommander().starShip.updateResistanceGraphs();





//        SystemTray tray = SystemTray.getSystemTray();
//
//        //If the icon is a file
//        //Image image = Toolkit.getDefaultToolkit().createImage("icon.png");
//        //Alternative (if the icon is on the classpath):
//        Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
//
//        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
//        //Let the system resize the image if needed
//        trayIcon.setImageAutoSize(true);
//        //Set tooltip text for the tray icon
//        trayIcon.setToolTip("System tray icon demo");
//        try
//        {
//            tray.add(trayIcon);
//        }
//        catch (AWTException e)
//        {
//            e.printStackTrace();
//        }
//
//        trayIcon.displayMessage("Hello, World", "notification demo", TrayIcon.MessageType.INFO);
    }
}
