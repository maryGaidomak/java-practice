package employee;

public class Employee {
    private final String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String GetName() {
        return name;
    }

    @Override
    public String toString() {
        if (department.GetHead() == this)
            return name + " начальник отдела " + department.GetName();
        String headName = department.GetHead() == null ? "отсутствует" : department.GetHead().GetName();
        return name + " работает в отделе " + department.GetName() + " начальник которого " + headName + ".";
    }

}
