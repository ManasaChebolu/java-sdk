package io.swagger.client.model.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * CancelOrderData
 */

//@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-04T12:13:22.976497502Z[GMT]")

public class CancelOrderData {
    @SerializedName("ordId")
    private String ordId = null;

    public CancelOrderData ordId(String ordId) {
        this.ordId = ordId;
        return this;
    }

    /**
     * Get ordId
     *
     * @return ordId
     **/
    @Schema(description = "")
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
        CancelOrderData cancelOrderData = (CancelOrderData) o;
        return Objects.equals(this.ordId, cancelOrderData.ordId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ordId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelOrderData {\n");

        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
