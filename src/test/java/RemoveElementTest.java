import org.example.RemoveElement;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    @Test
    public void testRemoveElement() {
        var nums = new int[] {3,2,2,3};

        var removeElement = new RemoveElement();
        var result = removeElement.removeElement(nums,3);
        assert result == 2;
        assert nums[0] == 2;
        assert nums[1] == 2;
    }
}
