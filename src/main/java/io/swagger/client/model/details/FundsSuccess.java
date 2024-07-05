package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * FundsSuccess
 */

public class FundsSuccess {
    @SerializedName("infoid")
    private String infoid = null;

    @SerializedName("data")
    private FundsSuccessData data = null;

    @SerializedName("infomsg")
    private String infomsg = null;

    @SerializedName("timestamp")
    private Float timestamp = null;

    public FundsSuccess infoid(String infoid) {
        this.infoid = infoid;
        return this;
    }

    /**
     * Get infoid
     *
     * @return infoid
     **/
    @Schema(example = "200", description = "")
    public String getInfoid() {
        return infoid;
    }

    public void setInfoid(String infoid) {
        this.infoid = infoid;
    }

    public FundsSuccess data(FundsSuccessData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public FundsSuccessData getData() {
        return data;
    }

    public void setData(FundsSuccessData data) {
        this.data = data;
    }

    public FundsSuccess infomsg(String infomsg) {
        this.infomsg = infomsg;
        return this;
    }

    /**
     * Get infomsg
     *
     * @return infomsg
     **/
    @Schema(example = "success", description = "")
    public String getInfomsg() {
        return infomsg;
    }

    public void setInfomsg(String infomsg) {
        this.infomsg = infomsg;
    }

    public FundsSuccess timestamp(Float timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @Schema(example = "6478390.03", description = "")
    public Float getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Float timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FundsSuccess fundsSucess = (FundsSuccess) o;
        return Objects.equals(this.infoid, fundsSucess.infoid) &&
                Objects.equals(this.data, fundsSucess.data) &&
                Objects.equals(this.infomsg, fundsSucess.infomsg) &&
                Objects.equals(this.timestamp, fundsSucess.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoid, data, infomsg, timestamp);
    }


    @Override
    public String toString() {

        return "class FundsSucess {\n" +
                "    infoid: " + toIndentedString(infoid) + "\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    infomsg: " + toIndentedString(infomsg) + "\n" +
                "    timestamp: " + toIndentedString(timestamp) + "\n" +
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
