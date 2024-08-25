package Models.Responses.MarketData;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MarketDataOHLCResponse {
    static class OHLC{
        @JsonProperty("exchange")
        private String exchange;

        @JsonProperty("tradingSymbol")
        private String tradingSymbol;

        @JsonProperty("symbolToken")
        private String symbolToken;

        @JsonProperty("ltp")
        private double ltp;

        @JsonProperty("open")
        private double open;

        @JsonProperty("high")
        private double high;

        @JsonProperty("low")
        private double low;

        @JsonProperty("close")
        private double close;

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

        public double getOpen() {
            return open;
        }

        public void setOpen(double open) {
            this.open = open;
        }

        public double getHigh() {
            return high;
        }

        public void setHigh(double high) {
            this.high = high;
        }

        public double getLow() {
            return low;
        }

        public void setLow(double low) {
            this.low = low;
        }

        public double getClose() {
            return close;
        }

        public void setClose(double close) {
            this.close = close;
        }
    }
    @JsonProperty
    private List<OHLC> fetched;
    @JsonProperty
    private List<OHLC> unfetched;
    public List<OHLC> getFetched() {
        return fetched;
    }
    public void setFetched(List<OHLC> fetched) {
        this.fetched = fetched;
    }
    public List<OHLC> getUnfetched() {
        return unfetched;
    }
    public void setUnfetched(List<OHLC> unfetched) {
        this.unfetched = unfetched;
    }
}
