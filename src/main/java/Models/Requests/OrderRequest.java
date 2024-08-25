package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Pattern;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderRequest {
    @JsonProperty("orderid")
    private String orderid;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @JsonProperty("uniqueorderid")
    private String uniqueorderid;

    public String getUniqueorderid() {
        return uniqueorderid;
    }

    public void setUniqueorderid(String uniqueorderid) {
        this.uniqueorderid = uniqueorderid;
    }

    @JsonProperty("variety")
    @Pattern(regexp = "NORMAL|STOPLOSS|AMO|ROBO")
    private String variety;

    @JsonProperty("tradingsymbol")
    private String tradingsymbol;

    @JsonProperty("symboltoken")
    private String symboltoken;

    @JsonProperty("transactiontype")
    @Pattern(regexp="BUY|SELL")
    private String transactiontype;

    @JsonProperty("exchange")
    @Pattern(regexp="BSE|NSE|NFO|MCX|BFO|CDS")
    private String exchange;

    @JsonProperty("ordertype")
    @Pattern(regexp="MARKET|LIMIT|STOPLOSS_LIMIT|STOPLOSS_MARKET")
    private String ordertype;

    @JsonProperty("producttype")
    @Pattern(regexp = "DELIVERY|CARRYFORWARD|MARGIN|INTRADAY|BO")
    private String producttype;

    @JsonProperty("duration")
    @Pattern(regexp="DAY|IOC")
    private String duration;

    @JsonProperty("price")
    private String price;

    @JsonProperty("squareoff")
    private String squareoff;

    @JsonProperty("stoploss")
    private String stoploss;

    @JsonProperty("quantity")
    private String quantity;

    public OrderRequest(String orderid, String variety) {
        this.orderid = orderid;
        this.variety = variety;
    }

    public OrderRequest(String orderid, String variety, String tradingsymbol,String exchange, String ordertype, String producttype, String duration, String price, String quantity) {
        this.orderid = orderid;
        this.variety = variety;
        this.tradingsymbol = tradingsymbol;
        this.exchange = exchange;
        this.ordertype = ordertype;
        this.producttype = producttype;
        this.duration = duration;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderRequest(String variety, String tradingsymbol,String transactiontype, String exchange, String ordertype, String producttype, String duration, String price, String squareoff, String stoploss, String quantity) {
        this.variety = variety;
        this.tradingsymbol = tradingsymbol;
        this.transactiontype = transactiontype;
        this.exchange = exchange;
        this.ordertype = ordertype;
        this.producttype = producttype;
        this.duration = duration;
        this.price = price;
        this.squareoff = squareoff;
        this.stoploss = stoploss;
        this.quantity = quantity;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getTradingsymbol() {
        return tradingsymbol;
    }

    public void setTradingsymbol(String tradingsymbol) {
        this.tradingsymbol = tradingsymbol;
    }

    public String getSymboltoken() {
        return symboltoken;
    }

    public void setSymboltoken(String symboltoken) {
        this.symboltoken = symboltoken;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSquareoff() {
        return squareoff;
    }

    public void setSquareoff(String squareoff) {
        this.squareoff = squareoff;
    }

    public String getStoploss() {
        return stoploss;
    }

    public void setStoploss(String stoploss) {
        this.stoploss = stoploss;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
