package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReviewService {
    public static Review selectById(int id, DatabaseConnection database) {

        Review result = null;

            PreparedStatement statement = database.newStatement("SELECT DateOfReview, Explanation, OutOfFive FROM Reviews WHERE CarParkID = ? AND MembershipID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Review(
                            results.getInt("DateOfReview"),
                            results.getString("Explanation"),
                            results.getInt("OutOfFive")
                    );
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

}
