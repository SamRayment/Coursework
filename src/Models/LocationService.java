package Models;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class LocationService {
    public static ResultSet results;

    public static ArrayList<Location> selectToLocate(String town,
                                                     boolean cctv,
                                                     boolean electricParking,
                                                     boolean disabledParking,
                                                     boolean childParking,
                                                     DatabaseConnection database) {

        ArrayList<Location> theLocations = new ArrayList<>();

        PreparedStatement statement = database.newStatement(
                "SELECT PostcodeID, Street, TownCountyID, Postcode, CarParkID, CCTV," +
                        "ElectricParking, DisabledParking, ChildParking FROM Locations WHERE " +
                        "TownCountyID = " +
                        "(SELECT TownCountyID FROM TownCounty WHERE Town = ?) " +
                        "AND CCTV = ? " +
                        "AND ElectricParking = ? " +
                        "AND DisabledParking = ? " +
                        "AND ChildParking = ?");

        try {
            if (statement != null) {

                statement.setString(1, town);
                statement.setBoolean(2, cctv);
                statement.setBoolean(3, electricParking);
                statement.setBoolean(4, disabledParking);
                statement.setBoolean(5, childParking);


                results = database.executeQuery(statement);

                if (results != null) {

                    while (results.next()) {

                        theLocations.add(new Location(
                                results.getInt("PostcodeID"),
                                results.getString("Street"),
                                results.getInt("TownCountyID"),
                                results.getString("Postcode"),
                                results.getInt("CarParkID"),
                                results.getBoolean("CCTV"),
                                results.getBoolean("ElectricParking"),
                                results.getBoolean("DisabledParking"),
                                results.getBoolean("ChildParking")));

                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return theLocations;
    }

    public static Location carParkLocation(int carParkId, DatabaseConnection database) {
        Location carParkLocated = null;

        PreparedStatement statement = database.newStatement(
                "SELECT PostcodeID, Street, TownCountyID, Postcode, CarParkID, CCTV," +
                        "ElectricParking, DisabledParking, ChildParking FROM Locations WHERE " +
                        "CarParkID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, carParkId);

                results = database.executeQuery(statement);

                if (results != null) {

                    while (results.next()) {

                        carParkLocated = new Location(
                                results.getInt("PostcodeID"),
                                results.getString("Street"),
                                results.getInt("TownCountyID"),
                                results.getString("Postcode"),
                                results.getInt("CarParkID"),
                                results.getBoolean("CCTV"),
                                results.getBoolean("ElectricParking"),
                                results.getBoolean("DisabledParking"),
                                results.getBoolean("ChildParking"));

                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return carParkLocated;
    }
}
