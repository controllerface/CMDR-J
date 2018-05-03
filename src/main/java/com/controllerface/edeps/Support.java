package com.controllerface.edeps;

import com.controllerface.edeps.structures.journal.JournalEvent;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by sroebuck on 5/3/2018.
 */
public class Support
{
    public static class JSON
    {
        private static final TypeReference<Map> mapTypeReference = new TypeReference<Map>()
        {
            @Override public Type getType() {return HashMap.class;}
        };

        public static final Function<String, Map<String, Object>> parseJsonString = (jsonString) ->
        {
            try {return new ObjectMapper().readValue(jsonString, mapTypeReference);}
            catch (Exception e) {throw new RuntimeException("Error parsing JSON string: " + jsonString, e);}
        };

        public static final Function<File, Map<String, Object>> parseJsonFile = (jsonFile) ->
        {
            try {return new ObjectMapper().readValue(jsonFile, mapTypeReference);}
            catch (Exception e) {throw new RuntimeException("Error parsing JSON file: " + jsonFile, e);}
        };

        public static final Function<InputStream, Map<String, Object>> parseJsonStream = (jsonStream) ->
        {
            try {return new ObjectMapper().readValue(jsonStream, mapTypeReference);}
            catch (Exception e) {throw new RuntimeException("Error parsing JSON stream: " + jsonStream, e);}
            finally
            {
                try {jsonStream.close();}
                catch (IOException e) {e.printStackTrace();}
            }
        };

        public static final BiFunction<File, Map<String, Object>, Boolean> writeJsonToFile = (file, json) ->
        {
            try(OutputStream outputStream = new FileOutputStream(file))
            {
                ObjectMapper mapper = new ObjectMapper();
                ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
                writer.writeValue(outputStream, json);
                return true;
            }
            catch (Exception e)
            {
                System.err.println("Error serializing JSON: ");
                return false;
            }
        };
    }
}
