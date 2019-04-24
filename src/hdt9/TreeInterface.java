package hdt9;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Camila.Maria
 * @param <Key>
 * @param <Value>
 */
public interface TreeInterface<Key extends Comparable<Key>, Value> {

    public void put(Key key, Value val);

    public boolean contains(Key key);

    public Value get(Key key);
    

    
}
