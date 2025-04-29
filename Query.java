package employee.software.org;

public class Query {
    static String insert = "INSERT INTO employee (id, name, email, address, salary) values (?, ?, ?, ?, ?);";
    static String update = "UPDATE employee SET name = ? WHERE id = ?;";
    static String delete = "DELETE FROM employee WHERE id = ?;";
    static String select = "SELECT * FROM employee";
}
