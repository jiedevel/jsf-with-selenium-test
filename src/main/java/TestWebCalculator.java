/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;


/**
 *
 * @author jie
 */
@Named(value = "testWebCalculator")
@RequestScoped
//@SessionScoped
//@ApplicationScoped
public class TestWebCalculator {

    /**
     * Creates a new instance of TestWebCalculator
     */
    
     public static final Logger  log  = Logger.getLogger("cal.log");
    
    public TestWebCalculator() {
      //  log.info("Test web cal constructed");
       // System.out.println("Test web calculator constructed");
    }
    
    private double paramOne;
    private double paramTwo;
    private double result;

    public double getParamOne() {
    //    System.out.println("get param one =" );
    //    System.out.println(paramOne);
        return paramOne;
    }

    public double getParamTwo() {
    //    System.out.println("get param tne =" );
    //    System.out.println(paramTwo);
        return paramTwo;
    }

    public double getResult() {
    //    System.out.println("get result =" );
    //    System.out.println(result);
        return result;
    }

    public void setParamOne(double paramOne) {
    //    System.out.println("set param one =" );
    //    System.out.println(paramOne);
        this.paramOne = paramOne;
    }

    public void setParamTwo(double paramTwo) {
    //    System.out.println("set param two =" );
    //    System.out.println(paramTwo);
        this.paramTwo = paramTwo;
    }

    public void setResult(double result) {
    //    System.out.println("set result=" );
    //    System.out.println(result);
        this.result = result;
    }

    
    public String add(){
        result = paramOne + paramTwo;
     //   System.out.println("Hello, added");
        return "";
    }
   
    
     public String subtract(){
        result = paramOne - paramTwo;
    //    System.out.println("Hello, sunstract");
        return "";
    }
   
    
    public String multiply(){
    //    System.out.println("Hello, mul");
        result = paramOne * paramTwo;
        return "";
    }
   
    
    public String divide(){
     //   System.out.println("Hello, divide");
        if ( paramTwo == 0.0 ) {
            return "";
        }
        result = paramOne / paramTwo;
        return "";
    }
   
    
    
    
}
