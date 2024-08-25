package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginRequest {
    @JsonProperty(value = "clientcode", required = true)
    private String clientcode;

    @JsonProperty(value = "password", required = true)
    private String password;

    @JsonProperty(value = "totp", required = true)
    private String totp;

    public LoginRequest(String clientcode, String password, String totp) {
        this.clientcode = clientcode;
        this.password = password;
        this.totp = totp;
    }

    // Getters and setters
    public String getClientcode() {
        return clientcode;
    }

    public void setClientcode(String clientcode) {
        this.clientcode = clientcode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTotp() {
        return totp;
    }

    public void setTotp(String totp) {
        this.totp = totp;
    }
}
