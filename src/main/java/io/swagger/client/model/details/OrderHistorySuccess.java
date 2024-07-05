package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * OrderHistorySuccess
 */

public class OrderHistorySuccess {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private BigDecimal timestamp = null;

    @SerializedName("data")
    private OrderHistoryData data = null;

    public OrderHistorySuccess infoID(String infoID) {
        this.infoID = infoID;
        return this;
    }

    /**
     * Get infoID
     *
     * @return infoID
     **/
    @Schema(required = true, description = "")
    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public OrderHistorySuccess infoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
        return this;
    }

    /**
     * Get infoMsg
     *
     * @return infoMsg
     **/
    @Schema(required = true, description = "")
    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public OrderHistorySuccess timestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @Schema(required = true, description = "")
    public BigDecimal getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(BigDecimal timestamp) {
        this.timestamp = timestamp;
    }

    public OrderHistorySuccess data(OrderHistoryData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(required = true, description = "")
    public OrderHistoryData getData() {
        return data;
    }

    public void setData(OrderHistoryData data) {
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
        OrderHistorySuccess orderHistorySuccess = (OrderHistorySuccess) o;
        return Objects.equals(this.infoID, orderHistorySuccess.infoID) &&
                Objects.equals(this.infoMsg, orderHistorySuccess.infoMsg) &&
                Objects.equals(this.timestamp, orderHistorySuccess.timestamp) &&
                Objects.equals(this.data, orderHistorySuccess.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, infoMsg, timestamp, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderHistorySuccess {\n");

        sb.append("    infoID: ").append(toIndentedString(infoID)).append("\n");
        sb.append("    infoMsg: ").append(toIndentedString(infoMsg)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("}");
        return sb.toString();
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
