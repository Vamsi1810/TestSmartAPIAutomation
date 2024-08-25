package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScripTokenRequest {
    @JsonProperty(value="exchange")
    public String exchange;

    @JsonProperty(value="searchscrip")
    public String searchscrip;

    public ScripTokenRequest(String exchange, String searchscrip) {
        this.exchange = exchange;
        this.searchscrip = searchscrip;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getSearchscrip() {
        return searchscrip;
    }

    public void setSearchscrip(String searchscrip) {
        this.searchscrip = searchscrip;
    }
}
