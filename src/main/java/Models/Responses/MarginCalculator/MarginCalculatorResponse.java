package Models.Responses.MarginCalculator;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarginCalculatorResponse {
    @JsonProperty
    private double totalMarginRequired;
    static class MarginComponents{
        @JsonProperty
        private int netPremium;
        @JsonProperty
        private int spanMargin;
        @JsonProperty
        private double marginBenefit;
        @JsonProperty
        private int deliveryMargin;
        @JsonProperty
        private int nonNFOMargin;
        @JsonProperty
        private int totOptionsPremium;

        public int getNetPremium() {
            return netPremium;
        }

        public void setNetPremium(int netPremium) {
            this.netPremium = netPremium;
        }

        public int getSpanMargin() {
            return spanMargin;
        }

        public void setSpanMargin(int spanMargin) {
            this.spanMargin = spanMargin;
        }

        public double getMarginBenefit() {
            return marginBenefit;
        }

        public void setMarginBenefit(double marginBenefit) {
            this.marginBenefit = marginBenefit;
        }

        public int getDeliveryMargin() {
            return deliveryMargin;
        }

        public void setDeliveryMargin(int deliveryMargin) {
            this.deliveryMargin = deliveryMargin;
        }

        public int getNonNFOMargin() {
            return nonNFOMargin;
        }

        public void setNonNFOMargin(int nonNFOMargin) {
            this.nonNFOMargin = nonNFOMargin;
        }

        public int getTotOptionsPremium() {
            return totOptionsPremium;
        }

        public void setTotOptionsPremium(int totOptionsPremium) {
            this.totOptionsPremium = totOptionsPremium;
        }
    }
    @JsonProperty
    private MarginComponents marginComponents;
    static class MarginBreakup{
        @JsonProperty
        private String exchange;
        @JsonProperty
        private String productType;
        @JsonProperty
        private double totalMarginRequired;

        public String getExchange() {
            return exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

        public String getProductType() {
            return productType;
        }

        public void setProductType(String productType) {
            this.productType = productType;
        }

        public double getTotalMarginRequired() {
            return totalMarginRequired;
        }

        public void setTotalMarginRequired(double totalMarginRequired) {
            this.totalMarginRequired = totalMarginRequired;
        }
    }
    @JsonProperty
    private MarginBreakup[] marginBreakup;
    static class OptionsBuy{
        static class OptionDetails{
            @JsonProperty
            private String exchange;
            @JsonProperty
            private String productType;
            @JsonProperty
            private String token;
            @JsonProperty
            private int lotMultiplier;
            @JsonProperty
            private int optionPremium;

            public String getExchange() {
                return exchange;
            }

            public void setExchange(String exchange) {
                this.exchange = exchange;
            }

            public String getProductType() {
                return productType;
            }

            public void setProductType(String productType) {
                this.productType = productType;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public int getLotMultiplier() {
                return lotMultiplier;
            }

            public void setLotMultiplier(int lotMultiplier) {
                this.lotMultiplier = lotMultiplier;
            }

            public int getOptionPremium() {
                return optionPremium;
            }

            public void setOptionPremium(int optionPremium) {
                this.optionPremium = optionPremium;
            }
        }
        @JsonProperty
        private int totOptionsPremium;
        @JsonProperty
        private OptionDetails[] optionDetails;

        public int getTotOptionsPremium() {
            return totOptionsPremium;
        }

        public void setTotOptionsPremium(int totOptionsPremium) {
            this.totOptionsPremium = totOptionsPremium;
        }

        public OptionDetails[] getOptionDetails() {
            return optionDetails;
        }

        public void setOptionDetails(OptionDetails[] optionDetails) {
            this.optionDetails = optionDetails;
        }
    }
    @JsonProperty
    private OptionsBuy optionsBuy;
}
