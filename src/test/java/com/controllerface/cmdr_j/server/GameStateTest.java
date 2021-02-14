package com.controllerface.cmdr_j.server;

import com.controllerface.cmdr_j.enums.commander.CommanderStat;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.ui.UIFunctions;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GameStateTest extends TestCase
{
    private static final String DATABASE_TEST_DIRECTORY = "/test_db";

    private ExecutorService executorService = Executors.newSingleThreadExecutor();

    private Path tmpNoPrefix;

    @BeforeClass
    public void setUp() throws IOException
    {
        executorService = Executors.newSingleThreadExecutor();
        tmpNoPrefix = Files.createTempDirectory(null);
        var dbTest = new File(UIFunctions.DATA_FOLDER + DATABASE_TEST_DIRECTORY);
        var del = UIFunctions.Data.destroyDirectory.test(dbTest);
        System.out.println("DEL: " + del);
    }

    @AfterClass
    public void tearDown()
    {
        executorService.shutdown();
        try (DirectoryStream<Path> ds = Files.newDirectoryStream(tmpNoPrefix)) {

            for (Path file: ds)
            {
                Files.delete(file);
            }

            Files.delete(tmpNoPrefix);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public void test() throws Exception
    {
        var x = GameStateTest.class
            .getResourceAsStream("/testdata/Journal.0.0.log");


        System.out.println(tmpNoPrefix.toAbsolutePath().toString());

        BufferedReader b = new BufferedReader(new InputStreamReader(x));

        File testFile = new File(tmpNoPrefix.toAbsolutePath().toString() + "/Journal.0.0.log");
        FileWriter writer = new FileWriter(testFile);
        b.lines().forEach(str ->
        {
            try
            {
                writer.write(str);
                writer.write("\n");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        });
        b.close();
        writer.close();
        System.out.println(tmpNoPrefix.getFileName());
        System.setProperty("journal.test", "true");
        System.setProperty("journal.test.folder", tmpNoPrefix.toAbsolutePath().toString());
        var gameState = new GameState(DATABASE_TEST_DIRECTORY);

        gameState.setCommanderStat(CommanderStat.Commander, "Controllerface");
        gameState.setCargoCount(Commodity.HEATSINKINTERLINK, Commodity.HEATSINKINTERLINK.getLocalizedName(), 20);
        gameState.setMaterialCount(Material.GUARDIAN_MODULEBLUEPRINT, 5);
        gameState.adjustTask("Modification:Utility_Mounts:Shield_Booster:ShieldBooster_HeavyDuty:ShieldBooster_HeavyDuty_5", "add");
        gameState.adjustTask("Unlock:Guardian:Guardian_Core_Internal:Guardian_Hybrid_Power_Distributor:Guardian_Hybrid_Power_Distributor", "add");
        gameState.adjustTask("Trade:Manufactured_Materials:Conductive:Conductive Ceramics:Compound Shielding", "add");
        gameState.adjustTask("Trade:Manufactured_Materials:Conductive:Conductive Ceramics:Compound Shielding", "add");
        gameState.adjustTask("Trade:Manufactured_Materials:Conductive:Conductive Ceramics:Compound Shielding", "add");
        gameState.adjustTask("Trade:Manufactured_Materials:Conductive:Conductive Ceramics:Compound Shielding", "add");
        executorService.submit(new JournalSyncTaskEX(gameState));

        Thread.sleep(Duration.ofSeconds(10).toMillis());
        //f.cancel(true);

        //Thread.sleep(Duration.ofSeconds(10).toMillis());


        System.out.println("Test: " + gameState.getCargoCapacity());


    }
}