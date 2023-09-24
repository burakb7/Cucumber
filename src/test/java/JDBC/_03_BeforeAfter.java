package JDBC;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.*;

public class _03_BeforeAfter {

    Connection connection;
    Statement statement;

    @BeforeMethod
    public void DBConncetion() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains type of connection(jdbc), type of database(mysql), url to remote server that our database is stored
        // port number of our database, name of the database.

        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z"; //    '"-LhCB'.%k[4S]z

        connection = DriverManager.getConnection(url,username,password); // Creates a connection to the database

        statement = connection.createStatement();

        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        // ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY -> statement returns move forward only result set.
        // to solve this problem add it into createStatement method.

    }
    @AfterMethod
    public void DBConnectionClose() throws SQLException {
        connection.close();
    }

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");
        rs.next();
        String language = rs.getString("name");
        System.out.println("language = " + language);

        rs.next();
        language = rs.getString("name");
        System.out.println("language = " + language);
    }

    @Test
    public void test2() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        rs.next();
        String language = rs.getString("name");
        System.out.println("language from the 1st row = " + language);

        rs.next();
        language = rs.getString("name");
        System.out.println("language from the 2nd row = " + language);

        rs.previous(); // moves one step back to the previous row
        language = rs.getString("name");
        System.out.println("language from the 1st row = " + language);
    }
}