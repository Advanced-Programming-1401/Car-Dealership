import java.util.Date;

public class Insurance {
    private Date expirationDate;
    private String type;
    private String company;

    public Insurance(Date expirationDate, String type, String company) {
        this.expirationDate = expirationDate;
        this.type = type;
        this.company = company;
    }

    public boolean isExpired() {
        Date now = new Date();
        return now.compareTo(this.expirationDate) > 0;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
