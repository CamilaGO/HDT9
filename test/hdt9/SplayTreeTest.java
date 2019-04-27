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
public class SplayTreeTest {
    
    public SplayTreeTest() {
    }
    /**
     * Test of contains method, of class SplayTree.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        String es="perro";
        String ing="dog";
        System.out.println("put");
        SplayTree instance = new SplayTree();
        instance.put(ing, es);
        boolean expResult=true;
        boolean result = instance.contains(ing);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of put method, of class SplayTree.
     */
    @Test
    public void testPut() {
        String es="perro";
        String ing="dog";
        System.out.println("put");
        SplayTree instance = new SplayTree();
        instance.put(ing, es);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
