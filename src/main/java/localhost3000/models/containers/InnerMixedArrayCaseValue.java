/*
 * AnyOfScalarModelsLib
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

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = InnerMixedArrayCaseValue.InnerMixedArrayCaseValueDeserializer.class)
public abstract class InnerMixedArrayCaseValue {
    
    /**
     * Any-of type initialization method.
     * @param precision List of Double value for precision.
     * @return The PrecisionCase object.
     */
    public static InnerMixedArrayCaseValue fromPrecision(List<Double> precision) {
        return new PrecisionCase(precision);
    }

    /**
     * Any-of type initialization method.
     * @param mBoolean boolean value for mBoolean.
     * @return The MBooleanCase object.
     */
    public static InnerMixedArrayCaseValue fromMBoolean(boolean mBoolean) {
        return new MBooleanCase(mBoolean);
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
        R precision(List<Double> precision);

        R mBoolean(boolean mBoolean);
    }

    /**
     * This is a implementation class for PrecisionCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorsCaseMarker
    private static class PrecisionCase extends InnerMixedArrayCaseValue {

        @JsonValue
        private List<Double> precision;

        PrecisionCase(List<Double> precision) {
            this.precision = precision;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.precision(this.precision);
        }

        @JsonCreator
        private PrecisionCase(JsonNode jsonNode) throws IOException {
            this.precision = ApiHelper.deserializeArray(jsonNode,
                Double[].class);
        }

        @Override
        public String toString() {
            return precision.toString();
        }
    }

    /**
     * This is a implementation class for MBooleanCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorsCaseMarker
    private static class MBooleanCase extends InnerMixedArrayCaseValue {

        @JsonValue
        private boolean mBoolean;

        MBooleanCase(boolean mBoolean) {
            this.mBoolean = mBoolean;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mBoolean(this.mBoolean);
        }

        @JsonCreator
        private MBooleanCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isBoolean()) {
                this.mBoolean = ApiHelper.deserialize(jsonNode, Boolean.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(mBoolean);
        }
    }

    /**
     * This is a custom deserializer class for InnerMixedArrayCaseValue.
     */
    protected static class InnerMixedArrayCaseValueDeserializer
        extends JsonDeserializer<InnerMixedArrayCaseValue> {

        @Override
        public InnerMixedArrayCaseValue deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(PrecisionCase.class,
                    MBooleanCase.class), false);
        }
    }

}
