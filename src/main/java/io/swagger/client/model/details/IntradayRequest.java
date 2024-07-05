package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * IntradayRequest
 */

public class IntradayRequest {
    @SerializedName("data")
    private IntradayData data = null;

    public IntradayRequest data(IntradayData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public IntradayData getData() {
        return data;
    }

    public void setData(IntradayData data) {
        this.data = data;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntradayRequest intradayRequest = (IntradayRequest) o;
        return Objects.equals(this.data, intradayRequest.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }


    @Override
    public String toString() {

        return "class IntradayRequest {\n" +
                "data: " + toIndentedString(data) + "\n" +
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