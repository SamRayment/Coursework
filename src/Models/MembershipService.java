package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembershipService {
    public static Membership selectById(int id, DatabaseConnection database) {

        Membership result = null;

        PreparedStatement statement = database.newStatement("SELECT MembershipID  FROM Locations WHERE  Username = ? AND Password = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Membership(
                            results.getInt("MembershipID"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static void save(Membership itemToSave, DatabaseConnection database) {

        Membership existingItem = null;
        if (itemToSave.getMembershipId() != 0) existingItem = selectById(itemToSave.getMembershipId(), database);

        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Membership (Username, Password) VALUES (?, ?))");
                statement.setString(1, itemToSave.getUsername());
                statement.setString(2, itemToSave.getPassword());
                database.executeUpdate(statement);
            }
            else {
                PreparedStatement statement = database.newStatement("UPDATE Table SET Username = ?, Password = ? WHERE MembershipID = ?");
                statement.setString(1, itemToSave.getUsername());
                statement.setString(2, itemToSave.getPassword());
                statement.setInt(4, itemToSave.getMembershipId());
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }

}
