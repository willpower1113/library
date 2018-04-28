package main.jdbc;

import main.bean.Book;

import java.sql.*;
import java.util.List;

public class ConnectManager {
    static final String USER = "root";
    static final String PASS = "100818";
    static final String DB_URL = "jdbc:mysql://localhost/box";
    static final String TABLE_NAME = "SCHOOL_LIBRARY";
    static ConnectManager mInstance;
    static Connection conn;
    public static Statement statement;

    private ConnectManager() {
        connect();
    }

    public static ConnectManager init() {
        if (mInstance == null) {
            mInstance = new ConnectManager();
        }
        return mInstance;
    }

    void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            statement = conn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("ConnectManager.java" + e.getMessage());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ConnectManager.java" + e.getMessage());
        }
    }

    public boolean createTable() {
        if (statement == null) {
            throw new NullPointerException("statement == null!");
        }
        try {
            if (!checkTableName()) {//先检查表是否存在
                return statement.executeUpdate("CREATE TABLE `" + TABLE_NAME + "` (\n" +
                        "`id` int NOT NULL AUTO_INCREMENT ,\n" +
                        "`name`  varchar(12) NULL ,\n" +
                        "`state`  int NULL ,\n" +
                        "`rentTime` datetime NULL," +
                        "`count` int NULL," +
                        "PRIMARY KEY (`id`)\n" +
                        ")") == 0;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkTableName() throws SQLException {
        ResultSet resultSet = statement.executeQuery("show tables like '" + TABLE_NAME + "'");
        return resultSet.next();
    }

    /**
     * insert
     */
    public static int insert(Book... books) {
        int result = 0;
        try {
            for (Book book : books) {
                result += statement.executeUpdate("INSERT INTO SCHOOL_LIBRARY (name) VALUES ('" +
                        book.getName() +
                        "')");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * query all
     */
    public static List<Book> queryAll(){
        return null;
    }
}
