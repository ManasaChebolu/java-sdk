package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * InstrumentsData
 */

public class InstrumentsData {
    @SerializedName("instruments")
    private List<Instrument> instruments = null;

    public InstrumentsData instruments(List<Instrument> instruments) {
        this.instruments = instruments;
        return this;
    }

    public InstrumentsData addInstrumentsItem(Instrument instrumentsItem) {
        if (this.instruments == null) {
            this.instruments = new ArrayList<Instrument>();
        }
        this.instruments.add(instrumentsItem);
        return this;
    }

    /**
     * Get instruments
     *
     * @return instruments
     **/
    @Schema(description = "")
    public List<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(List<Instrument> instruments) {
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
        InstrumentsData instrumentsData = (InstrumentsData) o;
        return Objects.equals(this.instruments, instrumentsData.instruments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instruments);
    }


    @Override
    public String toString() {

        return "class InstrumentsData {\n" +
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
