package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * PlReportItem
 */

public class PlReportItem {
    @SerializedName("symbol")
    private Symbol symbol = null;

    @SerializedName("clientName")
    private String clientName = null;

    @SerializedName("buyDate")
    private String buyDate = null;

    @SerializedName("expiryDate")
    private String expiryDate = null;

    @SerializedName("intraDayPL")
    private String intraDayPL = null;

    @SerializedName("openCost")
    private String openCost = null;

    @SerializedName("sellValue")
    private String sellValue = null;

    @SerializedName("scripCode")
    private String scripCode = null;

    @SerializedName("buyValue")
    private String buyValue = null;

    @SerializedName("buyRate")
    private String buyRate = null;

    @SerializedName("scripName")
    private String scripName = null;

    @SerializedName("openRate")
    private String openRate = null;

    @SerializedName("realisedPLFutures")
    private String realisedPLFutures = null;

    @SerializedName("longTermPL")
    private String longTermPL = null;

    @SerializedName("callPut")
    private String callPut = null;

    @SerializedName("realisedPLTotal")
    private String realisedPLTotal = null;

    @SerializedName("unrealisedPLOptions")
    private String unrealisedPLOptions = null;

    @SerializedName("realisedPLOptions")
    private String realisedPLOptions = null;

    @SerializedName("unrealisedPLFutures")
    private String unrealisedPLFutures = null;

    @SerializedName("segmentName")
    private String segmentName = null;

    @SerializedName("sellQty")
    private String sellQty = null;

    @SerializedName("sellRate")
    private String sellRate = null;

    @SerializedName("buyQty")
    private String buyQty = null;

    @SerializedName("productCode")
    private String productCode = null;

    @SerializedName("productTypeShort")
    private String productTypeShort = null;

    @SerializedName("clientCode")
    private String clientCode = null;

    @SerializedName("shortTermPL")
    private String shortTermPL = null;

    @SerializedName("openQty")
    private String openQty = null;

    @SerializedName("sellDate")
    private String sellDate = null;

    @SerializedName("unrealisedPLTotal")
    private String unrealisedPLTotal = null;

    @SerializedName("openDate")
    private String openDate = null;

    @SerializedName("strikePrice")
    private String strikePrice = null;

    @SerializedName("isin")
    private String isin = null;

