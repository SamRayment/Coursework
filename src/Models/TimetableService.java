package Models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TimetableService {

        public static Timetable selectById(int id, DatabaseConnection database) {

            Timetable result = null;

            PreparedStatement statement = database.newStatement("SELECT WeekdayOpening, WeekdayClosing, SaturdayOpening, SaturdayClosing, SundayOpening, SundayClosing, PublicHolidayOpening, PublicHolidayClosing  FROM Timetables WHERE CarParkID = ?");

            try {
                if (statement != null) {

                    statement.setInt(1, id);
                    ResultSet results = database.executeQuery(statement);

                    if (results != null) {
                        result = new Timetable(
                                results.getString("WeekdayOpening"),
                                results.getString("WeekdayClosing"),
                                results.getString("SaturdayOpening"),
                                results.getString("SaturdayClosing"),
                                results.getString("SundayOpening"),
                                results.getString("SundayClosing"),
                                results.getString("PublicHolidayOpening"),
                                results.getString("PublicHolidayClosing")
                        );
                    }
                }
            } catch (SQLException resultsException) {
                System.out.println("Database select by id error: " + resultsException.getMessage());
            }

            return result;
        }

    }



