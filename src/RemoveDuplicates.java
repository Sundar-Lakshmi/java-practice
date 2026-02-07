import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 3523, 245, 465, 246, 245, 3523, 3145, 435);
        nums.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }
}