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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import localhost3000.ApiHelper;
import localhost3000.annotations.TypeCombinatorsCaseMarker;
import localhost3000.models.Evening;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = SendMultiLevelAnyofSessionCase1.SendMultiLevelAnyofSessionCase1Deserializer.class)
public abstract class SendMultiLevelAnyofSessionCase1 {
    
    /**
     * Any-of type initialization method.
     * @param evening List of Evening value for evening.
     * @return The EveningCase object.
     */
    public static SendMultiLevelAnyofSessionCase1 fromEvening(List<Evening> evening) {
        return new EveningCase(evening);
    }

    /**
     * Any-of type initialization method.
     * @param evening2 Evening value for evening2.
     * @return The Evening2Case object.
     */
    public static SendMultiLevelAnyofSessionCase1 fromEvening2(Evening evening2) {
        return new Evening2Case(evening2);
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
        R evening(List<Evening> evening);

        R evening2(Evening evening2);
    }

    /**
     * This is a implementation class for EveningCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorsCaseMarker
    private static class EveningCase extends SendMultiLevelAnyofSessionCase1 {

        @JsonValue
        private List<Evening> evening;

        EveningCase(List<Evening> evening) {
            this.evening = evening;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.evening(this.evening);
        }

        @JsonCreator
        private EveningCase(JsonNode jsonNode) throws IOException {
            this.evening = ApiHelper.deserializeArray(jsonNode,
                Evening[].class);
        }

        @Override
        public String toString() {
            return evening.toString();
        }
    }

    /**
     * This is a implementation class for Evening2Case.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorsCaseMarker
    private static class Evening2Case extends SendMultiLevelAnyofSessionCase1 {

        @JsonValue
        private Evening evening2;

        Evening2Case(Evening evening2) {
            this.evening2 = evening2;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.evening2(this.evening2);
        }

        @JsonCreator
        private Evening2Case(JsonNode jsonNode) throws IOException {
            this.evening2 = ApiHelper.deserialize(jsonNode,
                Evening.class);
        }

        @Override
        public String toString() {
            return evening2.toString();
        }
    }

    /**
     * This is a custom deserializer class for SendMultiLevelAnyofSessionCase1.
     */
    protected static class SendMultiLevelAnyofSessionCase1Deserializer
        extends JsonDeserializer<SendMultiLevelAnyofSessionCase1> {

        @Override
        public SendMultiLevelAnyofSessionCase1 deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(EveningCase.class,
                    Evening2Case.class), false);
        }
    }

}
