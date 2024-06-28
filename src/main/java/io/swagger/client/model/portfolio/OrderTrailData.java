package io.swagger.client.model.portfolio;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrderTrailData
 */

@javax.annotation.processing.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-06-04T12:13:29.521089219Z[GMT]")

public class OrderTrailData {
    @SerializedName("trails")
    private List<OrderTrail> trails = null;

    public OrderTrailData trails(List<OrderTrail> trails) {
        this.trails = trails;
        return this;
    }

    public OrderTrailData addTrailsItem(OrderTrail trailsItem) {
        if (this.trails == null) {
            this.trails = new ArrayList<OrderTrail>();
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
    public List<OrderTrail> getTrails() {
        return trails;
    }

    public void setTrails(List<OrderTrail> trails) {
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
        OrderTrailData orderTrailData = (OrderTrailData) o;
        return Objects.equals(this.trails, orderTrailData.trails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trails);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTrailData {\n");

        sb.append("trails: ").append(toIndentedString(trails)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().replace("\n", "\n    ");
    }

}
