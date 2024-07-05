package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * IntradayData
 */

public class IntradayData {
    @SerializedName("exchangeInstrumentID")
    private String exchangeInstrumentID = null;

    @SerializedName("exchange")
    private String exchange = null;

    @SerializedName("startTime")
    private String startTime = null;

    @SerializedName("endTime")
    private String endTime = null;

    public IntradayData exchangeInstrumentID(String exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
        return this;
    }

    /**
     * Get exchangeInstrumentID
     *
     * @return exchangeInstrumentID
     **/
    @Schema(example = "25", description = "")
    public String getExchangeInstrumentID() {
        return exchangeInstrumentID;
    }

    public void setExchangeInstrumentID(String exchangeInstrumentID) {
        this.exchangeInstrumentID = exchangeInstrumentID;
    }

    public IntradayData exchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get exchange
     *
     * @return exchange
     **/
    @Schema(example = "NSE", description = "")
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public IntradayData startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get startTime
     *
     * @return startTime
     **/
    @Schema(example = "Mar 14 2024 150000", description = "")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public IntradayData endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get endTime
     *
     * @return endTime
     **/
    @Schema(example = "Mar 14 2024 161500", description = "")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntradayData intradayData = (IntradayData) o;
        return Objects.equals(this.exchangeInstrumentID, intradayData.exchangeInstrumentID) &&
                Objects.equals(this.exchange, intradayData.exchange) &&
                Objects.equals(this.startTime, intradayData.startTime) &&
                Objects.equals(this.endTime, intradayData.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchangeInstrumentID, exchange, startTime, endTime);
    }


    @Override
    public String toString() {

        return "class IntradayData {\n" +
                "    exchangeInstrumentID: " + toIndentedString(exchangeInstrumentID) + "\n" +
                "    exchange: " + toIndentedString(exchange) + "\n" +
                "    startTime: " + toIndentedString(startTime) + "\n" +
                "    endTime: " + toIndentedString(endTime) + "\n" +
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
