import org.junit.*;

public class PopEmptyStackTest {
     @Test
    public void testPopOnEmptyStack() {
        StackVector<Double> stack = new StackVector<>();

        // Intentamos hacer pop en un stack vacío
        Assert.assertTrue(stack.empty());
        Assert.assertNull(stack.pop());

        // Verificamos que el stack sigue vacío después del pop
        Assert.assertTrue(stack.empty());
        Assert.assertEquals(0, stack.size());
    }
}
