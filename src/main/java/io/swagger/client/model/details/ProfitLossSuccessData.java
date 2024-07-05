package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProfitLossSuccessData
 */

public class ProfitLossSuccessData {
    @SerializedName("clientId")
    private String clientId = null;

    @SerializedName("plReport")
    private List<PlReportItem> plReport = null;

    public ProfitLossSuccessData clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     *
     * @return clientId
     **/
    @Schema(example = "156339534", description = "")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public ProfitLossSuccessData plReport(List<PlReportItem> plReport) {
        this.plReport = plReport;
        return this;
    }

    public ProfitLossSuccessData addPlReportItem(PlReportItem plReportItem) {
        if (this.plReport == null) {
            this.plReport = new ArrayList<PlReportItem>();
        }
        this.plReport.add(plReportItem);
        return this;
    }

    /**
     * Get plReport
     *
     * @return plReport
     **/
    @Schema(description = "")
    public List<PlReportItem> getPlReport() {
        return plReport;
    }

    public void setPlReport(List<PlReportItem> plReport) {
        this.plReport = plReport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProfitLossSuccessData profitLossSuccessData = (ProfitLossSuccessData) o;
        return Objects.equals(this.clientId, profitLossSuccessData.clientId) &&
                Objects.equals(this.plReport, profitLossSuccessData.plReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, plReport);
    }


    @Override
    public String toString() {

        return "class ProfitLossSuccessData {\n" +
                "    clientId: " + toIndentedString(clientId) + "\n" +
                "    plReport: " + toIndentedString(plReport) + "\n" +
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
