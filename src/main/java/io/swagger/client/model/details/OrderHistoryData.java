package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrderHistoryData
 */

public class OrderHistoryData {
    @SerializedName("trails")
    private List<OrderHistoryTrails> trails = null;

    public OrderHistoryData trails(List<OrderHistoryTrails> trails) {
        this.trails = trails;
        return this;
    }

    public OrderHistoryData addTrailsItem(OrderHistoryTrails trailsItem) {
        if (this.trails == null) {
            this.trails = new ArrayList<OrderHistoryTrails>();
        }
        this.trails.add(trailsItem);
        return this;
    }

    /**
     * Get trails
     *
     * @return trails
     **/
    @Schema(description = "")
    public List<OrderHistoryTrails> getTrails() {
        return trails;
    }

    public void setTrails(List<OrderHistoryTrails> trails) {
        this.trails = trails;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderHistoryData orderHistoryData = (OrderHistoryData) o;
        return Objects.equals(this.trails, orderHistoryData.trails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trails);
    }


    @Override
    public String toString() {

        return "class OrderHistoryData {\n" +
                "trails: " + toIndentedString(trails) + "\n" +
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
