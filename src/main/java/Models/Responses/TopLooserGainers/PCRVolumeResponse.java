package Models.Responses.TopLooserGainers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PCRVolumeResponse {
    @JsonProperty
    private double pcr;
    @JsonProperty
    private String tradingSymbol;

    public double getPcr() {
        return pcr;
    }

    public void setPcr(double pcr) {
        this.pcr = pcr;
    }

    public String getTradingSymbol() {
        return tradingSymbol;
    }

    public void setTradingSymbol(String tradingSymbol) {
        this.tradingSymbol = tradingSymbol;
    }
}
