package com.github.jsonpatch;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.github.fge.jsonpatch.JsonPatch;
import com.github.fge.jsonpatch.JsonPatchException;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class SampleJsonPatch {

    public static Logger logger = Logger.getLogger("example");
    public static void main(String[] args) throws IOException, JsonPatchException {

        String yamlStr = getYamlResourceAsString("deployment.yaml");
        logger.info("yaml resource: \n " + yamlStr);

        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());
        ObjectMapper jsonMapper = new ObjectMapper();

        Object obj = yamlMapper.readValue(yamlStr, Object.class);
        String jsonStr = jsonMapper.writeValueAsString(obj);
        logger.info("Json Format: \n" + jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));

        List<Patch> patchList = getPatches();
        JsonPatch jsonPatch = JsonPatch.fromJson(jsonMapper.readTree(jsonMapper.writeValueAsString(patchList)));
        logger.info("patch details: \n"+jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonPatch));

        JsonNode target = jsonPatch.apply(jsonMapper.readTree(jsonStr));
        String mergedResourceStr = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(target);
        logger.info("Merged Json Resource: \n" + mergedResourceStr);

        Object mergedResource  = jsonMapper.readValue(mergedResourceStr, Object.class);
        logger.info("Merged Yaml Resource: \n" + yamlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(mergedResource));
    }

    @NotNull
    private static List<Patch> getPatches() {
        Map<String, String> labels = Map.of("sampleKey", "sampleValue", "instance", "nginx-patch");
        List<Patch> patchList = new ArrayList<>();
        patchList.add(new Patch("replace", "/metadata/labels/app", "nginx-patch"));
        patchList.add(new Patch("replace", "/spec/replicas", 3));
        patchList.add(new Patch("add", "/spec/template/metadata/labels", labels));
        patchList.add(new Patch("replace", "/spec/template/spec/containers/0/ports/0/containerPort", 8080));
        return patchList;
    }

    private static String getYamlResourceAsString(String resourceName) throws IOException {

        StringBuffer yamlResource = new StringBuffer("");
        ClassLoader classLoader =  Thread.currentThread().getContextClassLoader();

        try (InputStream inputStream = classLoader.getResourceAsStream(resourceName)) {
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8));

            String line;
            while ( (line = bufferedReader.readLine()) !=null) {
                yamlResource.append(line);
                yamlResource.append("\n");
            }
        }
        return yamlResource.toString();
    }
}
