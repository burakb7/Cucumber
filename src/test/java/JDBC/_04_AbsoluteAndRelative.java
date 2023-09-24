package JDBC;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_AbsoluteAndRelative extends DBUtilities {

    @Test
    public void test1() throws SQLException {
        ResultSet rs = statement.executeQuery("select * from film");
        rs.absolute(10); // takes us to the 10th row right away

        String title = rs.getString("title");
        System.out.println("title from the 10th row = " + title);

        rs.absolute(15); // jumps to the 15th row
        title = rs.getString("title");
        System.out.println("title from the 15th row = " + title);

        rs.absolute(3); // jumps to the 3rd row
        title = rs.getString("title");
        System.out.println("title from the 3rd row = " + title);

        rs.relative(20); // moves 20 rows from the current position.
        // In this case it takes us to the 23rd row

        title = rs.getString("title");
        System.out.println("title from the 23rd row = " + title);

        rs.relative(-14); // moves 14 rows backward. In this case to the 9th row
        title = rs.getString("title");
        System.out.println("title from the 9th row= " + title);
    }



}
