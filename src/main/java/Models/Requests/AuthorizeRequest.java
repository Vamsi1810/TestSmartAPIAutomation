package Models.Requests;

public class AuthorizeRequest {
    private String isin;
    private String quantity;
    public AuthorizeRequest(String isin, String quantity) {
        this.isin = isin;
        this.quantity = quantity;
    }
    public String getIsin() {
        return isin;
    }
    public void setIsin(String isin) {
        this.isin = isin;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
