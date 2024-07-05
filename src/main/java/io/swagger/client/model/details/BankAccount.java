package io.swagger.client.model.details;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * BankAccount
 */

public class BankAccount {
  @SerializedName("defaultBank")
  private Boolean defaultBank = null;

  @SerializedName("accNo")
  private String accNo = null;

  @SerializedName("chequeName")
  private String chequeName = null;

  @SerializedName("bankName")
  private String bankName = null;

  @SerializedName("accType")
  private String accType = null;

  @SerializedName("micrCode")
  private String micrCode = null;

  @SerializedName("ifscCode")
  private String ifscCode = null;

  public BankAccount defaultBank(Boolean defaultBank) {
    this.defaultBank = defaultBank;
    return this;
  }

   /**
   * Get defaultBank
   * @return defaultBank
  **/
  @Schema(example = "false", description = "")
  public Boolean isDefaultBank() {
    return defaultBank;
  }

  public void setDefaultBank(Boolean defaultBank) {
    this.defaultBank = defaultBank;
  }

  public BankAccount accNo(String accNo) {
    this.accNo = accNo;
    return this;
  }

   /**
   * Get accNo
   * @return accNo
  **/
  @Schema(example = "001101514870", description = "")
  public String getAccNo() {
    return accNo;
  }

  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }

  public BankAccount chequeName(String chequeName) {
    this.chequeName = chequeName;
    return this;
  }

   /**
   * Get chequeName
   * @return chequeName
  **/
  @Schema(description = "")
  public String getChequeName() {
    return chequeName;
  }

  public void setChequeName(String chequeName) {
    this.chequeName = chequeName;
  }

  public BankAccount bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Get bankName
   * @return bankName
  **/
  @Schema(example = "ICICI BANK LIMITED", description = "")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public BankAccount accType(String accType) {
    this.accType = accType;
    return this;
  }

   /**
   * Get accType
   * @return accType
  **/
  @Schema(example = "SAVINGS", description = "")
  public String getAccType() {
    return accType;
  }

  public void setAccType(String accType) {
    this.accType = accType;
  }

  public BankAccount micrCode(String micrCode) {
    this.micrCode = micrCode;
    return this;
  }

   /**
   * Get micrCode
   * @return micrCode
  **/
  @Schema(description = "")
  public String getMicrCode() {
    return micrCode;
  }

  public void setMicrCode(String micrCode) {
    this.micrCode = micrCode;
  }

  public BankAccount ifscCode(String ifscCode) {
    this.ifscCode = ifscCode;
    return this;
  }

   /**
   * Get ifscCode
   * @return ifscCode
  **/
  @Schema(example = "ICIC0000011", description = "")
  public String getIfscCode() {
    return ifscCode;
  }

  public void setIfscCode(String ifscCode) {
    this.ifscCode = ifscCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccount bankAccount = (BankAccount) o;
    return Objects.equals(this.defaultBank, bankAccount.defaultBank) &&
        Objects.equals(this.accNo, bankAccount.accNo) &&
        Objects.equals(this.chequeName, bankAccount.chequeName) &&
        Objects.equals(this.bankName, bankAccount.bankName) &&
        Objects.equals(this.accType, bankAccount.accType) &&
        Objects.equals(this.micrCode, bankAccount.micrCode) &&
        Objects.equals(this.ifscCode, bankAccount.ifscCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultBank, accNo, chequeName, bankName, accType, micrCode, ifscCode);
  }


  @Override
  public String toString() {

      return "class BankAccount {\n" +
              "    defaultBank: " + toIndentedString(defaultBank) + "\n" +
              "    accNo: " + toIndentedString(accNo) + "\n" +
              "    chequeName: " + toIndentedString(chequeName) + "\n" +
              "    bankName: " + toIndentedString(bankName) + "\n" +
              "    accType: " + toIndentedString(accType) + "\n" +
              "    micrCode: " + toIndentedString(micrCode) + "\n" +
              "    ifscCode: " + toIndentedString(ifscCode) + "\n" +
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
