package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * TradeDetailsData
 */

public class TradeDetailsData {
    @SerializedName("undAsset")
    private String undAsset = null;

    @SerializedName("excOrdTime")
    private String excOrdTime = null;

    @SerializedName("ordAction")
    private String ordAction = null;

    @SerializedName("cancelledQty")
    private String cancelledQty = null;

    @SerializedName("isAmo")
    private Boolean isAmo = null;

    @SerializedName("avgPrice")
    private String avgPrice = null;

    @SerializedName("exitable")
    private Boolean exitable = null;

    @SerializedName("companyName")
    private String companyName = null;

    @SerializedName("boOrdStatus")
    private String boOrdStatus = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("cancellable")
    private Boolean cancellable = null;

    @SerializedName("excToken")
    private String excToken = null;

    @SerializedName("optionType")
    private String optionType = null;

    @SerializedName("exc")
    private String exc = null;

    @SerializedName("ordDate")
    private String ordDate = null;

    @SerializedName("prdType")
    private String prdType = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    @SerializedName("baseSym")
    private String baseSym = null;

    @SerializedName("expiry")
    private String expiry = null;

    @SerializedName("modifiable")
    private Boolean modifiable = null;

    @SerializedName("ordStatus")
    private String ordStatus = null;

    @SerializedName("dispSym")
    private String dispSym = null;

    @SerializedName("ordDuration")
    private String ordDuration = null;

    @SerializedName("childType")
    private String childType = null;

    @SerializedName("instrumentType")
    private String instrumentType = null;

    @SerializedName("triggerPrice")
    private String triggerPrice = null;

    @SerializedName("limitPrice")
    private String limitPrice = null;

    @SerializedName("lotSize")
    private String lotSize = null;

    @SerializedName("multipleir")
    private String multipleir = null;

    @SerializedName("strike")
    private String strike = null;

    @SerializedName("disQty")
    private String disQty = null;

    @SerializedName("parOrdId")
    private String parOrdId = null;

    @SerializedName("mktPro")
    private String mktPro = null;

    @SerializedName("tradedQty")
    private String tradedQty = null;

    @SerializedName("remainQty")
    private String remainQty = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    @SerializedName("qty")
    private String qty = null;

    @SerializedName("exchOrdId")
    private String exchOrdId = null;

    @SerializedName("ordType")
    private String ordType = null;

    @SerializedName("remarks")
    private String remarks = null;

    @SerializedName("trSym")
    private String trSym = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("tradedPrice")
    private String tradedPrice = null;

    @SerializedName("exchTrdId")
    private String exchTrdId = null;

    @SerializedName("tradeTime")
    private String tradeTime = null;

    public TradeDetailsData undAsset(String undAsset) {
        this.undAsset = undAsset;
        return this;
    }

    /**
     * Get undAsset
     *
     * @return undAsset
     **/
    @Schema(description = "")
    public String getUndAsset() {
        return undAsset;
    }

    public void setUndAsset(String undAsset) {
        this.undAsset = undAsset;
    }

    public TradeDetailsData excOrdTime(String excOrdTime) {
        this.excOrdTime = excOrdTime;
        return this;
    }

    /**
     * Get excOrdTime
     *
     * @return excOrdTime
     **/
    @Schema(description = "")
    public String getExcOrdTime() {
        return excOrdTime;
    }

    public void setExcOrdTime(String excOrdTime) {
        this.excOrdTime = excOrdTime;
    }

    public TradeDetailsData ordAction(String ordAction) {
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

    public TradeDetailsData cancelledQty(String cancelledQty) {
        this.cancelledQty = cancelledQty;
        return this;
    }

    /**
     * Get cancelledQty
     *
     * @return cancelledQty
     **/
    @Schema(description = "")
    public String getCancelledQty() {
        return cancelledQty;
    }

    public void setCancelledQty(String cancelledQty) {
        this.cancelledQty = cancelledQty;
    }

    public TradeDetailsData isAmo(Boolean isAmo) {
        this.isAmo = isAmo;
        return this;
    }

    /**
     * Get isAmo
     *
     * @return isAmo
     **/
    @Schema(description = "")
    public Boolean isIsAmo() {
        return isAmo;
    }

    public void setIsAmo(Boolean isAmo) {
        this.isAmo = isAmo;
    }

    public TradeDetailsData avgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
        return this;
    }

