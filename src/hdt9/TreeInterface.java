package hdt9;

/**
 * Algoritmo y Estructura de datos - Seccion 10 
 * Maria Ines Vasquez Figueroa 18250 -  Paula Camila Gonzalez Ortega 18398
 * Abril 2019
 * Clase de interfaz que implementan nuestros arboles con metods que ambos arboles requieren necesariamente para nuestro diccionario
 */

/**
 *
 * @author Camila
 * @param <Key>
 * @param <Value>
 */
public interface TreeInterface<Key extends Comparable<Key>, Value> {

    public void put(Key key, Value val);

    public boolean contains(Key key);

    public Value get(Key key);
    

    
}
