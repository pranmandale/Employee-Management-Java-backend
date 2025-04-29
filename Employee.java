package employee.software.org;

public class Employee {

    private int id;
    private String name;
    private String email;
    private String address;
    private int salary;

    public Employee(int id, String name, String email, String address, int salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }


    public  void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
