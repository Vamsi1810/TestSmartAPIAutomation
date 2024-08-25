package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HistoricalApiRequest {
    @JsonProperty("exchange")
    private String exchange;

    @JsonProperty("symboltoken")
    private String symboltoken;

    @JsonProperty("interval")
    private String interval;

    @JsonProperty("fromdate")
    private String fromdate;

    @JsonProperty("todate")
    private String todate;

    public HistoricalApiRequest(String exchange, String symboltoken, String interval, String fromdate, String todate) {
        this.exchange = exchange;
        this.symboltoken = symboltoken;
        this.interval = interval;
        this.fromdate = fromdate;
        this.todate = todate;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getSymboltoken() {
        return symboltoken;
    }

    public void setSymboltoken(String symboltoken) {
        this.symboltoken = symboltoken;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getFromdate() {
        return fromdate;
    }

    public void setFromdate(String fromdate) {
        this.fromdate = fromdate;
    }

    public String getTodate() {
        return todate;
    }

    public void setTodate(String todate) {
        this.todate = todate;
    }
}
