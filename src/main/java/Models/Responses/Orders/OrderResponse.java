package Models.Responses.Orders;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class OrderResponse {
    @JsonProperty("script")
    private String script;

    @JsonProperty("orderid")
    @NotNull
    private String orderid;

    @JsonProperty("uniqueorderid")
    @NotNull
    private String uniqueorderid;

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getUniqueorderid() {
        return uniqueorderid;
    }

    public void setUniqueorderid(String uniqueorderid) {
        this.uniqueorderid = uniqueorderid;
    }
}
