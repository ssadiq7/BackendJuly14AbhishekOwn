package TestsAndRough.TestingGetOfObject;

public class Main {

    private static DepartmentRepository departmentRepository = new DepartmentRepository();
    private static EmployeeRepository employeeRepository = new EmployeeRepository();

    public static void main(String[] args) {

        Department department1 = new Department("IT");
        departmentRepository.addDepartment(department1);

        Department department2 = new Department("Accounting");
        departmentRepository.addDepartment(department2);

        Department department3 = new Department("HR");
        System.out.println("\nPrinting department3 after adding to repository:");
        System.out.println(departmentRepository.addDepartment(department3));



        Employee employee1 = new Employee("John", 30, 50000.0, department1);
        employeeRepository.addEmployee(employee1);
        Employee employee4 = new Employee("Jake", 28, 50000.0, department1);
        employeeRepository.addEmployee(employee4);

        Employee employee2 = new Employee("Jane", 25, 60000.0, department2);
        employeeRepository.addEmployee(employee2);
        Employee employee5 = new Employee("Jack", 40, 50000.0, department2);
        employeeRepository.addEmployee(employee5);

        System.out.println("\nPrinting employee3 after adding to repository:");
        Employee employee3 = new Employee("Bob", 35, 70000.0, department3);
        System.out.println(employeeRepository.addEmployee(employee3));

    }
}
