package com.controllerface.edeps;

import com.controllerface.edeps.structures.costs.commodities.Commodity;
import com.controllerface.edeps.structures.costs.materials.Material;
import com.controllerface.edeps.structures.equipment.ItemEffect;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by sroebuck on 5/3/2018.
 */
public class EDEPSTest
{
    @Test
    public void main() throws Exception
    {
        InputStream mods = this.getClass().getResourceAsStream("/testdata/modules_with_effects.json");
        Map<String, Object> data = JSONSupport.Parse.jsonStream.apply(mods);

        List<String> blueprints = new ArrayList<>();
        List<String> recipes = new ArrayList<>();

        data.entrySet().stream()
                .map(entry -> ((Map<String, Object>) entry.getValue()))
                .forEach(mod ->
                {
                    // generate blueprint enums
                    String blueprintName = ((String) mod.get("fdname"));
                    String name = ((String) mod.get("name"));
                    Map<String, Object> grades = ((Map<String, Object>) mod.get("grades"));
                    int gradeCount = grades.size();

                    String recipeEnums = IntStream.range(0, gradeCount)
                            .mapToObj(i->"\tModificationRecipe."+blueprintName+"_"+(i+1))
                            .collect(Collectors.joining(",\n"));

                    StringBuilder stringBuilder = new StringBuilder(blueprintName);
                    stringBuilder.append("(").append("\"").append(name).append("\"").append(",").append("\n")
                            .append(recipeEnums).append("),").append("\n");

                    blueprints.add(stringBuilder.toString());

                    localizeData();

                    // generate recipe enums
                    grades.entrySet().forEach(g->
                    {
                        String grade = g.getKey();
                        String recipeName = blueprintName + "_" + grade;
                        String gradeEnum = "ItemGrade.GRADE_" + grade;
                        String recipeEnum = recipeName + "(" + gradeEnum +", new ItemEffects";

                        Map<String, Object> costs = ((Map<String, Object>) ((Map<String, Object>) g.getValue()).get("components"));

                        String costValues = costs.entrySet().stream()
                                .map(e->
                                {
                                    Material material = Arrays.stream(Material.values())
                                            .filter(v->v.getLocalizedName().equals(e.getKey()))
                                            .findFirst().orElse(null);

                                    if (material == null)
                                    {
                                        System.err.println("ERROR: " + e.getKey());
                                    }
                                    return "\tnew CostData(Material." + material.name() + ", " + e.getValue().toString() + ")";
                                })
                                .collect(Collectors.joining(",\n","","),\n"));

                        Map<String, Object> effects = ((Map<String, Object>) ((Map<String, Object>) g.getValue()).get("features"));

                        String effectValues = effects.entrySet().stream()
                                .map(e->
                                {
                                    ItemEffect effect = ItemEffect.valueOf(e.getKey());

                                    List<Double> eff = ((List<Double>) e.getValue());
                                    return "new Pair<>(ItemEffect." + effect.name() + ", " + eff.get(1) + "d)";
                                })
                                .collect(Collectors.joining(",\n\t\t","\t(\n\t\t","\n\t),"));

                        recipes.add(recipeEnum + "\n" + effectValues + "\n" + costValues);
                    });



                });

        //blueprints.stream().sorted().forEach(l-> System.out.println(l));

        FileWriter bpFile = new FileWriter("bps.txt");
        blueprints.stream().sorted().forEach(bp ->
        {
            try
            {
                bpFile.write(bp+"\n");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        });
        bpFile.close();

        FileWriter rpFile = new FileWriter("rcp.txt");
        recipes.stream().sorted().forEach(r ->
        {
            try
            {
                rpFile.write(r+"\n");
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        });
        rpFile.close();

        //recipes.stream().sorted().forEach(l-> System.out.println(l));

    }

    private void localizeData()
    {
        InputStream inputStream = null;
        try
        {
            URL localizationData = getClass().getResource("/localization/eng.json");
            inputStream = localizationData.openStream();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Map<String, Object> data = JSONSupport.Parse.jsonStream.apply(inputStream);

        ((Map<String, Object>) data.get("materials"))
                .forEach((key, value) ->
                {
                    ProcurementCost material = Material.valueOf(key);
                    material.setLocalizedName(((String) value));
                });

        ((Map<String, Object>) data.get("commodities"))
                .forEach((key, value) ->
                {
                    ProcurementCost commodity = Commodity.valueOf(key);
                    commodity.setLocalizedName(((String) value));
                });
    }
}