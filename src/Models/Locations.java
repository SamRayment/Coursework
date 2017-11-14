package Models;

public class Locations {
    private int locationId;
    private int carParkId;
    private String street;
    private String town;
    private String postcode;

    public Locations(int locationId, int carParkId, String street, String town, String postcode) {
        this.locationId = locationId;
        this.carParkId = carParkId;
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}