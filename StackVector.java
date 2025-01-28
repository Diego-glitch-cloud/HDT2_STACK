import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    private Vector<E> vector;
    
    // El constructor genera un nuevo vector cuando se hace una estancia de la clase
    public StackVector() { 
        this.vector = new Vector<>(); 
    }

    @Override
    public void push(E item) {
        vector.add(item);
    }
    // pre: 
    // post: item is added to stack
    // will be popped next if no intervening push

    @Override
    public E pop() {
        if (vector.isEmpty()) {
            return null;
        }

        return vector.remove(vector.size() - 1);
    }
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned

    @Override
    public E peek() {
        // Revisa si está vacío
        if (vector.isEmpty()){
            return null;
        }

        return vector.lastElement();
    }
    // pre: stack is not empty
    // post: top value (next to be popped) is returned

    @Override
    public boolean empty() {
        if (vector.isEmpty()) {
            return true;
        }
        return false; 
    }
    // post: returns true if and only if the stack is empty

    @Override
    public int size() {
        return vector.size();
    }
    // post: returns the number of elements in the stack

}
