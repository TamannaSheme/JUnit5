/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewu.cse;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


/**
 *
 * @author mohsin
 */
public class StudentTest {
    
    public StudentTest() {
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
    
    
    //Helper Method
     public boolean isPalindrome(String candidate) {
         return candidate.equalsIgnoreCase(new StringBuilder(candidate).reverse().toString());
     }
     
     @RepeatedTest(10)
     public void repeatedTest() {}
     
     @ParameterizedTest
     @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
     public void palindroms(String candidate) {
         assertTrue(isPalindrome(candidate));
     }
     
     @Test
     @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
     public void testIncCGPA(){
         Student s1 = new Student("2050-1-60-120","Xman",3.6);
         s1.incCGPA(.15);
         assertEquals(3.75, s1.getCgpa(),"Testing cgpa increment");
     }
     
     
     @Disabled("Disabled until bug #99 has been fixed")
     @Test
     public void testsubCGPA(){
         Student s1 = new Student("2050-1-60-120","Xman",3.6);
         s1.subCGPA(.15);
         assertEquals(3.15, s1.getCgpa(),"Testing cgpa decrement");
     }
     
     
}
