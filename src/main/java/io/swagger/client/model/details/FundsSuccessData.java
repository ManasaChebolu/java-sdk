package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * FundsSuccessData
 */

public class FundsSuccessData {
    @SerializedName("ALL")
    private FundsSucessDataALL ALL = null;

    public FundsSuccessData ALL(FundsSucessDataALL ALL) {
        this.ALL = ALL;
        return this;
    }

    /**
     * Get ALL
     *
     * @return ALL
     **/
    @Schema(description = "")
    public FundsSucessDataALL getALL() {
        return ALL;
    }

    public void setALL(FundsSucessDataALL ALL) {
        this.ALL = ALL;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FundsSuccessData fundsSucessData = (FundsSuccessData) o;
        return Objects.equals(this.ALL, fundsSucessData.ALL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ALL);
    }


    @Override
    public String toString() {

        return "class FundsSuccessData {\n" +
                "    ALL: " + toIndentedString(ALL) + "\n" +
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
