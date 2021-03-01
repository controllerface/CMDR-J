package com.controllerface.cmdr_j.utilities;

import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
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
            @Override public Type getType() { return HashMap.class; }
        };

        public static final Function<String, Map<String, Object>> jsonString = (jsonString) ->
        {
            try { return new ObjectMapper().readValue(jsonString, mapTypeReference); }
            catch (Exception e) {throw new RuntimeException("Error parsing JSON string: " + jsonString, e);}
        };

        public static final Function<File, Map<String, Object>> jsonFile = (jsonFile) ->
        {
            try { return new ObjectMapper().readValue(jsonFile, mapTypeReference); }
            catch (Exception e) { throw new RuntimeException("Error parsing JSON file: " + jsonFile, e); }
        };

        public static final Function<InputStream, Map<String, Object>> jsonStream = (jsonStream) ->
        {
            try { return new ObjectMapper().readValue(jsonStream, mapTypeReference); }
            catch (Exception e) { throw new RuntimeException("Error parsing JSON stream: " + jsonStream, e); }
            finally
            {
                try {jsonStream.close();}
                catch (IOException e) {e.printStackTrace();}
            }
        };
    }

    public static class Write
    {
        private static void writeJson(OutputStream outputStream, Map<String, Object> json, boolean prettyPrint) throws IOException
        {
            ObjectMapper mapper = new ObjectMapper();

            PrettyPrinter prettyPrinter = prettyPrint
                    ? new DefaultPrettyPrinter()
                    : new MinimalPrettyPrinter();

            ObjectWriter writer = mapper.writer(prettyPrinter);
            writer.writeValue(outputStream, json);
        }

        public static final BiFunction<File, Map<String, Object>, Boolean> jsonToFile = (file, json) ->
        {
            try(OutputStream fileStream = new FileOutputStream(file))
            {
                writeJson(fileStream, json, true);
                return true;
            }
            catch (IOException e)
            {
                System.err.println("Error serializing JSON: ");
                return false;
            }
        };

        public static final Function<Map<String, Object>, String> jsonToString = (json) ->
        {
            try(ByteArrayOutputStream buffer = new ByteArrayOutputStream())
            {
                writeJson(buffer, json, false);
                return buffer.toString();
            }
            catch (IOException e)
            {
                System.err.println("Error serializing JSON: ");
                return "";
            }
        };
    }
}
