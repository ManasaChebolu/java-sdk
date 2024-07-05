package io.swagger.client.model.portfolio;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;

import java.io.IOException;
import java.util.Objects;

/**
 * OrderTrail
 */

@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-04T12:13:29.521089219Z[GMT]")

public class OrderTrail {
    @SerializedName("limitPrice")
    private Double limitPrice = null;

    @SerializedName("lupdateDateTime")
    private String lupdateDateTime = null;

    @SerializedName("ordDesc")
    private String ordDesc = null;

    /**
     * Gets or Sets ordType
     */
    @JsonAdapter(OrdTypeEnum.Adapter.class)
    public enum OrdTypeEnum {
        @SerializedName("Market")
        MARKET("Market"),
        @SerializedName("Limit")
        LIMIT("Limit"),
        @SerializedName("Stop")
        STOP("Stop"),
        @SerializedName("Stop-loss")
        STOP_LOSS("Stop-loss"),
        @SerializedName("SL-M")
        SL_M("SL-M"),
        @SerializedName("SL")
        SL("SL"),
        @SerializedName("None")
        NONE("None");

        private String value;

        OrdTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrdTypeEnum fromValue(String input) {
            for (OrdTypeEnum b : OrdTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrdTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrdTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrdTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrdTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordType")
    private OrdTypeEnum ordType = null;

    /**
     * Gets or Sets ordValidity
     */
    @JsonAdapter(OrdValidityEnum.Adapter.class)
    public enum OrdValidityEnum {
        @SerializedName("DAY")
        DAY("DAY"),
        @SerializedName("IOC")
        IOC("IOC"),
        @SerializedName("GMT")
        GMT("GMT"),
        @SerializedName("GTC")
        GTC("GTC"),
        @SerializedName("AMO")
        AMO("AMO"),
        @SerializedName("GTD")
        GTD("GTD"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        OrdValidityEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrdValidityEnum fromValue(String input) {
            for (OrdValidityEnum b : OrdValidityEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrdValidityEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrdValidityEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrdValidityEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrdValidityEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordValidity")
    private OrdValidityEnum ordValidity = null;

    @SerializedName("modifiedBy")
    private String modifiedBy = null;

    /**
     * Gets or Sets status
     */
    @JsonAdapter(StatusEnum.Adapter.class)
    public enum StatusEnum {
        @SerializedName("Executed")
        EXECUTED("Executed"),
        @SerializedName("Pending")
        PENDING("Pending"),
        @SerializedName("Cancelled")
        CANCELLED("Cancelled"),
        @SerializedName("Transit")
        TRANSIT("Transit"),
        @SerializedName("Rejected")
        REJECTED("Rejected"),
        @SerializedName("Requested")
        REQUESTED("Requested"),
        @SerializedName("None")
        NONE("None");

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StatusEnum fromValue(String input) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<StatusEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public StatusEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return StatusEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("status")
    private StatusEnum status = null;

    @SerializedName("rejReason")
    private String rejReason = null;

    @SerializedName("avgPrice")
    private Double avgPrice = null;

    @SerializedName("qty")
    private Integer qty = null;

    @SerializedName("pendingQty")
    private Integer pendingQty = null;

    @SerializedName("disQty")
    private Integer disQty = null;

    @SerializedName("price")
    private Double price = null;

    @SerializedName("triggerPrice")
    private Double triggerPrice = null;

    /**
     * Gets or Sets exc
     */
    @JsonAdapter(ExcEnum.Adapter.class)
    public enum ExcEnum {
        @SerializedName("NSE")
        NSE("NSE"),
        @SerializedName("BSE")
        BSE("BSE"),
        @SerializedName("NFO")
        NFO("NFO"),
        @SerializedName("BFO")
        BFO("BFO"),
        @SerializedName("CDS")
        CDS("CDS"),
        @SerializedName("BCD")
        BCD("BCD"),
        @SerializedName("MCXSX")
        MCXSX("MCXSX"),
        @SerializedName("MCX")
        MCX("MCX"),
        @SerializedName("NCO")
        NCO("NCO"),
        @SerializedName("BCO")
        BCO("BCO"),
        @SerializedName("ICEX")
        ICEX("ICEX");

        private String value;

        ExcEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ExcEnum fromValue(String input) {
            for (ExcEnum b : ExcEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<ExcEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ExcEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public ExcEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return ExcEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("exc")
    private ExcEnum exc = null;

    /**
     * Gets or Sets prdType
     */
    @JsonAdapter(PrdTypeEnum.Adapter.class)
    public enum PrdTypeEnum {
        @SerializedName("CASH")
        CASH("CASH"),
        @SerializedName("MTF")
        MTF("MTF"),
        @SerializedName("INTRADAY")
        INTRADAY("INTRADAY"),
        @SerializedName("MARGIN")
        MARGIN("MARGIN"),
        @SerializedName("SHORTSELL")
        SHORTSELL("SHORTSELL"),
        @SerializedName("COVER_ORDER")
        COVER_ORDER("COVER_ORDER"),
        @SerializedName("BRACKET_ORDER")
        BRACKET_ORDER("BRACKET_ORDER"),
        @SerializedName("NRML")
        NRML("NRML"),
        @SerializedName("TNC")
        TNC("TNC"),
        @SerializedName("DELIVERY")
        DELIVERY("DELIVERY"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        PrdTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static PrdTypeEnum fromValue(String input) {
            for (PrdTypeEnum b : PrdTypeEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<PrdTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final PrdTypeEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public PrdTypeEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return PrdTypeEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("prdType")
    private PrdTypeEnum prdType = null;

    @SerializedName("ordId")
    private String ordId = null;

    @SerializedName("exchOrdId")
    private String exchOrdId = null;

    /**
     * Gets or Sets ordAction
     */
    @JsonAdapter(OrdActionEnum.Adapter.class)
    public enum OrdActionEnum {
        @SerializedName("BUY")
        BUY("BUY"),
        @SerializedName("SELL")
        SELL("SELL"),
        @SerializedName("SHORT")
        SHORT("SHORT"),
        @SerializedName("NONE")
        NONE("NONE");

        private String value;

        OrdActionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static OrdActionEnum fromValue(String input) {
            for (OrdActionEnum b : OrdActionEnum.values()) {
                if (b.value.equals(input)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<OrdActionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final OrdActionEnum enumeration) throws IOException {
                jsonWriter.value(String.valueOf(enumeration.getValue()));
            }

            @Override
            public OrdActionEnum read(final JsonReader jsonReader) throws IOException {
                Object value = jsonReader.nextString();
                return OrdActionEnum.fromValue((String) (value));
            }
        }
    }

    @SerializedName("ordAction")
    private OrdActionEnum ordAction = null;

    @SerializedName("currentOrdStatus")
    private String currentOrdStatus = null;

    @SerializedName("tradedQty")
    private Integer tradedQty = null;

    @SerializedName("symbol")
    private SymbolDto symbol = null;

    public OrderTrail limitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Get limitPrice
     *
     * @return limitPrice
     **/
    @Schema(description = "")
    public Double getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(Double limitPrice) {
        this.limitPrice = limitPrice;
    }

    public OrderTrail lupdateDateTime(String lupdateDateTime) {
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

    public OrderTrail ordDesc(String ordDesc) {
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

    public OrderTrail ordType(OrdTypeEnum ordType) {
        this.ordType = ordType;
        return this;
    }

    /**
     * Get ordType
     *
     * @return ordType
     **/
    @Schema(description = "")
    public OrdTypeEnum getOrdType() {
        return ordType;
    }

    public void setOrdType(OrdTypeEnum ordType) {
        this.ordType = ordType;
    }

    public OrderTrail ordValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
        return this;
    }

    /**
     * Get ordValidity
     *
     * @return ordValidity
     **/
    @Schema(description = "")
    public OrdValidityEnum getOrdValidity() {
        return ordValidity;
    }

    public void setOrdValidity(OrdValidityEnum ordValidity) {
        this.ordValidity = ordValidity;
    }

    public OrderTrail modifiedBy(String modifiedBy) {
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

    public OrderTrail status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public OrderTrail rejReason(String rejReason) {
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

    public OrderTrail avgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
        return this;
    }

    /**
     * Get avgPrice
     *
     * @return avgPrice
     **/
    @Schema(description = "")
    public Double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(Double avgPrice) {
        this.avgPrice = avgPrice;
    }

    public OrderTrail qty(Integer qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     **/
    @Schema(description = "")
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public OrderTrail pendingQty(Integer pendingQty) {
        this.pendingQty = pendingQty;
        return this;
    }

    /**
     * Get pendingQty
     *
     * @return pendingQty
     **/
    @Schema(description = "")
    public Integer getPendingQty() {
        return pendingQty;
    }

    public void setPendingQty(Integer pendingQty) {
        this.pendingQty = pendingQty;
    }

    public OrderTrail disQty(Integer disQty) {
        this.disQty = disQty;
        return this;
    }

    /**
     * Get disQty
     *
     * @return disQty
     **/
    @Schema(description = "")
    public Integer getDisQty() {
        return disQty;
    }

    public void setDisQty(Integer disQty) {
        this.disQty = disQty;
    }

    public OrderTrail price(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     **/
    @Schema(description = "")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public OrderTrail triggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
        return this;
    }

    /**
     * Get triggerPrice
     *
     * @return triggerPrice
     **/
    @Schema(description = "")
    public Double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(Double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public OrderTrail exc(ExcEnum exc) {
        this.exc = exc;
        return this;
    }

    /**
     * Get exc
     *
     * @return exc
     **/
    @Schema(description = "")
    public ExcEnum getExc() {
        return exc;
    }

    public void setExc(ExcEnum exc) {
        this.exc = exc;
    }

    public OrderTrail prdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
        return this;
    }

    /**
     * Get prdType
     *
     * @return prdType
     **/
    @Schema(description = "")
    public PrdTypeEnum getPrdType() {
        return prdType;
    }

    public void setPrdType(PrdTypeEnum prdType) {
        this.prdType = prdType;
    }

    public OrderTrail ordId(String ordId) {
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

    public OrderTrail exchOrdId(String exchOrdId) {
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

    public OrderTrail ordAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
        return this;
    }

    /**
     * Get ordAction
     *
     * @return ordAction
     **/
    @Schema(description = "")
    public OrdActionEnum getOrdAction() {
        return ordAction;
    }

    public void setOrdAction(OrdActionEnum ordAction) {
        this.ordAction = ordAction;
    }

    public OrderTrail currentOrdStatus(String currentOrdStatus) {
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

    public OrderTrail tradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
        return this;
    }

    /**
     * Get tradedQty
     *
     * @return tradedQty
     **/
    @Schema(description = "")
    public Integer getTradedQty() {
        return tradedQty;
    }

    public void setTradedQty(Integer tradedQty) {
        this.tradedQty = tradedQty;
    }

    public OrderTrail symbol(SymbolDto symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(description = "")
    public SymbolDto getSymbol() {
        return symbol;
    }

    public void setSymbol(SymbolDto symbol) {
        this.symbol = symbol;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderTrail orderTrail = (OrderTrail) o;
        return Objects.equals(this.limitPrice, orderTrail.limitPrice) &&
                Objects.equals(this.lupdateDateTime, orderTrail.lupdateDateTime) &&
                Objects.equals(this.ordDesc, orderTrail.ordDesc) &&
                Objects.equals(this.ordType, orderTrail.ordType) &&
                Objects.equals(this.ordValidity, orderTrail.ordValidity) &&
                Objects.equals(this.modifiedBy, orderTrail.modifiedBy) &&
                Objects.equals(this.status, orderTrail.status) &&
                Objects.equals(this.rejReason, orderTrail.rejReason) &&
                Objects.equals(this.avgPrice, orderTrail.avgPrice) &&
                Objects.equals(this.qty, orderTrail.qty) &&
                Objects.equals(this.pendingQty, orderTrail.pendingQty) &&
                Objects.equals(this.disQty, orderTrail.disQty) &&
                Objects.equals(this.price, orderTrail.price) &&
                Objects.equals(this.triggerPrice, orderTrail.triggerPrice) &&
                Objects.equals(this.exc, orderTrail.exc) &&
                Objects.equals(this.prdType, orderTrail.prdType) &&
                Objects.equals(this.ordId, orderTrail.ordId) &&
                Objects.equals(this.exchOrdId, orderTrail.exchOrdId) &&
                Objects.equals(this.ordAction, orderTrail.ordAction) &&
                Objects.equals(this.currentOrdStatus, orderTrail.currentOrdStatus) &&
                Objects.equals(this.tradedQty, orderTrail.tradedQty) &&
                Objects.equals(this.symbol, orderTrail.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitPrice, lupdateDateTime, ordDesc, ordType, ordValidity, modifiedBy, status, rejReason, avgPrice, qty, pendingQty, disQty, price, triggerPrice, exc, prdType, ordId, exchOrdId, ordAction, currentOrdStatus, tradedQty, symbol);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrail {\n");

        sb.append("limitPrice: ").append(toIndentedString(limitPrice)).append("\n");
        sb.append("lupdateDateTime: ").append(toIndentedString(lupdateDateTime)).append("\n");
        sb.append("ordDesc: ").append(toIndentedString(ordDesc)).append("\n");
        sb.append("ordType: ").append(toIndentedString(ordType)).append("\n");
        sb.append("ordValidity: ").append(toIndentedString(ordValidity)).append("\n");
        sb.append("modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
        sb.append("status: ").append(toIndentedString(status)).append("\n");
        sb.append("rejReason: ").append(toIndentedString(rejReason)).append("\n");
        sb.append("avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("pendingQty: ").append(toIndentedString(pendingQty)).append("\n");
        sb.append("disQty: ").append(toIndentedString(disQty)).append("\n");
        sb.append("price: ").append(toIndentedString(price)).append("\n");
        sb.append("triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
        sb.append("exc: ").append(toIndentedString(exc)).append("\n");
        sb.append("prdType: ").append(toIndentedString(prdType)).append("\n");
        sb.append("ordId: ").append(toIndentedString(ordId)).append("\n");
        sb.append("exchOrdId: ").append(toIndentedString(exchOrdId)).append("\n");
        sb.append("ordAction: ").append(toIndentedString(ordAction)).append("\n");
        sb.append("currentOrdStatus: ").append(toIndentedString(currentOrdStatus)).append("\n");
        sb.append("tradedQty: ").append(toIndentedString(tradedQty)).append("\n");
        sb.append("symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
