package Models.Responses.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProfileResponse {
    @JsonProperty("clientcode")
    private String clientCode;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("mobileno")
    private String mobileNo;

    @JsonProperty("exchanges")
    private List<String> exchanges;

    @JsonProperty("products")
    private List<String> products;

    @JsonProperty("lastlogintime")
    private String lastLoginTime;

    @JsonProperty("broker")
    private String broker;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public List<String> getExchanges() {
        return exchanges;
    }

    public void setExchanges(List<String> exchanges) {
        this.exchanges = exchanges;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getbroker() {
        return broker;
    }

    public void setbroker(String broker) {
        this.broker = broker;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }
}
