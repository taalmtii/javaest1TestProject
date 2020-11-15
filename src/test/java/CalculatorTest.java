import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    static Calculator calculator;

    @BeforeAll
    static void createCalculator(){
        System.out.println("Calculator created");
        calculator = new Calculator();
    }

    @Test
    public void addTest(){
        assertAll(
                () -> assertEquals(8, calculator.add(5,3)),
                () -> assertEquals(7, calculator.add(5,2))
        );
    }

    @Test
    public void isBiggerThanTest(){
        Boolean isBigger = calculator.isBiggerThan(3, 5);
        assertFalse(isBigger);
    }

   @Test
    public void divisionByZeroTest(){
        Exception e = assertThrows(RuntimeException.class,
                () -> calculator.division(7, 0)
        );
        assertEquals(e.getMessage(), "divide by 0");
   }

   @ParameterizedTest



}
