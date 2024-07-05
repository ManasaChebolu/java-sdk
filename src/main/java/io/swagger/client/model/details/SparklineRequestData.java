package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * SparklineRequestData
 */

public class SparklineRequestData {
    @SerializedName("instruments")
    private InstrumentsData instruments = null;

    public SparklineRequestData instruments(InstrumentsData instruments) {
        this.instruments = instruments;
        return this;
    }

    /**
     * Get instruments
     *
     * @return instruments
     **/
    @Schema(description = "")
    public InstrumentsData getInstruments() {
        return instruments;
    }

    public void setInstruments(InstrumentsData instruments) {
        this.instruments = instruments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SparklineRequestData sparklineRequestData = (SparklineRequestData) o;
        return Objects.equals(this.instruments, sparklineRequestData.instruments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instruments);
    }


    @Override
    public String toString() {

        return "class SparklineRequestData {\n" +
                "    instruments: " + toIndentedString(instruments) + "\n" +
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
