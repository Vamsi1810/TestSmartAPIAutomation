package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OptionGreekRequest {
    @JsonProperty
    private String name;
    @JsonProperty
    private String expirydate;

    public OptionGreekRequest(String name, String expirydate) {
        this.name = name;
        this.expirydate = expirydate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }
}
