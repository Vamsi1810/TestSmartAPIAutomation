package Models.Responses.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {
    @JsonProperty("jwtToken")
    private String jwtToken;

    @JsonProperty("refreshToken")
    private String refreshToken;

    @JsonProperty("feedToken")
    private String feedToken;

    @JsonProperty("state")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getFeedToken() {
        return feedToken;
    }

    public void setFeedToken(String feedToken) {
        this.feedToken = feedToken;
    }
}
