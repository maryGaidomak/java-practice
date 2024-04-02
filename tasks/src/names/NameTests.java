package names;

import java.util.ArrayList;
import java.util.List;

public class NameTests {
    public static void Test() {
        List<String> testResults = new ArrayList<>();

        Name firstName = new Name("Клеопатра");
        if (!firstName.toString().equals("Клеопатра"))
            testResults.add("Test failed on name " + firstName);
        Name secondName = new Name("Александр", "Сергеевич", "Пушкин");
        if (!secondName.toString().equals("Александр Сергеевич Пушкин"))
            testResults.add("Test failed on name " + secondName);
        Name thirdName = new Name("Владимир", "Маяковский");
        if (!thirdName.toString().equals("Владимир Маяковский"))
            testResults.add("Test failed on name " + thirdName);
        Name fourthName = new Name("Христофор", "", "Бонифатьевич");
        if (!fourthName.toString().equals("Христофор Бонифатьевич"))
            testResults.add("Test failed on name " + fourthName);

        try {
            Name emptyName = new Name("", "", "");
            testResults.add("Test failed on empty name " + emptyName);
        } catch (IllegalArgumentException e) {
            // Expected
        }

        if (testResults.isEmpty())
            System.out.println("Names test passed. Checked 5 names");
        else
            testResults.forEach(System.out::println);
    }
}
