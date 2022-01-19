/*
 * AnyOfNonScalarEndpointsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost3000.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import localhost3000.ApiHelper;
import localhost3000.annotations.TypeCombinatorsCaseMarker;
import localhost3000.models.Evening;
import localhost3000.models.Morning;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = SendAnyofMapOfInnerMixedMapSession.SendAnyofMapOfInnerMixedMapSessionDeserializer.class)
public abstract class SendAnyofMapOfInnerMixedMapSession {
    
    /**
     * Any-of type initialization method.
     * @param morning Morning value for morning.
     * @return The MorningCase object.
     */
    public static SendAnyofMapOfInnerMixedMapSession fromMorning(Morning morning) {
        return new MorningCase(morning);
    }

    /**
     * Any-of type initialization method.
     * @param evening Map of String, value for evening.
     * @return The EveningCase object.
     */
    public static SendAnyofMapOfInnerMixedMapSession fromEvening(Map<String, Evening> evening) {
        return new EveningCase(evening);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R morning(Morning morning);

        R evening(Map<String, Evening> evening);
    }

    /**
     * This is a implementation class for MorningCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorsCaseMarker
    private static class MorningCase extends SendAnyofMapOfInnerMixedMapSession {

        @JsonValue
        private Morning morning;

        MorningCase(Morning morning) {
            this.morning = morning;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.morning(this.morning);
        }

        @JsonCreator
        private MorningCase(JsonNode jsonNode) throws IOException {
            this.morning = ApiHelper.deserialize(jsonNode,
                Morning.class);
        }

        @Override
        public String toString() {
            return morning.toString();
        }
    }

    /**
     * This is a implementation class for EveningCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorsCaseMarker
    private static class EveningCase extends SendAnyofMapOfInnerMixedMapSession {

        @JsonValue
        private Map<String, Evening> evening;

        EveningCase(Map<String, Evening> evening) {
            this.evening = evening;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.evening(this.evening);
        }

        @JsonCreator
        private EveningCase(JsonNode jsonNode) throws IOException {
            this.evening = ApiHelper.deserialize(jsonNode,
                new TypeReference<Map<String, Evening>>(){});
        }

        @Override
        public String toString() {
            return evening.toString();
        }
    }

    /**
     * This is a custom deserializer class for SendAnyofMapOfInnerMixedMapSession.
     */
    protected static class SendAnyofMapOfInnerMixedMapSessionDeserializer
        extends JsonDeserializer<SendAnyofMapOfInnerMixedMapSession> {

        @Override
        public SendAnyofMapOfInnerMixedMapSession deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(MorningCase.class,
                    EveningCase.class), false);
        }
    }

}
