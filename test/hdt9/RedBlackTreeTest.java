/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hdt9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class RedBlackTreeTest {
    
    
    /**
     * Test of contains method, of class RedBlackTree.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        String es="perro";
        String ing="dog";
        System.out.println("put");
        RedBlackTree instance = new RedBlackTree();
        instance.put(ing, es);
        boolean expResult=true;
        boolean result = instance.contains(ing);
        assertEquals(expResult, result);
    }

    /**
     * Test of put method, of class RedBlackTree.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        String es="perro";
        String ing="dog";
        RedBlackTree instance = new RedBlackTree();
        instance.put(ing, es);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
