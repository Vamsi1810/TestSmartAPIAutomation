package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MarginCalculatorRequest {
    public static class Position{
        @JsonProperty
        private String exchange;
        @JsonProperty
        private int qty;
        @JsonProperty
        private int price;
        @JsonProperty
        private String productType;
        @JsonProperty
        private String token;
        @JsonProperty
        private String tradeType;

        public Position(String exchange, int qty, int price, String productType, String token, String tradeType) {
            this.exchange = exchange;
            this.qty = qty;
            this.price = price;
            this.productType = productType;
            this.token = token;
            this.tradeType = tradeType;
        }

        public String getExchange() {
            return exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
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

        public String getTradeType() {
            return tradeType;
        }

        public void setTradeType(String tradeType) {
            this.tradeType = tradeType;
        }
    }
    @JsonProperty
    private Position[] positions;

    public MarginCalculatorRequest(Position[] positions) {
        this.positions = positions;
    }

    public Position[] getPositions() {
        return positions;
    }

    public void setPositions(Position[] positions) {
        this.positions = positions;
    }
}
