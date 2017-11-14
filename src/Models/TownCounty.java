package Models;

public class TownCounty {
    private String town;
    private String county;

    public TownCounty(String town, String county) {
        this.town = town;
        this.county = county;
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

    @Override
    public String toString() {
        return "TownCounty{" +
                "town='" + town + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}