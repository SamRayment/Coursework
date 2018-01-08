package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReviewService {
    public static ArrayList<Review> selectById(int carParkId, DatabaseConnection database) {

        ArrayList<Review> theReviews = new ArrayList<>();

            PreparedStatement statement = database.newStatement("SELECT ReviewID, CarParkID," +
                    "Explanation, OutOfFive FROM Reviews WHERE CarParkID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, carParkId);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    theReviews.add(new Review(
                            results.getInt("ReviewID"),
                            results.getInt("CarParkID"),
                            results.getString("Explanation"),
                            results.getInt("OutOfFive")
                    ));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return theReviews;
    }
/*
public static void save(Review itemToSave, DatabaseConnection database) {

 Review existingItem = null;
if (itemToSave.getCarParkId() != 0) existingItem = selectById(itemToSave.getCarParkId(), database);

 try {
   if (existingItem == null) {
       PreparedStatement statement = database.newStatement("INSERT INTO Membership (Explanation, DateOfReview, OutOfFive) VALUES (?, ?, ?))");
 statement.setString(1, itemToSave.getExplanation());
    statement.setInt(3, itemToSave.getOutOfFive());
database.executeUpdate(statement);
  }
 else {
    PreparedStatement statement = database.newStatement("UPDATE Table SET Explanation = ?, DateOfReview = ?, OutOfFive = ? WHERE CarParkID = ?");
   statement.setString(1, itemToSave.getExplanation());
   statement.setInt(3, itemToSave.getOutOfFive());
    database.executeUpdate(statement);
  }
} catch (SQLException resultsException) {
   System.out.println("Database saving error: " + resultsException.getMessage());
}
}
*/
}
