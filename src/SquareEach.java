import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareEach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,32,654,656,4545);
        nums.stream().map(n->n*n).collect(Collectors.toList());
    }
}
