package student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student(String name, List<Integer> grades) {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("Имя не может быть пустым");
        if (grades != null && !grades.isEmpty()) {
            if (!grades.stream().allMatch(this::checkCorrectGrade))
                throw new IllegalArgumentException("Оценка должна быть в диапазоне от 2 до 5");
            this.grades = new ArrayList<>(grades);
        }
        this.name = name;
    }

    public Integer getAverage() {
        if (grades.isEmpty())
            return 0;
        return getGradesSum() / (grades.size());
    }

    public Boolean checkIfExcellent() {
        if (grades.isEmpty())
            return false;
        return grades.stream().allMatch(grade -> grade == 5);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void removeGrade(int index) {
        grades.remove(index);
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    private Boolean checkCorrectGrade(int grade) {
        return grade >= 2 && grade <= 5;
    }

    private Integer getGradesSum() {
        int sum = 0;
        for (int grade : grades)
            sum += grade;
        return sum;
    }

    @Override
    public String toString() {
        return name + ": " + grades;
    }
}
