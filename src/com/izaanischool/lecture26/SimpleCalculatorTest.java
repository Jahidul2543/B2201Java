package com.izaanischool.lecture26;
import calculator.Calculator;

public class SimpleCalculatorTest {

    // Testing is nothing but comparing expected result with actual result.
    // Comparing Expected With Actual

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
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
        // Reassigning the value to the actual variable  after calling deduct()
        expectedValue = -1;
        actualResult  =  Calculator.deduct();

        if(expectedValue == actualResult){
            System.out.println("Test Passed");
        }
        else if (expectedValue !=actualResult){
            System.out.println("Test Failed");
        }
    }

}
