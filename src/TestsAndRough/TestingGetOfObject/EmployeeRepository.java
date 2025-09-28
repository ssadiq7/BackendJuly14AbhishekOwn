package TestsAndRough.TestingGetOfObject;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {

    private Map<Long, Employee> employeeMap = new HashMap<>();
    private int idCounter = 0;


    public Employee addEmployee(Employee employee) {

        if(employee.getId() == 0) {
            employee.setId(++idCounter);
        }

        employeeMap.put(employee.getId(), employee);

//        return employeeMap.get(employee); // This line would return null, because employee is not the key, the key is employee.getId()
        return employeeMap.get(employee.getId());
    }

    public Employee getEmployeeById(long id) {

        return employeeMap.get(id);

    }
}
