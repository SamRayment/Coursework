package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarParkService {
    public static CarPark selectById(int id, DatabaseConnection database) {

        CarPark result = null;

        PreparedStatement statement = database.newStatement("SELECT CarParkName, NoOfSpaces, CostPerHour, LostTicket, CardPayment, PhonePayment  FROM CarParks WHERE CarParkID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new CarPark(
                            results.getString("CarParkName"),
                            results.getInt("NoOfSpaces"),
                            results.getInt("CostPerHour"),
                            results.getInt("LostTicket"),
                            results.getBoolean("CardPayment"),
                            results.getString("PhonePayment")
                    );
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

}
