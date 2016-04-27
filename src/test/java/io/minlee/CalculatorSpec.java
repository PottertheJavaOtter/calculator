package io.minlee;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by minlee on 4/27/16.
 */
public class CalculatorSpec {

    @Test
    public void sumTest(){
        Calculator calculator = new Calculator();
        int expectedSum = 4;
        int actualSum = calculator.sum(2,2);
        assertEquals("The expected value should be "+expectedSum,expectedSum,actualSum);
    }
    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int expectedSubtraction = 1;
        int actualSubtraction = calculator.subtract(3,2);
        assertEquals("The expected value should be "+expectedSubtraction,expectedSubtraction,actualSubtraction);
    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int expectedMultiplication = 4;
        int actualMultiplication = calculator.multiply(2,2);
        assertEquals("The expected value should be "+expectedMultiplication,expectedMultiplication,actualMultiplication);
    }
    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int expectedDivision = 1;
        int actualDivision = calculator.divide(2,2);
        assertEquals("The expected value should be "+expectedDivision,expectedDivision,actualDivision);
    }
}