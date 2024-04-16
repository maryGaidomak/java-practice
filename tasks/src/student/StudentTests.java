package student;

import java.util.List;

public class StudentTests extends Test.BaseTest {

    public StudentTests() {
        super("Student", 2);
    }

    @Override
    public  void Test() {

        Student student1 = new Student("Вася", null);
        student1.addGrade(3);
        student1.addGrade(4);
        student1.addGrade(5);
        /*
        System.out.println(student1);
        System.out.println("Средний балл: " + student1.getAverage());
        System.out.println("Вася " + (student1.checkIfExcellent() ? "отличник" : "не отличник"));
        */
        if (!student1.toString().equals("Вася: [3, 4, 5]"))
            AddResult("Test failed on student print " + student1);
        if (!student1.getAverage().equals(4))
            AddResult("Test failed on student average " + student1);
        if (student1.checkIfExcellent())
            AddResult("Test failed on student excellent " + student1);

        Student student2 = new Student("Петя", List.of(5, 5, 5));
        /*
        System.out.println(student2);
        System.out.println("Средний балл: " + student2.getAverage());
        System.out.println("Петя " + (student2.checkIfExcellent() ? "отличник" : "не отличник"));
        */
        if (!student2.toString().equals("Петя: [5, 5, 5]"))
            AddResult("Test failed on student print " + student2);
        if (!student2.getAverage().equals(5))
            AddResult("Test failed on student average " + student2);
        if (!student2.checkIfExcellent())
            AddResult("Test failed on student excellent " + student2);

        super.Test();
    }
}
