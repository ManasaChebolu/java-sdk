package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * IntradaySuccessData
 */

public class IntradaySuccessData {
    @SerializedName("exchangeInstrumentID")
    private String exchangeInstrumentID = null;

    @SerializedName("prevDataAvailableTime")
    private String prevDataAvailableTime = null;

    @SerializedName("optionChainDetails")
    private String optionChainDetails = null;

    @SerializedName("exchange")
    private String exchange = null;

    @SerializedName("intradayData")
    private String intradayData = null;

    public IntradaySuccessData exchangeInstrumentID(String exchangeInstrumentID) {
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

    public IntradaySuccessData prevDataAvailableTime(String prevDataAvailableTime) {
        this.prevDataAvailableTime = prevDataAvailableTime;
        return this;
    }

    /**
     * Get prevDataAvailableTime
     *
     * @return prevDataAvailableTime
     **/
    @Schema(description = "")
    public String getPrevDataAvailableTime() {
        return prevDataAvailableTime;
    }

    public void setPrevDataAvailableTime(String prevDataAvailableTime) {
        this.prevDataAvailableTime = prevDataAvailableTime;
    }

    public IntradaySuccessData optionChainDetails(String optionChainDetails) {
        this.optionChainDetails = optionChainDetails;
        return this;
    }

    /**
     * Get optionChainDetails
     *
     * @return optionChainDetails
     **/
    @Schema(description = "")
    public String getOptionChainDetails() {
        return optionChainDetails;
    }

    public void setOptionChainDetails(String optionChainDetails) {
        this.optionChainDetails = optionChainDetails;
    }

    public IntradaySuccessData exchange(String exchange) {
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

    public IntradaySuccessData intradayData(String intradayData) {
        this.intradayData = intradayData;
        return this;
    }

    /**
     * Get intradayData
     *
     * @return intradayData
     **/
    @Schema(description = "")
    public String getIntradayData() {
        return intradayData;
    }

    public void setIntradayData(String intradayData) {
        this.intradayData = intradayData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntradaySuccessData intradaySuccessData = (IntradaySuccessData) o;
        return Objects.equals(this.exchangeInstrumentID, intradaySuccessData.exchangeInstrumentID) &&
                Objects.equals(this.prevDataAvailableTime, intradaySuccessData.prevDataAvailableTime) &&
                Objects.equals(this.optionChainDetails, intradaySuccessData.optionChainDetails) &&
                Objects.equals(this.exchange, intradaySuccessData.exchange) &&
                Objects.equals(this.intradayData, intradaySuccessData.intradayData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchangeInstrumentID, prevDataAvailableTime, optionChainDetails, exchange, intradayData);
    }


    @Override
    public String toString() {

        return "class IntradaySuccessData {\n" +
                "    exchangeInstrumentID: " + toIndentedString(exchangeInstrumentID) + "\n" +
                "    prevDataAvailableTime: " + toIndentedString(prevDataAvailableTime) + "\n" +
                "    optionChainDetails: " + toIndentedString(optionChainDetails) + "\n" +
                "    exchange: " + toIndentedString(exchange) + "\n" +
                "    intradayData: " + toIndentedString(intradayData) + "\n" +
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
