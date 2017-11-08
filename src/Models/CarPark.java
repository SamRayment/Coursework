package Models;

public class CarPark {
    private int carParkId;
    private String carParkName;
    private String street;
    private String town;
    private String county;
    private String postcode;
    private String problems;
    private int noOfSpaces;

    public CarPark(int carParkId, String carParkName, String street, String town, String county, String postcode, String problems, int noOfSpaces) {
        this.carParkId = carParkId;
        this.carParkName = carParkName;
        this.street = street;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
        this.problems = problems;
        this.noOfSpaces = noOfSpaces;

    }
    public int getCarParkId() {
        return carParkId;
    }

    public void setCarParkId(int carParkId) {
        this.carParkId = carParkId;
    }

    public String getCarParkName() {
        return carParkName;
    }

    public void setCarParkName(String carParkName) {
        this.carParkName = carParkName;
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

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    public int getNoOfSpaces() {
        return noOfSpaces;
    }

    public void setNoOfSpaces(int noOfSpaces) {
        this.noOfSpaces = noOfSpaces;
    }

    @Override
    public String toString() {
        return "CarPark{" +
                "carParkName='" + carParkName + '\'' +
                ", street='" + street + '\'' +
                ", town='" + town + '\'' +
                ", county='" + county + '\'' +
                ", postcode='" + postcode + '\'' +
                ", problems='" + problems + '\'' +
                '}';
    }


}

