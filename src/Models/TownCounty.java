package Models;

public class TownCounty {
    private int id;
    private String town;
    private String county;

    public TownCounty(int id, String town, String county) {
        this.id = id;
        this.town = town;
        this.county = county;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return town;
    }
}

