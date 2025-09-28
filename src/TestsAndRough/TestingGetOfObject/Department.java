package TestsAndRough.TestingGetOfObject;

public class Department extends BaseModel {
    String departmentName;

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department() {}

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
