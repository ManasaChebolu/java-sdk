package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * IntradaySuccess
 */

public class IntradaySuccess {
    @SerializedName("infoID")
    private String infoID = null;

    @SerializedName("data")
    private IntradaySuccessData data = null;

    @SerializedName("infoMsg")
    private String infoMsg = null;

    public IntradaySuccess infoID(String infoID) {
        this.infoID = infoID;
        return this;
    }

    /**
     * Get infoID
     *
     * @return infoID
     **/
    @Schema(example = "0", description = "")
    public String getInfoID() {
        return infoID;
    }

    public void setInfoID(String infoID) {
        this.infoID = infoID;
    }

    public IntradaySuccess data(IntradaySuccessData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public IntradaySuccessData getData() {
        return data;
    }

    public void setData(IntradaySuccessData data) {
        this.data = data;
    }

    public IntradaySuccess infoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
        return this;
    }

    /**
     * Get infoMsg
     *
     * @return infoMsg
     **/
    @Schema(description = "")
    public String getInfoMsg() {
        return infoMsg;
    }

    public void setInfoMsg(String infoMsg) {
        this.infoMsg = infoMsg;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntradaySuccess intradaySuccess = (IntradaySuccess) o;
        return Objects.equals(this.infoID, intradaySuccess.infoID) &&
                Objects.equals(this.data, intradaySuccess.data) &&
                Objects.equals(this.infoMsg, intradaySuccess.infoMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoID, data, infoMsg);
    }


    @Override
    public String toString() {

        return "class IntradaySuccess {\n" +
                "    infoID: " + toIndentedString(infoID) + "\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    infoMsg: " + toIndentedString(infoMsg) + "\n" +
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
