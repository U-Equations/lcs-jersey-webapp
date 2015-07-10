package u.equations.lcs.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import u.equations.lcs.algorithm.LCSAlgorithmImpl;
import u.equations.lcs.util.ListUniquenessImpl;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonValue;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * Root resource (exposed at "lcs" path)
 *
 * @author U-Equations
 * @version $Id: $Id
 */
@Path("/lcs")
public class LCS_Resource implements LCS_Resource_Constants {

    private static final Logger logger = LoggerFactory
            .getLogger(LCS_Resource.class);

    /**
     * <p>processJSONArray.</p>
     *
     * @param jsonObject a {@link javax.json.JsonObject} object.
     * @return a {@link javax.json.JsonObject} object.
     */
    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN})
    @Consumes(MediaType.APPLICATION_JSON)
    public JsonObject processJSONArray(JsonObject jsonObject) {

        JsonObject jsonObjectResponse = JSON_OBJECT_PROCESSING_ERROR_RESPONSE;
        String lcsString;

        logger.info("processing: " + jsonObject.toString());

        logger.info("getJsonArray: " + jsonObject.getJsonArray(JSON_ARRAY_NAME).toString());

        JsonArray jsonArray = jsonObject.getJsonArray(JSON_ARRAY_NAME);

        logger.info("value type: " + jsonArray.getValueType().name());

        List<String> stringList = new ArrayList<>();

        for (JsonValue value : jsonArray) {
            JsonObject object = (JsonObject) value;
            String string = object.getJsonString("value").getString();

            if (string.equals("")) {
                jsonObjectResponse = EMPTY_JSON_OBJECT_RESPONSE;
                return jsonObjectResponse;
            }

            stringList.add(string);
        }

        ListUniquenessImpl uniquenessImpl = new ListUniquenessImpl();

        if (uniquenessImpl.isUnique(stringList)) {

            LCSAlgorithmImpl lcsAlgorithm = new LCSAlgorithmImpl();
            lcsString = lcsAlgorithm.findLCS(stringList);
            jsonObjectResponse = Json.createObjectBuilder().add("lcs", Json.createObjectBuilder().add("value", lcsString)).build();

            logger.info(jsonObjectResponse.toString());

        } else {

            jsonObjectResponse = NOT_UNIQUE_JSON_OBJECT;
        }

        logger.info("string list: " + stringList.toString());

        return jsonObjectResponse;
    }
}
