package Models.Responses.Portfolio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PortfolioResponse {
    @JsonProperty("tradingsymbol")
    private String tradingSymbol;

    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("isin")
    private String isin;

    @JsonProperty("t1quantity")
    private int t1Quantity;

    @JsonProperty("realisedquantity")
    private int realisedQuantity;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("authorisedquantity")
    private int authorisedQuantity;

    @JsonProperty("product")
    private String product;

    @JsonProperty("collateralquantity")
    private Integer collateralQuantity;

    @JsonProperty("collateraltype")
    private String collateralType;

    @JsonProperty("haircut")
    private double haircut;

    @JsonProperty("averageprice")
    private double averagePrice;

    @JsonProperty("ltp")
    private double ltp;

    @JsonProperty("symboltoken")
    private String symbolToken;

    @JsonProperty("close")
    private double close;

    @JsonProperty("profitandloss")
    private double profitAndLoss;

    @JsonProperty("pnlpercentage")
    private double pnlPercentage;

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getIsin() {
        return isin;
    }

    public void setIsin(String isin) {
        this.isin = isin;
    }

    public int getT1Quantity() {
        return t1Quantity;
    }

    public void setT1Quantity(int t1Quantity) {
        this.t1Quantity = t1Quantity;
    }

    public int getRealisedQuantity() {
        return realisedQuantity;
    }

    public void setRealisedQuantity(int realisedQuantity) {
        this.realisedQuantity = realisedQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getAuthorisedQuantity() {
        return authorisedQuantity;
    }

    public void setAuthorisedQuantity(int authorisedQuantity) {
        this.authorisedQuantity = authorisedQuantity;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getCollateralQuantity() {
        return collateralQuantity;
    }

    public void setCollateralQuantity(Integer collateralQuantity) {
        this.collateralQuantity = collateralQuantity;
    }

    public String getCollateralType() {
        return collateralType;
    }

    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    public double getHaircut() {
        return haircut;
    }

    public void setHaircut(double haircut) {
        this.haircut = haircut;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public double getLtp() {
        return ltp;
    }

    public void setLtp(double ltp) {
        this.ltp = ltp;
    }

    public String getSymbolToken() {
        return symbolToken;
    }

    public void setSymbolToken(String symbolToken) {
        this.symbolToken = symbolToken;
    }

    public double getClose() {
        return close;
    }

    public void setClose(double close) {
        this.close = close;
    }

    public double getProfitAndLoss() {
        return profitAndLoss;
    }

    public void setProfitAndLoss(double profitAndLoss) {
        this.profitAndLoss = profitAndLoss;
    }

    public double getPnlPercentage() {
        return pnlPercentage;
    }

    public void setPnlPercentage(double pnlPercentage) {
        this.pnlPercentage = pnlPercentage;
    }
}
