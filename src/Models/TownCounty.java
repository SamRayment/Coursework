package Models;

public class TownCounty {
    private int id; //(Line M1) Sets the variable, id, as an int and private
    private String town; //(Line M2) Sets the variable, town, as a string and private
    private String county; //(Line M3) Sets the variable, county, as a string and private

    public TownCounty(int id, String town, String county) { //(Line M4) Creates a constructor called TownCounty with all the columns of table, TownCounty
        this.id = id;
        this.town = town;
        this.county = county;

    }

    public int getId() {
        return id;
    }  //(Line M5)

    public void setId(int id) {
        this.id = id;
    }  //(Line M6)
                                        //The getter (Line M5) and setter (Line M6) of the variable, id
    public String getTown() {
        return town;
    }  //(Line M7)

    public void setTown(String town) {
        this.town = town;
    }  //(Line M8)
                                        //The getter (Line M7) and setter (Line M8) of the variable, town
    public String getCounty() {
        return county;
    }  //(Line M9)

    public void setCounty(String county) {
        this.county = county;
    }  //(Line M10)
                                        // The getter (Line M9) and setter (Line M10) of the variable, county
    @Override
    public String toString() {
        return town;
    } //(Line M11) This is an override method, which returns the value of town
}

