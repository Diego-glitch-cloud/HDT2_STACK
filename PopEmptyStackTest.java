import org.junit.*;

/**
 * La clase PopEmptyStackTest contiene pruebas unitarias para evaluar 
 * el comportamiento del método pop en la clase StackVector cuando se 
 * intenta hacer pop en un StackVector vacío.
 * 
 * @version 1.0
 * @author Adrian Penagos
 */
public class PopEmptyStackTest {

    /**
     * Prueba que verifica que el método pop retorne null y que el StackVector
     * permanezca vacío cuando se intenta hacer pop en un StackVector vacío.
     */
    @Test
    public void testPopOnEmptyStack() {
        StackVector<Double> stack = new StackVector<>();

        // Intentamos hacer pop en un StackVector vacío
        Assert.assertTrue(stack.empty());
        Assert.assertNull(stack.pop());

        // Verificamos que el StackVector sigue vacío después del pop
        Assert.assertTrue(stack.empty());
        Assert.assertEquals(0, stack.size());
    }
}
