package com.controllerface.edeps;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Controllerface on 5/3/2018.
 */
public class JSONSupport
{
    public static class Parse
    {
        private static final TypeReference<Map> mapTypeReference = new TypeReference<Map>()
        {
            @Override public Type getType() {return HashMap.class;}
        };

        public static final Function<String, Map<String, Object>> jsonString = (jsonString) ->
        {
            try {return new ObjectMapper().readValue(jsonString, mapTypeReference);}
            catch (Exception e) {throw new RuntimeException("Error parsing JSON string: " + jsonString, e);}
        };

        public static final Function<File, Map<String, Object>> jsonFile = (jsonFile) ->
        {
            try {return new ObjectMapper().readValue(jsonFile, mapTypeReference);}
            catch (Exception e) {throw new RuntimeException("Error parsing JSON file: " + jsonFile, e);}
        };

        public static final Function<InputStream, Map<String, Object>> jsonStream = (jsonStream) ->
        {
            try {return new ObjectMapper().readValue(jsonStream, mapTypeReference);}
            catch (Exception e) {throw new RuntimeException("Error parsing JSON stream: " + jsonStream, e);}
            finally
            {
                try {jsonStream.close();}
                catch (IOException e) {e.printStackTrace();}
            }
        };
    }

    public static class Write
    {
        public static final BiFunction<File, Map<String, Object>, Boolean> jsonToFile = (file, json) ->
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

        public static final Function<Map<String, Object>, String> jsonToString = (jsonObject) ->
        {
            try(ByteArrayOutputStream outputStream = new ByteArrayOutputStream())
            {
                ObjectMapper mapper = new ObjectMapper();
                ObjectWriter writer = mapper.writer();
                writer.writeValue(outputStream, jsonObject);
                return outputStream.toString();
            }
            catch (Exception e)
            {
                System.err.println("Error serializing JSON: ");
                return "";
            }
        };
    }
}
