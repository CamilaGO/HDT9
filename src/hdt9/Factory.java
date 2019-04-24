/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

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
