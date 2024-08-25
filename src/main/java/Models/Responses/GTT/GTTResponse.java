package Models.Responses.GTT;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GTTResponse {
    @JsonProperty("id")
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("stoplossprice")
    private double stoplossprice;

    @JsonProperty("stoplosstriggerprice")
    private double stoplosstriggerprice;

    @JsonProperty("gttType")
    private String gttType;

    @JsonProperty("status")
    private String status;

    @JsonProperty("createddate")
    private String createddate;

    @JsonProperty("updateddate")
    private String updateddate;

    @JsonProperty("expirydate")
    private String expirydate;

    @JsonProperty("clientid")
    private String clientid;

    @JsonProperty("tradingsymbol")
    private String tradingsymbol;

    @JsonProperty("symboltoken")
    private String symboltoken;

    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("producttype")
    private String producttype;

    @JsonProperty("transactiontype")
    private String transactiontype;

    @JsonProperty("price")
    private double price;

    @JsonProperty("qty")
    private int qty;

    @JsonProperty("triggerprice")
    private double triggerprice;

    @JsonProperty("disclosedqty")
    private int disclosedqty;

    public double getStoplossprice() {
        return stoplossprice;
    }

    public void setStoplossprice(double stoplossprice) {
        this.stoplossprice = stoplossprice;
    }

    public double getStoplosstriggerprice() {
        return stoplosstriggerprice;
    }

    public void setStoplosstriggerprice(double stoplosstriggerprice) {
        this.stoplosstriggerprice = stoplosstriggerprice;
    }

    public String getGttType() {
        return gttType;
    }

    public void setGttType(String gttType) {
        this.gttType = gttType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getUpdateddate() {
        return updateddate;
    }

    public void setUpdateddate(String updateddate) {
        this.updateddate = updateddate;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
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

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTriggerprice() {
        return triggerprice;
    }

    public void setTriggerprice(double triggerprice) {
        this.triggerprice = triggerprice;
    }

    public int getDisclosedqty() {
        return disclosedqty;
    }

    public void setDisclosedqty(int disclosedqty) {
        this.disclosedqty = disclosedqty;
    }
}
