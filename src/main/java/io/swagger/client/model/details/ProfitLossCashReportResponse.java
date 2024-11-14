package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * ProfitLossSuccess
 */

public class ProfitLossCashReportResponse {

    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("data")
    private ProfitLossSuccessData data = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    @SerializedName("timestamp")
    private String timestamp = null;


    public ProfitLossCashReportResponse(String infoID, ProfitLossSuccessData data, String infoMsg, String timestamp) {
        this.infoID = infoID;
        this.data = data;
        this.infoMsg = infoMsg;
        this.timestamp = timestamp;
    }
}