    public PlReportItem symbol(Symbol symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(description = "")
    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlReportItem clientName(String clientName) {
        this.clientName = clientName;
        return this;
    }

    /**
     * Get clientName
     *
     * @return clientName
     **/
    @Schema(example = "RAHULKUMAR  SUTHAR", description = "")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public PlReportItem buyDate(String buyDate) {
        this.buyDate = buyDate;
        return this;
    }

    /**
     * Get buyDate
     *
     * @return buyDate
     **/
    @Schema(example = "05 Dec 2023", description = "")
    public String getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(String buyDate) {
        this.buyDate = buyDate;
    }

    public PlReportItem expiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get expiryDate
     *
     * @return expiryDate
     **/
    @Schema(description = "")
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public PlReportItem intraDayPL(String intraDayPL) {
        this.intraDayPL = intraDayPL;
        return this;
    }

    /**
     * Get intraDayPL
     *
     * @return intraDayPL
     **/
    @Schema(example = "-", description = "")
    public String getIntraDayPL() {
        return intraDayPL;
    }

    public void setIntraDayPL(String intraDayPL) {
        this.intraDayPL = intraDayPL;
    }

    public PlReportItem openCost(String openCost) {
        this.openCost = openCost;
        return this;
    }

    /**
     * Get openCost
     *
     * @return openCost
     **/
    @Schema(example = "0.0", description = "")
    public String getOpenCost() {
        return openCost;
    }

    public void setOpenCost(String openCost) {
        this.openCost = openCost;
    }

    public PlReportItem sellValue(String sellValue) {
        this.sellValue = sellValue;
        return this;
    }

    /**
     * Get sellValue
     *
     * @return sellValue
     **/
    @Schema(example = "18500.2494", description = "")
    public String getSellValue() {
        return sellValue;
    }

    public void setSellValue(String sellValue) {
        this.sellValue = sellValue;
    }

    public PlReportItem scripCode(String scripCode) {
        this.scripCode = scripCode;
        return this;
    }

    /**
     * Get scripCode
     *
     * @return scripCode
     **/
    @Schema(example = "500875", description = "")
    public String getScripCode() {
        return scripCode;
    }

    public void setScripCode(String scripCode) {
        this.scripCode = scripCode;
    }

    public PlReportItem buyValue(String buyValue) {
        this.buyValue = buyValue;
        return this;
    }

    /**
     * Get buyValue
     *
     * @return buyValue
     **/
    @Schema(example = "18271.7398", description = "")
    public String getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(String buyValue) {
        this.buyValue = buyValue;
    }

    public PlReportItem buyRate(String buyRate) {
        this.buyRate = buyRate;
        return this;
    }

    /**
     * Get buyRate
     *
     * @return buyRate
     **/
    @Schema(example = "456.7935", description = "")
    public String getBuyRate() {
        return buyRate;
    }

    public void setBuyRate(String buyRate) {
        this.buyRate = buyRate;
    }

    public PlReportItem scripName(String scripName) {
        this.scripName = scripName;
        return this;
    }

    /**
     * Get scripName
     *
     * @return scripName
     **/
    @Schema(example = "ITC LTD.", description = "")
    public String getScripName() {
        return scripName;
    }

    public void setScripName(String scripName) {
        this.scripName = scripName;
    }

    public PlReportItem openRate(String openRate) {
        this.openRate = openRate;
        return this;
    }

    /**
     * Get openRate
     *
     * @return openRate
     **/
    @Schema(example = "0.0", description = "")
    public String getOpenRate() {
        return openRate;
    }

    public void setOpenRate(String openRate) {
        this.openRate = openRate;
    }

    public PlReportItem realisedPLFutures(String realisedPLFutures) {
        this.realisedPLFutures = realisedPLFutures;
        return this;
    }

    /**
     * Get realisedPLFutures
     *
     * @return realisedPLFutures
     **/
    @Schema(example = "-", description = "")
    public String getRealisedPLFutures() {
        return realisedPLFutures;
    }

    public void setRealisedPLFutures(String realisedPLFutures) {
        this.realisedPLFutures = realisedPLFutures;
    }

    public PlReportItem longTermPL(String longTermPL) {
        this.longTermPL = longTermPL;
        return this;
    }

    /**
     * Get longTermPL
     *
     * @return longTermPL
     **/
    @Schema(example = "-", description = "")
    public String getLongTermPL() {
        return longTermPL;
    }

    public void setLongTermPL(String longTermPL) {
        this.longTermPL = longTermPL;
    }

    public PlReportItem callPut(String callPut) {
        this.callPut = callPut;
        return this;
    }

    /**
     * Get callPut
     *
     * @return callPut
     **/
    @Schema(description = "")
    public String getCallPut() {
        return callPut;
    }

    public void setCallPut(String callPut) {
        this.callPut = callPut;
    }

    public PlReportItem realisedPLTotal(String realisedPLTotal) {
        this.realisedPLTotal = realisedPLTotal;
        return this;
    }

    /**
     * Get realisedPLTotal
     *
     * @return realisedPLTotal
     **/
    @Schema(example = "-", description = "")
    public String getRealisedPLTotal() {
        return realisedPLTotal;
    }

    public void setRealisedPLTotal(String realisedPLTotal) {
        this.realisedPLTotal = realisedPLTotal;
    }

    public PlReportItem unrealisedPLOptions(String unrealisedPLOptions) {
        this.unrealisedPLOptions = unrealisedPLOptions;
        return this;
    }

    /**
     * Get unrealisedPLOptions
     *
     * @return unrealisedPLOptions
     **/
    @Schema(example = "-", description = "")
    public String getUnrealisedPLOptions() {
        return unrealisedPLOptions;
    }

    public void setUnrealisedPLOptions(String unrealisedPLOptions) {
        this.unrealisedPLOptions = unrealisedPLOptions;
    }

    public PlReportItem realisedPLOptions(String realisedPLOptions) {
        this.realisedPLOptions = realisedPLOptions;
        return this;
    }

    /**
     * Get realisedPLOptions
     *
     * @return realisedPLOptions
     **/
    @Schema(example = "-", description = "")
    public String getRealisedPLOptions() {
        return realisedPLOptions;
    }

    public void setRealisedPLOptions(String realisedPLOptions) {
        this.realisedPLOptions = realisedPLOptions;
    }

    public PlReportItem unrealisedPLFutures(String unrealisedPLFutures) {
        this.unrealisedPLFutures = unrealisedPLFutures;
        return this;
    }

    /**
     * Get unrealisedPLFutures
     *
     * @return unrealisedPLFutures
     **/
    @Schema(example = "-", description = "")
    public String getUnrealisedPLFutures() {
        return unrealisedPLFutures;
    }

    public void setUnrealisedPLFutures(String unrealisedPLFutures) {
        this.unrealisedPLFutures = unrealisedPLFutures;
    }

    public PlReportItem segmentName(String segmentName) {
        this.segmentName = segmentName;
        return this;
    }

    /**
     * Get segmentName
     *
     * @return segmentName
     **/
    @Schema(example = "Equity", description = "")
    public String getSegmentName() {
        return segmentName;
    }

    public void setSegmentName(String segmentName) {
        this.segmentName = segmentName;
    }

    public PlReportItem sellQty(String sellQty) {
        this.sellQty = sellQty;
        return this;
    }

    /**
     * Get sellQty
     *
     * @return sellQty
     **/
    @Schema(example = "40", description = "")
    public String getSellQty() {
        return sellQty;
    }

    public void setSellQty(String sellQty) {
        this.sellQty = sellQty;
    }

    public PlReportItem sellRate(String sellRate) {
        this.sellRate = sellRate;
        return this;
    }

    /**
     * Get sellRate
     *
     * @return sellRate
     **/
    @Schema(example = "462.5062", description = "")
    public String getSellRate() {
        return sellRate;
    }

    public void setSellRate(String sellRate) {
        this.sellRate = sellRate;
    }

    public PlReportItem buyQty(String buyQty) {
        this.buyQty = buyQty;
        return this;
    }

    /**
     * Get buyQty
     *
     * @return buyQty
     **/
    @Schema(example = "40", description = "")
    public String getBuyQty() {
        return buyQty;
    }

    public void setBuyQty(String buyQty) {
        this.buyQty = buyQty;
    }

    public PlReportItem productCode(String productCode) {
        this.productCode = productCode;
        return this;
    }

    /**
     * Get productCode
     *
     * @return productCode
     **/
    @Schema(description = "")
    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public PlReportItem productTypeShort(String productTypeShort) {
        this.productTypeShort = productTypeShort;
        return this;
    }

    /**
     * Get productTypeShort
     *
     * @return productTypeShort
     **/
    @Schema(description = "")
    public String getProductTypeShort() {
        return productTypeShort;
    }

    public void setProductTypeShort(String productTypeShort) {
        this.productTypeShort = productTypeShort;
    }

    public PlReportItem clientCode(String clientCode) {
        this.clientCode = clientCode;
        return this;
    }

    /**
     * Get clientCode
     *
     * @return clientCode
     **/
    @Schema(example = "156339534", description = "")
    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public PlReportItem shortTermPL(String shortTermPL) {
        this.shortTermPL = shortTermPL;
        return this;
    }

    /**
     * Get shortTermPL
     *
     * @return shortTermPL
     **/
    @Schema(example = "228.51", description = "")
    public String getShortTermPL() {
        return shortTermPL;
    }

    public void setShortTermPL(String shortTermPL) {
        this.shortTermPL = shortTermPL;
    }

    public PlReportItem openQty(String openQty) {
        this.openQty = openQty;
        return this;
    }

    /**
     * Get openQty
     *
     * @return openQty
     **/
    @Schema(example = "0.0", description = "")
    public String getOpenQty() {
        return openQty;
    }

    public void setOpenQty(String openQty) {
        this.openQty = openQty;
    }

    public PlReportItem sellDate(String sellDate) {
        this.sellDate = sellDate;
        return this;
    }

    /**
     * Get sellDate
     *
     * @return sellDate
     **/
    @Schema(example = "06 Dec 2023", description = "")
    public String getSellDate() {
        return sellDate;
    }

    public void setSellDate(String sellDate) {
        this.sellDate = sellDate;
    }

    public PlReportItem unrealisedPLTotal(String unrealisedPLTotal) {
        this.unrealisedPLTotal = unrealisedPLTotal;
        return this;
    }

    /**
     * Get unrealisedPLTotal
     *
     * @return unrealisedPLTotal
     **/
    @Schema(example = "-", description = "")
    public String getUnrealisedPLTotal() {
        return unrealisedPLTotal;
    }

    public void setUnrealisedPLTotal(String unrealisedPLTotal) {
        this.unrealisedPLTotal = unrealisedPLTotal;
    }

    public PlReportItem openDate(String openDate) {
        this.openDate = openDate;
        return this;
    }

    /**
     * Get openDate
     *
     * @return openDate
     **/
    @Schema(description = "")
    public String getOpenDate() {
        return openDate;
    }

    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    public PlReportItem strikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
        return this;
    }

