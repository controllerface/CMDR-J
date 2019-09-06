package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.modules.core.bulkheads.AbstractBulkheads;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.classes.modules.core.fueltank.AbstractFuelTank;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.classes.modules.guardian.AbstractGuardianModule;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.engineers.Engineer;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.enums.equipment.modules.OptionalInternalModule;
import com.sun.corba.se.spi.orb.StringPair;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Collectors;
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
    }



    private StringPair getAbstractClass(ShipModule module)
    {
        if (module.modificationType() == null)
        {
            String displayText = module.displayText();
            if (displayText.contains("Guardian"))
            {
                return new StringPair(AbstractGuardianModule.class.getSimpleName(), AbstractGuardianModule.class.getCanonicalName());
            }
            if (displayText.contains("Fuel Tank"))
            {
                return new StringPair(AbstractFuelTank.class.getSimpleName(), AbstractFuelTank.class.getCanonicalName());
            }
            return null;
        }

        else
        {
            ModificationType modificationType = ((ModificationType) module.modificationType());

            switch (modificationType)
            {
                case Frame_Shift_Drive:
                    return new StringPair(AbstractFSD.class.getSimpleName(), AbstractFSD.class.getCanonicalName());

                case Life_Support:
                    return new StringPair(AbstractLifeSupport.class.getSimpleName(), AbstractLifeSupport.class.getCanonicalName());

                case Power_Distributor:
                    return new StringPair(AbstractPowerDistributor.class.getSimpleName(), AbstractPowerDistributor.class.getCanonicalName());

                case Power_Plant:
                    return new StringPair(AbstractPowerPlant.class.getSimpleName(), AbstractPowerPlant.class.getCanonicalName());

                case Sensors:
                    return new StringPair(AbstractSensors.class.getSimpleName(), AbstractSensors.class.getCanonicalName());

                case Thrusters:
                    return new StringPair(AbstractThrusters.class.getSimpleName(), AbstractThrusters.class.getCanonicalName());

                case Bulkheads:
                    return new StringPair(AbstractBulkheads.class.getSimpleName(), AbstractBulkheads.class.getCanonicalName());
                default:
                    return null;
            }

        }
    }


    @Test
    public void writeOuttest() throws IOException
    {
        /*

        package com.controllerface.cmdr_j.classes.modules.weapons.beam;

        import com.controllerface.cmdr_j.classes.ItemEffects;
        import com.controllerface.cmdr_j.classes.modules.AbstractModule;
        import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalType;
        import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;

        public abstract class AbstractBeamLaser extends AbstractModule
        {
            public AbstractBeamLaser(String displayText, ItemEffects itemEffects)
            {
                super(displayText, ModificationType.Beam_Laser, ExperimentalType.Beam_Laser, itemEffects);
            }
        }


                new ItemEffects(
                        new ItemEffectData(ItemEffect.Mass, 1.3d),
                        new ItemEffectData(ItemEffect.Integrity, 48d),
                        new ItemEffectData(ItemEffect.PowerDraw, 1.68d),
                        new ItemEffectData(ItemEffect.BootTime, 1d),
                        new ItemEffectData(ItemEffect.ShieldGenMinimumMass, 13d),
                        new ItemEffectData(ItemEffect.ShieldGenOptimalMass, 25d),
                        new ItemEffectData(ItemEffect.ShieldGenMaximumMass, 63d),
                        new ItemEffectData(ItemEffect.ShieldGenMinStrength, 70d),
                        new ItemEffectData(ItemEffect.ShieldGenStrength, 120d),
                        new ItemEffectData(ItemEffect.ShieldGenMaxStrength, 170d),
                        new ItemEffectData(ItemEffect.RegenRate, 1d),
                        new ItemEffectData(ItemEffect.BrokenRegenRate, 1.6d),
                        new ItemEffectData(ItemEffect.DistributorDraw, 0.6d),
                        new ItemEffectData(ItemEffect.ThermalLoad, 1.2d),
                        new ItemEffectData(ItemEffect.KineticResistance, 40d),
                        new ItemEffectData(ItemEffect.ThermicResistance, -20d),
                        new ItemEffectData(ItemEffect.ExplosiveResistance, 50d)
                )


         */

        File output;
        try
        {
            output = new File("output");
            System.out.println(output.mkdir() + " :: " + output.getCanonicalPath());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw e;
        }

        StringBuilder outerBuilder = new StringBuilder();

        Stream.of(CoreInternalModule.values())
                .forEach(v->
                {
                    StringBuilder stringBuilder = new StringBuilder();

                    String className;
                    if (v.displayText().contains("Armour"))
                    {
                        String x = v.name().split("_")[0];
                        className = v.displayText().replaceAll(" ","") + "_" + x;
                    }
                    else
                    {
                        // generate class nameclass name
                        String [] parts = v.displayText().split(" ");

                        className = Arrays.stream(parts, 1, parts.length)
                                .collect(Collectors.joining()) + "_" + parts[0];
                        className = className.replaceAll("-","")
                                .replaceAll("Standard","");
                    }


                    // mod, exp, and text
                    //String modType = v.modificationType() == null ? "null" : "ModificationType." + v.modificationType().getName();
                    //String expType = v.experimentalType() == null ? "null" : "ExperimentalType." + v.experimentalType().getName();
                    String displayText = "\"" + v.displayText() + "\"";

                    // item effects
                    String s = v.itemEffects().effectStream()
                            .map(e->
                            {
                                String val = e.isNumerical() ? String.valueOf(e.getDoubleValue()) : "\""+e.getStringValue()+"\"";

                                return  "                  new ItemEffectData(ItemEffect." + e.getEffect().name() + ", " + val + ")";
                            }).collect(Collectors.joining(",\n","new ItemEffects(\n","\n    "));

                    outerBuilder.append(v.name())
                            .append("(new ").append(className)
                            .append("()),\n");


                    StringPair a = getAbstractClass(v);

                    stringBuilder.append("package com.controllerface.cmdr_j.classes.modules.generated;\n\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.classes.ItemEffects;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.classes.ItemEffectData;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.equipment.ItemEffect;\n");
                    stringBuilder.append("import " + a.getSecond() + ";\n");
                    stringBuilder.append("\n");

                    stringBuilder.append("public class ").append(className).append(" extends " + a.getFirst() + "\n");

                    stringBuilder.append("{\n");
                    stringBuilder.append("    public ").append(className).append("()\n");
                    stringBuilder.append("    {\n");
                    stringBuilder.append("        super(")
                            .append(displayText).append(", ")
                            //.append(modType).append(", ")
                            //.append(expType).append(", ")
                            .append("\n            ")
                            .append(s).append("        ));\n");
                    stringBuilder.append("    }\n");
                    stringBuilder.append("}");

                    //System.out.println(stringBuilder.toString());

                    File next = new File(output,className+".java");
                    try
                    {
                        if (next.createNewFile())
                        {
                            PrintStream printStream = new PrintStream(next);
                            printStream.print(stringBuilder.toString());
                        }
                    }
                    catch (IOException e)
                    {
                        e.printStackTrace();
                    }

                    //System.out.println("test: \n" + stringBuilder.toString() + "\n");
                });

        System.out.println("Outer: \n" + outerBuilder.toString());
    }
}