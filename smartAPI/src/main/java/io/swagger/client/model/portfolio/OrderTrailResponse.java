package io.swagger.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * OrderTrailResponse
 */

@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-04T12:13:29.521089219Z[GMT]")

public class OrderTrailResponse {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    @SerializedName("data")
    private OrderTrailData data = null;

    public OrderTrailResponse infoID(String infoID) {
        this.infoID = infoID;
        return this;
    }

    /**
     * Get infoID
     *
     * @return infoID
     **/
    @Schema(description = "")
    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public OrderTrailResponse infoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
        return this;
    }

    /**
     * Get infoMsg
     *
     * @return infoMsg
     **/
    @Schema(description = "")
    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public OrderTrailResponse timestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @Schema(description = "")
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public OrderTrailResponse data(OrderTrailData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public OrderTrailData getData() {
        return data;
    }

    public void setData(OrderTrailData data) {
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
        OrderTrailResponse orderTrailResponse = (OrderTrailResponse) o;
        return Objects.equals(this.infoID, orderTrailResponse.infoID) &&
                Objects.equals(this.infoMsg, orderTrailResponse.infoMsg) &&
                Objects.equals(this.timestamp, orderTrailResponse.timestamp) &&
                Objects.equals(this.data, orderTrailResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, infoMsg, timestamp, data);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrailResponse {\n");

        sb.append("infoID: ").append(toIndentedString(infoID)).append("\n");
        sb.append("infoMsg: ").append(toIndentedString(infoMsg)).append("\n");
        sb.append("timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("data: ").append(toIndentedString(data)).append("\n");
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
