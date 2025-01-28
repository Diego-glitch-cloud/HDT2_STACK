import org.junit.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InvalidCharactersTest {
    @Test
    public void testEvaluateInvalidCharacters() {
        Calculator calculator = new Calculator();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        calculator.evaluate("2 a +");
        Assert.assertTrue(outputStream.toString().contains("The string contains an invalid character"));
    }

}
