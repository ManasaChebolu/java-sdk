package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Symbol
 */

public class Symbol {
    @SerializedName("freezeQty")
    private String freezeQty = null;

    @SerializedName("symbol")
    private String symbol = null;

    @SerializedName("dispSym")
    private String dispSym = null;

    @SerializedName("excTkn")
    private BigDecimal excTkn = null;

    @SerializedName("lotSize")
    private BigDecimal lotSize = null;

    @SerializedName("fno")
    private Boolean fno = null;

    @SerializedName("multiplier")
    private String multiplier = null;

    @SerializedName("companyName")
    private String companyName = null;

    @SerializedName("streamSym")
    private String streamSym = null;

    @SerializedName("instrument")
    private String instrument = null;

    @SerializedName("tickSize")
    private String tickSize = null;

    @SerializedName("expiryDate")
    private String expiryDate = null;

    @SerializedName("optionType")
    private String optionType = null;

    @SerializedName("exc")
    private String exc = null;

    @SerializedName("series")
    private String series = null;

    @SerializedName("segment")
    private String segment = null;

    @SerializedName("baseSym")
    private String baseSym = null;

    @SerializedName("isin")
    private String isin = null;

    @SerializedName("strikePrice")
    private BigDecimal strikePrice = null;

    @SerializedName("mtf")
    private Boolean mtf = null;

    public Symbol freezeQty(String freezeQty) {
        this.freezeQty = freezeQty;
        return this;
    }

    /**
     * Get freezeQty
     *
     * @return freezeQty
     **/
    @Schema(description = "")
    public String getFreezeQty() {
        return freezeQty;
    }

    public void setFreezeQty(String freezeQty) {
        this.freezeQty = freezeQty;
    }

