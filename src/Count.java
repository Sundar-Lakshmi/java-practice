import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry", "Avacado", "AAAA", "Orange"));
        Long count = fruits
                     .stream()
                     .filter(s -> s.startsWith("A"))
                     .count();
        System.out.println(count);
    }
}