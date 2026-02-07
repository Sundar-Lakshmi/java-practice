import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(456, 5432, 25323, 2134, 435, 2345,54);
        nums.stream().filter(m -> m%2==0).forEach(System.out::println);
    }
}
