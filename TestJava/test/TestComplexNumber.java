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
import org.junit.jupiter.api.DisplayName;


public class TestComplexNumber {
    
    public TestComplexNumber() {
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

    @Test
    @DisplayName("Testing Complex Addition")
    public void testAdd() {
        ComplexNumber c1 = new ComplexNumber(5, 10);
        ComplexNumber c2 = new ComplexNumber(15, 4);
        ComplexNumber result = ComplexNumber.add (c1,c2);
        assertEquals(20, result.getReal(),"Testing real part after addition");
        assertEquals(14, result.getImag(),"Testing imaginary part after addition");
        
        
        c1 = new ComplexNumber(-5, -10);
        c2 = new ComplexNumber(-15, -4);
        result = ComplexNumber.add (c1,c2);
        assertEquals(-20, result.getReal(),"Testing real part after addition");
        assertEquals(-14, result.getImag(),"Testing imaginary part after addition");
        
    }
    
    
    @Test
    @DisplayName("Testing Complex Subtraction")
    public void testSubtract() {
        ComplexNumber c1 = new ComplexNumber(5, 10);
        ComplexNumber c2 = new ComplexNumber(15, 4);
        ComplexNumber result = ComplexNumber.subtract (c1,c2);
        assertEquals(-10, result.getReal(),"Testing real part after subtraction");
        assertEquals(6, result.getImag(),"Testing imaginary part after subtraction");
        
        
        
    }
}
