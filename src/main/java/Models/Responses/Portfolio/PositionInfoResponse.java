package Models.Responses.Portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PositionInfoResponse {
    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("symboltoken")
    private String symbolToken;

    @JsonProperty("producttype")
    private String productType;

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

    @JsonProperty("symbolgroup")
    private String symbolGroup;

    @JsonProperty("strikeprice")
    private String strikePrice;

    @JsonProperty("optiontype")
    private String optionType;

    @JsonProperty("expirydate")
    private String expiryDate;

    @JsonProperty("lotsize")
    private String lotSize;

    @JsonProperty("cfbuyqty")
    private String cfBuyQty;

    @JsonProperty("cfsellqty")
    private String cfSellQty;

    @JsonProperty("cfbuyamount")
    private String cfBuyAmount;

    @JsonProperty("cfsellamount")
    private String cfSellAmount;

    @JsonProperty("buyavgprice")
    private String buyAvgPrice;

    @JsonProperty("sellavgprice")
    private String sellAvgPrice;

    @JsonProperty("avgnetprice")
    private String avgNetPrice;

    @JsonProperty("netvalue")
    private String netValue;

    @JsonProperty("netqty")
    private String netQty;

    @JsonProperty("totalbuyvalue")
    private String totalBuyValue;

    @JsonProperty("totalsellvalue")
    private String totalSellValue;

    @JsonProperty("cfbuyavgprice")
    private String cfBuyAvgPrice;

    @JsonProperty("cfsellavgprice")
    private String cfSellAvgPrice;

    @JsonProperty("totalbuyavgprice")
    private String totalBuyAvgPrice;

    @JsonProperty("totalsellavgprice")
    private String totalSellAvgPrice;

    @JsonProperty("netprice")
    private String netPrice;

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

    public String getLotSize() {
        return lotSize;
    }

    public void setLotSize(String lotSize) {
        this.lotSize = lotSize;
    }

    public String getCfBuyQty() {
        return cfBuyQty;
    }

    public void setCfBuyQty(String cfBuyQty) {
        this.cfBuyQty = cfBuyQty;
    }

    public String getCfSellQty() {
        return cfSellQty;
    }

    public void setCfSellQty(String cfSellQty) {
        this.cfSellQty = cfSellQty;
    }

    public String getCfBuyAmount() {
        return cfBuyAmount;
    }

    public void setCfBuyAmount(String cfBuyAmount) {
        this.cfBuyAmount = cfBuyAmount;
    }

    public String getCfSellAmount() {
        return cfSellAmount;
    }

    public void setCfSellAmount(String cfSellAmount) {
        this.cfSellAmount = cfSellAmount;
    }

    public String getBuyAvgPrice() {
        return buyAvgPrice;
    }

    public void setBuyAvgPrice(String buyAvgPrice) {
        this.buyAvgPrice = buyAvgPrice;
    }

    public String getSellAvgPrice() {
        return sellAvgPrice;
    }

    public void setSellAvgPrice(String sellAvgPrice) {
        this.sellAvgPrice = sellAvgPrice;
    }

    public String getAvgNetPrice() {
        return avgNetPrice;
    }

    public void setAvgNetPrice(String avgNetPrice) {
        this.avgNetPrice = avgNetPrice;
    }

    public String getNetValue() {
        return netValue;
    }

    public void setNetValue(String netValue) {
        this.netValue = netValue;
    }

    public String getNetQty() {
        return netQty;
    }

    public void setNetQty(String netQty) {
        this.netQty = netQty;
    }

    public String getTotalBuyValue() {
        return totalBuyValue;
    }

    public void setTotalBuyValue(String totalBuyValue) {
        this.totalBuyValue = totalBuyValue;
    }

    public String getTotalSellValue() {
        return totalSellValue;
    }

    public void setTotalSellValue(String totalSellValue) {
        this.totalSellValue = totalSellValue;
    }

    public String getCfBuyAvgPrice() {
        return cfBuyAvgPrice;
    }

    public void setCfBuyAvgPrice(String cfBuyAvgPrice) {
        this.cfBuyAvgPrice = cfBuyAvgPrice;
    }

    public String getCfSellAvgPrice() {
        return cfSellAvgPrice;
    }

    public void setCfSellAvgPrice(String cfSellAvgPrice) {
        this.cfSellAvgPrice = cfSellAvgPrice;
    }

    public String getTotalBuyAvgPrice() {
        return totalBuyAvgPrice;
    }

    public void setTotalBuyAvgPrice(String totalBuyAvgPrice) {
        this.totalBuyAvgPrice = totalBuyAvgPrice;
    }

    public String getTotalSellAvgPrice() {
        return totalSellAvgPrice;
    }

    public void setTotalSellAvgPrice(String totalSellAvgPrice) {
        this.totalSellAvgPrice = totalSellAvgPrice;
    }

    public String getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(String netPrice) {
        this.netPrice = netPrice;
    }
}
