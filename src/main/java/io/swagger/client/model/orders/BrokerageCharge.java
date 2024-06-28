package io.swagger.client.model.orders;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * BrokerageCharge
 */

@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-04T12:13:22.976497502Z[GMT]")

public class BrokerageCharge {
    @SerializedName("totalMargin")
    private String totalMargin = null;

    @SerializedName("spanMargin")
    private String spanMargin = null;

    @SerializedName("exposureMargin")
    private String exposureMargin = null;

    @SerializedName("availableBal")
    private String availableBal = null;

    @SerializedName("varMargin")
    private String varMargin = null;

    @SerializedName("insufficientBal")
    private String insufficientBal = null;

    @SerializedName("brokerage")
    private String brokerage = null;

    @SerializedName("brokerBrokerage")
    private String brokerBrokerage = null;

    @SerializedName("leviesBrokerage")
    private String leviesBrokerage = null;

    @SerializedName("otherBrokerage")
    private String otherBrokerage = null;

    public BrokerageCharge totalMargin(String totalMargin) {
        this.totalMargin = totalMargin;
        return this;
    }

    /**
     * Get totalMargin
     *
     * @return totalMargin
     **/
    @Schema(description = "")
    public String getTotalMargin() {
        return totalMargin;
    }

    public void setTotalMargin(String totalMargin) {
        this.totalMargin = totalMargin;
    }

    public BrokerageCharge spanMargin(String spanMargin) {
        this.spanMargin = spanMargin;
        return this;
    }

    /**
     * Get spanMargin
     *
     * @return spanMargin
     **/
    @Schema(description = "")
    public String getSpanMargin() {
        return spanMargin;
    }

    public void setSpanMargin(String spanMargin) {
        this.spanMargin = spanMargin;
    }

    public BrokerageCharge exposureMargin(String exposureMargin) {
        this.exposureMargin = exposureMargin;
        return this;
    }

    /**
     * Get exposureMargin
     *
     * @return exposureMargin
     **/
    @Schema(description = "")
    public String getExposureMargin() {
        return exposureMargin;
    }

    public void setExposureMargin(String exposureMargin) {
        this.exposureMargin = exposureMargin;
    }

    public BrokerageCharge availableBal(String availableBal) {
        this.availableBal = availableBal;
        return this;
    }

    /**
     * Get availableBal
     *
     * @return availableBal
     **/
    @Schema(description = "")
    public String getAvailableBal() {
        return availableBal;
    }

    public void setAvailableBal(String availableBal) {
        this.availableBal = availableBal;
    }

    public BrokerageCharge varMargin(String varMargin) {
        this.varMargin = varMargin;
        return this;
    }

    /**
     * Get varMargin
     *
     * @return varMargin
     **/
    @Schema(description = "")
    public String getVarMargin() {
        return varMargin;
    }

    public void setVarMargin(String varMargin) {
        this.varMargin = varMargin;
    }

    public BrokerageCharge insufficientBal(String insufficientBal) {
        this.insufficientBal = insufficientBal;
        return this;
    }

    /**
     * Get insufficientBal
     *
     * @return insufficientBal
     **/
    @Schema(description = "")
    public String getInsufficientBal() {
        return insufficientBal;
    }

    public void setInsufficientBal(String insufficientBal) {
        this.insufficientBal = insufficientBal;
    }

    public BrokerageCharge brokerage(String brokerage) {
        this.brokerage = brokerage;
        return this;
    }

    /**
     * Get brokerage
     *
     * @return brokerage
     **/
    @Schema(description = "")
    public String getBrokerage() {
        return brokerage;
    }

    public void setBrokerage(String brokerage) {
        this.brokerage = brokerage;
    }

    public BrokerageCharge brokerBrokerage(String brokerBrokerage) {
        this.brokerBrokerage = brokerBrokerage;
        return this;
    }

    /**
     * Get brokerBrokerage
     *
     * @return brokerBrokerage
     **/
    @Schema(description = "")
    public String getBrokerBrokerage() {
        return brokerBrokerage;
    }

    public void setBrokerBrokerage(String brokerBrokerage) {
        this.brokerBrokerage = brokerBrokerage;
    }

    public BrokerageCharge leviesBrokerage(String leviesBrokerage) {
        this.leviesBrokerage = leviesBrokerage;
        return this;
    }

    /**
     * Get leviesBrokerage
     *
     * @return leviesBrokerage
     **/
    @Schema(description = "")
    public String getLeviesBrokerage() {
        return leviesBrokerage;
    }

    public void setLeviesBrokerage(String leviesBrokerage) {
        this.leviesBrokerage = leviesBrokerage;
    }

    public BrokerageCharge otherBrokerage(String otherBrokerage) {
        this.otherBrokerage = otherBrokerage;
        return this;
    }

    /**
     * Get otherBrokerage
     *
     * @return otherBrokerage
     **/
    @Schema(description = "")
    public String getOtherBrokerage() {
        return otherBrokerage;
    }

    public void setOtherBrokerage(String otherBrokerage) {
        this.otherBrokerage = otherBrokerage;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BrokerageCharge brokerageCharge = (BrokerageCharge) o;
        return Objects.equals(this.totalMargin, brokerageCharge.totalMargin) &&
                Objects.equals(this.spanMargin, brokerageCharge.spanMargin) &&
                Objects.equals(this.exposureMargin, brokerageCharge.exposureMargin) &&
                Objects.equals(this.availableBal, brokerageCharge.availableBal) &&
                Objects.equals(this.varMargin, brokerageCharge.varMargin) &&
                Objects.equals(this.insufficientBal, brokerageCharge.insufficientBal) &&
                Objects.equals(this.brokerage, brokerageCharge.brokerage) &&
                Objects.equals(this.brokerBrokerage, brokerageCharge.brokerBrokerage) &&
                Objects.equals(this.leviesBrokerage, brokerageCharge.leviesBrokerage) &&
                Objects.equals(this.otherBrokerage, brokerageCharge.otherBrokerage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalMargin, spanMargin, exposureMargin, availableBal, varMargin, insufficientBal, brokerage, brokerBrokerage, leviesBrokerage, otherBrokerage);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrokerageCharge {\n");

        sb.append("totalMargin: ").append(toIndentedString(totalMargin)).append("\n");
        sb.append("spanMargin: ").append(toIndentedString(spanMargin)).append("\n");
        sb.append("exposureMargin: ").append(toIndentedString(exposureMargin)).append("\n");
        sb.append("availableBal: ").append(toIndentedString(availableBal)).append("\n");
        sb.append("varMargin: ").append(toIndentedString(varMargin)).append("\n");
        sb.append("insufficientBal: ").append(toIndentedString(insufficientBal)).append("\n");
        sb.append("brokerage: ").append(toIndentedString(brokerage)).append("\n");
        sb.append("brokerBrokerage: ").append(toIndentedString(brokerBrokerage)).append("\n");
        sb.append("leviesBrokerage: ").append(toIndentedString(leviesBrokerage)).append("\n");
        sb.append("otherBrokerage: ").append(toIndentedString(otherBrokerage)).append("\n");
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
