import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * La clase EvaluateTooManyNumbersTest contiene pruebas unitarias para
 * evaluar el comportamiento del método evaluate de la clase Calculator
 * cuando hay demasiados números en la pila después de la operación.
 * 
 * @author Adrian Penagos
 * @version 1.0
 */
public class EvaluateTooManyNumbersTest {

    /**
     * Prueba que verifica si el mensaje "Too many numbers left in the stack"
     * se muestra correctamente cuando se introducen demasiados números en 
     * el StackVector.
     */
    @Test
    public void testEvaluateTooManyNumbers() {
        Calculator calculator = new Calculator();

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        calculator.evaluate("3 4 5 +");
        Assert.assertTrue(outputStream.toString().contains("Too many numbers left in the stack"));
    }
}

