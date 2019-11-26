/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author jie
 */
public class TestWebCalculatorTest {
    
   
    TestWebCalculator myCal;
    
    
   
    @BeforeEach
    public void setUp() {
        
        myCal = new TestWebCalculator();
        myCal.setParamOne(6.0);
        myCal.setParamTwo(4.0);
        myCal.setResult(1.0);
        
    }
    
    

    /**
     * Test of getParamOne method, of class TestWebCalculator.
     */
    @Test
    public void testGetParamOne() {
        System.out.println("getParamOne");
        String text = Double.toString(myCal.getParamOne());
        assertEquals("6.0",text);
        System.out.println("getParamOne passed");
    }

    /**
     * Test of getParamTwo method, of class TestWebCalculator.
     */
    @Test
    public void testGetParamTwo() {
       System.out.println("getParamTwo");
       String text = Double.toString(myCal.getParamTwo());
       assertEquals("4.0",text);
       System.out.println("getParamTwo passed");
    }

    /**
     * Test of getResult method, of class TestWebCalculator.
     */
    @Test
    public void testGetResult() {
        System.out.println("get result");
        String text = Double.toString(myCal.getParamOne());
        assertEquals("6.0",text);
        System.out.println("get result passed");
    }

    /**
     * Test of setParamOne method, of class TestWebCalculator.
     */
    @Test
    public void testSetParamOne() {
        System.out.println("set  param one");
        myCal.setParamOne(5.0);
        String text = Double.toString(myCal.getParamOne());
        assertEquals("5.0",text);
        System.out.println("set paramone passed");
    }

    /**
     * Test of setParamTwo method, of class TestWebCalculator.
     */
   @Test
    public void testSetParamTwo() {
        System.out.println("set  param tw0");
        myCal.setParamTwo(50.0);
        String text = Double.toString(myCal.getParamTwo());
        assertEquals("50.0",text);
        System.out.println("set paramtwo passed");;
    }

    /**
     * Test of setResult method, of class TestWebCalculator.
     */
    @Test
    public void testSetResult() {
        
        System.out.println("set result");
        myCal.setResult(15.0);
        String text = Double.toString(myCal.getResult());
        assertEquals("15.0",text);
        System.out.println("set result passed");
    }

    /**
     * Test of add method, of class TestWebCalculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        myCal.add();
        String text = Double.toString(myCal.getResult());
        assertEquals("10.0", text);
        System.out.println("add passed");
        // TODO review the generated test code and remove the default call to fail.
   //     fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class TestWebCalculator.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        myCal.subtract();
        String text = Double.toString(myCal.getResult());
        assertEquals("2.0", text);
        System.out.println("subtract passed");
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class TestWebCalculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        myCal.multiply();
        String text = Double.toString(myCal.getResult());
        assertEquals("24.0", text);
        System.out.println("multiply passed");
    }

    /**
     * Test of divide method, of class TestWebCalculator.
     */
   @Test
    public void testDivide() {
        System.out.println("divide");
        myCal.divide();
        String text = Double.toString(myCal.getResult());
        assertEquals("1.5", text);
        System.out.println("divide passed");;
        myCal.setParamTwo(0.0);
        myCal.setResult(1.0);
        myCal.divide();
        text = Double.toString(myCal.getResult());
        assertEquals("1.0", text);
        System.out.println("divided by zero passed");;
    }


    

    
    
    
}
