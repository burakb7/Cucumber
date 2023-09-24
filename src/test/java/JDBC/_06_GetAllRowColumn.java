package JDBC;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _06_GetAllRowColumn extends DBUtilities {
    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from language");

        ResultSetMetaData rsmd = rs.getMetaData(); // stores the names, types and number of columns

        int columnCount = rsmd.getColumnCount(); // gives how many columns we have on a table
        System.out.println("columnCount = " + columnCount);

        String columnName = rsmd.getColumnName(2); // gives the name of the 2nd column
        System.out.println("columnName = " + columnName);

        // Write the code to get name and type of each column
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            columnName = rsmd.getColumnName(i);
            System.out.println("columnName = " + columnName);

            String columnType = rsmd.getColumnTypeName(i); // gives the type of the column
            System.out.println("columnType = " + columnType);
        }
    }
}
