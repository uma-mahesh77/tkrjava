package jbdcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertMultiplePrepared {
	 public static void main(String[] args) {
	        String url = "jdbc:mysql://localhost:3306/new";
	        String user = "root";
	        String password = "1234";

	        // Data to insert
	        String[] names = {"John Doe", "Jane Smith", "Mike Brown", "Alice Green"};
	        int[] ages = {22, 21, 24, 23};

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(url, user, password);

	            // Prepare SQL statement
	            String sql = "INSERT INTO students (name, age) VALUES (?, ?)";
	            PreparedStatement pstmt = con.prepareStatement(sql);

	            // Add all rows to batch
	            for (int i = 0; i < names.length; i++) {
	                pstmt.setString(1, names[i]);
	                pstmt.setInt(2, ages[i]);
	                pstmt.addBatch();
	            }

	            // Execute batch
	            int[] rows = pstmt.executeBatch();
	            System.out.println("✅ " + rows.length + " row(s) inserted successfully!");

	            // Display inserted data
	            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM students");
	            System.out.println("Current Students:");
	            while (rs.next()) {
	                System.out.println(rs.getInt("id") + " | " +
	                                   rs.getString("name") + " | " +
	                                   rs.getInt("age"));
	            }

	            // Close resources
	            rs.close();
	            pstmt.close();
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
