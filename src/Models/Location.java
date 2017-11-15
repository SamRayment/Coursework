package Models;

public class Location {
    private int locationId;
    private int carParkId;
    private String street;
    private String town;
    private String postcode;
    private boolean cctv;
    private boolean electricParking;
    private boolean disabledParking;
    private boolean childParking;

    public Location(boolean cctv, boolean electricParking, boolean disabledParking, boolean childParking, int locationId, int carParkId, String street, String town, String postcode) {
        this.cctv = cctv;
        this.electricParking = electricParking;
        this.disabledParking = disabledParking;
        this.childParking = childParking;
        this.locationId = locationId;
        this.carParkId = carParkId;
        this.street = street;
        this.town = town;
        this.postcode = postcode;
    }

    public Location(int carParkId){
        this.carParkId = carParkId;
    }

    public Location(String street, String town, String postcode){
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

    public boolean isCctv() {
        return cctv;
    }

    public void setCctv(boolean cctv) {
        this.cctv = cctv;
    }

    public boolean isElectricParking() {
        return electricParking;
    }

    public void setElectricParking(boolean electricParking) {
        this.electricParking = electricParking;
    }

    public boolean isDisabledParking() {
        return disabledParking;
    }

    public void setDisabledParking(boolean disabledParking) {
        this.disabledParking = disabledParking;
    }

    public boolean isChildParking() {
        return childParking;
    }

    public void setChildParking(boolean childParking) {
        this.childParking = childParking;
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