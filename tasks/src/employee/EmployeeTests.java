package employee;

import test.BaseTest;

public class EmployeeTests extends BaseTest {
    public EmployeeTests() {
        super("Employee", 4);
    }

    @Override
    public void Test() {
        Department ITDepartment = new Department("IT");
        Employee employee1 = new Employee("Петров", ITDepartment);
        Employee employee2 = new Employee("Козлов", ITDepartment);
        Employee employee3 = new Employee("Сидоров", ITDepartment);

        if (!employee1.toString().equals("Петров работает в отделе IT начальник которого отсутствует."))
            AddResult("Test failed on employee print " + employee1);
        if (!employee2.toString().equals("Козлов работает в отделе IT начальник которого отсутствует."))
            AddResult("Test failed on employee print " + employee1);
        if (!employee3.toString().equals("Сидоров работает в отделе IT начальник которого отсутствует."))
            AddResult("Test failed on employee print " + employee1);

        ITDepartment.AddHead(employee2);

        if (!employee1.toString().equals("Петров работает в отделе IT начальник которого Козлов."))
            AddResult("Test failed on employee print " + employee1);
        if (!employee2.toString().equals("Козлов начальник отдела IT"))
            AddResult("Test failed on employee print " + employee1);
        if (!employee3.toString().equals("Сидоров работает в отделе IT начальник которого Козлов."))
            AddResult("Test failed on employee print " + employee1);

        Department MarketDepartment = new Department("Marketing");
        Employee employee4 = new Employee("Иванов", MarketDepartment);

        try {
            MarketDepartment.AddHead(employee1);
            AddResult("Test failed on check head " + employee1);
        } catch (IllegalArgumentException e) {
            // expected
        }
        super.Test();
    }
}
