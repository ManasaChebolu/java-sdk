package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * OrderHistoryTrails
 */

public class OrderHistoryTrails {
    @SerializedName("symbol")
    private Symbol symbol = null;

    @SerializedName("ordAction")
    private String ordAction = null;

    @SerializedName("pendingQty")
    private BigDecimal pendingQty = null;

    @SerializedName("triggerPrice")
    private BigDecimal triggerPrice = null;

    @SerializedName("limitPrice")
    private BigDecimal limitPrice = null;

    @SerializedName("avgPrice")
    private BigDecimal avgPrice = null;

    @SerializedName("disQty")
    private BigDecimal disQty = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("ordDesc")
    private String ordDesc = null;

    @SerializedName("ordValidity")
    private String ordValidity = null;

    @SerializedName("currentOrdStatus")
    private String currentOrdStatus = null;

    @SerializedName("exc")
    private String exc = null;

    @SerializedName("tradedQty")
    private BigDecimal tradedQty = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    @SerializedName("price")
    private BigDecimal price = null;

    @SerializedName("qty")
    private BigDecimal qty = null;

    @SerializedName("prdType")
    private String prdType = null;

    @SerializedName("exchOrdId")
    private String exchOrdId = null;

    @SerializedName("lupdateDateTime")
    private String lupdateDateTime = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    @SerializedName("ordType")
    private String ordType = null;

    @SerializedName("status")
    private String status = null;

