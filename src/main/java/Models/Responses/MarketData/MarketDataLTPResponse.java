package Models.Responses.MarketData;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MarketDataLTPResponse {
    static class LTP{
        @JsonProperty
        private String exchange;
        @JsonProperty
        private String tradingSymbol;
        @JsonProperty
        private String symbolToken;
        @JsonProperty
        private double ltp;

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

        public double getLtp() {
            return ltp;
        }

        public void setLtp(double ltp) {
            this.ltp = ltp;
        }
    }
    @JsonProperty
    private List<LTP> fetched;
    @JsonProperty
    private List<LTP> unfetched;
    public List<LTP> getFetched() {
        return fetched;
    }
    public void setFetched(List<LTP> fetched) {
        this.fetched = fetched;
    }
    public List<LTP> getUnfetched() {
        return unfetched;
    }
    public void setUnfetched(List<LTP> unfetched) {
        this.unfetched = unfetched;
    }
}
