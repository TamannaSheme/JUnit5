/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.cse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mohsin
 */
public class TestSET {
    
    public TestSET() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSetAdd() {
        SET<String> set = new SET<String>();
        set.add("www.cs.princeton.edu");
        assertTrue(set.contains("www.cs.princeton.edu"),"Testing contains");
    }
    
    @Test
    public void testSetDelete() {
        SET<String> set = new SET<String>();
        set.add("www.cs.princeton.edu");
        set.delete("www.cs.princeton.edu");
        assertFalse(set.contains("www.cs.princeton.edu"),"Testing contains");
    }
    
    @Test
    public void testExceptionInAddition() {
        SET<String> set = new SET<String>();
        Exception e = assertThrows(IllegalArgumentException.class, ()->set.add(null));
        assertEquals("called add() with a null key", e.getMessage());
    }
    
    @Test
    public void testExceptionInContains() {
        SET<String> set = new SET<String>();
        Exception e = assertThrows(IllegalArgumentException.class, ()->set.contains(null));
        assertEquals("called contains() with a null key", e.getMessage());
    }
    
    @Test
    public void testExceptionInDeletion() {
        SET<String> set = new SET<String>();
        Exception e = assertThrows(IllegalArgumentException.class, ()->set.delete(null));
        assertEquals("called delete() with a null key", e.getMessage());
    }
}
