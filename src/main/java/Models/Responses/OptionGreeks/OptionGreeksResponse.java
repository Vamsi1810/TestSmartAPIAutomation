package Models.Responses.OptionGreeks;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Pattern;

public class OptionGreeksResponse {
    @JsonProperty("name")
    private String name;

    @JsonProperty("expiry")
    private String expiry;

    @JsonProperty("strikePrice")
    private String strikePrice;

    @JsonProperty("optionType")
    @Pattern(regexp = "CE|PE")
    private String optionType;

    @JsonProperty("delta")
    private String delta;

    @JsonProperty("gamma")
    private String gamma;

    @JsonProperty("theta")
    private String theta;

    @JsonProperty("vega")
    private String vega;

    @JsonProperty("impliedVolatility")
    private String impliedVolatility;

    @JsonProperty("tradeVolume")
    private String tradeVolume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
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

    public String getDelta() {
        return delta;
    }

    public void setDelta(String delta) {
        this.delta = delta;
    }

    public String getGamma() {
        return gamma;
    }

    public void setGamma(String gamma) {
        this.gamma = gamma;
    }

    public String getTheta() {
        return theta;
    }

    public void setTheta(String theta) {
        this.theta = theta;
    }

    public String getVega() {
        return vega;
    }

    public void setVega(String vega) {
        this.vega = vega;
    }

    public String getImpliedVolatility() {
        return impliedVolatility;
    }

    public void setImpliedVolatility(String impliedVolatility) {
        this.impliedVolatility = impliedVolatility;
    }

    public String getTradeVolume() {
        return tradeVolume;
    }

    public void setTradeVolume(String tradeVolume) {
        this.tradeVolume = tradeVolume;
    }
}
