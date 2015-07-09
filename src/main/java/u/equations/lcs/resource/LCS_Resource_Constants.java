package u.equations.lcs.resource;

import javax.json.Json;
import javax.json.JsonObject;

/**
 * Created by parallels on 7/9/15.
 */
public interface LCS_Resource_Constants {

    String JSON_ARRAY_NAME = "setOfStrings";
    JsonObject EMPTY_JSON_OBJECT = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value", "")).build();
    JsonObject EMPTY_JSON_OBJECT_RESPONSE = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value","List of words cannot be empty.")).build();
    JsonObject JSON_OBJECT_PROCESSING_ERROR_RESPONSE = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value","Error in processing words.")).build();
    JsonObject UNIQUE_JSON_OBJECT = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value", "All values are unique.")).build();
    JsonObject NOT_UNIQUE_JSON_OBJECT = Json.createObjectBuilder().add("lcs",Json.createObjectBuilder().add("value", "All values must be unique.")).build();
}
