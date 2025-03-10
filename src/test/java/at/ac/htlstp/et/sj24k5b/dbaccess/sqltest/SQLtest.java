package at.ac.htlstp.et.sj24k5b.dbaccess.sqltest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQLtest {

    private static String url = "jdbc:mysql://localhost:1306/";

    public static void main(String[] args) throws SQLException {
        Connection con = null;
        String sqlStatement;
        Statement stmt;
        con = DriverManager.getConnection(url+"htl_dbrl","htl","htl");
        System.out.println("Database connection established!");

        sqlStatement = "select * from Adresse";
        stmt = con.createStatement();
        ResultSet resultSet = stmt.executeQuery(sqlStatement);
        List<List<String>> data = new ArrayList<List<String>>();
        //System.out.println(resultSet);
        while (resultSet.next()) {
            List<String> row = new ArrayList<>();
            for (int i = 0; i < resultSet.getMetaData().getColumnCount(); i++) {
                row.add(resultSet.getString(i + 1));
            }
            data.add(row);
        }
        for (List<String> row : data) {
            System.out.println(row);
        }

    }


}

