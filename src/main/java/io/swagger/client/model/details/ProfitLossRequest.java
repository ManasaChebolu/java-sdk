package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProfitLossRequest
 */

public class ProfitLossRequest {
    @SerializedName("data")
    private ProfitLossRequestData data = null;

    @SerializedName("appID")
    private String appID = null;

    public ProfitLossRequest data(ProfitLossRequestData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public ProfitLossRequestData getData() {
        return data;
    }

    public void setData(ProfitLossRequestData data) {
        this.data = data;
    }

    public ProfitLossRequest appID(String appID) {
        this.appID = appID;
        return this;
    }

    /**
     * Get appID
     *
     * @return appID
     **/
    @Schema(example = "123456789", description = "")
    public String getAppID() {
        return appID;
    }

    public void setAppID(String appID) {
        this.appID = appID;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfitLossRequest profitLossRequest = (ProfitLossRequest) o;
        return Objects.equals(this.data, profitLossRequest.data) &&
                Objects.equals(this.appID, profitLossRequest.appID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, appID);
    }


    @Override
    public String toString() {

        return "class ProfitLossRequest {\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    appID: " + toIndentedString(appID) + "\n" +
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
