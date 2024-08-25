package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class GTTRuleRequest {
    @JsonProperty("id")
    private String id;
    @JsonProperty("tradingsymbol")
    private String tradingsymbol;

    @JsonProperty("symboltoken")
    private String symboltoken;

    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("transactiontype")
    private String transactiontype;

    @JsonProperty("producttype")
    private String producttype;

    @JsonProperty("price")
    private String price;

    @JsonProperty("qty")
    private String qty;

    @JsonProperty("triggerprice")
    private String triggerprice;


    @JsonProperty("timeperiod")
    private String timeperiod;

    @JsonProperty("status")
    private String[] status;

    @JsonProperty("page")
    private Integer page;

    @JsonProperty("count")
    private Integer count;

    public GTTRuleRequest(String[] status, int page, int count){
        this.status = status;
        this.page = page;
        this.count = count;
    }

    public GTTRuleRequest(String id) {
        this.id = id;
    }
    public GTTRuleRequest(String id, String symboltoken, String exchange){
        this.id=id;
        this.symboltoken = symboltoken;
        this.exchange=exchange;
    }
    public GTTRuleRequest(String tradingsymbol, String symboltoken, String exchange, String transactiontype, String producttype, String price, String qty, String triggerprice, String timeperiod) {
        this.tradingsymbol = tradingsymbol;
        this.symboltoken = symboltoken;
        this.exchange = exchange;
        this.transactiontype = transactiontype;
        this.producttype = producttype;
        this.price = price;
        this.qty = qty;
        this.triggerprice = triggerprice;
        this.timeperiod = timeperiod;
    }
    public GTTRuleRequest(String id, String symboltoken, String exchange, String price, String qty, String triggerprice) {
        this.id = id;
        this.symboltoken = symboltoken;
        this.exchange = exchange;
        this.price = price;
        this.qty = qty;
        this.triggerprice = triggerprice;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String gettradingsymbol() {
        return tradingsymbol;
    }

    public void settradingsymbol(String tradingsymbol) {
        this.tradingsymbol = tradingsymbol;
    }

    public String getSymboltoken() {
        return symboltoken;
    }

    public void setSymboltoken(String symboltoken) {
        this.symboltoken = symboltoken;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String gettransactiontype() {
        return transactiontype;
    }

    public void settransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String gettriggerprice() {
        return triggerprice;
    }

    public void settriggerprice(String triggerprice) {
        this.triggerprice = triggerprice;
    }

    public String gettimeperiod() {
        return timeperiod;
    }

    public void settimeperiod(String timeperiod) {
        this.timeperiod = timeperiod;
    }
}
