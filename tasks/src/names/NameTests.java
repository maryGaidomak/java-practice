package names;

public class NameTests extends test.BaseTest {

    public NameTests() {
        super("Name", 4);
    }

    @Override
    public void Test() {
        Name firstName = new Name("Клеопатра");
        if (!firstName.toString().equals("Клеопатра"))
            AddResult("Test failed on name " + firstName);
        Name secondName = new Name("Александр", "Сергеевич", "Пушкин");
        if (!secondName.toString().equals("Александр Сергеевич Пушкин"))
            AddResult("Test failed on name " + secondName);
        Name thirdName = new Name("Владимир", "Маяковский");
        if (!thirdName.toString().equals("Владимир Маяковский"))
            AddResult("Test failed on name " + thirdName);
        Name fourthName = new Name("Христофор", "", "Бонифатьевич");
        if (!fourthName.toString().equals("Христофор Бонифатьевич"))
            AddResult("Test failed on name " + fourthName);

        try {
            Name emptyName = new Name("", "", "");
            AddResult("Test failed on empty name " + emptyName);
        } catch (IllegalArgumentException e) {
            // Expected
        }

        super.Test();
    }
}
