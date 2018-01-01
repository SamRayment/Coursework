package Models;

public class Location {
    private int postcodeId;
    private String street;
    private int townCountyId;
    private String postcode;
    private int carParkId;
    private boolean cctv;
    private boolean electricParking;
    private boolean disabledParking;
    private boolean childParking;

    public Location(int postcodeId, String street, int townCountyId, String postcode, int carParkId, boolean cctv, boolean electricParking, boolean disabledParking, boolean childParking) {
        this.postcodeId = postcodeId;
        this.street = street;
        this.townCountyId = townCountyId;
        this.postcode = postcode;
        this.carParkId = carParkId;
        this.cctv = cctv;
        this.electricParking = electricParking;
        this.disabledParking = disabledParking;
        this.childParking = childParking;
    }

    public int getPostcodeId() {
        return postcodeId;
    }

    public void setPostcodeId(int postcodeId) {
        this.postcodeId = postcodeId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getTownCountyId() {
        return townCountyId;
    }

    public void setTownCountyId(int townCountyId) {
        this.townCountyId = townCountyId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
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
        return String.valueOf(carParkId);
    }
}

