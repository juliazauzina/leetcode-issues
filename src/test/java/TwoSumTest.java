import org.example.TwoSum;
import org.junit.jupiter.api.Test;

public class TwoSumTest {
    @Test
    public void testTwoSum() {
        var nums = new int[] {2,7,11,15};

        var solution = new TwoSum();
        var result = solution.twoSumHashmap(nums, 9);
        assert result[0] == 0;
        assert result[1] == 1;
    }
}
