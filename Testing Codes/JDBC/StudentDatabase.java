package JDBC;

import java.sql.*;

public class StudentDatabase {
    public static void main(String[] args) {
        // JDBC connection parameters
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "system";
        String password = "system";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            // Create the student table if it doesn't exist (optional)
            createStudentTable(conn);

            // Menu-driven program
            int choice;
            do {
                System.out.println("Menu:");
                System.out.println("1. Insert a student record");
                System.out.println("2. Delete a student record");
                System.out.println("3. Search for a student record");
                System.out.println("4. View all student records");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(System.console().readLine());

                switch (choice) {
                    case 1:
                        insertStudent(conn);
                        break;
                    case 2:
                        deleteStudent(conn);
                        break;
                    case 3:
                        searchStudent(conn);
                        break;
                    case 4:
                        viewAllStudents(conn);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 5);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createStudentTable(Connection conn) throws SQLException {
        String sql = "create table student (id number(3), name varchar2(30), fees number(7,2))";
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Student table created successfully.");
        } catch (SQLException e) {
            // Table already exists. Ignore the exception.
        }
    }

    private static void insertStudent(Connection conn) throws SQLException {
        System.out.print("Enter student ID: ");
        int id = Integer.parseInt(System.console().readLine());
        System.out.print("Enter student name: ");
        String name = System.console().readLine();
        System.out.print("Enter student fees: ");
        double fees = Double.parseDouble(System.console().readLine());

        String sql = "insert into student (id, name, fees) values (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setDouble(3, fees);
            pstmt.executeUpdate();
            System.out.println("Student record inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteStudent(Connection conn) throws SQLException {
        System.out.print("Enter student ID to delete: ");
        int id = Integer.parseInt(System.console().readLine());

        String sql = "delete from student where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student record deleted successfully.");
            } else {
                System.out.println("No matching student record found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void searchStudent(Connection conn) throws SQLException {
        System.out.print("Enter student ID to search: ");
        int id = Integer.parseInt(System.console().readLine());

        String sql = "select * from student where id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Student record found:");
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Fees: " + rs.getDouble("fees"));
                } else {
                    System.out.println("No matching student record found.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewAllStudents(Connection conn) throws SQLException {
        String sql = "select * from student";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            if (rs.next()) {
                System.out.println("All student records:");
                do {
                    System.out.println("ID: " + rs.getInt("id"));
                    System.out.println("Name: " + rs.getString("name"));
                    System.out.println("Fees: " + rs.getDouble("fees"));
                    System.out.println("-----------");
                } while (rs.next());
            } else {
                System.out.println("No student records found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}