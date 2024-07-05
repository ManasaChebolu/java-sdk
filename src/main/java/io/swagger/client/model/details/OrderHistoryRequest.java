package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * OrderHistoryRequest
 */

public class OrderHistoryRequest {
    @SerializedName("instrument")
    private String instrument = null;

    @SerializedName("ordId")
    private String ordId = null;

    public OrderHistoryRequest instrument(String instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(example = "string", required = true, description = "")
    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public OrderHistoryRequest ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(example = "string", required = true, description = "")
    public String getOrdId() {
        return ordId;
    }

    public void setOrdId(String ordId) {
        this.ordId = ordId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderHistoryRequest orderHistoryRequest = (OrderHistoryRequest) o;
        return Objects.equals(this.instrument, orderHistoryRequest.instrument) &&
                Objects.equals(this.ordId, orderHistoryRequest.ordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instrument, ordId);
    }


    @Override
    public String toString() {

        return "class OrderHistoryRequest {\n" +
                "instrument: " + toIndentedString(instrument) + "\n" +
                "ordId: " + toIndentedString(ordId) + "\n" +
                "}";
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
