package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConvertPositionRequest {
    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("symboltoken")
    private String symbolToken;

    @JsonProperty("producttype")
    private String productType;

    @JsonProperty("newproducttype")
    private String newProductType;

    @JsonProperty("tradingsymbol")
    private String tradingSymbol;

    @JsonProperty("symbolname")
    private String symbolName;

    @JsonProperty("instrumenttype")
    private String instrumentType;

    @JsonProperty("priceden")
    private String priceDen;

    @JsonProperty("pricenum")
    private String priceNum;

    @JsonProperty("genden")
    private String genDen;

    @JsonProperty("gennum")
    private String genNum;

    @JsonProperty("precision")
    private String precision;

    @JsonProperty("multiplier")
    private String multiplier;

    @JsonProperty("boardlotsize")
    private String boardLotSize;

    @JsonProperty("buyqty")
    private String buyQty;

    @JsonProperty("sellqty")
    private String sellQty;

    @JsonProperty("buyamount")
    private String buyAmount;

    @JsonProperty("sellamount")
    private String sellAmount;

    @JsonProperty("transactiontype")
    private String transactionType;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("type")
    private String type;

    public ConvertPositionRequest(String exchange, String symbolToken, String productType, String newProductType, String tradingSymbol, String symbolName, String instrumentType, String priceDen, String priceNum, String genDen, String genNum, String precision, String multiplier, String boardLotSize, String buyQty, String sellQty, String buyAmount, String sellAmount, String transactionType, int quantity, String type) {
        this.exchange = exchange;
        this.symbolToken = symbolToken;
        this.productType = productType;
        this.newProductType = newProductType;
        this.tradingSymbol = tradingSymbol;
        this.symbolName = symbolName;
        this.instrumentType = instrumentType;
        this.priceDen = priceDen;
        this.priceNum = priceNum;
        this.genDen = genDen;
        this.genNum = genNum;
        this.precision = precision;
        this.multiplier = multiplier;
        this.boardLotSize = boardLotSize;
        this.buyQty = buyQty;
        this.sellQty = sellQty;
        this.buyAmount = buyAmount;
        this.sellAmount = sellAmount;
        this.transactionType = transactionType;
        this.quantity = quantity;
        this.type = type;
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

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getNewProductType() {
        return newProductType;
    }

    public void setNewProductType(String newProductType) {
        this.newProductType = newProductType;
    }

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getPriceDen() {
        return priceDen;
    }

    public void setPriceDen(String priceDen) {
        this.priceDen = priceDen;
    }

    public String getPriceNum() {
        return priceNum;
    }

    public void setPriceNum(String priceNum) {
        this.priceNum = priceNum;
    }

    public String getGenDen() {
        return genDen;
    }

    public void setGenDen(String genDen) {
        this.genDen = genDen;
    }

    public String getGenNum() {
        return genNum;
    }

    public void setGenNum(String genNum) {
        this.genNum = genNum;
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

    public String getBoardLotSize() {
        return boardLotSize;
    }

    public void setBoardLotSize(String boardLotSize) {
        this.boardLotSize = boardLotSize;
    }

    public String getBuyQty() {
        return buyQty;
    }

    public void setBuyQty(String buyQty) {
        this.buyQty = buyQty;
    }

    public String getSellQty() {
        return sellQty;
    }

    public void setSellQty(String sellQty) {
        this.sellQty = sellQty;
    }

    public String getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(String buyAmount) {
        this.buyAmount = buyAmount;
    }

    public String getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(String sellAmount) {
        this.sellAmount = sellAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
