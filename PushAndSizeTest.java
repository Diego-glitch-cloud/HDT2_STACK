import org.junit.*;

/**
 * La clase PushAndSizeTest contiene pruebas unitarias para evaluar 
 * el comportamiento de los métodos push y size de la clase StackVector.
 * 
 * @version 1.0
 * @author Adrian Penagos
 */
public class PushAndSizeTest {

    /**
     * Prueba que verifica las operaciones de agregar elementos y 
     * obtener el tamaño en un StackVector.
     */
    @Test
    public void testPushAndSize() {
        StackVector<Integer> stack = new StackVector<>();
        
        // Inicialmente el StackVector está vacío
        Assert.assertEquals(0, stack.size());
        Assert.assertTrue(stack.empty());

        // Añadimos elementos al StackVector
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Verificamos el tamaño después de añadir elementos
        Assert.assertEquals(3, stack.size());
        Assert.assertFalse(stack.empty());
    }
}
