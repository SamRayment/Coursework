package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembershipService {
    public static DatabaseConnection database;
    public static Membership selectMemberUsernameAndPassword(String usernameAsString, String hashedPassword, DatabaseConnection database) {

        Membership result = null;

        PreparedStatement statement = database.newStatement("SELECT MembershipID, Username, HashcodePassword  FROM Memberships WHERE  Username = ? AND HashcodePassword = ?");

        try {
            if (statement != null) {

                statement.setString(1, usernameAsString);
                statement.setString(2, hashedPassword);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Membership(
                            results.getInt("MembershipID"),
                            results.getString("Username"),
                            results.getString("HashcodePassword"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static Membership selectMemberById(int id, DatabaseConnection database) {

        Membership result = null;

        PreparedStatement statement = database.newStatement("SELECT Username, HashcodePassword  FROM Memberships WHERE MembershipID = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Membership(
                            id,
                            results.getString("Username"),
                            results.getString("HashcodePassword"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }




    public static void save(Membership itemToSave, DatabaseConnection database) {
        Membership existingItem = null;
        if (itemToSave.getMembershipId() != 0)
            existingItem = selectMemberById(itemToSave.getMembershipId(), database);
        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Membership (Username, HashcodePassword) VALUES (?,?))");
                statement.setString(1, itemToSave.getUsername());
                statement.setString(2, itemToSave.getPassword());
                database.executeUpdate(statement);
            } else {
                PreparedStatement statement = database.newStatement("UPDATE Membership SET Username = ?, HashcodePassword = ? WHERE MembershipID = ?");
                statement.setString(1, itemToSave.getUsername());
                statement.setString(1, itemToSave.getPassword());
                statement.setInt(3, itemToSave.getMembershipId());
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }
}
