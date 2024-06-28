package io.swagger.client.model.login;

public class Data {
    private String accessToken;
    private String refreshToken;
    private String expiryTime;
    private Boolean ddpi;
    private String poaFlag;
    private String intellectJwtToken;
    private String mobileNumber;
    private Boolean mpinEnabled;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    public Boolean getMpinEnabled() {
        return mpinEnabled;
    }

    public void setMpinEnabled(Boolean mpinEnabled) {
        this.mpinEnabled = mpinEnabled;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getIntellectJwtToken() {
        return intellectJwtToken;
    }

    public void setIntellectJwtToken(String intellectJwtToken) {
        this.intellectJwtToken = intellectJwtToken;
    }

    public String getPoaFlag() {
        return poaFlag;
    }

    public void setPoaFlag(String poaFlag) {
        this.poaFlag = poaFlag;
    }

    public Boolean getDdpi() {
        return ddpi;
    }

    public void setDdpi(Boolean ddpi) {
        this.ddpi = ddpi;
    }
}