    public Symbol symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     **/
    @Schema(description = "")
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Symbol dispSym(String dispSym) {
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

    public Symbol excTkn(BigDecimal excTkn) {
        this.excTkn = excTkn;
        return this;
    }

    /**
     * Get excTkn
     *
     * @return excTkn
     **/
    @Schema(description = "")
    public BigDecimal getExcTkn() {
        return excTkn;
    }

    public void setExcTkn(BigDecimal excTkn) {
        this.excTkn = excTkn;
    }

    public Symbol lotSize(BigDecimal lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    /**
     * Get lotSize
     *
     * @return lotSize
     **/
    @Schema(description = "")
    public BigDecimal getLotSize() {
        return lotSize;
    }

    public void setLotSize(BigDecimal lotSize) {
        this.lotSize = lotSize;
    }

    public Symbol fno(Boolean fno) {
        this.fno = fno;
        return this;
    }

    /**
     * Get fno
     *
     * @return fno
     **/
    @Schema(description = "")
    public Boolean isFno() {
        return fno;
    }

    public void setFno(Boolean fno) {
        this.fno = fno;
    }

    public Symbol multiplier(String multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    /**
     * Get multiplier
     *
     * @return multiplier
     **/
    @Schema(description = "")
    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public Symbol companyName(String companyName) {
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

    public Symbol streamSym(String streamSym) {
        this.streamSym = streamSym;
        return this;
    }

    /**
     * Get streamSym
     *
     * @return streamSym
     **/
    @Schema(description = "")
    public String getStreamSym() {
        return streamSym;
    }

    public void setStreamSym(String streamSym) {
        this.streamSym = streamSym;
    }

    public Symbol instrument(String instrument) {
        this.instrument = instrument;
        return this;
    }

    /**
     * Get instrument
     *
     * @return instrument
     **/
    @Schema(description = "")
    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public Symbol tickSize(String tickSize) {
        this.tickSize = tickSize;
        return this;
    }

    /**
     * Get tickSize
     *
     * @return tickSize
     **/
    @Schema(description = "")
    public String getTickSize() {
        return tickSize;
    }

    public void setTickSize(String tickSize) {
        this.tickSize = tickSize;
    }

    public Symbol expiryDate(String expiryDate) {
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

    public Symbol optionType(String optionType) {
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

    public Symbol exc(String exc) {
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

    public Symbol series(String series) {
        this.series = series;
        return this;
    }

    /**
     * Get series
     *
     * @return series
     **/
    @Schema(description = "")
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Symbol segment(String segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Get segment
     *
     * @return segment
     **/
    @Schema(description = "")
    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public Symbol baseSym(String baseSym) {
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

    public Symbol isin(String isin) {
        this.isin = isin;
        return this;
    }

    /**
     * Get isin
     *
     * @return isin
     **/
    @Schema(description = "")
    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public Symbol strikePrice(BigDecimal strikePrice) {
        this.strikePrice = strikePrice;
        return this;
    }

    /**
     * Get strikePrice
     *
     * @return strikePrice
     **/
    @Schema(description = "")
    public BigDecimal getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(BigDecimal strikePrice) {
        this.strikePrice = strikePrice;
    }

    public Symbol mtf(Boolean mtf) {
        this.mtf = mtf;
        return this;
    }

    /**
     * Get mtf
     *
     * @return mtf
     **/
    @Schema(description = "")
    public Boolean isMtf() {
        return mtf;
    }

    public void setMtf(Boolean mtf) {
        this.mtf = mtf;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Symbol symbol = (Symbol) o;
        return Objects.equals(this.freezeQty, symbol.freezeQty) &&
                Objects.equals(this.symbol, symbol.symbol) &&
                Objects.equals(this.dispSym, symbol.dispSym) &&
                Objects.equals(this.excTkn, symbol.excTkn) &&
                Objects.equals(this.lotSize, symbol.lotSize) &&
                Objects.equals(this.fno, symbol.fno) &&
                Objects.equals(this.multiplier, symbol.multiplier) &&
                Objects.equals(this.companyName, symbol.companyName) &&
                Objects.equals(this.streamSym, symbol.streamSym) &&
                Objects.equals(this.instrument, symbol.instrument) &&
                Objects.equals(this.tickSize, symbol.tickSize) &&
                Objects.equals(this.expiryDate, symbol.expiryDate) &&
                Objects.equals(this.optionType, symbol.optionType) &&
                Objects.equals(this.exc, symbol.exc) &&
                Objects.equals(this.series, symbol.series) &&
                Objects.equals(this.segment, symbol.segment) &&
                Objects.equals(this.baseSym, symbol.baseSym) &&
                Objects.equals(this.isin, symbol.isin) &&
                Objects.equals(this.strikePrice, symbol.strikePrice) &&
                Objects.equals(this.mtf, symbol.mtf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freezeQty, symbol, dispSym, excTkn, lotSize, fno, multiplier, companyName, streamSym, instrument, tickSize, expiryDate, optionType, exc, series, segment, baseSym, isin, strikePrice, mtf);
    }


    @Override
    public String toString() {

        return "class Symbol {\n" +
                "freezeQty: " + toIndentedString(freezeQty) + "\n" +
                "symbol: " + toIndentedString(symbol) + "\n" +
                "dispSym: " + toIndentedString(dispSym) + "\n" +
                "excTkn: " + toIndentedString(excTkn) + "\n" +
                "lotSize: " + toIndentedString(lotSize) + "\n" +
                "fno: " + toIndentedString(fno) + "\n" +
                "multiplier: " + toIndentedString(multiplier) + "\n" +
                "companyName: " + toIndentedString(companyName) + "\n" +
                "streamSym: " + toIndentedString(streamSym) + "\n" +
                "instrument: " + toIndentedString(instrument) + "\n" +
                "tickSize: " + toIndentedString(tickSize) + "\n" +
                "expiryDate: " + toIndentedString(expiryDate) + "\n" +
                "optionType: " + toIndentedString(optionType) + "\n" +
                "exc: " + toIndentedString(exc) + "\n" +
                "series: " + toIndentedString(series) + "\n" +
                "segment: " + toIndentedString(segment) + "\n" +
                "baseSym: " + toIndentedString(baseSym) + "\n" +
                "isin: " + toIndentedString(isin) + "\n" +
                "strikePrice: " + toIndentedString(strikePrice) + "\n" +
                "mtf: " + toIndentedString(mtf) + "\n" +
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
