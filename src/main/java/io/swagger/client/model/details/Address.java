package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Address
 */

public class Address {
    @SerializedName("zip")
    private String zip = null;

    @SerializedName("address3")
    private String address3 = null;

    @SerializedName("address2")
    private String address2 = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("nation")
    private String nation = null;

    @SerializedName("address1")
    private String address1 = null;

    @SerializedName("state")
    private String state = null;

    public Address zip(String zip) {
        this.zip = zip;
        return this;
    }

    /**
     * Get zip
     *
     * @return zip
     **/
    @Schema(example = "400058", description = "")
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Address address3(String address3) {
        this.address3 = address3;
        return this;
    }

    /**
     * Get address3
     *
     * @return address3
     **/
    @Schema(description = "")
    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public Address address2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * Get address2
     *
     * @return address2
     **/
    @Schema(example = "P  ROAD  BHARDAWADI", description = "")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * Get city
     *
     * @return city
     **/
    @Schema(example = "MUMBAI", description = "")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address nation(String nation) {
        this.nation = nation;
        return this;
    }

    /**
     * Get nation
     *
     * @return nation
     **/
    @Schema(example = "India", description = "")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Address address1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Get address1
     *
     * @return address1
     **/
    @Schema(example = "B   2  1ST OBEROI BLOCKS  J", description = "")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public Address state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/
    @Schema(example = "Maharashtra", description = "")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.zip, address.zip) &&
                Objects.equals(this.address3, address.address3) &&
                Objects.equals(this.address2, address.address2) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.nation, address.nation) &&
                Objects.equals(this.address1, address.address1) &&
                Objects.equals(this.state, address.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zip, address3, address2, city, nation, address1, state);
    }


    @Override
    public String toString() {

        return "class Address {\n" +
                "    zip: " + toIndentedString(zip) + "\n" +
                "    address3: " + toIndentedString(address3) + "\n" +
                "    address2: " + toIndentedString(address2) + "\n" +
                "    city: " + toIndentedString(city) + "\n" +
                "    nation: " + toIndentedString(nation) + "\n" +
                "    address1: " + toIndentedString(address1) + "\n" +
                "    state: " + toIndentedString(state) + "\n" +
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
