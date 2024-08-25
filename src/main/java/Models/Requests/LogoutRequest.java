package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogoutRequest {
    @JsonProperty(value = "clientcode")
    public String clientcode;

    public LogoutRequest(String clientcode) {
        this.clientcode = clientcode;
    }

    public String getClientcode() {
        return clientcode;
    }

    public void setClientcode(String clientcode) {
        this.clientcode = clientcode;
    }
}
