package pistol;

import java.util.ArrayList;
import java.util.List;

public class PistolTests {
    public static void Test(){
        List<String> testResults = new ArrayList<>();

        Pistol pistol = new Pistol(3, 5);
        List<String> pistolOutput = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            pistolOutput.add(pistol.shotSilence());
        if (!pistolOutput.equals(List.of("Бах!", "Бах!", "Бах!", "Клац!", "Клац!")))
            testResults.add("Test failed on pistol 1 output.");
        pistolOutput = new ArrayList<>();

        pistol = new Pistol(3, 7);
        for (int i = 0; i < 5; i++)
            pistolOutput.add(pistol.shotSilence());
        int lost = pistol.load(8);
        for (int i = 0; i < 2; i++)
            pistolOutput.add(pistol.shotSilence());
        int unloadResult = pistol.unload();
        pistolOutput.add(pistol.shotSilence());
        if (!pistolOutput.equals(List.of("Бах!", "Бах!", "Бах!", "Клац!", "Клац!", "Бах!", "Бах!", "Клац!")))
            testResults.add("Test failed on pistol 2 output.");
        if (lost != 1 || unloadResult != 5)
            testResults.add("Test failed on pistol 2 load/unload.");

        if (testResults.isEmpty())
            System.out.println("Pistol test passed.");
        else
            testResults.forEach(System.out::println);
    }
}
