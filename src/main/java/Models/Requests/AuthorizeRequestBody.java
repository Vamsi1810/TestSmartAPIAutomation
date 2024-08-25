package Models.Requests;

public class AuthorizeRequestBody {
    private String ReqId;

    public AuthorizeRequestBody(String reqId) {
        ReqId = reqId;
    }

    public String getReqId() {
        return ReqId;
    }

    public void setReqId(String reqId) {
        ReqId = reqId;
    }
}
