package ru.level.qa.test.auto.autumn.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

public class DatabaseTest {

    @Test
    public void databaseConnectionTest() {
        Connection pgConnection = PostgresDatabaseConnector.getInstance().getConnection();
        assertThat(pgConnection, is(not(nullValue())));
        PostgresDatabaseConnector.getInstance().close();
    }

    @Test
    public void selectTest() {
        Connection pgConnection = PostgresDatabaseConnector.getInstance().getConnection();
        try {
            Statement statement = pgConnection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PUBLIC.USER");

            List<Map<String, Object>> resultList = new ArrayList<>();
            while (resultSet.next()) {
                Map<String, Object> map = new LinkedHashMap<>();
                map.put("ID", resultSet.getInt(1));
                map.put("user_name", resultSet.getString("user_name"));
                map.put("email", resultSet.getString(3));
                map.put("birthday", resultSet.getString("birthday"));
                resultList.add(map);
            }
            System.out.println(resultList);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PostgresDatabaseConnector.getInstance().close();
    }

    @Test
    public void insertTest() {
        Connection pgConnection = PostgresDatabaseConnector.getInstance().getConnection();
        try {
            Statement statement = pgConnection.createStatement();
            statement.execute("INSERT INTO PUBLIC.USER (user_name, email, birthday)" +
                    "VALUES('insert_user', 'insert.user@email.com', '12/12/2016')");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM PUBLIC.USER");

            List<Map<String, Object>> resultList = new ArrayList<>();
            while (resultSet.next()) {
                Map<String, Object> map = new LinkedHashMap<>();
                map.put("ID", resultSet.getInt(1));
                map.put("user_name", resultSet.getString("user_name"));
                map.put("email", resultSet.getString(3));
                map.put("birthday", resultSet.getString("birthday"));
                resultList.add(map);
            }
            System.out.println(resultList);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PostgresDatabaseConnector.getInstance().close();
    }

    @Test
    public void deleteTest() {
        Connection pgConnection = PostgresDatabaseConnector.getInstance().getConnection();
        try {
            Statement statement = pgConnection.createStatement();
            statement.execute("INSERT INTO PUBLIC.USER (user_name, email, birthday)" +
                    "VALUES('insert_user', 'insert.user@email.com', '12/12/2016')");

            ResultSet resultSet = statement.executeQuery("SELECT * FROM PUBLIC.USER");

            List<Map<String, Object>> resultList = new ArrayList<>();
            while (resultSet.next()) {
                Map<String, Object> map = new LinkedHashMap<>();
                map.put("ID", resultSet.getInt(1));
                map.put("user_name", resultSet.getString("user_name"));
                map.put("email", resultSet.getString(3));
                map.put("birthday", resultSet.getString("birthday"));
                resultList.add(map);
            }
            System.out.println(resultList);


            ResultSet rsMaxId = statement.executeQuery("select max(id) from public.user");
            int maxId = 0;
            while (rsMaxId.next()) {
                maxId = rsMaxId.getInt(1);
            }

            statement.execute(String.format("DELEte from public.user where id = %d", maxId));

            System.out.println("=====================");
            resultSet = statement.executeQuery("SELECT * FROM PUBLIC.USER");

            resultList = new ArrayList<>();
            while (resultSet.next()) {
                Map<String, Object> map = new LinkedHashMap<>();
                map.put("ID", resultSet.getInt(1));
                map.put("user_name", resultSet.getString("user_name"));
                map.put("email", resultSet.getString(3));
                map.put("birthday", resultSet.getString("birthday"));
                resultList.add(map);
            }
            System.out.println(resultList);

            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        PostgresDatabaseConnector.getInstance().close();
    }
}
