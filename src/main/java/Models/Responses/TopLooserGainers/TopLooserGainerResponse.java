package Models.Responses.TopLooserGainers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TopLooserGainerResponse {
    @JsonProperty("tradingSymbol")
    private String tradingSymbol;

    @JsonProperty("percentChange")
    private double percentChange;

    @JsonProperty("symbolToken")
    private int symbolToken;
    @JsonProperty("netChange")
    private String netChange;
    @JsonProperty("ltp")
    private String ltp;

    @JsonProperty("opnInterest")
    private String opnInterest;

    @JsonProperty("netChangeOpnInterest")
    private Object netChangeOpnInterest;

    public String getNetChange() {
        return netChange;
    }

    public void setNetChange(String netChange) {
        this.netChange = netChange;
    }

    public String getLtp() {
        return ltp;
    }

    public void setLtp(String ltp) {
        this.ltp = ltp;
    }

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }

    public double getPercentChange() {
        return percentChange;
    }

    public void setPercentChange(double percentChange) {
        this.percentChange = percentChange;
    }

    public int getSymbolToken() {
        return symbolToken;
    }

    public void setSymbolToken(int symbolToken) {
        this.symbolToken = symbolToken;
    }

    public String getOpnInterest() {
        return opnInterest;
    }

    public void setOpnInterest(String opnInterest) {
        this.opnInterest = opnInterest;
    }

    public double getNetChangeOpnInterest() {
        return (double) netChangeOpnInterest;
    }

    public void setNetChangeOpnInterest(double netChangeOpnInterest) {
        this.netChangeOpnInterest = netChangeOpnInterest;
    }
}
