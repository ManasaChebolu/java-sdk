package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Profile
 */

public class Profile {
  @SerializedName("addresses")
  private List<Address> addresses = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("turnOverBrokerageSaving")
  private String turnOverBrokerageSaving = null;

  @SerializedName("dpid")
  private String dpid = null;

  @SerializedName("bankAccounts")
  private List<BankAccount> bankAccounts = null;

  @SerializedName("premiumPlanRenewed")
  private Boolean premiumPlanRenewed = null;

  @SerializedName("offerType")
  private String offerType = null;

  @SerializedName("poaFlag")
  private Boolean poaFlag = null;

  @SerializedName("inActiveFrom")
  private String inActiveFrom = null;

  @SerializedName("segment")
  private String segment = null;

  @SerializedName("pan")
  private String pan = null;

  @SerializedName("planEndDate")
  private String planEndDate = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("activeFrom")
  private String activeFrom = null;

  @SerializedName("planActualPrice")
  private String planActualPrice = null;

  @SerializedName("planType")
  private String planType = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("mobile")
  private String mobile = null;

  @SerializedName("ddpiFlag")
  private Boolean ddpiFlag = null;

  @SerializedName("clientCode")
  private String clientCode = null;

  @SerializedName("dob")
  private OffsetDateTime dob = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("showOfferPrice")
  private Boolean showOfferPrice = null;

  @SerializedName("repositoryType")
  private String repositoryType = null;

  @SerializedName("planStartDate")
  private String planStartDate = null;

  @SerializedName("premiumPlanActive")
  private Boolean premiumPlanActive = null;

  public Profile addresses(List<Address> addresses) {
    this.addresses = addresses;
    return this;
  }

  public Profile addAddressesItem(Address addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<Address>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @Schema(description = "")
  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public Profile gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @Schema(example = "Female", description = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Profile turnOverBrokerageSaving(String turnOverBrokerageSaving) {
    this.turnOverBrokerageSaving = turnOverBrokerageSaving;
    return this;
  }

   /**
   * Get turnOverBrokerageSaving
   * @return turnOverBrokerageSaving
  **/
  @Schema(description = "")
  public String getTurnOverBrokerageSaving() {
    return turnOverBrokerageSaving;
  }

  public void setTurnOverBrokerageSaving(String turnOverBrokerageSaving) {
    this.turnOverBrokerageSaving = turnOverBrokerageSaving;
  }

  public Profile dpid(String dpid) {
    this.dpid = dpid;
    return this;
  }

   /**
   * Get dpid
   * @return dpid
  **/
  @Schema(example = "1203330001292256", description = "")
  public String getDpid() {
    return dpid;
  }

  public void setDpid(String dpid) {
    this.dpid = dpid;
  }

  public Profile bankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
    return this;
  }

  public Profile addBankAccountsItem(BankAccount bankAccountsItem) {
    if (this.bankAccounts == null) {
      this.bankAccounts = new ArrayList<BankAccount>();
    }
    this.bankAccounts.add(bankAccountsItem);
    return this;
  }

   /**
   * Get bankAccounts
   * @return bankAccounts
  **/
  @Schema(description = "")
  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }

  public Profile premiumPlanRenewed(Boolean premiumPlanRenewed) {
    this.premiumPlanRenewed = premiumPlanRenewed;
    return this;
  }

   /**
   * Get premiumPlanRenewed
   * @return premiumPlanRenewed
  **/
  @Schema(example = "false", description = "")
  public Boolean isPremiumPlanRenewed() {
    return premiumPlanRenewed;
  }

  public void setPremiumPlanRenewed(Boolean premiumPlanRenewed) {
    this.premiumPlanRenewed = premiumPlanRenewed;
  }

  public Profile offerType(String offerType) {
    this.offerType = offerType;
    return this;
  }

   /**
   * Get offerType
   * @return offerType
  **/
  @Schema(description = "")
  public String getOfferType() {
    return offerType;
  }

  public void setOfferType(String offerType) {
    this.offerType = offerType;
  }

  public Profile poaFlag(Boolean poaFlag) {
    this.poaFlag = poaFlag;
    return this;
  }

   /**
   * Get poaFlag
   * @return poaFlag
  **/
  @Schema(example = "false", description = "")
  public Boolean isPoaFlag() {
    return poaFlag;
  }

  public void setPoaFlag(Boolean poaFlag) {
    this.poaFlag = poaFlag;
  }

  public Profile inActiveFrom(String inActiveFrom) {
    this.inActiveFrom = inActiveFrom;
    return this;
  }

   /**
   * Get inActiveFrom
   * @return inActiveFrom
  **/
  @Schema(description = "")
  public String getInActiveFrom() {
    return inActiveFrom;
  }

