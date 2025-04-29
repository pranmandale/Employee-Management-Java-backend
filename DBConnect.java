package employee.software.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnect {



    static Connection conn = null;
    public static Connection connect() throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/";
            String db = "EmployeeInfo";
            String userName = "root";
            String password = "Pranav@12345";

            conn = DriverManager.getConnection(url+db, userName, password);


            System.out.println("Connection successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }



}
