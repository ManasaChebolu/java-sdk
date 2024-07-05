package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * TradeDetailsRequest
 */

public class TradeDetailsRequest {
    @SerializedName("orderId")
    private String orderId = null;

    public TradeDetailsRequest orderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     **/
    @Schema(example = "240603000000063", description = "")
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TradeDetailsRequest tradeDetailsRequest = (TradeDetailsRequest) o;
        return Objects.equals(this.orderId, tradeDetailsRequest.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }


    @Override
    public String toString() {

        return "class TradeDetailsRequest {\n" +
                "orderId: " + toIndentedString(orderId) + "\n" +
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
