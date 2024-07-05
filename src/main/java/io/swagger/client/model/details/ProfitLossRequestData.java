package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProfitLossRequestData
 */

public class ProfitLossRequestData {
    @SerializedName("fromDate")
    private String fromDate = null;

    @SerializedName("months")
    private String months = null;

    @SerializedName("fy")
    private String fy = null;

    @SerializedName("segment")
    private String segment = null;

    @SerializedName("toDate")
    private String toDate = null;

    @SerializedName("days")
    private String days = null;

    public ProfitLossRequestData fromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    /**
     * Get fromDate
     *
     * @return fromDate
     **/
    @Schema(description = "")
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public ProfitLossRequestData months(String months) {
        this.months = months;
        return this;
    }

    /**
     * Get months
     *
     * @return months
     **/
    @Schema(example = "10", description = "")
    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public ProfitLossRequestData fy(String fy) {
        this.fy = fy;
        return this;
    }

    /**
     * Get fy
     *
     * @return fy
     **/
    @Schema(description = "")
    public String getFy() {
        return fy;
    }

    public void setFy(String fy) {
        this.fy = fy;
    }

    public ProfitLossRequestData segment(String segment) {
        this.segment = segment;
        return this;
    }

    /**
     * Get segment
     *
     * @return segment
     **/
    @Schema(example = "equity", description = "")
    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    public ProfitLossRequestData toDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    /**
     * Get toDate
     *
     * @return toDate
     **/
    @Schema(description = "")
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public ProfitLossRequestData days(String days) {
        this.days = days;
        return this;
    }

    /**
     * Get days
     *
     * @return days
     **/
    @Schema(description = "")
    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfitLossRequestData profitLossRequestData = (ProfitLossRequestData) o;
        return Objects.equals(this.fromDate, profitLossRequestData.fromDate) &&
                Objects.equals(this.months, profitLossRequestData.months) &&
                Objects.equals(this.fy, profitLossRequestData.fy) &&
                Objects.equals(this.segment, profitLossRequestData.segment) &&
                Objects.equals(this.toDate, profitLossRequestData.toDate) &&
                Objects.equals(this.days, profitLossRequestData.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fromDate, months, fy, segment, toDate, days);
    }


    @Override
    public String toString() {

        return "class ProfitLossRequestData {\n" +
                "    fromDate: " + toIndentedString(fromDate) + "\n" +
                "    months: " + toIndentedString(months) + "\n" +
                "    fy: " + toIndentedString(fy) + "\n" +
                "    segment: " + toIndentedString(segment) + "\n" +
                "    toDate: " + toIndentedString(toDate) + "\n" +
                "    days: " + toIndentedString(days) + "\n" +
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
