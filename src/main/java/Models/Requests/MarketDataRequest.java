package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.Pattern;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarketDataRequest {
    @JsonProperty
    @Pattern(regexp = "FULL|OHLC|LTP")
    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ExchangeTokens{

        @JsonProperty(value= "NSE",required = false)
        private String[] NSE;
        @JsonProperty(value = "NFO",required = false)
        private List<String> NFO;
        public ExchangeTokens(String[] NSE, List<String> NFO) {
            this.NSE = NSE;
            this.NFO = NFO;
        }
        public ExchangeTokens(String[] NSE) {
            this.NSE = NSE;
        }
        public ExchangeTokens(List<String> NFO) {
            this.NFO = NFO;
        }

        public void setNSE(String[] NSE) {
            this.NSE = NSE;
        }

        public void setNFO(List<String> NFO) {
            this.NFO = NFO;
        }
    }
    @JsonProperty
    private ExchangeTokens exchangeTokens;

    public MarketDataRequest(String mode, ExchangeTokens exchangeTokens) {
        this.mode = mode;
        this.exchangeTokens = exchangeTokens;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ExchangeTokens getExchangeTokens() {
        return exchangeTokens;
    }

    public void setExchangeTokens(ExchangeTokens exchangeTokens) {
        this.exchangeTokens = exchangeTokens;
    }
}
