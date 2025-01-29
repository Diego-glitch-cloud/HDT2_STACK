import java.util.Vector;

/**
 * La clase StackVector implementa la interfaz Stack utilizando un Vector para almacenar los elementos.
 * 
 * @param <E> El tipo de elementos en el stack.
 * @version 1.0
 * @author Diego Calderón
 */
public class StackVector<E> implements Stack<E> {

    private Vector<E> vector;
    
    /**
     * El constructor genera un nuevo vector cuando se instancia la clase.
     */
    public StackVector() { 
        this.vector = new Vector<>(); 
    }

    /**
     * Añade un elemento al stack.
     * 
     * @param item El elemento a añadir al stack.
     * @pre El elemento será añadido al stack.
     * @post El elemento será el siguiente en ser sacado (popped) si no hay operaciones push intermedias.
     */
    @Override
    public void push(E item) {
        vector.add(item);
    }

    /**
     * Elimina y retorna el elemento más recientemente añadido al stack.
     * 
     * @return El elemento más recientemente añadido al stack, o null si el stack está vacío.
     * @pre El stack no está vacío.
     * @post El elemento más recientemente añadido es eliminado y retornado.
     */
    @Override
    public E pop() {
        if (vector.isEmpty()) {
            return null;
        }

        return vector.remove(vector.size() - 1);
    }

    /**
     * Retorna el elemento en la cima del stack sin eliminarlo.
     * 
     * @return El elemento en la cima del stack, o null si el stack está vacío.
     * @pre El stack no está vacío.
     * @post El valor en la cima (el siguiente en ser sacado) es retornado.
     */
    @Override
    public E peek() {
        if (vector.isEmpty()){
            return null;
        }

        return vector.lastElement();
    }

    /**
     * Verifica si el stack está vacío.
     * 
     * @return true si el stack está vacío; false de lo contrario.
     * @post Retorna true si y solo si el stack está vacío.
     */
    @Override
    public boolean empty() {
        return vector.isEmpty();
    }

    /**
     * Retorna el número de elementos en el stack.
     * 
     * @return El número de elementos en el stack.
     * @post Retorna el número de elementos en el stack.
     */
    @Override
    public int size() {
        return vector.size();
    }
}
