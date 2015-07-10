package u.equations.lcs.resource;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by parallels on 7/9/15.
 *
 * @author U-Equations
 * @version $Id: $Id
 */
public interface LCS_Resource_Constants {

    /**
     * Constant <code>JSON_ARRAY_NAME="setOfStrings"</code>
     */
    String JSON_ARRAY_NAME = "setOfStrings";
    /**
     * Constant <code>EMPTY_JSON_OBJECT</code>
     */
    JsonObject EMPTY_JSON_OBJECT = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value", "")).build();
    /**
     * Constant <code>EMPTY_JSON_OBJECT_RESPONSE</code>
     */
    JsonObject EMPTY_JSON_OBJECT_RESPONSE = Json.createObjectBuilder().add("lcs", Json.createObjectBuilder().add("value", "Word box(es) cannot be empty.")).build();
    /** Constant <code>JSON_OBJECT_PROCESSING_ERROR_RESPONSE</code> */
    JsonObject JSON_OBJECT_PROCESSING_ERROR_RESPONSE = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value","Error in processing words.")).build();
    /** Constant <code>UNIQUE_JSON_OBJECT</code> */
    JsonObject UNIQUE_JSON_OBJECT = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value", "All values are unique.")).build();
    /** Constant <code>NOT_UNIQUE_JSON_OBJECT</code> */
    JsonObject NOT_UNIQUE_JSON_OBJECT = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value", "All values must be unique.")).build();
}
