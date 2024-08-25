package Models.Responses.Brokerage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrokerageCalculatorResponse {
    static class Breakup{
        @JsonProperty
        private String name;
        @JsonProperty
        private double amount;
        @JsonProperty
        private String msg;
        @JsonProperty
        private Breakup[] breakup;
    }
    static class Summary{
        @JsonProperty
        private double total_charges;
        @JsonProperty
        private int trade_value;
        @JsonProperty
        private Breakup[] breakup;
    }
    @JsonProperty
    public Summary summary;
    @JsonProperty
    public Summary[] charges;
}
