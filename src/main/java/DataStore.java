import jetbrains.exodus.entitystore.Entity;
import jetbrains.exodus.entitystore.PersistentEntityStore;
import jetbrains.exodus.entitystore.PersistentEntityStores;
import jetbrains.exodus.env.Environment;
import jetbrains.exodus.env.EnvironmentConfig;
import jetbrains.exodus.env.Environments;

import java.io.File;

/**
 * Created by Stephen on 1/17/2019.
 */
public class DataStore
{
    private static final String ROOT = "root";
    private static final String DATA_FOLDER = System.getProperty("user.home")
            + File.separator + "CMDR_J" + "/db";

    private File directory = new File(DATA_FOLDER);
    private final Entity rootEntity;

    public DataStore()
    {
        rootEntity = thing();
    }

    private Entity thing()
    {
        EnvironmentConfig config = new EnvironmentConfig();
        config.setSetting(EnvironmentConfig.GC_MIN_UTILIZATION, 25);
        config.setSetting(EnvironmentConfig.GC_TRANSACTION_ACQUIRE_TIMEOUT, 500);
        config.setSetting(EnvironmentConfig.GC_TRANSACTION_TIMEOUT, 500);
        //config.setSetting(EnvironmentConfig.GC_USE_EXCLUSIVE_TRANSACTION, false);

        Environment environment = Environments.newInstance(directory, config);

        // create the main entity storage object
        PersistentEntityStore entityStore = PersistentEntityStores.newInstance(environment);

        // create the root entity
        return entityStore.computeInTransaction((transaction) -> transaction.newEntity(ROOT));
    }
}
