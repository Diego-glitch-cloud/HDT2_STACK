/**
 * La interfaz Stack define los métodos básicos para una estructura de datos tipo stack.
 * 
 * @param <E> El tipo de elementos en el stack.
 * @version 1.0
 * @author Diego Calderón
 */
public interface Stack<E> {

   /**
    * Añade un elemento al stack.
    * 
    * @param item El elemento a añadir al stack.
    * @pre El elemento será añadido al stack.
    * @post El elemento será el siguiente en ser sacado (popped) si no hay operaciones push intermedias.
    */
   public void push(E item);
  
   /**
    * Elimina y retorna el elemento más recientemente añadido al stack.
    * 
    * @return El elemento más recientemente añadido al stack.
    * @pre El stack no está vacío.
    * @post El elemento más recientemente añadido es eliminado y retornado.
    */
   public E pop();
  
   /**
    * Retorna el elemento en la cima del stack sin eliminarlo.
    * 
    * @return El elemento en la cima del stack.
    * @pre El stack no está vacío.
    * @post El valor en la cima (el siguiente en ser sacado) es retornado.
    */
   public E peek();
  
   /**
    * Verifica si el stack está vacío.
    * 
    * @return true si el stack está vacío; false de lo contrario.
    * @post Retorna true si y solo si el stack está vacío.
    */
   public boolean empty();
  
   /**
    * Retorna el número de elementos en el stack.
    * 
    * @return El número de elementos en el stack.
    * @post Retorna el número de elementos en el stack.
    */
   public int size();
}
