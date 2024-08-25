package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LTPDataRequest {
    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("tradingsymbol")
    private String tradingSymbol;

    @JsonProperty("symboltoken")
    private String symbolToken;

    public LTPDataRequest(String exchange, String tradingSymbol, String symbolToken) {
        this.exchange = exchange;
        this.tradingSymbol = tradingSymbol;
        this.symbolToken = symbolToken;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public String getSymbolToken() {
        return symbolToken;
    }

    public void setSymbolToken(String symbolToken) {
        this.symbolToken = symbolToken;
    }
}
