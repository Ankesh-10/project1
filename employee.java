/*Implement an EMPLOYEE class with an inner class named Department that handles
department-related details. The inner class Department should:
a. Contain fields for departmentName and location.
b. Provide methods to set and display department details.
The EMPLOYEE class should:
Contain fields for eName (employee name), salary, and an array of Department objects.
Provide methods to:
c) Add departments.
d) Display employee details along with department information.*/
import java.util.*;
class employee{
    String eName;
    double salary;
    Department[] departments; // Array to hold department objects
    int departmentCount; // Counter to track the number of departments

    // Constructor for employee class
    employee(String eName, double salary,int maxdeps) {
        this.eName = eName;
        this.salary = salary;
        this.departments = new Department[maxdeps]; // Initialize the array with a maximum size
        this.departmentCount = 0; // Initialize department count
    }

    // Method to add a department
    void addDepartment(String departmentName, String location) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = new Department(departmentName, location);
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments. Maximum limit reached.");
        }
        
        System.out.println("Department added: " + departmentName);
    }

    // Method to display employee details along with department information
    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Salary: " + salary);
        System.out.println("Departments: ");
        for (Department dept : departments) {
            dept.displayDepartmentDetails();
        }
    }

    // Inner class Department
    class Department {
        String departmentName;
        String location;

        // Constructor for Department class
        Department(String departmentName, String location) {
            this.departmentName = departmentName;
            this.location = location;
        }

        // Method to display department details
        void displayDepartmentDetails() {
            for(int i=0;i<departmentCount;i++){
            System.out.println("Department Name: " + departments[i].departmentName);
            System.out.println("Location: " + departments[i].location);
        }
    }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter employee name: ");
            String empName = sc.nextLine();
            System.out.println("Enter employee salary: ");
            double empSalary = sc.nextDouble();
            System.out.println("Enter maximum number of departments: ");
            int maxdeps = sc.nextInt();
            employee emp = new employee(empName, empSalary,maxdeps);

            // Adding departments
            sc.nextLine(); // Consume newline
            System.out.println("Enter department name: ");
            String deptName = sc.nextLine();
            System.out.println("Enter department location: ");
            String deptLocation = sc.nextLine();
            emp.addDepartment(deptName, deptLocation);

            // Displaying employee details
            emp.displayEmployeeDetails();
        }
    
}
