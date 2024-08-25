package Models.Responses.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RMSResponse {
    @JsonProperty("net")
    private String net;

    @JsonProperty("availablecash")
    private String availableCash;

    @JsonProperty("availableintradaypayin")
    private String availableIntradayPayin;

    @JsonProperty("availablelimitmargin")
    private String availableLimitMargin;

    @JsonProperty("collateral")
    private String collateral;

    @JsonProperty("m2munrealized")
    private String m2mUnrealized;

    @JsonProperty("m2mrealized")
    private String m2mRealized;

    @JsonProperty("utiliseddebits")
    private String utilisedDebits;

    @JsonProperty("utilisedspan")
    private String utilisedSpan;

    @JsonProperty("utilisedoptionpremium")
    private String utilisedOptionPremium;

    @JsonProperty("utilisedholdingsales")
    private String utilisedHoldingSales;

    @JsonProperty("utilisedexposure")
    private String utilisedExposure;

    @JsonProperty("utilisedturnover")
    private String utilisedTurnover;

    @JsonProperty("utilisedpayout")
    private String utilisedPayout;

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getAvailableCash() {
        return availableCash;
    }

    public void setAvailableCash(String availableCash) {
        this.availableCash = availableCash;
    }

    public String getAvailableIntradayPayin() {
        return availableIntradayPayin;
    }

    public void setAvailableIntradayPayin(String availableIntradayPayin) {
        this.availableIntradayPayin = availableIntradayPayin;
    }

    public String getAvailableLimitMargin() {
        return availableLimitMargin;
    }

    public void setAvailableLimitMargin(String availableLimitMargin) {
        this.availableLimitMargin = availableLimitMargin;
    }

    public String getCollateral() {
        return collateral;
    }

    public void setCollateral(String collateral) {
        this.collateral = collateral;
    }

    public String getM2mUnrealized() {
        return m2mUnrealized;
    }

    public void setM2mUnrealized(String m2mUnrealized) {
        this.m2mUnrealized = m2mUnrealized;
    }

    public String getM2mRealized() {
        return m2mRealized;
    }

    public void setM2mRealized(String m2mRealized) {
        this.m2mRealized = m2mRealized;
    }

    public String getUtilisedDebits() {
        return utilisedDebits;
    }

    public void setUtilisedDebits(String utilisedDebits) {
        this.utilisedDebits = utilisedDebits;
    }

    public String getUtilisedSpan() {
        return utilisedSpan;
    }

    public void setUtilisedSpan(String utilisedSpan) {
        this.utilisedSpan = utilisedSpan;
    }

    public String getUtilisedOptionPremium() {
        return utilisedOptionPremium;
    }

    public void setUtilisedOptionPremium(String utilisedOptionPremium) {
        this.utilisedOptionPremium = utilisedOptionPremium;
    }

    public String getUtilisedHoldingSales() {
        return utilisedHoldingSales;
    }

    public void setUtilisedHoldingSales(String utilisedHoldingSales) {
        this.utilisedHoldingSales = utilisedHoldingSales;
    }

    public String getUtilisedExposure() {
        return utilisedExposure;
    }

    public void setUtilisedExposure(String utilisedExposure) {
        this.utilisedExposure = utilisedExposure;
    }

    public String getUtilisedTurnover() {
        return utilisedTurnover;
    }

    public void setUtilisedTurnover(String utilisedTurnover) {
        this.utilisedTurnover = utilisedTurnover;
    }

    public String getUtilisedPayout() {
        return utilisedPayout;
    }

    public void setUtilisedPayout(String utilisedPayout) {
        this.utilisedPayout = utilisedPayout;
    }
}
