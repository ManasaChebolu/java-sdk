package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PresentData
 */

public class PresentData {
    @SerializedName("presentData")
    private List<PresentDataItem> presentData = null;

    public PresentData presentData(List<PresentDataItem> presentData) {
        this.presentData = presentData;
        return this;
    }

    public PresentData addPresentDataItem(PresentDataItem presentDataItem) {
        if (this.presentData == null) {
            this.presentData = new ArrayList<PresentDataItem>();
        }
        this.presentData.add(presentDataItem);
        return this;
    }

    /**
     * Get presentData
     *
     * @return presentData
     **/
    @Schema(description = "")
    public List<PresentDataItem> getPresentData() {
        return presentData;
    }

    public void setPresentData(List<PresentDataItem> presentData) {
        this.presentData = presentData;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentData presentData = (PresentData) o;
        return Objects.equals(this.presentData, presentData.presentData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(presentData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentData {\n");

        sb.append("    presentData: ").append(toIndentedString(presentData)).append("\n");
        sb.append("}");
        return sb.toString();
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
