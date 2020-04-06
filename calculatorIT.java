/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rabia
 */
public class calculatorIT {
    
    public calculatorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        System.out.println("Arthimatic operation is about to being");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Arthimatic operation are performed");
    }
    
    
    @Test
    public void testAdd() {
        System.out.println("add");
        String a = "4";
        String b  = "4";
        assertSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 8;
         assertNotNull(expres);
        int res = instance.Add(a,b);
        assertEquals(expres,res);             
        
    }
    
    
     @Test
    public void testAdd1() {
        System.out.println("add");
        String a = "4";
        String b= "5";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 9;
         assertNotNull(expres);
        int res = instance.Add(a,b);
        assertEquals(expres,res);             
        
    }
    
    
      @Test(expected=NumberFormatException.class )
    public void testAdd2() {
        System.out.println("add");
        String a = "4";
        String b= "foo";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 0;
         assertNotNull(expres);
        int res = instance.Add(a,b);
        assertEquals(expres,res);             
        
    }
    
    
     @Test
    public void testSub() {
        System.out.println("sub");
        String a = "4";
        String b  = "4";
        assertSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 0;
         assertNotNull(expres);
        int res = instance.Sub(a,b);
        assertEquals(expres,res);             
        
    }
    
     @Test
    public void testSub1() {
        System.out.println("sub");
        String a = "5";
        String b  = "4";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 1;
         assertNotNull(expres);
        int res = instance.Sub(a,b);
        assertEquals(expres,res);             
        
    }
    
      @Test
    public void testSub2() {
        System.out.println("sub");
        String a = "2";
        String b  = "4";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 2;
         assertNotNull(expres);
        int res = instance.Sub(a,b);
        assertEquals(expres,res);             
        
    }
    
    
      @Test(expected=NumberFormatException.class )
    public void testSub3() {
        System.out.println("sub");
        String a = "2";
        String b  = "foo";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 0;
         assertNotNull(expres);
        int res = instance.Sub(a,b);
        assertEquals(expres,res);             
        
    }
    
      @Test
    public void testMul() {
        System.out.println("sub");
        String a = "2";
        String b  = "4";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 8;
         assertNotNull(expres);
        int res = instance.Mul(a,b);
        assertEquals(expres,res);             
        
    }
    
     @Test(expected=NumberFormatException.class )
    public void testMu1l() {
        System.out.println("sub");
        String a = "2";
        String b  = "foo";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 0;
         assertNotNull(expres);
        int res = instance.Mul(a,b);
        assertEquals(expres,res);             
        
    }
    
    
    @Test
    public void testDiv() {
        System.out.println("div");
        String a = "4";
        String b  = "4";
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 1;
         assertNotNull(expres);
        int res = instance.Div(a,b);
        assertEquals(expres,res);             
        
    }
    
     @Test
    public void testDiv1() {
        System.out.println("div");
        String a = "9";
        String b  = "3";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 3;
         assertNotNull(expres);
        int res = instance.Div(a,b);
        assertEquals(expres,res);             
        
    }
    
      @Test
    public void testDiv2() {
        System.out.println("div");
        String a = "3";
        String b  = "9";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 3;
         assertNotNull(expres);
        int res = instance.Div(a,b);
        assertEquals(expres,res);             
        
    }
    
    
      @Test(expected=NumberFormatException.class )
    public void testDiv3() {
        System.out.println("div");
        String a = "2";
        String b  = "foo";
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator instance = new  calculator();
        int expres = 0;
        assertNotNull(expres);
        int res = instance.Div(a,b);
        assertEquals(expres,res);             
        
    }
    
    @Test
    public void evenNumberTest(){
        int a=3;
        int b=4;
          assertNotSame(a,b);
        assertNotNull(a);
        assertNotNull(b);
        calculator asft = new calculator();
        assertFalse(asft.isEvenNumber(a));
        assertTrue(asft.isEvenNumber(b));
    }
    
    
     @Test
    public void squareTest(){
         System.out.println("square");
        String a = "6";
        assertNotNull(a);
        calculator instance = new  calculator();
        int expres = 36;
        assertNotNull(expres);
        int res = instance.square(a);
        assertEquals(expres,res); 
    }
    
    
}
