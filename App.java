package employee.software.org;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception{
        while (true) {
            System.out.println("\n Employee Management Software");
            System.out.print("Enter your choice :");
            System.out.println("1. Insert 2.Update 3.Delete 4.Read");
            Scanner  sc = new Scanner(System.in);
            int choice = sc.nextInt();


            if (choice < 1 || choice > 4) break;

            switch (choice) {
                case 1:
                    System.out.println("welcome to Insert Operation");
                    System.out.println("id , name , email, address, salary");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    String email = sc.nextLine();
                    String address = sc.nextLine();
                    int salary = sc.nextInt();


                    Employee emp = new Employee(id,name, email,address, salary);

                    EmployeeOp.createEmployee(emp);
                    break;


                case 2 :
                    System.out.println("Welcome to Update operation");
                    System.out.println("\n id, name \n");
                    id = sc.nextInt();
                    sc.nextLine();
                    name = sc.nextLine();
                    EmployeeOp.updateEmployee(name,id);
                    System.out.println("Employee updated");
                    break;


                case 3 :
                    System.out.println("Welcome to delete operation");
                    System.out.println("id ");
                    id = sc.nextInt();;
                    EmployeeOp.deleteEmployee(id);
                    System.out.println("employee deleted");

                    break;


                case 4 :
                    System.out.println("welcome to select operation");
                    ArrayList<Employee> list = EmployeeOp.readEmployee();

                    for(Employee employee : list) {
                        System.out.println(employee);
                    }

                    break;

            }

        }
    }
}
