package TestsAndRough.TestingGetOfObject;

import java.util.Map;
import java.util.HashMap;

public class DepartmentRepository {

    private Map<Long, Department> departmentMap = new HashMap<>();
    private int idCounter = 0;

    public Department addDepartment(Department department) {

        if(department.getId() == 0) {
            department.setId(++idCounter);
        }

        departmentMap.put(department.getId(), department);

//        return departmentMap.get(department);
        return departmentMap.get(department.getId());
    }

    public Department getDepartmentById(long id) {

        return departmentMap.get(id);

    }

}
