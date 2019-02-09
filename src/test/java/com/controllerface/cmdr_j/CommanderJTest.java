package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.structures.engineers.Engineer;
import com.controllerface.cmdr_j.structures.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.structures.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.structures.equipment.modules.OptionalInternalModule;
import com.controllerface.cmdr_j.structures.equipment.modules.OptionalInternalShieldModule;
import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by sroebuck on 5/3/2018.
 */
public class CommanderJTest
{
    @Test
    public void testDistance()
    {
        double distance = Engineer.TIANA_FORTUNE.getLocation().distanceBetween(Engineer.BILL_TURNER.getLocation());

        // this distance is known to be 221.68 Light years.
        Assert.assertEquals(221.68, distance, 0);
    }

    @Test
    public void banana()
    {
        Stream.of(CoreInternalModule.values())
                .forEach(System.out::println);

        Stream.of(HardpointModule.values())
                .forEach(System.out::println);

        Stream.of(OptionalInternalModule.values())
                .forEach(System.out::println);

        Stream.of(OptionalInternalShieldModule.values())
                .forEach(System.out::println);
    }
}