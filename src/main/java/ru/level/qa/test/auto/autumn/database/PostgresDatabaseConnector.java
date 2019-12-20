package ru.level.qa.test.auto.autumn.database;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgresDatabaseConnector {

    private static PostgresDatabaseConnector instance;

    private Connection connection;

    private PostgresDatabaseConnector() {
    }

    private void createdConnection() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.printf("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        Properties dbProperties = new Properties();
        try {
            dbProperties.load(this.getClass().getClassLoader().getResourceAsStream("database/postgresdb.properties"));
        } catch (IOException e) {
            System.out.println("Read properties file error");
            e.printStackTrace();
        }

        long currentTime = System.currentTimeMillis();
        try {
            connection = DriverManager.getConnection(dbProperties.getProperty("postgres.url"),
                    dbProperties.getProperty("postgres.username"), dbProperties.getProperty("postgres.password"));
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        } finally {
            System.out.println("Execution time: " + (System.currentTimeMillis() - currentTime)/1000);
        }
    }

    public void close() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed");
            } catch (SQLException e) {
                System.out.println("Unable close database connection");
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static PostgresDatabaseConnector getInstance() {
        if (instance == null) {
            instance = new PostgresDatabaseConnector();
            instance.createdConnection();
        }
        return instance;
    }



}
