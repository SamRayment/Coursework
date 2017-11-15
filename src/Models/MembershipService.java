package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MembershipService {
    public static Membership selectById(int id, DatabaseConnection database) {

        Membership result = null;

        PreparedStatement statement = database.newStatement("SELECT ,  FROM Locations WHERE  = ?");

        try {
            if (statement != null) {

                statement.setInt(1, id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Membership(
                            results.getInt("CarParkID"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("Database select by id error: " + resultsException.getMessage());
        }

        return result;
    }

    public static void save(Thing itemToSave, DatabaseConnection database) {

        Thing existingItem = null;
        if (itemToSave.getId() != 0) existingItem = selectById(itemToSave.getId(), database);

        try {
            if (existingItem == null) {
                PreparedStatement statement = database.newStatement("INSERT INTO Table (a, b, c) VALUES (?, ?, ?))");
                statement.setString(1, itemToSave.getA());
                statement.setString(2, itemToSave.getB());
                statement.setString(3, itemToSave.getC());
                database.executeUpdate(statement);
            }
            else {
                PreparedStatement statement = database.newStatement("UPDATE Table SET a = ?, b = ?, c = ? WHERE id = ?");
                statement.setString(1, itemToSave.getA());
                statement.setString(2, itemToSave.getB());
                statement.setString(3, itemToSave.getC());
                statement.setInt(4, itemToSave.getId());
                database.executeUpdate(statement);
            }
        } catch (SQLException resultsException) {
            System.out.println("Database saving error: " + resultsException.getMessage());
        }
    }

}
