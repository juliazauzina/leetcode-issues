import org.example.LengthOfLastWord;
import org.junit.jupiter.api.Test;

public class LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWord() {
        var s = "Hello World";

        var lengthOfLastWord = new LengthOfLastWord();
        var result = lengthOfLastWord.lengthOfLastWord(s);
        assert result == 5;
    }
}
