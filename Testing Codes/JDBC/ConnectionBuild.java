package JDBC;

import java.sql.*;

public class ConnectionBuild {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection("jdbc:odbc:emp1", "system", "system");
            if (con == null) {
                System.out.println("Connection not established");
            } else {
                System.out.println("Connection established successfully");
            }
            st = con.createStatement();
            rs = st.executeQuery("select * from emp");
            boolean more = rs.next();

            while (more) {
                System.out.println(rs.getString(1) + "\t");
                System.out.println(rs.getString(2) + "\t");
                System.out.println(rs.getString(3));
                more = rs.next();
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}