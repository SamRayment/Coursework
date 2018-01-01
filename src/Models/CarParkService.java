package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarParkService {
    public static CarPark selectById(int carParkTestId, DatabaseConnection database) {

        CarPark result = null;

        PreparedStatement statement = database.newStatement("SELECT CarParkID, " +
                "CarParkName, NoOfSpaces, " +
                "CostPerHour, LostTicket, " +
                "CardPayment, PhonePayment, AverageOutOfFive, " +
                "Problems  FROM CarParks WHERE CarParkID = ?");

        try {
            if (statement != null) {
                statement.setInt(1, carParkTestId);

                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    while (results.next()) {


                        result = new CarPark(
                                results.getInt("CarParkID"),
                                results.getString("CarParkName"),
                                results.getInt("NoOfSpaces"),
                                results.getInt("CostPerHour"),
                                results.getInt("LostTicket"),
                                results.getBoolean("CardPayment"),
                                results.getString("PhonePayment"),
                                results.getInt("AverageOutOfFive"),
                                results.getString("Problems")
                        );
                        System.out.println("Result found: " + result);
                    }
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

}
