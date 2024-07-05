package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TradeDetailsSuccess
 */

public class TradeDetailsSuccess {
    @SerializedName("infoid")
    private String infoid = null;

    @SerializedName("data")
    private List<TradeDetailsData> data = new ArrayList<TradeDetailsData>();

    @SerializedName("infomsg")
    private String infomsg = null;

    @SerializedName("timestamp")
    private BigDecimal timestamp = null;

    public TradeDetailsSuccess infoid(String infoid) {
        this.infoid = infoid;
        return this;
    }

    /**
     * Get infoid
     *
     * @return infoid
     **/
    @Schema(description = "")
    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid;
    }

    public TradeDetailsSuccess data(List<TradeDetailsData> data) {
        this.data = data;
        return this;
    }

    public TradeDetailsSuccess addDataItem(TradeDetailsData dataItem) {
        this.data.add(dataItem);
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(required = true, description = "")
    public List<TradeDetailsData> getData() {
        return data;
    }

    public void setData(List<TradeDetailsData> data) {
        this.data = data;
    }

    public TradeDetailsSuccess infomsg(String infomsg) {
        this.infomsg = infomsg;
        return this;
    }

    /**
     * Get infomsg
     *
     * @return infomsg
     **/
    @Schema(required = true, description = "")
    public String getInfomsg() {
        return infomsg;
    }

    public void setInfomsg(String infomsg) {
        this.infomsg = infomsg;
    }

    public TradeDetailsSuccess timestamp(BigDecimal timestamp) {
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


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TradeDetailsSuccess tradeDetailsSuccess = (TradeDetailsSuccess) o;
        return Objects.equals(this.infoid, tradeDetailsSuccess.infoid) &&
                Objects.equals(this.data, tradeDetailsSuccess.data) &&
                Objects.equals(this.infomsg, tradeDetailsSuccess.infomsg) &&
                Objects.equals(this.timestamp, tradeDetailsSuccess.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoid, data, infomsg, timestamp);
    }


    @Override
    public String toString() {

        return "class TradeDetailsSuccess {\n" +
                "infoid: " + toIndentedString(infoid) + "\n" +
                "data: " + toIndentedString(data) + "\n" +
                "infomsg: " + toIndentedString(infomsg) + "\n" +
                "timestamp: " + toIndentedString(timestamp) + "\n" +
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
