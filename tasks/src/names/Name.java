package names;

public class Name {
    private final String firstName;
    private String lastName;
    private String middleName;

    public Name(String firstName, String middleName, String lastName) {
        if (isEmpty(firstName) && isEmpty(lastName) && isEmpty(middleName))
            throw new IllegalArgumentException("Имя не может быть пустым");
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Name(String firstName) {
        if (isEmpty(firstName))
            throw new IllegalArgumentException("Имя не может быть пустым");
        this.firstName = firstName;
    }

    public Name(String firstName, String lastName) {
        if (isEmpty(firstName) && isEmpty(lastName))
            throw new IllegalArgumentException("Имя не может быть пустым");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String result = "";
        if (!isEmpty(firstName))
            result += firstName;
        if (!isEmpty(middleName))
            result += " " + middleName;
        if (!isEmpty(lastName))
            result += " " + lastName;
        return result;
    }

    private static Boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
