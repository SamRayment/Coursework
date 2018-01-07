package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewService {
    public static Review selectById(int carParkId, int membershipId, DatabaseConnection database) {

        Review result = null;

            PreparedStatement statement = database.newStatement("SELECT Explanation, OutOfFive FROM Reviews WHERE CarParkID = ? AND MembershipID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, carParkId);
                statement.setInt(2, membershipId);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Review(
                            results.getString("Explanation"),
                            results.getInt("OutOfFive")
                    );
                    System.out.print("Result found: "+ result);
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

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

}