    /**
     * Get strikePrice
     *
     * @return strikePrice
     **/
    @Schema(description = "")
    public String getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
    }

    public PlReportItem isin(String isin) {
        this.isin = isin;
        return this;
    }

    /**
     * Get isin
     *
     * @return isin
     **/
    @Schema(example = "INE154A01025", description = "")
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlReportItem plReportItem = (PlReportItem) o;
        return Objects.equals(this.symbol, plReportItem.symbol) &&
                Objects.equals(this.clientName, plReportItem.clientName) &&
                Objects.equals(this.buyDate, plReportItem.buyDate) &&
                Objects.equals(this.expiryDate, plReportItem.expiryDate) &&
                Objects.equals(this.intraDayPL, plReportItem.intraDayPL) &&
                Objects.equals(this.openCost, plReportItem.openCost) &&
                Objects.equals(this.sellValue, plReportItem.sellValue) &&
                Objects.equals(this.scripCode, plReportItem.scripCode) &&
                Objects.equals(this.buyValue, plReportItem.buyValue) &&
                Objects.equals(this.buyRate, plReportItem.buyRate) &&
                Objects.equals(this.scripName, plReportItem.scripName) &&
                Objects.equals(this.openRate, plReportItem.openRate) &&
                Objects.equals(this.realisedPLFutures, plReportItem.realisedPLFutures) &&
                Objects.equals(this.longTermPL, plReportItem.longTermPL) &&
                Objects.equals(this.callPut, plReportItem.callPut) &&
                Objects.equals(this.realisedPLTotal, plReportItem.realisedPLTotal) &&
                Objects.equals(this.unrealisedPLOptions, plReportItem.unrealisedPLOptions) &&
                Objects.equals(this.realisedPLOptions, plReportItem.realisedPLOptions) &&
                Objects.equals(this.unrealisedPLFutures, plReportItem.unrealisedPLFutures) &&
                Objects.equals(this.segmentName, plReportItem.segmentName) &&
                Objects.equals(this.sellQty, plReportItem.sellQty) &&
                Objects.equals(this.sellRate, plReportItem.sellRate) &&
                Objects.equals(this.buyQty, plReportItem.buyQty) &&
                Objects.equals(this.productCode, plReportItem.productCode) &&
                Objects.equals(this.productTypeShort, plReportItem.productTypeShort) &&
                Objects.equals(this.clientCode, plReportItem.clientCode) &&
                Objects.equals(this.shortTermPL, plReportItem.shortTermPL) &&
                Objects.equals(this.openQty, plReportItem.openQty) &&
                Objects.equals(this.sellDate, plReportItem.sellDate) &&
                Objects.equals(this.unrealisedPLTotal, plReportItem.unrealisedPLTotal) &&
                Objects.equals(this.openDate, plReportItem.openDate) &&
                Objects.equals(this.strikePrice, plReportItem.strikePrice) &&
                Objects.equals(this.isin, plReportItem.isin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, clientName, buyDate, expiryDate, intraDayPL, openCost, sellValue, scripCode, buyValue, buyRate, scripName, openRate, realisedPLFutures, longTermPL, callPut, realisedPLTotal, unrealisedPLOptions, realisedPLOptions, unrealisedPLFutures, segmentName, sellQty, sellRate, buyQty, productCode, productTypeShort, clientCode, shortTermPL, openQty, sellDate, unrealisedPLTotal, openDate, strikePrice, isin);
    }


    @Override
    public String toString() {

        return "class PlReportItem {\n" +
                "    symbol: " + toIndentedString(symbol) + "\n" +
                "    clientName: " + toIndentedString(clientName) + "\n" +
                "    buyDate: " + toIndentedString(buyDate) + "\n" +
                "    expiryDate: " + toIndentedString(expiryDate) + "\n" +
                "    intraDayPL: " + toIndentedString(intraDayPL) + "\n" +
                "    openCost: " + toIndentedString(openCost) + "\n" +
                "    sellValue: " + toIndentedString(sellValue) + "\n" +
                "    scripCode: " + toIndentedString(scripCode) + "\n" +
                "    buyValue: " + toIndentedString(buyValue) + "\n" +
                "    buyRate: " + toIndentedString(buyRate) + "\n" +
                "    scripName: " + toIndentedString(scripName) + "\n" +
                "    openRate: " + toIndentedString(openRate) + "\n" +
                "    realisedPLFutures: " + toIndentedString(realisedPLFutures) + "\n" +
                "    longTermPL: " + toIndentedString(longTermPL) + "\n" +
                "    callPut: " + toIndentedString(callPut) + "\n" +
                "    realisedPLTotal: " + toIndentedString(realisedPLTotal) + "\n" +
                "    unrealisedPLOptions: " + toIndentedString(unrealisedPLOptions) + "\n" +
                "    realisedPLOptions: " + toIndentedString(realisedPLOptions) + "\n" +
                "    unrealisedPLFutures: " + toIndentedString(unrealisedPLFutures) + "\n" +
                "    segmentName: " + toIndentedString(segmentName) + "\n" +
                "    sellQty: " + toIndentedString(sellQty) + "\n" +
                "    sellRate: " + toIndentedString(sellRate) + "\n" +
                "    buyQty: " + toIndentedString(buyQty) + "\n" +
                "    productCode: " + toIndentedString(productCode) + "\n" +
                "    productTypeShort: " + toIndentedString(productTypeShort) + "\n" +
                "    clientCode: " + toIndentedString(clientCode) + "\n" +
                "    shortTermPL: " + toIndentedString(shortTermPL) + "\n" +
                "    openQty: " + toIndentedString(openQty) + "\n" +
                "    sellDate: " + toIndentedString(sellDate) + "\n" +
                "    unrealisedPLTotal: " + toIndentedString(unrealisedPLTotal) + "\n" +
                "    openDate: " + toIndentedString(openDate) + "\n" +
                "    strikePrice: " + toIndentedString(strikePrice) + "\n" +
                "    isin: " + toIndentedString(isin) + "\n" +
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
