package com.izaanischool.lecture26;

import calculator.Calculator;
import org.testng.annotations.*;

public class CalculatorTest {
    @Test()
    public void addTest(){
        int a = 2;
        int b = 2;
        int expectedValue = 4;
        int actualResult = Calculator.add(a, b);
        // expectedValue == actualResult --> add() method is working. Test Passed
        // expectedValue != actualResult --> add() method is not working. Test Failed

        if(expectedValue == actualResult){
            System.out.println("Test Passed");
        }
        else if (expectedValue !=actualResult){
            System.out.println("Test Failed");
        }

        System.out.println("Oh Great Calculator App is working well...");
    }
    @Test()
    public void deductTest(){
        // Reassigning the value to the actual variable  after calling deduct()
        int a = 2;
        int b = 2;
        int expectedValue = -1;
        int actualResult  =  Calculator.deduct();

        if(expectedValue == actualResult){
            System.out.println("Test Passed");
        }
        else if (expectedValue !=actualResult){
            System.out.println("Test Failed");
        }
    }

}
