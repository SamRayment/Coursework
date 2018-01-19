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

    public static Review selectReviewById(int id, DatabaseConnection database) {

        Review result = null;

        PreparedStatement statement = database.newStatement("SELECT CarParkID, Explanation, OutOfFive FROM Reviews WHERE ReviewId = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Review(
                            id,
                            results.getInt("CarParkID"),
                            results.getString("Explanation"),
                            results.getInt("OutOfFive"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static void saveReview(Review itemToSave, DatabaseConnection database) {
        Review existingItem = null;
        if (itemToSave.getReviewId() != 0)
            existingItem = selectReviewById(itemToSave.getReviewId(), database);
        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Reviews (CarParkID, Explanation, OutOfFive) VALUES (?,?,?)");
                statement.setInt(1, itemToSave.getCarParkId());
                statement.setString(2, itemToSave.getExplanation());
                statement.setInt(3, itemToSave.getOutOfFive());
                database.executeUpdate(statement);
            } else {
                PreparedStatement statement = database.newStatement("UPDATE Memberships SET CarParkID = ?, Explanation = ?, OutOfFive = ? WHERE MembershipID = ?");
                statement.setInt(1, itemToSave.getCarParkId());
                statement.setString(1, itemToSave.getExplanation());
                statement.setInt(3, itemToSave.getOutOfFive());
                statement.setInt(4, itemToSave.getReviewId());
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }
}
