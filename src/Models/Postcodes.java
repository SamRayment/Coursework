package Models;

public class Postcodes {
    private int postcodeId;
    private String Street;
    private int TownCountyId;
    private String postcode;

    public Postcodes(int postocdeId, String street, int townCountyId, String postcode) {
        postcodeId = postcodeId;
        Street = street;
        TownCountyId = townCountyId;
        this.postcode = postcode;
    }

    public Postcodes(String street, String postcode) {
        Street = street;
        this.postcode = postcode;
    }

    public int getPostcodeId() {
        return postcodeId;
    }

    public void setPostcodeId(int postcodeId) {
        postcodeId = postcodeId;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public int getTownCountyId() {
        return TownCountyId;
    }

    public void setTownCountyId(int townCountyId) {
        TownCountyId = townCountyId;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Postcodes{" +
                "Street='" + Street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
