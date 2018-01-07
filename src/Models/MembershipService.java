package Models;

import javax.xml.crypto.Data;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembershipService {
    public static DatabaseConnection database;
    public static Membership selectMemberById(String usernameAsString, String hashedPassword, DatabaseConnection database) {

        Membership result = null;

        PreparedStatement statement = database.newStatement("SELECT MembershipID  FROM Memberships WHERE  Username = ? AND HashcodePassword = ?");

        try {
            if (statement != null) {

                statement.setString(1, usernameAsString);
                statement.setString(2, hashedPassword);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Membership(
                            results.getInt("MembershipID"));
                }
                System.out.println("Results found: " + result);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static void addNewMember(Review itemToSave, DatabaseConnection database) {

        Membership existingItem = null;
        if (itemToSave.getCarParkId() != 0) existingItem = selectMemberById(itemToSave.getMembershipId(), database);

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