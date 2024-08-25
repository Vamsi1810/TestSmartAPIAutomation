package Models.Responses.Portfolio;


import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAllHoldingsResponse {
    @JsonProperty
    private PortfolioResponse[] holdings;

    static class TotalHolding{
        @JsonProperty
        private int totalholdingvalue;
        @JsonProperty
        private int totalinvvalue;
        @JsonProperty
        private double totalprofitandloss;
        @JsonProperty
        private double totalpnlpercentage;

        public int getTotalholdingvalue() {
            return totalholdingvalue;
        }

        public void setTotalholdingvalue(int totalholdingvalue) {
            this.totalholdingvalue = totalholdingvalue;
        }

        public int getTotalinvvalue() {
            return totalinvvalue;
        }

        public void setTotalinvvalue(int totalinvvalue) {
            this.totalinvvalue = totalinvvalue;
        }

        public double getTotalprofitandloss() {
            return totalprofitandloss;
        }

        public void setTotalprofitandloss(double totalprofitandloss) {
            this.totalprofitandloss = totalprofitandloss;
        }

        public double getTotalpnlpercentage() {
            return totalpnlpercentage;
        }

        public void setTotalpnlpercentage(double totalpnlpercentage) {
            this.totalpnlpercentage = totalpnlpercentage;
        }
    }
    @JsonProperty
    private TotalHolding totalholding;

    public PortfolioResponse[] getHoldings() {
        return holdings;
    }

    public void setHoldings(PortfolioResponse[] holdings) {
        this.holdings = holdings;
    }

    public TotalHolding getTotalHolding() {
        return totalholding;
    }

    public void setTotalHolding(TotalHolding totalHolding) {
        this.totalholding = totalHolding;
    }
}
