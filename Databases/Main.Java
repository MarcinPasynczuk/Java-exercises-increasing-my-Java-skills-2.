import java.sql.*;

public class Main {
    public static void main(String[] args) {


//        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:/Volumes/Production/Courses/Programs/JavaPrograms/TestDB/testjava.db");
//            Statement statement = conn.createStatement()) {
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Cineczeq\\OneDrive\\Desktop\\Program O Wanie\\Databases\\firstDatabase.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts" +
                    "(name TEXT, phone INTEGER, email TEXT)");

//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                              "VALUES('Joe', 45, 'joe@anywhere.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Jane', 4829484, 'jane@somewhere.com')");
//
//            statement.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES('Fido', 9038, 'dog@email.com')");

//            statement.execute("UPDATE contacts SET phone=123456 WHERE name = 'Jane'");
//            statement.execute("DELETE from contacts WHERE name = 'Joe'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();



            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Went wrong: " +e.getMessage());
        }
    }
}
