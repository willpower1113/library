package manager;

import jdk.internal.dynalink.beans.StaticClass;

import java.sql.*;

public class DBManager {

    static final String USER = "root";
    static final String PASS = "100818";
    static final String DB_URL = "jdbc:mysql://localhost/box";

    static Connection conn;
    static Statement statement;
    static String sql = "CREATE TABLE `SCHOOL_LIBRARY` (\n" +
            "`_id`  int NOT NULL AUTO_INCREMENT ,\n" +
            "`name`  varchar(12) NULL ,\n" +
            "`state`  int NULL ,\n" +
            "PRIMARY KEY (`_id`)\n" +
            ")";

    static String select = "SELECT * from SCHOOL_LIBRARY";
    
    public static void connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(select);
            while(resultSet.next()){
                //Retrieve by column name
                int id  = resultSet.getInt("_id");
                String name = resultSet.getString("name");
                int state = resultSet.getInt("state");
                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + name);
                System.out.println(", State: " + state);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("DBManager.java" + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("DBManager.java" + e.getMessage());
        }  
    }


}