  public void setInActiveFrom(String inActiveFrom) {
    this.inActiveFrom = inActiveFrom;
  }

  public Profile segment(String segment) {
    this.segment = segment;
    return this;
  }

   /**
   * Get segment
   * @return segment
  **/
  @Schema(example = "BFO,BSE,BSE MF,BCD,MCX,NFO,NSE,CDS,SLBBSE SLBS,SLBNSE SLBS", description = "")
  public String getSegment() {
    return segment;
  }

  public void setSegment(String segment) {
    this.segment = segment;
  }

  public Profile pan(String pan) {
    this.pan = pan;
    return this;
  }

   /**
   * Get pan
   * @return pan
  **/
  @Schema(example = "ARAPP6551E", description = "")
  public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public Profile planEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
    return this;
  }

   /**
   * Get planEndDate
   * @return planEndDate
  **/
  @Schema(description = "")
  public String getPlanEndDate() {
    return planEndDate;
  }

  public void setPlanEndDate(String planEndDate) {
    this.planEndDate = planEndDate;
  }

  public Profile email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(example = "akshaya@gmail.com", description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Profile activeFrom(String activeFrom) {
    this.activeFrom = activeFrom;
    return this;
  }

   /**
   * Get activeFrom
   * @return activeFrom
  **/
  @Schema(description = "")
  public String getActiveFrom() {
    return activeFrom;
  }

  public void setActiveFrom(String activeFrom) {
    this.activeFrom = activeFrom;
  }

  public Profile planActualPrice(String planActualPrice) {
    this.planActualPrice = planActualPrice;
    return this;
  }

   /**
   * Get planActualPrice
   * @return planActualPrice
  **/
  @Schema(description = "")
  public String getPlanActualPrice() {
    return planActualPrice;
  }

  public void setPlanActualPrice(String planActualPrice) {
    this.planActualPrice = planActualPrice;
  }

  public Profile planType(String planType) {
    this.planType = planType;
    return this;
  }

   /**
   * Get planType
   * @return planType
  **/
  @Schema(description = "")
  public String getPlanType() {
    return planType;
  }

  public void setPlanType(String planType) {
    this.planType = planType;
  }

  public Profile address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @Schema(example = "B     ST OBEROI BLOCKS  J  P  ROAD  BHARDAWADI   MUMBAI", description = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Profile mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @Schema(example = "7305989193", description = "")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Profile ddpiFlag(Boolean ddpiFlag) {
    this.ddpiFlag = ddpiFlag;
    return this;
  }

   /**
   * Get ddpiFlag
   * @return ddpiFlag
  **/
  @Schema(example = "false", description = "")
  public Boolean isDdpiFlag() {
    return ddpiFlag;
  }

  public void setDdpiFlag(Boolean ddpiFlag) {
    this.ddpiFlag = ddpiFlag;
  }

  public Profile clientCode(String clientCode) {
    this.clientCode = clientCode;
    return this;
  }

   /**
   * Get clientCode
   * @return clientCode
  **/
  @Schema(example = "DBG101", description = "")
  public String getClientCode() {
    return clientCode;
  }

  public void setClientCode(String clientCode) {
    this.clientCode = clientCode;
  }

  public Profile dob(OffsetDateTime dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  @Schema(description = "")
  public OffsetDateTime getDob() {
    return dob;
  }

  public void setDob(OffsetDateTime dob) {
    this.dob = dob;
  }

  public Profile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "Akshaya B", description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Profile showOfferPrice(Boolean showOfferPrice) {
    this.showOfferPrice = showOfferPrice;
    return this;
  }

   /**
   * Get showOfferPrice
   * @return showOfferPrice
  **/
  @Schema(example = "false", description = "")
  public Boolean isShowOfferPrice() {
    return showOfferPrice;
  }

  public void setShowOfferPrice(Boolean showOfferPrice) {
    this.showOfferPrice = showOfferPrice;
  }

  public Profile repositoryType(String repositoryType) {
    this.repositoryType = repositoryType;
    return this;
  }

   /**
   * Get repositoryType
   * @return repositoryType
  **/
  @Schema(description = "")
  public String getRepositoryType() {
    return repositoryType;
  }

  public void setRepositoryType(String repositoryType) {
    this.repositoryType = repositoryType;
  }

  public Profile planStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
    return this;
  }

   /**
   * Get planStartDate
   * @return planStartDate
  **/
  @Schema(description = "")
  public String getPlanStartDate() {
    return planStartDate;
  }

  public void setPlanStartDate(String planStartDate) {
    this.planStartDate = planStartDate;
  }

  public Profile premiumPlanActive(Boolean premiumPlanActive) {
    this.premiumPlanActive = premiumPlanActive;
    return this;
  }

   /**
   * Get premiumPlanActive
   * @return premiumPlanActive
  **/
  @Schema(example = "false", description = "")
  public Boolean isPremiumPlanActive() {
    return premiumPlanActive;
  }

  public void setPremiumPlanActive(Boolean premiumPlanActive) {
    this.premiumPlanActive = premiumPlanActive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.addresses, profile.addresses) &&
        Objects.equals(this.gender, profile.gender) &&
        Objects.equals(this.turnOverBrokerageSaving, profile.turnOverBrokerageSaving) &&
        Objects.equals(this.dpid, profile.dpid) &&
        Objects.equals(this.bankAccounts, profile.bankAccounts) &&
        Objects.equals(this.premiumPlanRenewed, profile.premiumPlanRenewed) &&
        Objects.equals(this.offerType, profile.offerType) &&
        Objects.equals(this.poaFlag, profile.poaFlag) &&
        Objects.equals(this.inActiveFrom, profile.inActiveFrom) &&
        Objects.equals(this.segment, profile.segment) &&
        Objects.equals(this.pan, profile.pan) &&
        Objects.equals(this.planEndDate, profile.planEndDate) &&
        Objects.equals(this.email, profile.email) &&
        Objects.equals(this.activeFrom, profile.activeFrom) &&
        Objects.equals(this.planActualPrice, profile.planActualPrice) &&
        Objects.equals(this.planType, profile.planType) &&
        Objects.equals(this.address, profile.address) &&
        Objects.equals(this.mobile, profile.mobile) &&
        Objects.equals(this.ddpiFlag, profile.ddpiFlag) &&
        Objects.equals(this.clientCode, profile.clientCode) &&
        Objects.equals(this.dob, profile.dob) &&
        Objects.equals(this.name, profile.name) &&
        Objects.equals(this.showOfferPrice, profile.showOfferPrice) &&
        Objects.equals(this.repositoryType, profile.repositoryType) &&
        Objects.equals(this.planStartDate, profile.planStartDate) &&
        Objects.equals(this.premiumPlanActive, profile.premiumPlanActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, gender, turnOverBrokerageSaving, dpid, bankAccounts, premiumPlanRenewed, offerType, poaFlag, inActiveFrom, segment, pan, planEndDate, email, activeFrom, planActualPrice, planType, address, mobile, ddpiFlag, clientCode, dob, name, showOfferPrice, repositoryType, planStartDate, premiumPlanActive);
  }


  @Override
  public String toString() {

      return "class Profile {\n" +
              "    addresses: " + toIndentedString(addresses) + "\n" +
              "    gender: " + toIndentedString(gender) + "\n" +
              "    turnOverBrokerageSaving: " + toIndentedString(turnOverBrokerageSaving) + "\n" +
              "    dpid: " + toIndentedString(dpid) + "\n" +
              "    bankAccounts: " + toIndentedString(bankAccounts) + "\n" +
              "    premiumPlanRenewed: " + toIndentedString(premiumPlanRenewed) + "\n" +
              "    offerType: " + toIndentedString(offerType) + "\n" +
              "    poaFlag: " + toIndentedString(poaFlag) + "\n" +
              "    inActiveFrom: " + toIndentedString(inActiveFrom) + "\n" +
              "    segment: " + toIndentedString(segment) + "\n" +
              "    pan: " + toIndentedString(pan) + "\n" +
              "    planEndDate: " + toIndentedString(planEndDate) + "\n" +
              "    email: " + toIndentedString(email) + "\n" +
              "    activeFrom: " + toIndentedString(activeFrom) + "\n" +
              "    planActualPrice: " + toIndentedString(planActualPrice) + "\n" +
              "    planType: " + toIndentedString(planType) + "\n" +
              "    address: " + toIndentedString(address) + "\n" +
              "    mobile: " + toIndentedString(mobile) + "\n" +
              "    ddpiFlag: " + toIndentedString(ddpiFlag) + "\n" +
              "    clientCode: " + toIndentedString(clientCode) + "\n" +
              "    dob: " + toIndentedString(dob) + "\n" +
              "    name: " + toIndentedString(name) + "\n" +
              "    showOfferPrice: " + toIndentedString(showOfferPrice) + "\n" +
              "    repositoryType: " + toIndentedString(repositoryType) + "\n" +
              "    planStartDate: " + toIndentedString(planStartDate) + "\n" +
              "    premiumPlanActive: " + toIndentedString(premiumPlanActive) + "\n" +
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
