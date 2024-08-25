package Models.Responses.Orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndividualOrderStatusResponse {
    @JsonProperty("variety")
    private String variety;

    @JsonProperty("ordertype")
    private String orderType;

    @JsonProperty("producttype")
    private String productType;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("price")
    private double price;

    @JsonProperty("triggerprice")
    private double triggerPrice;

    @JsonProperty("quantity")
    private String quantity;

    @JsonProperty("disclosedquantity")
    private String disclosedQuantity;

    @JsonProperty("squareoff")
    private double squareOff;

    @JsonProperty("stoploss")
    private double stopLoss;

    @JsonProperty("trailingstoploss")
    private double trailingStopLoss;

    @JsonProperty("tradingsymbol")
    private String tradingSymbol;

    @JsonProperty("transactiontype")
    private String transactionType;

    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("symboltoken")
    private String symbolToken;

    @JsonProperty("instrumenttype")
    private String instrumentType;

    @JsonProperty("strikeprice")
    private double strikePrice;

    @JsonProperty("optiontype")
    private String optionType;

    @JsonProperty("expirydate")
    private String expiryDate;

    @JsonProperty("lotsize")
    private String lotSize;

    @JsonProperty("cancelsize")
    private String cancelSize;

    @JsonProperty("averageprice")
    private double averagePrice;

    @JsonProperty("filledshares")
    private String filledShares;

    @JsonProperty("unfilledshares")
    private String unfilledShares;

    @JsonProperty("orderid")
    private String orderId;

    @JsonProperty("text")
    private String text;

    @JsonProperty("status")
    private String status;

    @JsonProperty("orderstatus")
    private String orderStatus;

    @JsonProperty("updatetime")
    private String updateTime;

    @JsonProperty("exchtime")
    private String exchTime;

    @JsonProperty("exchorderupdatetime")
    private String exchOrderUpdateTime;

    @JsonProperty("fillid")
    private String fillId;

    @JsonProperty("filltime")
    private String fillTime;

    @JsonProperty("parentorderid")
    private String parentOrderId;

    @JsonProperty("ordertag")
    private String orderTag;

    @JsonProperty("uniqueorderid")
    private String uniqueOrderId;

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTriggerPrice() {
        return triggerPrice;
    }

    public void setTriggerPrice(double triggerPrice) {
        this.triggerPrice = triggerPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDisclosedQuantity() {
        return disclosedQuantity;
    }

    public void setDisclosedQuantity(String disclosedQuantity) {
        this.disclosedQuantity = disclosedQuantity;
    }

    public double getSquareOff() {
        return squareOff;
    }

    public void setSquareOff(double squareOff) {
        this.squareOff = squareOff;
    }

    public double getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    public double getTrailingStopLoss() {
        return trailingStopLoss;
    }

    public void setTrailingStopLoss(double trailingStopLoss) {
        this.trailingStopLoss = trailingStopLoss;
    }

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getSymbolToken() {
        return symbolToken;
    }

    public void setSymbolToken(String symbolToken) {
        this.symbolToken = symbolToken;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getLotSize() {
        return lotSize;
    }

    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    public String getCancelSize() {
        return cancelSize;
    }

    public void setCancelSize(String cancelSize) {
        this.cancelSize = cancelSize;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getFilledShares() {
        return filledShares;
    }

    public void setFilledShares(String filledShares) {
        this.filledShares = filledShares;
    }

    public String getUnfilledShares() {
        return unfilledShares;
    }

    public void setUnfilledShares(String unfilledShares) {
        this.unfilledShares = unfilledShares;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getExchTime() {
        return exchTime;
    }

    public void setExchTime(String exchTime) {
        this.exchTime = exchTime;
    }

    public String getExchOrderUpdateTime() {
        return exchOrderUpdateTime;
    }

    public void setExchOrderUpdateTime(String exchOrderUpdateTime) {
        this.exchOrderUpdateTime = exchOrderUpdateTime;
    }

    public String getFillId() {
        return fillId;
    }

    public void setFillId(String fillId) {
        this.fillId = fillId;
    }

    public String getFillTime() {
        return fillTime;
    }

    public void setFillTime(String fillTime) {
        this.fillTime = fillTime;
    }

    public String getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(String parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getOrderTag() {
        return orderTag;
    }

    public void setOrderTag(String orderTag) {
        this.orderTag = orderTag;
    }

    public String getUniqueOrderId() {
        return uniqueOrderId;
    }

    public void setUniqueOrderId(String uniqueOrderId) {
        this.uniqueOrderId = uniqueOrderId;
    }
}
