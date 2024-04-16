import Test.CommonTest;
import employee.EmployeeTests;
import house.HouseTests;
import names.NameTests;
import pistol.PistolTests;
import student.StudentTests;
import time.TimeTests;

public class Main {
    public static void main(String[] args) {
        new CommonTest().Test();

        new HouseTests().Test();
        new NameTests().Test();
        new StudentTests().Test();
        new PistolTests().Test();
        new TimeTests().Test();
        new EmployeeTests().Test();
    }
}