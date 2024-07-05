package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HistorySuccess
 */

public class HistorySuccess {
    @SerializedName("s")
    private String s = null;

    @SerializedName("c")
    private List<BigDecimal> c = null;

    @SerializedName("t")
    private List<BigDecimal> t = null;

    @SerializedName("v")
    private List<BigDecimal> v = null;

    @SerializedName("h")
    private List<BigDecimal> h = null;

    @SerializedName("l")
    private List<BigDecimal> l = null;

    @SerializedName("o")
    private List<BigDecimal> o = null;

    public HistorySuccess s(String s) {
        this.s = s;
        return this;
    }

    /**
     * Get s
     *
     * @return s
     **/
    @Schema(example = "ok", description = "")
    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public HistorySuccess c(List<BigDecimal> c) {
        this.c = c;
        return this;
    }

    public HistorySuccess addCItem(BigDecimal cItem) {
        if (this.c == null) {
            this.c = new ArrayList<BigDecimal>();
        }
        this.c.add(cItem);
        return this;
    }

    /**
     * Get c
     *
     * @return c
     **/
    @Schema(description = "")
    public List<BigDecimal> getC() {
        return c;
    }

    public void setC(List<BigDecimal> c) {
        this.c = c;
    }

    public HistorySuccess t(List<BigDecimal> t) {
        this.t = t;
        return this;
    }

    public HistorySuccess addTItem(BigDecimal tItem) {
        if (this.t == null) {
            this.t = new ArrayList<BigDecimal>();
        }
        this.t.add(tItem);
        return this;
    }

    /**
     * Get t
     *
     * @return t
     **/
    @Schema(description = "")
    public List<BigDecimal> getT() {
        return t;
    }

    public void setT(List<BigDecimal> t) {
        this.t = t;
    }

    public HistorySuccess v(List<BigDecimal> v) {
        this.v = v;
        return this;
    }

    public HistorySuccess addVItem(BigDecimal vItem) {
        if (this.v == null) {
            this.v = new ArrayList<BigDecimal>();
        }
        this.v.add(vItem);
        return this;
    }

    /**
     * Get v
     *
     * @return v
     **/
    @Schema(description = "")
    public List<BigDecimal> getV() {
        return v;
    }

    public void setV(List<BigDecimal> v) {
        this.v = v;
    }

    public HistorySuccess h(List<BigDecimal> h) {
        this.h = h;
        return this;
    }

    public HistorySuccess addHItem(BigDecimal hItem) {
        if (this.h == null) {
            this.h = new ArrayList<BigDecimal>();
        }
        this.h.add(hItem);
        return this;
    }

    /**
     * Get h
     *
     * @return h
     **/
    @Schema(description = "")
    public List<BigDecimal> getH() {
        return h;
    }

    public void setH(List<BigDecimal> h) {
        this.h = h;
    }

    public HistorySuccess l(List<BigDecimal> l) {
        this.l = l;
        return this;
    }

    public HistorySuccess addLItem(BigDecimal lItem) {
        if (this.l == null) {
            this.l = new ArrayList<BigDecimal>();
        }
        this.l.add(lItem);
        return this;
    }

    /**
     * Get l
     *
     * @return l
     **/
    @Schema(description = "")
    public List<BigDecimal> getL() {
        return l;
    }

    public void setL(List<BigDecimal> l) {
        this.l = l;
    }

    public HistorySuccess o(List<BigDecimal> o) {
        this.o = o;
        return this;
    }

    public HistorySuccess addOItem(BigDecimal oItem) {
        if (this.o == null) {
            this.o = new ArrayList<BigDecimal>();
        }
        this.o.add(oItem);
        return this;
    }

    /**
     * Get o
     *
     * @return o
     **/
    @Schema(description = "")
    public List<BigDecimal> getO() {
        return o;
    }

    public void setO(List<BigDecimal> o) {
        this.o = o;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistorySuccess historySuccess = (HistorySuccess) o;
        return Objects.equals(this.s, historySuccess.s) &&
                Objects.equals(this.c, historySuccess.c) &&
                Objects.equals(this.t, historySuccess.t) &&
                Objects.equals(this.v, historySuccess.v) &&
                Objects.equals(this.h, historySuccess.h) &&
                Objects.equals(this.l, historySuccess.l) &&
                Objects.equals(this.o, historySuccess.o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, c, t, v, h, l, o);
    }


    @Override
    public String toString() {

        return "class HistorySuccess {\n" +
                "s: " + toIndentedString(s) + "\n" +
                "c: " + toIndentedString(c) + "\n" +
                "t: " + toIndentedString(t) + "\n" +
                "v: " + toIndentedString(v) + "\n" +
                "h: " + toIndentedString(h) + "\n" +
                "l: " + toIndentedString(l) + "\n" +
                "o: " + toIndentedString(o) + "\n" +
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
