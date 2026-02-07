import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args){
        List<String> fruits = new ArrayList(Arrays.asList("Apple", "Banana", "Orange", "Guava"));
        Collections.sort(fruits);
        System.out.println(fruits);
    }
}
