package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TpinRequest {
    @JsonProperty("dpId")
    private String dpId;

    @JsonProperty("ReqId")
    private String reqId;

    @JsonProperty("boid")
    private String boid;

    @JsonProperty("pan")
    private String pan;

    public TpinRequest(String dpId, String reqId, String boid, String pan) {
        this.dpId = dpId;
        this.reqId = reqId;
        this.boid = boid;
        this.pan = pan;
    }

    public String getDpId() {
        return dpId;
    }

    public void setDpId(String dpId) {
        this.dpId = dpId;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getBoid() {
        return boid;
    }

    public void setBoid(String boid) {
        this.boid = boid;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }
}
