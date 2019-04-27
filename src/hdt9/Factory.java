/**
 * Algoritmo y Estructura de datos - Seccion 10 
 * Maria Ines Vasquez Figueroa 18250 -  Paula Camila Gonzalez Ortega 18398
 * Abril 2019
 * Clase del factory para implementar el arbol deseado por el usuario
 */
//package hdt9;

/**
 *
 * @author Camila
 */
public class Factory {
    
    public TreeInterface<String, String> crearArbol(int n){
        if (n==1){
            return new RedBlackTree<>();
        } else{
            return new SplayTree<>();
        }
    }
    
}
