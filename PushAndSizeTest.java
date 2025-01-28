import org.junit.*;

public class PushAndSizeTest {
    @Test
    public void testPushAndSize() {
        StackVector<Integer> stack = new StackVector<>();
        
        // Inicialmente el stack está vacío
        Assert.assertEquals(0, stack.size());
        Assert.assertTrue(stack.empty());

        // Añadimos elementos al stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Verificamos el tamaño después de añadir elementos
        Assert.assertEquals(3, stack.size());
        Assert.assertFalse(stack.empty());
    }
}
