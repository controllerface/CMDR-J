package com.controllerface.cmdr_j;

import com.controllerface.cmdr_j.classes.commander.ShipModule;
import com.controllerface.cmdr_j.classes.modules.AbstractExperimentalModule;
import com.controllerface.cmdr_j.classes.modules.AbstractGuardianModule;
import com.controllerface.cmdr_j.classes.modules.core.bulkheads.AbstractBulkheads;
import com.controllerface.cmdr_j.classes.modules.core.distributor.AbstractPowerDistributor;
import com.controllerface.cmdr_j.classes.modules.core.fsd.AbstractFSD;
import com.controllerface.cmdr_j.classes.modules.core.fueltank.AbstractFuelTank;
import com.controllerface.cmdr_j.classes.modules.core.lifesupport.AbstractLifeSupport;
import com.controllerface.cmdr_j.classes.modules.core.powerplant.AbstractPowerPlant;
import com.controllerface.cmdr_j.classes.modules.core.sensors.AbstractSensors;
import com.controllerface.cmdr_j.classes.modules.core.thrusters.AbstractThrusters;
import com.controllerface.cmdr_j.classes.modules.utility.abrasionblaster.AbstractAbrasionBlaster;
import com.controllerface.cmdr_j.classes.modules.utility.chafflauncher.AbstractChaffLauncher;
import com.controllerface.cmdr_j.classes.modules.utility.ecm.AbstractECM;
import com.controllerface.cmdr_j.classes.modules.utility.heatsinklauncher.AbstractHeatsinkLauncher;
import com.controllerface.cmdr_j.classes.modules.utility.killwarrant.AbstractKillWarrantScanner;
import com.controllerface.cmdr_j.classes.modules.utility.manifestscanner.AbstractManifestScanner;
import com.controllerface.cmdr_j.classes.modules.utility.mininglaser.AbstractMiningLaser;
import com.controllerface.cmdr_j.classes.modules.utility.pointdefense.AbstractPointDefense;
import com.controllerface.cmdr_j.classes.modules.utility.pulsewave.AbstractPulseWaveScanner;
import com.controllerface.cmdr_j.classes.modules.utility.seismiccharge.AbstractSeismicChargeLauncher;
import com.controllerface.cmdr_j.classes.modules.utility.shieldbooster.AbstractShieldBooster;
import com.controllerface.cmdr_j.classes.modules.utility.subsurfacemissile.AbstractSubsurfaceMissileLauncher;
import com.controllerface.cmdr_j.classes.modules.utility.wakescanner.AbstractWakeScanner;
import com.controllerface.cmdr_j.classes.modules.weapons.beam.AbstractBeamLaser;
import com.controllerface.cmdr_j.classes.modules.weapons.burst.AbstractBurstLaser;
import com.controllerface.cmdr_j.classes.modules.weapons.cannon.AbstractCannon;
import com.controllerface.cmdr_j.classes.modules.weapons.fragcannon.AbstractFragCannon;
import com.controllerface.cmdr_j.classes.modules.weapons.minelauncher.AbstractMineLauncher;
import com.controllerface.cmdr_j.classes.modules.weapons.missilerack.AbstractMissileRack;
import com.controllerface.cmdr_j.classes.modules.weapons.multicannon.AbstractMultiCannon;
import com.controllerface.cmdr_j.classes.modules.weapons.plasmaaccellerator.AbstractPlasmaAccelerator;
import com.controllerface.cmdr_j.classes.modules.weapons.pulse.AbstractPulseLaser;
import com.controllerface.cmdr_j.classes.modules.weapons.railgun.AbstractRailGun;
import com.controllerface.cmdr_j.classes.modules.weapons.seekermissile.AbstractSeekerMissileRack;
import com.controllerface.cmdr_j.classes.modules.weapons.torpedo.AbstractTorpedoPylon;
import com.controllerface.cmdr_j.classes.procurements.ProcurementRecipe;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.enums.craftable.experimentals.ExperimentalRecipe;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.craftable.synthesis.SynthesisRecipe;
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
import java.util.HashSet;
import java.util.Set;
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

    private StringPair getAbstractClass(ProcurementRecipe recipe)
    {

        switch (recipe.getGrade())
        {
            case SYNTHESIS_BASIC:
                return new StringPair(AbstractSynthesisRecipe_Basic.class.getSimpleName(), AbstractSynthesisRecipe_Basic.class.getCanonicalName());

            case SYNTHESIS_STANDARD:
                return new StringPair(AbstractSynthesisRecipe_Standard.class.getSimpleName(), AbstractSynthesisRecipe_Standard.class.getCanonicalName());

            case SYNTHESIS_PREMIUM:
                return new StringPair(AbstractSynthesisRecipe_Premium.class.getSimpleName(), AbstractSynthesisRecipe_Premium.class.getCanonicalName());
        }
        return null;
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
            if (displayText.contains("Seismic Charge"))
            {
                return new StringPair(AbstractSeismicChargeLauncher.class.getSimpleName(), AbstractSeismicChargeLauncher.class.getCanonicalName());
            }
            if (displayText.contains("Sub-Surface"))
            {
                return new StringPair(AbstractSubsurfaceMissileLauncher.class.getSimpleName(), AbstractSubsurfaceMissileLauncher.class.getCanonicalName());
            }
            if (displayText.contains("Abrasion Blaster"))
            {
                return new StringPair(AbstractAbrasionBlaster.class.getSimpleName(), AbstractAbrasionBlaster.class.getCanonicalName());
            }
            if (displayText.contains("Pulse Wave"))
            {
                return new StringPair(AbstractPulseWaveScanner.class.getSimpleName(), AbstractPulseWaveScanner.class.getCanonicalName());
            }
            if (displayText.contains("Mining Laser")
                    || displayText.contains("Mining Lance"))
            {
                return new StringPair(AbstractMiningLaser.class.getSimpleName(), AbstractMiningLaser.class.getCanonicalName());
            }
            if (displayText.contains("Anti-Thargoid")
                    || displayText.contains("Shock Cannon")
                    || displayText.contains("Flak Launcher")
                    || displayText.contains("Flechette Launcher")
                    || displayText.contains("Enzyme Missile"))
            {
                return new StringPair(AbstractExperimentalModule.class.getSimpleName(), AbstractExperimentalModule.class.getCanonicalName());
            }
            return null;
        }

        else
        {
            ModificationType modificationType = ((ModificationType) module.modificationType());

            switch (modificationType)
            {
                case Beam_Laser:
                    return new StringPair(AbstractBeamLaser.class.getSimpleName(), AbstractBeamLaser.class.getCanonicalName());

                case Burst_Laser:
                    return new StringPair(AbstractBurstLaser.class.getSimpleName(), AbstractBurstLaser.class.getCanonicalName());

                case Pulse_Laser:
                    return new StringPair(AbstractPulseLaser.class.getSimpleName(), AbstractPulseLaser.class.getCanonicalName());

                case Cannon:
                    return new StringPair(AbstractCannon.class.getSimpleName(), AbstractCannon.class.getCanonicalName());

                case Multi_Cannon:
                    return new StringPair(AbstractMultiCannon.class.getSimpleName(), AbstractMultiCannon.class.getCanonicalName());

                case Fragment_Cannon:
                    return new StringPair(AbstractFragCannon.class.getSimpleName(), AbstractFragCannon.class.getCanonicalName());

                case Missile_Rack:
                    return new StringPair(AbstractMissileRack.class.getSimpleName(), AbstractMissileRack.class.getCanonicalName());

                case Seeker_Missile_Rack:
                    return new StringPair(AbstractSeekerMissileRack.class.getSimpleName(), AbstractSeekerMissileRack.class.getCanonicalName());

                case Torpedo_Pylon:
                    return new StringPair(AbstractTorpedoPylon.class.getSimpleName(), AbstractTorpedoPylon.class.getCanonicalName());

                case Mine_Launcher:
                    return new StringPair(AbstractMineLauncher.class.getSimpleName(), AbstractMineLauncher.class.getCanonicalName());

                case Plasma_Accelerator:
                    return new StringPair(AbstractPlasmaAccelerator.class.getSimpleName(), AbstractPlasmaAccelerator.class.getCanonicalName());

                case Rail_Gun:
                    return new StringPair(AbstractRailGun.class.getSimpleName(), AbstractRailGun.class.getCanonicalName());



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




                case Shield_Booster:
                    return new StringPair(AbstractShieldBooster.class.getSimpleName(), AbstractShieldBooster.class.getCanonicalName());

                case Chaff_Launcher:
                    return new StringPair(AbstractChaffLauncher.class.getSimpleName(), AbstractChaffLauncher.class.getCanonicalName());

                case Heat_Sink_Launcher:
                    return new StringPair(AbstractHeatsinkLauncher.class.getSimpleName(), AbstractHeatsinkLauncher.class.getCanonicalName());

                case Point_Defense:
                    return new StringPair(AbstractPointDefense.class.getSimpleName(), AbstractPointDefense.class.getCanonicalName());

                case Electronic_Countermeasures:
                    return new StringPair(AbstractECM.class.getSimpleName(), AbstractECM.class.getCanonicalName());

                case Frame_Shift_Wake_Scanner:
                    return new StringPair(AbstractWakeScanner.class.getSimpleName(), AbstractWakeScanner.class.getCanonicalName());

                case Kill_Warrant_Scanner:
                    return new StringPair(AbstractKillWarrantScanner.class.getSimpleName(), AbstractKillWarrantScanner.class.getCanonicalName());

                case Manifest_Scanner:
                    return new StringPair(AbstractManifestScanner.class.getSimpleName(), AbstractManifestScanner.class.getCanonicalName());

                case Auto_Field_Maintenence_Unit:

                case Hull_Reinforcement_Package:

                case Detailed_Surface_Scanner:

                case Refinery:

                case Frame_Shift_Drive_Interdictor:

                case Fuel_Scoop:

                case Collector_Limpet_Controller:

                case Prospector_Limpet_Controller:

                case Fuel_Transfer_Limpet:

                case Hatch_Breaker_Limpet:

                case Shield_Cell_Bank:

                case Shield_Generator:


                default:
                    return null;
            }

        }
    }


    private Set<String> seen = new HashSet<>();

    @Test
    public void writeOuttest() throws IOException
    {

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

        Stream.of(SynthesisRecipe.values())
                .forEach(v->
                {
                    StringBuilder stringBuilder = new StringBuilder();

                    String className = v.name()
                            .replaceAll(" ","")
                            .replaceAll("-","")
                            .replace("(","_")
                            .replace(")","_");

                    switch (className)
                    {
                        case "AngledPlating":
                        case "DeepPlating":
                        case "DoubleBraced":
                        case "FlowControl":
                        case "ForceBlock":
                        case "LayeredPlating":
                        case "ReflectivePlating":
                        case "StrippedDown":
                        case "ThermalSpread":
                        case "ThermoBlock":
                            className = className + v.getName();
                    }

                    if (seen.contains(className))
                    {
                        System.out.println("Dupe: " + className);
                    }

                    seen.add(className);

                    String displayText = "\"" + v.getShortLabel() + "\"";

                    // item effects
                    String s = v.effects().effectStream()
                            .map(e->
                            {
                                String val = e.isNumerical() ? String.valueOf(e.getDoubleValue()) : "\""+e.getStringValue()+"\"";

                                return  "                  new ItemEffectData(ItemEffect." + e.getEffect().name() + ", " + val + ")";
                            }).collect(Collectors.joining(",\n","new ItemEffects(\n","\n    "));

                    outerBuilder.append(v.name())
                            .append("(new ").append(className)
                            .append("()),\n");


                    String costs = v.costStream()
                            .map(c->
                            {
                                return "new CostData(Material."
                                        + c.toString()
                                        .replaceAll(":",", ")
                                        .replaceFirst(" ","")
                                        .replaceFirst("  "," ")
                                        + ")";
                            })
                            .collect(Collectors.joining(",\n            "));


                    StringPair c = getAbstractClass(v);

                    stringBuilder.append("package com.controllerface.cmdr_j.classes.modules.generated;\n\n");

                    stringBuilder.append("import com.controllerface.cmdr_j.classes.ItemEffects;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.classes.ItemEffectData;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.classes.procurements.CostData;\n");
                    stringBuilder.append("import " + c.getSecond() + ";\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.costs.materials.Material;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.equipment.ItemEffect;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.equipment.ItemGrade;\n");
                    stringBuilder.append("\n");

                    stringBuilder.append("public class ").append(className).append(" extends " + c.getFirst() + "\n");

                    stringBuilder.append("{\n");
                    stringBuilder.append("    public ").append(className).append("()\n");
                    stringBuilder.append("    {\n");
                    stringBuilder.append("        super(")
                            .append("\"").append(className.replace("_"," ")).append("\"").append(", ")
                            .append("\n            ")
                            .append(s).append("        ),\n")
                            .append("            ").append(costs);

                    stringBuilder.append(");\n");
                    stringBuilder.append("    }\n");
                    stringBuilder.append("}");

                    System.out.println(stringBuilder.toString());

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

                });

        System.out.println("Outer: \n" + outerBuilder.toString());
    }
}