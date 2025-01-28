import org.junit.*;

public class PopAndPeekTest {
    @Test
    public void testPopAndPeek() {
        StackVector<String> stack = new StackVector<>();
        
        // Añadimos elementos al stack
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
