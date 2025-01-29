import org.junit.*;

/**
 * La clase PopAndPeekTest contiene pruebas unitarias para evaluar 
 * el comportamiento de los métodos pop y peek de la clase StackVector.
 * 
 * @version 1.0
 * @author Adrian Penagos
 */
public class PopAndPeekTest {

    /**
     * Prueba que verifica las operaciones de agregar, obtener y eliminar
     * elementos en un StackVector.
     */
    @Test
    public void testPopAndPeek() {
        StackVector<String> stack = new StackVector<>();
        
        // Añadimos elementos al StackVector
        stack.push("A");
        stack.push("B");
        stack.push("C");

        // Verificamos que peek muestra el último elemento sin eliminarlo
        Assert.assertEquals("C", stack.peek());
        Assert.assertEquals(3, stack.size());

        // Eliminamos el último elemento con pop
        Assert.assertEquals("C", stack.pop());
        Assert.assertEquals(2, stack.size());

        // Verificamos el nuevo elemento en la cima
        Assert.assertEquals("B", stack.peek());
    }

}
