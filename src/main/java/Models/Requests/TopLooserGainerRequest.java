package Models.Requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.Pattern;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TopLooserGainerRequest {
    @JsonProperty
    @Pattern(regexp = "PercOILosers|PercOIGainers|PercPriceGainers|PercPriceLosers|Long Built Up|Short Built Up|Short Covering|Long Unwinding")
    private String datatype;
    @JsonProperty
    @Pattern(regexp = "NEAR|NEXT|FAR")
    private String expirytype;

    public TopLooserGainerRequest(String datatype, String expirytype) {
        this.datatype = datatype;
        this.expirytype = expirytype;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getExpirytype() {
        return expirytype;
    }

    public void setExpirytype(String expirytype) {
        this.expirytype = expirytype;
    }
}
