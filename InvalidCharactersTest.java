import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * La clase InvalidCharactersTest contiene pruebas unitarias para
 * evaluar el comportamiento del método evaluate de la clase Calculator
 * cuando la cadena de operación contiene caracteres inválidos.
 * 
 * @author Adrian Penagos
 * @version 1.0
 */
public class InvalidCharactersTest {

    /**
     * Prueba que verifica si el mensaje "The string contains an invalid character"
     * se muestra correctamente cuando la cadena de operación contiene 
     * caracteres no válidos.
     */
    @Test
    public void testEvaluateInvalidCharacters() {
        Calculator calculator = new Calculator();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        calculator.evaluate("2 a +");
        Assert.assertTrue(outputStream.toString().contains("The string contains an invalid character"));
    }
}
