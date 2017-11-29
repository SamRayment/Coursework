package Models;

public class TownCounty {
    private String street;
    private String town;
    private String county;
    private String postcode;

    public TownCounty(String street, String town, String county, String postcode) {
        this.street = street;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "TownCounty{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", county='" + county + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}