import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;



public class EvaluateTooManyNumbersTest {
    @Test
    public void testEvaluateTooManyNumbers() {
        Calculator calculator = new Calculator();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        calculator.evaluate("3 4 5 +");
        Assert.assertTrue(outputStream.toString().contains("Too many numbers left in the stack"));
    }
}
