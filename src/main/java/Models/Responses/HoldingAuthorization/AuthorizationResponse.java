package Models.Responses.HoldingAuthorization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthorizationResponse {
    @JsonProperty("ReqId")
    private String reqId;

    @JsonProperty("ReturnURL")
    private String returnURL;

    @JsonProperty("DPId")
    private String dpId;

    @JsonProperty("BOID")
    private String boid;

    @JsonProperty("TransDtls")
    private String transDtls;

    @JsonProperty("version")
    private String version;

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getReturnURL() {
        return returnURL;
    }

    public void setReturnURL(String returnURL) {
        this.returnURL = returnURL;
    }

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getBoid() {
        return boid;
    }

    public void setBoid(String boid) {
        this.boid = boid;
    }

    public String getTransDtls() {
        return transDtls;
    }

    public void setTransDtls(String transDtls) {
        this.transDtls = transDtls;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
