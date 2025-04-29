package employee.software.org;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeOp {

    public static void createEmployee(Employee emp) throws Exception {
        Connection conn = DBConnect.connect();
        String query = Query.insert;

        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1,emp.getId());
        pstm.setString(2,emp.getName());
        pstm.setString(3,emp.getEmail());
        pstm.setString(4, emp.getAddress());
        pstm.setInt(5, emp.getSalary());

        System.out.println("\n ps = "+pstm + "\n");
        pstm.executeUpdate();
        pstm.close();
    }

    public static void deleteEmployee (int id) throws Exception {
        Connection conn = DBConnect.connect();
        String query = Query.delete;

        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setInt(1,id);
        System.out.println("\n ps = " + pstm + "\n");
        pstm.executeUpdate();
        pstm.close();
    }

    public static void updateEmployee(String name, int id) throws Exception {
        Connection conn = DBConnect.connect();
        String query = Query.update;

        PreparedStatement pstm = conn.prepareStatement(query);
        pstm.setString(1, name);
        pstm.setInt(2, id);

        System.out.println("\n ps = " + pstm + "\n");
        pstm.executeUpdate();
        pstm.close();
    }

    public static ArrayList<Employee> readEmployee() throws Exception {
        ArrayList<Employee> empList = new ArrayList<>();
        Connection conn = DBConnect.connect();
        String query = Query.select;

        Statement stm = conn.createStatement();
        stm.execute(query);

        ResultSet rs = stm.executeQuery(query);

        while(rs.next()) {
            Employee employee = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getInt(5));
            empList.add(employee);
        }
        stm.close();
        return empList;
    }
}
