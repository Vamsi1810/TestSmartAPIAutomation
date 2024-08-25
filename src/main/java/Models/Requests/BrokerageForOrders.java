package Models.Requests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrokerageForOrders {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public class BrokerageForOrder {
        @JsonProperty("product_type")
        private String product_type;

        @JsonProperty("transaction_type")
        private String transaction_type;

        @JsonProperty("quantity")
        private String quantity;

        @JsonProperty("price")
        private String price;

        @JsonProperty("exchange")
        private String exchange;

        @JsonProperty("symbol_name")
        private String symbol_name;

        @JsonProperty("token")
        private String token;
        @JsonCreator
        public BrokerageForOrder(String product_type, String transaction_type, String quantity, String price, String exchange, String symbol_name, String token) {
            this.product_type = product_type;
            this.transaction_type = transaction_type;
            this.quantity = quantity;
            this.price = price;
            this.exchange = exchange;
            this.symbol_name = symbol_name;
            this.token = token;
        }
        public BrokerageForOrder(){}

        public String getProduct_type() {
            return product_type;
        }

        public void setProduct_type(String product_type) {
            this.product_type = product_type;
        }

        public String getTransaction_type() {
            return transaction_type;
        }

        public void setTransaction_type(String transaction_type) {
            this.transaction_type = transaction_type;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getExchange() {
            return exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

        public String getSymbol_name() {
            return symbol_name;
        }

        public void setSymbol_name(String symbol_name) {
            this.symbol_name = symbol_name;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
    @JsonProperty("orders")
    public BrokerageForOrder[] orders;
    @JsonCreator
    public BrokerageForOrders(BrokerageForOrder[] orders){
        this.orders = orders;
    }
    public BrokerageForOrders(){
    }

    public BrokerageForOrder[] getOrders() {
        return orders;
    }

    public void setOrders(BrokerageForOrder[] orders) {
        this.orders = orders;
    }
}
