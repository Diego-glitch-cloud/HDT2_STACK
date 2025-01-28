import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class ValidOperationsTest {
    @Test
    public void testEvaluateValidOperations() {
        Calculator calculator = new Calculator();

        // Capturando la salida de la consola
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Prueba de suma
        calculator.evaluate("3 4 +");
        Assert.assertTrue(outputStream.toString().contains("7"));
        outputStream.reset();

        // Prueba de resta
        calculator.evaluate("10 2 -");
        Assert.assertTrue(outputStream.toString().contains("8"));
        outputStream.reset();

        // Prueba de multiplicación
        calculator.evaluate("5 3 *");
        Assert.assertTrue(outputStream.toString().contains("15"));
        outputStream.reset();

        // Prueba de división
        calculator.evaluate("8 4 /");
        Assert.assertTrue(outputStream.toString().contains("2"));
        outputStream.reset();

        // Prueba de módulo
        calculator.evaluate("10 3 %");
        Assert.assertTrue(outputStream.toString().contains("1"));
        outputStream.reset();
    }
}
