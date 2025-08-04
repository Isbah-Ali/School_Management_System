/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Arham
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectivity {
    private static DatabaseConnectivity instance;
    private Connection connection;

    private final String URL = "jdbc:mysql://localhost:3306/school";
    private final String USER = "root";
    private final String PASSWORD = "";

    // Private constructor to prevent external instantiation
    private DatabaseConnectivity() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Public method to get the singleton instance
    public static DatabaseConnectivity getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectivity.class) {
                if (instance == null) {
                    instance = new DatabaseConnectivity();
                }
            }
        }
        return instance;
    }

    // Method to get the database connection
    public Connection getConnection() {
        return connection;
    }
}