    public OrderHistoryTrails symbol(Symbol symbol) {
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

    public OrderHistoryTrails ordAction(String ordAction) {
        this.ordAction = ordAction;
        return this;
    }

    /**
     * Get ordAction
     *
     * @return ordAction
     **/
    @Schema(description = "")
    public String getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(String ordAction) {
        this.ordAction = ordAction;
    }

    public OrderHistoryTrails pendingQty(BigDecimal pendingQty) {
        this.pendingQty = pendingQty;
        return this;
    }

    /**
     * Get pendingQty
     *
     * @return pendingQty
     **/
    @Schema(description = "")
    public BigDecimal getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(BigDecimal pendingQty) {
        this.pendingQty = pendingQty;
    }

    public OrderHistoryTrails triggerPrice(BigDecimal triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(description = "")
    public BigDecimal getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(BigDecimal triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public OrderHistoryTrails limitPrice(BigDecimal limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Get limitPrice
     *
     * @return limitPrice
     **/
    @Schema(description = "")
    public BigDecimal getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(BigDecimal limitPrice) {
        this.limitPrice = limitPrice;
    }

    public OrderHistoryTrails avgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
        return this;
    }

    /**
     * Get avgPrice
     *
     * @return avgPrice
     **/
    @Schema(description = "")
    public BigDecimal getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(BigDecimal avgPrice) {
        this.avgPrice = avgPrice;
    }

    public OrderHistoryTrails disQty(BigDecimal disQty) {
        this.disQty = disQty;
        return this;
    }

    /**
     * Get disQty
     *
     * @return disQty
     **/
    @Schema(description = "")
    public BigDecimal getDisQty() {
        return disQty;
    }

    public void setDisQty(BigDecimal disQty) {
        this.disQty = disQty;
    }

    public OrderHistoryTrails ordId(String ordId) {
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

    public OrderHistoryTrails ordDesc(String ordDesc) {
        this.ordDesc = ordDesc;
        return this;
    }

    /**
     * Get ordDesc
     *
     * @return ordDesc
     **/
    @Schema(description = "")
    public String getOrdDesc() {
        return ordDesc;
    }

    public void setOrdDesc(String ordDesc) {
        this.ordDesc = ordDesc;
    }

    public OrderHistoryTrails ordValidity(String ordValidity) {
        this.ordValidity = ordValidity;
        return this;
    }

    /**
     * Get ordValidity
     *
     * @return ordValidity
     **/
    @Schema(description = "")
    public String getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(String ordValidity) {
        this.ordValidity = ordValidity;
    }

    public OrderHistoryTrails currentOrdStatus(String currentOrdStatus) {
        this.currentOrdStatus = currentOrdStatus;
        return this;
    }

    /**
     * Get currentOrdStatus
     *
     * @return currentOrdStatus
     **/
    @Schema(description = "")
    public String getCurrentOrdStatus() {
        return currentOrdStatus;
    }

    public void setCurrentOrdStatus(String currentOrdStatus) {
        this.currentOrdStatus = currentOrdStatus;
    }

    public OrderHistoryTrails exc(String exc) {
        this.exc = exc;
        return this;
    }

    /**
     * Get exc
     *
     * @return exc
     **/
    @Schema(description = "")
    public String getExc() {
        return exc;
    }

    public void setExc(String exc) {
        this.exc = exc;
    }

    public OrderHistoryTrails tradedQty(BigDecimal tradedQty) {
        this.tradedQty = tradedQty;
        return this;
    }

    /**
     * Get tradedQty
     *
     * @return tradedQty
     **/
    @Schema(description = "")
    public BigDecimal getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(BigDecimal tradedQty) {
        this.tradedQty = tradedQty;
    }

    public OrderHistoryTrails rejReason(String rejReason) {
        this.rejReason = rejReason;
        return this;
    }

    /**
     * Get rejReason
     *
     * @return rejReason
     **/
    @Schema(description = "")
    public String getRejReason() {
        return rejReason;
    }

    public void setRejReason(String rejReason) {
        this.rejReason = rejReason;
    }

    public OrderHistoryTrails price(BigDecimal price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(description = "")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OrderHistoryTrails qty(BigDecimal qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(description = "")
    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public OrderHistoryTrails prdType(String prdType) {
        this.prdType = prdType;
        return this;
    }

    /**
     * Get prdType
     *
     * @return prdType
     **/
    @Schema(description = "")
    public String getPrdType() {
        return prdType;
    }

    public void setPrdType(String prdType) {
        this.prdType = prdType;
    }

    public OrderHistoryTrails exchOrdId(String exchOrdId) {
        this.exchOrdId = exchOrdId;
        return this;
    }

    /**
     * Get exchOrdId
     *
     * @return exchOrdId
     **/
    @Schema(description = "")
    public String getExchOrdId() {
        return exchOrdId;
    }

    public void setExchOrdId(String exchOrdId) {
        this.exchOrdId = exchOrdId;
    }

    public OrderHistoryTrails lupdateDateTime(String lupdateDateTime) {
        this.lupdateDateTime = lupdateDateTime;
        return this;
    }

    /**
     * Get lupdateDateTime
     *
     * @return lupdateDateTime
     **/
    @Schema(description = "")
    public String getLupdateDateTime() {
        return lupdateDateTime;
    }

    public void setLupdateDateTime(String lupdateDateTime) {
        this.lupdateDateTime = lupdateDateTime;
    }

    public OrderHistoryTrails modifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
        return this;
    }

    /**
     * Get modifiedBy
     *
     * @return modifiedBy
     **/
    @Schema(description = "")
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public OrderHistoryTrails ordType(String ordType) {
        this.ordType = ordType;
        return this;
    }

    /**
     * Get ordType
     *
     * @return ordType
     **/
    @Schema(description = "")
    public String getOrdType() {
        return ordType;
    }

    public void setOrdType(String ordType) {
        this.ordType = ordType;
    }

    public OrderHistoryTrails status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderHistoryTrails orderHistoryTrails = (OrderHistoryTrails) o;
        return Objects.equals(this.symbol, orderHistoryTrails.symbol) &&
                Objects.equals(this.ordAction, orderHistoryTrails.ordAction) &&
                Objects.equals(this.pendingQty, orderHistoryTrails.pendingQty) &&
                Objects.equals(this.triggerPrice, orderHistoryTrails.triggerPrice) &&
                Objects.equals(this.limitPrice, orderHistoryTrails.limitPrice) &&
                Objects.equals(this.avgPrice, orderHistoryTrails.avgPrice) &&
                Objects.equals(this.disQty, orderHistoryTrails.disQty) &&
                Objects.equals(this.ordId, orderHistoryTrails.ordId) &&
                Objects.equals(this.ordDesc, orderHistoryTrails.ordDesc) &&
                Objects.equals(this.ordValidity, orderHistoryTrails.ordValidity) &&
                Objects.equals(this.currentOrdStatus, orderHistoryTrails.currentOrdStatus) &&
                Objects.equals(this.exc, orderHistoryTrails.exc) &&
                Objects.equals(this.tradedQty, orderHistoryTrails.tradedQty) &&
                Objects.equals(this.rejReason, orderHistoryTrails.rejReason) &&
                Objects.equals(this.price, orderHistoryTrails.price) &&
                Objects.equals(this.qty, orderHistoryTrails.qty) &&
                Objects.equals(this.prdType, orderHistoryTrails.prdType) &&
                Objects.equals(this.exchOrdId, orderHistoryTrails.exchOrdId) &&
                Objects.equals(this.lupdateDateTime, orderHistoryTrails.lupdateDateTime) &&
                Objects.equals(this.modifiedBy, orderHistoryTrails.modifiedBy) &&
                Objects.equals(this.ordType, orderHistoryTrails.ordType) &&
                Objects.equals(this.status, orderHistoryTrails.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, ordAction, pendingQty, triggerPrice, limitPrice, avgPrice, disQty, ordId, ordDesc, ordValidity, currentOrdStatus, exc, tradedQty, rejReason, price, qty, prdType, exchOrdId, lupdateDateTime, modifiedBy, ordType, status);
    }


    @Override
    public String toString() {

        return "class OrderHistoryTrails {\n" +
                "symbol: " + toIndentedString(symbol) + "\n" +
                "ordAction: " + toIndentedString(ordAction) + "\n" +
                "pendingQty: " + toIndentedString(pendingQty) + "\n" +
                "triggerPrice: " + toIndentedString(triggerPrice) + "\n" +
                "limitPrice: " + toIndentedString(limitPrice) + "\n" +
                "avgPrice: " + toIndentedString(avgPrice) + "\n" +
                "disQty: " + toIndentedString(disQty) + "\n" +
                "ordId: " + toIndentedString(ordId) + "\n" +
                "ordDesc: " + toIndentedString(ordDesc) + "\n" +
                "ordValidity: " + toIndentedString(ordValidity) + "\n" +
                "currentOrdStatus: " + toIndentedString(currentOrdStatus) + "\n" +
                "exc: " + toIndentedString(exc) + "\n" +
                "tradedQty: " + toIndentedString(tradedQty) + "\n" +
                "rejReason: " + toIndentedString(rejReason) + "\n" +
                "price: " + toIndentedString(price) + "\n" +
                "qty: " + toIndentedString(qty) + "\n" +
                "prdType: " + toIndentedString(prdType) + "\n" +
                "exchOrdId: " + toIndentedString(exchOrdId) + "\n" +
                "lupdateDateTime: " + toIndentedString(lupdateDateTime) + "\n" +
                "modifiedBy: " + toIndentedString(modifiedBy) + "\n" +
                "ordType: " + toIndentedString(ordType) + "\n" +
                "status: " + toIndentedString(status) + "\n" +
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
