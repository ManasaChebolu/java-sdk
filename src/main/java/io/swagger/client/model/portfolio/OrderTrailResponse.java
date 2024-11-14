package io.swagger.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * OrderTrailResponse
 */

//@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-04T12:13:29.521089219Z[GMT]")

public class OrderTrailResponse {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private Long timestamp = null;

    @SerializedName("data")
    private OrderTrailData data = null;


    public OrderTrailResponse(String infoID, String infoMsg, Long timestamp, OrderTrailData data) {
        this.infoID = infoID;
        this.infoMsg = infoMsg;
        this.timestamp = timestamp;
        this.data = data;
    }

    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public OrderTrailData getData() {
        return data;
    }

    public void setData(OrderTrailData data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderTrailResponse that = (OrderTrailResponse) o;
        return Objects.equals(infoID, that.infoID) && Objects.equals(infoMsg, that.infoMsg) && Objects.equals(timestamp, that.timestamp) && Objects.equals(data, that.data);
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

    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }
}
