/*
package com.curso.solid.utils;
import co.com.bancolombia.performance.text_extraction_ocr.models.ExecutionJson;
import com.amazonaws.services.lambda.model.ServiceException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class JsonUtils {
    public static String convertJsonToString(String rawBucketName, String intermediateBucketName,
                                             String extractType, String numPagesFile, String sizeFile){
        String jsonLambda="EMPTY";
        JsonObject objectJson;
        try {
            objectJson = jsonExtractor(numPagesFile);
            JsonParser parser = new JsonParser();
            JsonObject file = (JsonObject) parser.parse(String.valueOf(objectJson));
            prepareRequest(rawBucketName, intermediateBucketName,
                    extractType, numPagesFile, sizeFile);
            jsonLambda = file.toString();
            return jsonLambda;
        } catch (Exception e) {
            throw new ServiceException("Error on JsonUtils -> jsonExtractor" + e);
        }
    }

    public static JsonObject jsonExtractor(String numPagesFile) throws Exception {
        JsonParser jsonParser = new JsonParser();
        Object object;
        JsonObject objectJson;
        try (FileReader reader = new FileReader(ConfigurationUtils.getEventFilePath(numPagesFile))) {
            object = jsonParser.parse(reader);
            objectJson = (JsonObject) object;
        } catch (JsonParseException e) {
            throw new ServiceException("Error on JsonUtils -> jsonExtractor" + e);
        }
        return objectJson;
    }

    public static void prepareRequest(String rawBucketName, String intermediateBucketName,
                                      String extractType, String numPagesFile, String sizeFile){
        JsonObject jsonPetition = null;
        try {
            jsonPetition = JsonUtils.jsonExtractor(numPagesFile);
        } catch (Exception e) {
            throw new ServiceException("Error on JsonUtils -> jsonExtractor" + e);
        }
        String[] intermediateKeyPaths = ConfigurationUtils.getIntermediateBucketTargetKeyPaths(Integer.valueOf(numPagesFile),
                sizeFile);
        jsonPetition = JsonUtils.putValue(jsonPetition, "<RAW_BUCKET_NAME>", rawBucketName);
        jsonPetition = JsonUtils.putValue(jsonPetition, "<INTERMEDIATE_BUCKET_NAME>" , intermediateBucketName);
        jsonPetition = JsonUtils.putValue(jsonPetition, "<EXTRACT_TYPE>" , extractType);
        jsonPetition = JsonUtils.putValue(jsonPetition, "<S3_SOURCE_KEY>",
                ConfigurationUtils.getRawBucketTargetKeyPath(numPagesFile, sizeFile));
        for(int i = 1; i<=Integer.parseInt(numPagesFile); i++){
            jsonPetition = JsonUtils.putValue(jsonPetition, "<S3_TARGET_KEY_"+String.valueOf(i)+">",
                    intermediateKeyPaths[i-1]);
        }
        ExecutionJson.setBody(jsonPetition.toString());
    }

    public static JsonObject putValue(JsonObject jsonObject, String target, String value){
        JsonParser parser = new JsonParser();
        String objJsonAux = jsonObject.toString().replace(target, value);
        return (JsonObject) parser.parse(objJsonAux);
    }
}
*/
