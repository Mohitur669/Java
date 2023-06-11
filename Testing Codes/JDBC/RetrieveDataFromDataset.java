package JDBC;

import java.sql.*;

public class RetrieveDataFromDataset {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
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