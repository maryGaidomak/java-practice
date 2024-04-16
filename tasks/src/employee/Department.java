package employee;

public class Department {
    private final String name;
    private Employee head;
    public Department(String name, Employee head) {
        this.name = name;
        CheckHead(head);
        this.head = head;
    }

    public void AddHead(Employee head) {
        CheckHead(head);
        this.head = head;
    }

    public Employee GetHead() {
        return head;
    }

    public Department(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
    @Override
    public String toString() {
        return "Отдел "+ name + ". Начальник: " + head.GetName();
    }

    private void CheckHead(Employee head) {
        if (head.department != this)
            throw new IllegalArgumentException("Начальник не может работать в другом отделе.");
    }
}
