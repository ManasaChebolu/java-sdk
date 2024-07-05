package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * GetProfileSuccessData
 */

public class GetProfileSuccessData {
    @SerializedName("upcomingPlan")
    private String upcomingPlan = null;

    @SerializedName("profile")
    private Profile profile = null;

    public GetProfileSuccessData upcomingPlan(String upcomingPlan) {
        this.upcomingPlan = upcomingPlan;
        return this;
    }

    /**
     * Get upcomingPlan
     *
     * @return upcomingPlan
     **/
    @Schema(description = "")
    public String getUpcomingPlan() {
        return upcomingPlan;
    }

    public void setUpcomingPlan(String upcomingPlan) {
        this.upcomingPlan = upcomingPlan;
    }

    public GetProfileSuccessData profile(Profile profile) {
        this.profile = profile;
        return this;
    }

    /**
     * Get profile
     *
     * @return profile
     **/
    @Schema(description = "")
    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProfileSuccessData getProfileSucsessData = (GetProfileSuccessData) o;
        return Objects.equals(this.upcomingPlan, getProfileSucsessData.upcomingPlan) &&
                Objects.equals(this.profile, getProfileSucsessData.profile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(upcomingPlan, profile);
    }


    @Override
    public String toString() {

        return "class GetProfileSuccessData {\n" +
                "    upcomingPlan: " + toIndentedString(upcomingPlan) + "\n" +
                "    profile: " + toIndentedString(profile) + "\n" +
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
