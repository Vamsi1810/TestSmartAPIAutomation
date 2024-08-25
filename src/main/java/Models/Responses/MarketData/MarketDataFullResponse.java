package Models.Responses.MarketData;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MarketDataFullResponse {
    static class Full {
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

        @JsonProperty("lastTradeQty")
        private int lastTradeQty;

        @JsonProperty("exchFeedTime")
        private String exchFeedTime;

        @JsonProperty("exchTradeTime")
        private String exchTradeTime;

        @JsonProperty("netChange")
        private double netChange;

        @JsonProperty("percentChange")
        private double percentChange;

        @JsonProperty("avgPrice")
        private double avgPrice;

        @JsonProperty("tradeVolume")
        private int tradeVolume;

        @JsonProperty("opnInterest")
        private int opnInterest;

        @JsonProperty("lowerCircuit")
        private double lowerCircuit;

        @JsonProperty("upperCircuit")
        private double upperCircuit;

        @JsonProperty("totBuyQuan")
        private int totBuyQuan;

        @JsonProperty("totSellQuan")
        private int totSellQuan;

        @JsonProperty("52WeekLow")
        private double fiftyTwoWeekLow;

        @JsonProperty("52WeekHigh")
        private double fiftyTwoWeekHigh;

        public static class MarketDepth {
            public static class Depth {
                @JsonProperty
                private double price;
                @JsonProperty
                private int quantity;
                @JsonProperty
                private int orders;

                public double getPrice() {
                    return price;
                }

                public void setPrice(double price) {
                    this.price = price;
                }

                public int getQuantity() {
                    return quantity;
                }

                public void setQuantity(int quantity) {
                    this.quantity = quantity;
                }

                public int getOrders() {
                    return orders;
                }

                public void setOrders(int orders) {
                    this.orders = orders;
                }
            }

            @JsonProperty
            private Depth[] buy;
            @JsonProperty
            private Depth[] sell;

            public Depth[] getBuy() {
                return buy;
            }

            public void setBuy(Depth[] buy) {
                this.buy = buy;
            }

            public Depth[] getSell() {
                return sell;
            }

            public void setSell(Depth[] sell) {
                this.sell = sell;
            }
        }

        @JsonProperty("depth")
        private MarketDepth depth;

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

        public int getLastTradeQty() {
            return lastTradeQty;
        }

        public void setLastTradeQty(int lastTradeQty) {
            this.lastTradeQty = lastTradeQty;
        }

        public String getExchFeedTime() {
            return exchFeedTime;
        }

        public void setExchFeedTime(String exchFeedTime) {
            this.exchFeedTime = exchFeedTime;
        }

        public String getExchTradeTime() {
            return exchTradeTime;
        }

        public void setExchTradeTime(String exchTradeTime) {
            this.exchTradeTime = exchTradeTime;
        }

        public double getNetChange() {
            return netChange;
        }

        public void setNetChange(double netChange) {
            this.netChange = netChange;
        }

        public double getPercentChange() {
            return percentChange;
        }

        public void setPercentChange(double percentChange) {
            this.percentChange = percentChange;
        }

        public double getAvgPrice() {
            return avgPrice;
        }

        public void setAvgPrice(double avgPrice) {
            this.avgPrice = avgPrice;
        }

        public int getTradeVolume() {
            return tradeVolume;
        }

        public void setTradeVolume(int tradeVolume) {
            this.tradeVolume = tradeVolume;
        }

        public int getOpnInterest() {
            return opnInterest;
        }

        public void setOpnInterest(int opnInterest) {
            this.opnInterest = opnInterest;
        }

        public double getLowerCircuit() {
            return lowerCircuit;
        }

        public void setLowerCircuit(double lowerCircuit) {
            this.lowerCircuit = lowerCircuit;
        }

        public double getUpperCircuit() {
            return upperCircuit;
        }

        public void setUpperCircuit(double upperCircuit) {
            this.upperCircuit = upperCircuit;
        }

        public int getTotBuyQuan() {
            return totBuyQuan;
        }

        public void setTotBuyQuan(int totBuyQuan) {
            this.totBuyQuan = totBuyQuan;
        }

        public int getTotSellQuan() {
            return totSellQuan;
        }

        public void setTotSellQuan(int totSellQuan) {
            this.totSellQuan = totSellQuan;
        }

        public double getFiftyTwoWeekLow() {
            return fiftyTwoWeekLow;
        }

        public void setFiftyTwoWeekLow(double fiftyTwoWeekLow) {
            this.fiftyTwoWeekLow = fiftyTwoWeekLow;
        }

        public double getFiftyTwoWeekHigh() {
            return fiftyTwoWeekHigh;
        }

        public void setFiftyTwoWeekHigh(double fiftyTwoWeekHigh) {
            this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
        }

        public MarketDepth getDepth() {
            return depth;
        }

        public void setDepth(MarketDepth depth) {
            this.depth = depth;
        }
    }
    @JsonProperty
    private List<Full> fetched;
    @JsonProperty
    private List<Full> unfetched;

    public List<Full> getFetched() {
        return fetched;
    }

    public void setFetched(List<Full> fetched) {
        this.fetched = fetched;
    }

    public List<Full> getUnfetched() {
        return unfetched;
    }

    public void setUnfetched(List<Full> unfetched) {
        this.unfetched = unfetched;
    }
}
