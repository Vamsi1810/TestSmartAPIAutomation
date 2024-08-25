package Models.Responses.Orders;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TradeBookResponse {
    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("producttype")
    private String productType;

    @JsonProperty("tradingsymbol")
    private String tradingSymbol;

    @JsonProperty("instrumenttype")
    private String instrumentType;

    @JsonProperty("symbolgroup")
    private String symbolGroup;

    @JsonProperty("strikeprice")
    private String strikePrice;

    @JsonProperty("optiontype")
    private String optionType;

    @JsonProperty("expirydate")
    private String expiryDate;

    @JsonProperty("marketlot")
    private String marketLot;

    @JsonProperty("precision")
    private String precision;

    @JsonProperty("multiplier")
    private String multiplier;

    @JsonProperty("tradevalue")
    private String tradeValue;

    @JsonProperty("transactiontype")
    private String transactionType;

    @JsonProperty("fillprice")
    private String fillPrice;

    @JsonProperty("fillsize")
    private String fillSize;

    @JsonProperty("orderid")
    private String orderId;

    @JsonProperty("fillid")
    private String fillId;

    @JsonProperty("filltime")
    private String fillTime;

    @JsonProperty("uniqueorderid")
    private String uniqueOrderId;

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

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getSymbolGroup() {
        return symbolGroup;
    }

    public void setSymbolGroup(String symbolGroup) {
        this.symbolGroup = symbolGroup;
    }

    public String getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(String strikePrice) {
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

    public String getMarketLot() {
        return marketLot;
    }

    public void setMarketLot(String marketLot) {
        this.marketLot = marketLot;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public String getTradeValue() {
        return tradeValue;
    }

    public void setTradeValue(String tradeValue) {
        this.tradeValue = tradeValue;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getFillPrice() {
        return fillPrice;
    }

    public void setFillPrice(String fillPrice) {
        this.fillPrice = fillPrice;
    }

    public String getFillSize() {
        return fillSize;
    }

    public void setFillSize(String fillSize) {
        this.fillSize = fillSize;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getUniqueOrderId() {
        return uniqueOrderId;
    }

    public void setUniqueOrderId(String uniqueOrderId) {
        this.uniqueOrderId = uniqueOrderId;
    }
}
