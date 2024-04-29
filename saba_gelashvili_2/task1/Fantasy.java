package midterm.saba_gelashvili_2.task1;

import java.util.ArrayList;
import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    // TODO change studentName to your name
    private String studentName = "Your Name";

    @Override
    public String getStapler1() {
        return "This is getStapler1 implementation";
    }

    @Override
    public String getMicroscope2() {
        return "This is getMicroscope2 implementation";
    }

    @Override
    public String methodHealth3(String argPop5) {
        return "This is methodHealth3 implementation with argument: " + argPop5;
    }

    @Override
    public List<String> methodBurger4(String argElasticity6) {
        List<String> result = new ArrayList<>();
        result.add("This is methodBurger4 implementation");
        result.add("with argument: " + argElasticity6);
        return result;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Student Name: ").append(studentName).append("\n");
        result.append("Stapler1: ").append(getStapler1()).append("\n");
        result.append("Microscope2: ").append(getMicroscope2()).append("\n");
        result.append("Health3: ").append(methodHealth3("someArg")).append("\n");
        result.append("Burger4: ").append(methodBurger4("anotherArg"));
        return result.toString();
    }
}
