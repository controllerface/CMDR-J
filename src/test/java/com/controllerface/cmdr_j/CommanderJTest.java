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
import com.controllerface.cmdr_j.classes.data.CostData;
import com.controllerface.cmdr_j.classes.tasks.TaskCost;
import com.controllerface.cmdr_j.classes.tasks.TaskRecipe;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Basic;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Premium;
import com.controllerface.cmdr_j.classes.recipes.AbstractSynthesisRecipe_Standard;
import com.controllerface.cmdr_j.classes.recipes.AbstractTechnologyRecipe;
import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;
import com.controllerface.cmdr_j.enums.costs.materials.Material;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialSubCostCategory;
import com.controllerface.cmdr_j.enums.costs.materials.MaterialType;
import com.controllerface.cmdr_j.enums.craftable.modifications.ModificationType;
import com.controllerface.cmdr_j.enums.craftable.technologies.TechnologyRecipe;
import com.controllerface.cmdr_j.enums.engineers.Engineer;
import com.controllerface.cmdr_j.enums.equipment.modules.CoreInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.HardpointModule;
import com.controllerface.cmdr_j.enums.equipment.modules.OptionalInternalModule;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;
import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;
import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
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
    @Ignore
    public void testDamageTypes()
    {
        Stream.of(HardpointModule.values())
                .forEach(v->
                {
                    Assert.assertTrue(v.displayText() + "failed", v.itemEffects().effectByName(ItemEffect.DamageType).isPresent());
                });
    }

    @Test
    public void printCurrent()
    {
        Stream.of(CoreInternalModule.values())
                .filter(m->m.price() == 1)
                .forEach(System.out::println);

        Stream.of(OptionalInternalModule.values())
                .filter(m->m.price() == 1)
                .forEach(System.out::println);

        Stream.of(HardpointModule.values())
                .filter(m->m.price() == 1)
                .forEach(System.out::println);
    }

    @Test
    public void getGrades()
    {
        Stream.of(HardpointModule.values())
                .filter(m -> !m.itemEffects().effectByName(ItemEffect.Class).isPresent())
                .forEach(System.out::println);

        Stream.of(OptionalInternalModule.values())
                .filter(m -> !m.itemEffects().effectByName(ItemEffect.Class).isPresent())
                .forEach(System.out::println);

        Stream.of(CoreInternalModule.values())
                .filter(m -> !m.itemEffects().effectByName(ItemEffect.Class).isPresent())
                .forEach(System.out::println);
    }

    @Test
    @SuppressWarnings("unchecked")
    public void modules()
    {
        InputStream is = this.getClass().getResourceAsStream("/modules.json");
        Map<String, Object> x = JSONSupport.Parse.jsonStream.apply(is);

        Set<String> out = new HashSet<>();

        AtomicInteger remaining = new AtomicInteger(0);

        ((List<Map<String, Object>>) x.get("modules"))
                .forEach(a->
                {
                    AtomicReference<ShipModule> result = new AtomicReference<>(null);
                    String symbol = ((String) a.get("ed_symbol"));
                    Integer price = ((Integer) a.get("price"));
                    Map<String, Object> group = ((Map<String, Object>) a.get("group"));
                    int id = ((int) group.get("category_id"));

//                    if (name != null)
//                    {
//                        System.out.println("name: "+name);
//                    }
//                    System.out.println("Getting: " + symbol);
                    if (symbol == null)
                    {
                        //System.out.println("Null symbol: " + a);
                        return;
                    }
                    out.add(symbol.toLowerCase());
                    switch (id)
                    {
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                        case 50:
                            try
                            {
                                result.set(OptionalInternalModule.valueOf(symbol.toLowerCase()));
                            }
                            catch (Exception e)
                            {
                                try
                                {
                                    result.set(CoreInternalModule.valueOf(symbol.toLowerCase()));
                                }
                                catch (Exception e1)
                                {
                                    try
                                    {
                                        result.set(HardpointModule.valueOf(symbol.toLowerCase()));
                                    }
                                    catch (Exception e2)
                                    {
                                        e2.printStackTrace();
                                    }
                                }

                            }
                            break;

                        default:
                            System.out.println(id + " :: " + symbol);
                    }

                    if (result.get()!=null)
                    {
                        if (price != null)
                        {
                            if (result.get().price() == 1)
                            {
                                remaining.incrementAndGet();
                                String output = String.format("%,8d%n", price).trim()
                                        .replaceAll(",","_");

//                                String method =
//                                        "    @Override\n" +
//                                        "    public long price()\n" +
//                                        "    {\n" +
//                                        "        return " + output + ";\n" +
//                                        "    }";

                                System.out.println(result.get() + " : " + output);
                            }
                        }
//                        else
//                        {
//                            System.out.println("No price: " + symbol);
//                        }
                    }
                });

        System.out.println("Remaining: " + remaining.get());

        Set<String> out2 = new HashSet<>();

        Stream<String> v1 = EnumSet.allOf(CoreInternalModule.class).stream()
                .map(Enum::name)
                .map(String::toLowerCase);

        Stream<String> v2 = EnumSet.allOf(OptionalInternalModule.class).stream()
                .map(Enum::name)
                .map(String::toLowerCase);

        Stream<String> v3 = EnumSet.allOf(HardpointModule.class).stream()
                .map(Enum::name)
                .map(String::toLowerCase);

        Stream.concat(v1, Stream.concat(v2, v3))
                .filter(s->!out.contains(s))
                .forEach(out2::add);

        //out2.forEach(z-> System.out.println("Missing: " + z));
    }

    @Test
    @Ignore
    public void vals()
    {
        InputStream is = this.getClass().getResourceAsStream("/vals.json");
        Map<String, Object> x = JSONSupport.Parse.jsonStream.apply(is);

        Set<String> out = new HashSet<>();

        ((List<String>) x.get("modules"))
                .forEach(a->
                {
                    out.add(a.toLowerCase());
                    try
                    {
                        OptionalInternalModule m1 = OptionalInternalModule.valueOf(a.toLowerCase());
                        System.out.println(m1);
                    }
                    catch (Exception e)
                    {
                        try
                        {
                            CoreInternalModule m1a = CoreInternalModule.valueOf(a.toLowerCase());
                            System.out.println(m1a);
                        }
                        catch (Exception e1)
                        {
                            try
                            {
                                HardpointModule m1b = HardpointModule.valueOf(a.toLowerCase());
                                System.out.println(m1b);
                            }
                            catch (Exception e2)
                            {
                                throw e2;
                            }
                        }
                    }
                });

        Set<String> out2 = new HashSet<>();

        Stream<String> v1 = EnumSet.allOf(CoreInternalModule.class).stream()
                .map(Enum::name)
                .map(String::toLowerCase);

        Stream<String> v2 = EnumSet.allOf(OptionalInternalModule.class).stream()
                .map(Enum::name)
                .map(String::toLowerCase);

        Stream<String> v3 = EnumSet.allOf(HardpointModule.class).stream()
                .map(Enum::name)
                .map(String::toLowerCase);

        Stream.concat(v1, Stream.concat(v2, v3))
                .filter(s->!out.contains(s))
                .forEach(out2::add);

        out2.forEach(z-> System.out.println("Missing: " + z));
    }

    private int determineMaximum(ItemGrade itemGrade)
    {
        switch (itemGrade)
        {
            case VERY_COMMON:
                return 300;
            case COMMON:
                return 250;
            case STANDARD:
                return 200;
            case RARE:
                return 150;
            case VERY_RARE:
                return 100;
            default:
                return 0;
        }
    }

    /**
     * Generates HTML for material categories
     */
    @Test
    public void generateMaterialCategories()
    {
        InputStream jsonStream = null;
        try
        {
            URL localizationData = getClass().getResource("/localization/eng.json");
            jsonStream = localizationData.openStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Map<String, Object> data = JSONSupport.Parse.jsonStream.apply(jsonStream);

        ((Map<String, Object>) data.get("materials"))
            .forEach((key, value) ->
            {
                TaskCost material = Material.valueOf(key);
                material.setLocalizedName(((String) ((Map<String, Object>) value).get("name")));
                List<String> locations = ((List<String>) ((Map<String, Object>) value).get("locations"));
                material.setLocationInformation(locations.stream().collect(Collectors.joining("\n")));
            });

        Arrays.stream(MaterialType.values())

            // uncomment a filter to generate only that type

            //.filter(materialType -> materialType == MaterialType.RAW)
            //.filter(materialType -> materialType == MaterialType.ENCODED)
            //.filter(materialType -> materialType == MaterialType.MANUFACTURED)

            .forEach(materialType ->
            {
                System.out.println("\n\n" + materialType +"\n\n");

                StringBuilder buffer = new StringBuilder();
                buffer.append("<div class=\"tabPanel\">\n")
                    .append("\t<div class=\"inventoryBin\">\n")
                    .append("\t\t<div class=\"binHeader\">\n")
                    .append("\t\t\t<div class=\"binName\">Name</div>\n")
                    .append("\t\t\t<div class=\"binGrade\">Grade</div>\n")
                    .append("\t\t\t<div class=\"binCount\">Stock</div>\n")
                    .append("\t\t\t<div class=\"binCapacity\">Capacity</div>\n")
                    .append("\t\t</div>\n\n");

                materialType.categories()
                    .forEach(category ->
                    {
                        buffer.append("\t\t<div class=\"binCategoryHeader\">")
                            .append(category)
                            .append("</div>\n");

                        category.materials()
                            .forEach(material ->
                            {
                                var grade = material.getGrade();
                                var max = determineMaximum(grade);
                                var materialName = material.name();
                                buffer.append("\t\t<div class=\"binCategory\" id=\"")
                                    .append(materialName)
                                    .append("\">\n")
                                    .append("\t\t\t<details class=\"binName\">\n")
                                    .append("\t\t\t\t<summary>")
                                    .append(material.getLocalizedName())
                                    .append("</summary>\n")
                                    .append("\t\t\t\tTrade data\n")
                                    .append("\t\t\t</details>\n")
                                    .append("\t\t\t<div class=\"binGrade\">")
                                    .append(grade)
                                    .append("</div>\n")
                                    .append("\t\t\t<div class=\"binCount\">0</div>\n")
                                    .append("\t\t\t<div class=\"binCapacity\">\n")
                                    .append("\t\t\t\t<progress max=\"")
                                    .append(max)
                                    .append("\" value=\"0\"></progress>\n")
                                    .append("\t\t\t</div>\n")
                                    .append("\t\t</div>\n");
                            });
                    });

                buffer.append("\t</div>\n")
                    .append("</div>\n\n");
                System.out.println(buffer.toString());
            });
    }

    @Test
    public void generateMaterialEvents()
    {
        StringBuilder buffer = new StringBuilder();
        Arrays.stream(MaterialType.values())
            .flatMap(MaterialType::categories)
            .flatMap(MaterialSubCostCategory::materials)
            .forEach(m->
            {
                String name = m.name();
                buffer.append(name)
                    .append(": (e) => setMaterialCount(\"")
                    .append(name)
                    .append("\", e.data),\n");
            });
        System.out.println(buffer.toString());
    }

    private Pair<String, String> getAbstractClass(TaskRecipe recipe)
    {

        switch (recipe.getGrade())
        {
            case SYNTHESIS_BASIC:
                return new Pair<>(AbstractSynthesisRecipe_Basic.class.getSimpleName(), AbstractSynthesisRecipe_Basic.class.getCanonicalName());

            case SYNTHESIS_STANDARD:
                return new Pair<>(AbstractSynthesisRecipe_Standard.class.getSimpleName(), AbstractSynthesisRecipe_Standard.class.getCanonicalName());

            case SYNTHESIS_PREMIUM:
                return new Pair<>(AbstractSynthesisRecipe_Premium.class.getSimpleName(), AbstractSynthesisRecipe_Premium.class.getCanonicalName());

            case Technology:
                return new Pair<>(AbstractTechnologyRecipe.class.getSimpleName(), AbstractTechnologyRecipe.class.getCanonicalName());
        }
        System.out.println("Bad: " + recipe);
        return null;
    }


    private Pair<String, String> getAbstractClass(ShipModule module)
    {
        if (module.modificationType() == null)
        {
            String displayText = module.displayText();
            if (displayText.contains("Guardian"))
            {
                return new Pair<>(AbstractGuardianModule.class.getSimpleName(), AbstractGuardianModule.class.getCanonicalName());
            }
            if (displayText.contains("Fuel Tank"))
            {
                return new Pair<>(AbstractFuelTank.class.getSimpleName(), AbstractFuelTank.class.getCanonicalName());
            }
            if (displayText.contains("Seismic Charge"))
            {
                return new Pair<>(AbstractSeismicChargeLauncher.class.getSimpleName(), AbstractSeismicChargeLauncher.class.getCanonicalName());
            }
            if (displayText.contains("Sub-Surface"))
            {
                return new Pair<>(AbstractSubsurfaceMissileLauncher.class.getSimpleName(), AbstractSubsurfaceMissileLauncher.class.getCanonicalName());
            }
            if (displayText.contains("Abrasion Blaster"))
            {
                return new Pair<>(AbstractAbrasionBlaster.class.getSimpleName(), AbstractAbrasionBlaster.class.getCanonicalName());
            }
            if (displayText.contains("Pulse Wave"))
            {
                return new Pair<>(AbstractPulseWaveScanner.class.getSimpleName(), AbstractPulseWaveScanner.class.getCanonicalName());
            }
            if (displayText.contains("Mining Laser")
                    || displayText.contains("Mining Lance"))
            {
                return new Pair<>(AbstractMiningLaser.class.getSimpleName(), AbstractMiningLaser.class.getCanonicalName());
            }
            if (displayText.contains("Anti-Xeno")
                    || displayText.contains("Shock Cannon")
                    || displayText.contains("Flak Launcher")
                    || displayText.contains("Flechette Launcher")
                    || displayText.contains("Enzyme Missile"))
            {
                return new Pair<>(AbstractExperimentalModule.class.getSimpleName(), AbstractExperimentalModule.class.getCanonicalName());
            }
            return null;
        }

        else
        {
            ModificationType modificationType = ((ModificationType) module.modificationType());

            switch (modificationType)
            {
                case Beam_Laser:
                    return new Pair<>(AbstractBeamLaser.class.getSimpleName(), AbstractBeamLaser.class.getCanonicalName());

                case Burst_Laser:
                    return new Pair<>(AbstractBurstLaser.class.getSimpleName(), AbstractBurstLaser.class.getCanonicalName());

                case Pulse_Laser:
                    return new Pair<>(AbstractPulseLaser.class.getSimpleName(), AbstractPulseLaser.class.getCanonicalName());

                case Cannon:
                    return new Pair<>(AbstractCannon.class.getSimpleName(), AbstractCannon.class.getCanonicalName());

                case Multi_Cannon:
                    return new Pair<>(AbstractMultiCannon.class.getSimpleName(), AbstractMultiCannon.class.getCanonicalName());

                case Fragment_Cannon:
                    return new Pair<>(AbstractFragCannon.class.getSimpleName(), AbstractFragCannon.class.getCanonicalName());

                case Missile_Rack:
                    return new Pair<>(AbstractMissileRack.class.getSimpleName(), AbstractMissileRack.class.getCanonicalName());

                case Seeker_Missile_Rack:
                    return new Pair<>(AbstractSeekerMissileRack.class.getSimpleName(), AbstractSeekerMissileRack.class.getCanonicalName());

                case Torpedo_Pylon:
                    return new Pair<>(AbstractTorpedoPylon.class.getSimpleName(), AbstractTorpedoPylon.class.getCanonicalName());

                case Mine_Launcher:
                    return new Pair<>(AbstractMineLauncher.class.getSimpleName(), AbstractMineLauncher.class.getCanonicalName());

                case Plasma_Accelerator:
                    return new Pair<>(AbstractPlasmaAccelerator.class.getSimpleName(), AbstractPlasmaAccelerator.class.getCanonicalName());

                case Rail_Gun:
                    return new Pair<>(AbstractRailGun.class.getSimpleName(), AbstractRailGun.class.getCanonicalName());



                case Frame_Shift_Drive:
                    return new Pair<>(AbstractFSD.class.getSimpleName(), AbstractFSD.class.getCanonicalName());

                case Life_Support:
                    return new Pair<>(AbstractLifeSupport.class.getSimpleName(), AbstractLifeSupport.class.getCanonicalName());

                case Power_Distributor:
                    return new Pair<>(AbstractPowerDistributor.class.getSimpleName(), AbstractPowerDistributor.class.getCanonicalName());

                case Power_Plant:
                    return new Pair<>(AbstractPowerPlant.class.getSimpleName(), AbstractPowerPlant.class.getCanonicalName());

                case Sensors:
                    return new Pair<>(AbstractSensors.class.getSimpleName(), AbstractSensors.class.getCanonicalName());

                case Thrusters:
                    return new Pair<>(AbstractThrusters.class.getSimpleName(), AbstractThrusters.class.getCanonicalName());

                case Bulkheads:
                    return new Pair<>(AbstractBulkheads.class.getSimpleName(), AbstractBulkheads.class.getCanonicalName());




                case Shield_Booster:
                    return new Pair<>(AbstractShieldBooster.class.getSimpleName(), AbstractShieldBooster.class.getCanonicalName());

                case Chaff_Launcher:
                    return new Pair<>(AbstractChaffLauncher.class.getSimpleName(), AbstractChaffLauncher.class.getCanonicalName());

                case Heat_Sink_Launcher:
                    return new Pair<>(AbstractHeatsinkLauncher.class.getSimpleName(), AbstractHeatsinkLauncher.class.getCanonicalName());

                case Point_Defense:
                    return new Pair<>(AbstractPointDefense.class.getSimpleName(), AbstractPointDefense.class.getCanonicalName());

                case Electronic_Countermeasures:
                    return new Pair<>(AbstractECM.class.getSimpleName(), AbstractECM.class.getCanonicalName());

                case Frame_Shift_Wake_Scanner:
                    return new Pair<>(AbstractWakeScanner.class.getSimpleName(), AbstractWakeScanner.class.getCanonicalName());

                case Kill_Warrant_Scanner:
                    return new Pair<>(AbstractKillWarrantScanner.class.getSimpleName(), AbstractKillWarrantScanner.class.getCanonicalName());

                case Manifest_Scanner:
                    return new Pair<>(AbstractManifestScanner.class.getSimpleName(), AbstractManifestScanner.class.getCanonicalName());

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


    private String costType(CostData data)
    {
        if (data.cost instanceof Material) return "Material."+data.toString();
        if (data.cost instanceof Commodity) return "Commodity."+data.toString();
        return "";
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

        Stream.of(TechnologyRecipe.values())
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
                                String val = e.isNumerical() ? String.valueOf(e.getDoubleValue()) : "\""+e.getValueString()+"\"";

                                return  "                  new ItemEffectData(ItemEffect." + e.effect.name() + ", " + val + ")";
                            }).collect(Collectors.joining(",\n","new ItemEffects(\n","\n    "));

                    String items =
                            Stream.of(v.getModules())
                                    .map(m->
                                    {
                                        if (m instanceof CoreInternalModule)
                                        {
                                            return "        CoreInternalModule."+((CoreInternalModule) m).name();
                                        }
                                        if (m instanceof OptionalInternalModule)
                                        {
                                            return "        OptionalInternalModule."+((OptionalInternalModule) m).name();
                                        }
                                        if (m instanceof HardpointModule)
                                        {
                                            return "        HardpointModule."+((HardpointModule) m).name();
                                        }
                                        return "";
                                    })
                                    .collect(Collectors.joining(",\n"));

                    outerBuilder.append(v.name())
                            .append("(new ").append(className)
                            .append("(),\n")
                            .append(items)
                            .append("),\n\n");


                    String costs = v.costStream()
                            .map(c -> "new CostData(" + costType(c)
                                    .replaceAll(":",", ")
                                    .replaceFirst(" ","")
                                    .replaceFirst("  "," ")
                                    + ")")
                            .collect(Collectors.joining(",\n            "));


                    Pair<String, String> c = getAbstractClass(v);

                    stringBuilder.append("package com.controllerface.cmdr_j.classes.modules.generated;\n\n");

                    stringBuilder.append("import com.controllerface.cmdr_j.classes.ItemEffects;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.classes.data.ItemEffectData;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.classes.data.CostData;\n");
                    stringBuilder.append("import " + c.getValue() + ";\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.costs.materials.Material;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.costs.commodities.Commodity;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemEffect;\n");
                    stringBuilder.append("import com.controllerface.cmdr_j.enums.equipment.modules.stats.ItemGrade;\n");
                    stringBuilder.append("\n");

                    stringBuilder.append("public class ").append(className).append(" extends " + c.getKey() + "\n");

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

//                    System.out.println(stringBuilder.toString());
//
//                    File next = new File(output,className+".java");
//                    try
//                    {
//                        if (next.createNewFile())
//                        {
//                            PrintStream printStream = new PrintStream(next);
//                            printStream.print(stringBuilder.toString());
//                        }
//                    }
//                    catch (IOException e)
//                    {
//                        e.printStackTrace();
//                    }

                });

        System.out.println("Outer: \n" + outerBuilder.toString());
    }
}