    /**
     * Get avgPrice
     *
     * @return avgPrice
     **/
    @Schema(description = "")
    public String getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    public TradeDetailsData exitable(Boolean exitable) {
        this.exitable = exitable;
        return this;
    }

    /**
     * Get exitable
     *
     * @return exitable
     **/
    @Schema(description = "")
    public Boolean isExitable() {
        return exitable;
    }

    public void setExitable(Boolean exitable) {
        this.exitable = exitable;
    }

    public TradeDetailsData companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * Get companyName
     *
     * @return companyName
     **/
    @Schema(description = "")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public TradeDetailsData boOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
        return this;
    }

    /**
     * Get boOrdStatus
     *
     * @return boOrdStatus
     **/
    @Schema(description = "")
    public String getBoOrdStatus() {
        return boOrdStatus;
    }

    public void setBoOrdStatus(String boOrdStatus) {
        this.boOrdStatus = boOrdStatus;
    }

    public TradeDetailsData ordId(String ordId) {
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

    public TradeDetailsData cancellable(Boolean cancellable) {
        this.cancellable = cancellable;
        return this;
    }

    /**
     * Get cancellable
     *
     * @return cancellable
     **/
    @Schema(description = "")
    public Boolean isCancellable() {
        return cancellable;
    }

    public void setCancellable(Boolean cancellable) {
        this.cancellable = cancellable;
    }

    public TradeDetailsData excToken(String excToken) {
        this.excToken = excToken;
        return this;
    }

    /**
     * Get excToken
     *
     * @return excToken
     **/
    @Schema(description = "")
    public String getExcToken() {
        return excToken;
    }

    public void setExcToken(String excToken) {
        this.excToken = excToken;
    }

    public TradeDetailsData optionType(String optionType) {
        this.optionType = optionType;
        return this;
    }

    /**
     * Get optionType
     *
     * @return optionType
     **/
    @Schema(description = "")
    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public TradeDetailsData exc(String exc) {
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

    public TradeDetailsData ordDate(String ordDate) {
        this.ordDate = ordDate;
        return this;
    }

    /**
     * Get ordDate
     *
     * @return ordDate
     **/
    @Schema(description = "")
    public String getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(String ordDate) {
        this.ordDate = ordDate;
    }

    public TradeDetailsData prdType(String prdType) {
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

    public TradeDetailsData modifiedBy(String modifiedBy) {
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

    public TradeDetailsData baseSym(String baseSym) {
        this.baseSym = baseSym;
        return this;
    }

    /**
     * Get baseSym
     *
     * @return baseSym
     **/
    @Schema(description = "")
    public String getBaseSym() {
        return baseSym;
    }

    public void setBaseSym(String baseSym) {
        this.baseSym = baseSym;
    }

    public TradeDetailsData expiry(String expiry) {
        this.expiry = expiry;
        return this;
    }

    /**
     * Get expiry
     *
     * @return expiry
     **/
    @Schema(description = "")
    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public TradeDetailsData modifiable(Boolean modifiable) {
        this.modifiable = modifiable;
        return this;
    }

    /**
     * Get modifiable
     *
     * @return modifiable
     **/
    @Schema(description = "")
    public Boolean isModifiable() {
        return modifiable;
    }

    public void setModifiable(Boolean modifiable) {
        this.modifiable = modifiable;
    }

    public TradeDetailsData ordStatus(String ordStatus) {
        this.ordStatus = ordStatus;
        return this;
    }

    /**
     * Get ordStatus
     *
     * @return ordStatus
     **/
    @Schema(description = "")
    public String getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }

    public TradeDetailsData dispSym(String dispSym) {
        this.dispSym = dispSym;
        return this;
    }

    /**
     * Get dispSym
     *
     * @return dispSym
     **/
    @Schema(description = "")
    public String getDispSym() {
        return dispSym;
    }

    public void setDispSym(String dispSym) {
        this.dispSym = dispSym;
    }

    public TradeDetailsData ordDuration(String ordDuration) {
        this.ordDuration = ordDuration;
        return this;
    }

    /**
     * Get ordDuration
     *
     * @return ordDuration
     **/
    @Schema(description = "")
    public String getOrdDuration() {
        return ordDuration;
    }

    public void setOrdDuration(String ordDuration) {
        this.ordDuration = ordDuration;
    }

    public TradeDetailsData childType(String childType) {
        this.childType = childType;
        return this;
    }

    /**
     * Get childType
     *
     * @return childType
     **/
    @Schema(description = "")
    public String getChildType() {
        return childType;
    }

    public void setChildType(String childType) {
        this.childType = childType;
    }

    public TradeDetailsData instrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    /**
     * Get instrumentType
     *
     * @return instrumentType
     **/
    @Schema(description = "")
    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public TradeDetailsData triggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(description = "")
    public String getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(String triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public TradeDetailsData limitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Get limitPrice
     *
     * @return limitPrice
     **/
    @Schema(description = "")
    public String getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    public TradeDetailsData lotSize(String lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    /**
     * Get lotSize
     *
     * @return lotSize
     **/
    @Schema(description = "")
    public String getLotSize() {
        return lotSize;
    }

    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    public TradeDetailsData multipleir(String multipleir) {
        this.multipleir = multipleir;
        return this;
    }

    /**
     * Get multipleir
     *
     * @return multipleir
     **/
    @Schema(description = "")
    public String getMultipleir() {
        return multipleir;
    }

    public void setMultipleir(String multipleir) {
        this.multipleir = multipleir;
    }

    public TradeDetailsData strike(String strike) {
        this.strike = strike;
        return this;
    }

    /**
     * Get strike
     *
     * @return strike
     **/
    @Schema(description = "")
    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public TradeDetailsData disQty(String disQty) {
        this.disQty = disQty;
        return this;
    }

    /**
     * Get disQty
     *
     * @return disQty
     **/
    @Schema(description = "")
    public String getDisQty() {
        return disQty;
    }

    public void setDisQty(String disQty) {
        this.disQty = disQty;
    }

    public TradeDetailsData parOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
        return this;
    }

    /**
     * Get parOrdId
     *
     * @return parOrdId
     **/
    @Schema(description = "")
    public String getParOrdId() {
        return parOrdId;
    }

    public void setParOrdId(String parOrdId) {
        this.parOrdId = parOrdId;
    }

    public TradeDetailsData mktPro(String mktPro) {
        this.mktPro = mktPro;
        return this;
    }

    /**
     * Get mktPro
     *
     * @return mktPro
     **/
    @Schema(description = "")
    public String getMktPro() {
        return mktPro;
    }

    public void setMktPro(String mktPro) {
        this.mktPro = mktPro;
    }

    public TradeDetailsData tradedQty(String tradedQty) {
        this.tradedQty = tradedQty;
        return this;
    }

    /**
     * Get tradedQty
     *
     * @return tradedQty
     **/
    @Schema(description = "")
    public String getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(String tradedQty) {
        this.tradedQty = tradedQty;
    }

    public TradeDetailsData remainQty(String remainQty) {
        this.remainQty = remainQty;
        return this;
    }

    /**
     * Get remainQty
     *
     * @return remainQty
     **/
    @Schema(description = "")
    public String getRemainQty() {
        return remainQty;
    }

    public void setRemainQty(String remainQty) {
        this.remainQty = remainQty;
    }

    public TradeDetailsData rejReason(String rejReason) {
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

    public TradeDetailsData qty(String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(description = "")
    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public TradeDetailsData exchOrdId(String exchOrdId) {
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

    public TradeDetailsData ordType(String ordType) {
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

    public TradeDetailsData remarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * Get remarks
     *
     * @return remarks
     **/
    @Schema(description = "")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public TradeDetailsData trSym(String trSym) {
        this.trSym = trSym;
        return this;
    }

    /**
     * Get trSym
     *
     * @return trSym
     **/
    @Schema(description = "")
    public String getTrSym() {
        return trSym;
    }

    public void setTrSym(String trSym) {
        this.trSym = trSym;
    }

    public TradeDetailsData status(String status) {
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

    public TradeDetailsData tradedPrice(String tradedPrice) {
        this.tradedPrice = tradedPrice;
        return this;
    }

    /**
     * Get tradedPrice
     *
     * @return tradedPrice
     **/
    @Schema(description = "")
    public String getTradedPrice() {
        return tradedPrice;
    }

    public void setTradedPrice(String tradedPrice) {
        this.tradedPrice = tradedPrice;
    }

    public TradeDetailsData exchTrdId(String exchTrdId) {
        this.exchTrdId = exchTrdId;
        return this;
    }

    /**
     * Get exchTrdId
     *
     * @return exchTrdId
     **/
    @Schema(description = "")
    public String getExchTrdId() {
        return exchTrdId;
    }

    public void setExchTrdId(String exchTrdId) {
        this.exchTrdId = exchTrdId;
    }

    public TradeDetailsData tradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * Get tradeTime
     *
     * @return tradeTime
     **/
    @Schema(description = "")
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TradeDetailsData tradeDetailsData = (TradeDetailsData) o;
        return Objects.equals(this.undAsset, tradeDetailsData.undAsset) &&
                Objects.equals(this.excOrdTime, tradeDetailsData.excOrdTime) &&
                Objects.equals(this.ordAction, tradeDetailsData.ordAction) &&
                Objects.equals(this.cancelledQty, tradeDetailsData.cancelledQty) &&
                Objects.equals(this.isAmo, tradeDetailsData.isAmo) &&
                Objects.equals(this.avgPrice, tradeDetailsData.avgPrice) &&
                Objects.equals(this.exitable, tradeDetailsData.exitable) &&
                Objects.equals(this.companyName, tradeDetailsData.companyName) &&
                Objects.equals(this.boOrdStatus, tradeDetailsData.boOrdStatus) &&
                Objects.equals(this.ordId, tradeDetailsData.ordId) &&
                Objects.equals(this.cancellable, tradeDetailsData.cancellable) &&
                Objects.equals(this.excToken, tradeDetailsData.excToken) &&
                Objects.equals(this.optionType, tradeDetailsData.optionType) &&
                Objects.equals(this.exc, tradeDetailsData.exc) &&
                Objects.equals(this.ordDate, tradeDetailsData.ordDate) &&
                Objects.equals(this.prdType, tradeDetailsData.prdType) &&
                Objects.equals(this.modifiedBy, tradeDetailsData.modifiedBy) &&
                Objects.equals(this.baseSym, tradeDetailsData.baseSym) &&
                Objects.equals(this.expiry, tradeDetailsData.expiry) &&
                Objects.equals(this.modifiable, tradeDetailsData.modifiable) &&
                Objects.equals(this.ordStatus, tradeDetailsData.ordStatus) &&
                Objects.equals(this.dispSym, tradeDetailsData.dispSym) &&
                Objects.equals(this.ordDuration, tradeDetailsData.ordDuration) &&
                Objects.equals(this.childType, tradeDetailsData.childType) &&
                Objects.equals(this.instrumentType, tradeDetailsData.instrumentType) &&
                Objects.equals(this.triggerPrice, tradeDetailsData.triggerPrice) &&
                Objects.equals(this.limitPrice, tradeDetailsData.limitPrice) &&
                Objects.equals(this.lotSize, tradeDetailsData.lotSize) &&
                Objects.equals(this.multipleir, tradeDetailsData.multipleir) &&
                Objects.equals(this.strike, tradeDetailsData.strike) &&
                Objects.equals(this.disQty, tradeDetailsData.disQty) &&
                Objects.equals(this.parOrdId, tradeDetailsData.parOrdId) &&
                Objects.equals(this.mktPro, tradeDetailsData.mktPro) &&
                Objects.equals(this.tradedQty, tradeDetailsData.tradedQty) &&
                Objects.equals(this.remainQty, tradeDetailsData.remainQty) &&
                Objects.equals(this.rejReason, tradeDetailsData.rejReason) &&
                Objects.equals(this.qty, tradeDetailsData.qty) &&
                Objects.equals(this.exchOrdId, tradeDetailsData.exchOrdId) &&
                Objects.equals(this.ordType, tradeDetailsData.ordType) &&
                Objects.equals(this.remarks, tradeDetailsData.remarks) &&
                Objects.equals(this.trSym, tradeDetailsData.trSym) &&
                Objects.equals(this.status, tradeDetailsData.status) &&
                Objects.equals(this.tradedPrice, tradeDetailsData.tradedPrice) &&
                Objects.equals(this.exchTrdId, tradeDetailsData.exchTrdId) &&
                Objects.equals(this.tradeTime, tradeDetailsData.tradeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(undAsset, excOrdTime, ordAction, cancelledQty, isAmo, avgPrice, exitable, companyName, boOrdStatus, ordId, cancellable, excToken, optionType, exc, ordDate, prdType, modifiedBy, baseSym, expiry, modifiable, ordStatus, dispSym, ordDuration, childType, instrumentType, triggerPrice, limitPrice, lotSize, multipleir, strike, disQty, parOrdId, mktPro, tradedQty, remainQty, rejReason, qty, exchOrdId, ordType, remarks, trSym, status, tradedPrice, exchTrdId, tradeTime);
    }


    @Override
    public String toString() {

        return "class TradeDetailsData {\n" +
                "undAsset: " + toIndentedString(undAsset) + "\n" +
                "excOrdTime: " + toIndentedString(excOrdTime) + "\n" +
                "ordAction: " + toIndentedString(ordAction) + "\n" +
                "cancelledQty: " + toIndentedString(cancelledQty) + "\n" +
                "isAmo: " + toIndentedString(isAmo) + "\n" +
                "avgPrice: " + toIndentedString(avgPrice) + "\n" +
                "exitable: " + toIndentedString(exitable) + "\n" +
                "companyName: " + toIndentedString(companyName) + "\n" +
                "boOrdStatus: " + toIndentedString(boOrdStatus) + "\n" +
                "ordId: " + toIndentedString(ordId) + "\n" +
                "cancellable: " + toIndentedString(cancellable) + "\n" +
                "excToken: " + toIndentedString(excToken) + "\n" +
                "optionType: " + toIndentedString(optionType) + "\n" +
                "exc: " + toIndentedString(exc) + "\n" +
                "ordDate: " + toIndentedString(ordDate) + "\n" +
                "prdType: " + toIndentedString(prdType) + "\n" +
                "modifiedBy: " + toIndentedString(modifiedBy) + "\n" +
                "baseSym: " + toIndentedString(baseSym) + "\n" +
                "expiry: " + toIndentedString(expiry) + "\n" +
                "modifiable: " + toIndentedString(modifiable) + "\n" +
                "ordStatus: " + toIndentedString(ordStatus) + "\n" +
                "dispSym: " + toIndentedString(dispSym) + "\n" +
                "ordDuration: " + toIndentedString(ordDuration) + "\n" +
                "childType: " + toIndentedString(childType) + "\n" +
                "instrumentType: " + toIndentedString(instrumentType) + "\n" +
                "triggerPrice: " + toIndentedString(triggerPrice) + "\n" +
                "limitPrice: " + toIndentedString(limitPrice) + "\n" +
                "lotSize: " + toIndentedString(lotSize) + "\n" +
                "multipleir: " + toIndentedString(multipleir) + "\n" +
                "strike: " + toIndentedString(strike) + "\n" +
                "disQty: " + toIndentedString(disQty) + "\n" +
                "parOrdId: " + toIndentedString(parOrdId) + "\n" +
                "mktPro: " + toIndentedString(mktPro) + "\n" +
                "tradedQty: " + toIndentedString(tradedQty) + "\n" +
                "remainQty: " + toIndentedString(remainQty) + "\n" +
                "rejReason: " + toIndentedString(rejReason) + "\n" +
                "qty: " + toIndentedString(qty) + "\n" +
                "exchOrdId: " + toIndentedString(exchOrdId) + "\n" +
                "ordType: " + toIndentedString(ordType) + "\n" +
                "remarks: " + toIndentedString(remarks) + "\n" +
                "trSym: " + toIndentedString(trSym) + "\n" +
                "status: " + toIndentedString(status) + "\n" +
                "tradedPrice: " + toIndentedString(tradedPrice) + "\n" +
                "exchTrdId: " + toIndentedString(exchTrdId) + "\n" +
                "tradeTime: " + toIndentedString(tradeTime) + "\n" +
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
