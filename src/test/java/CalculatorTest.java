import static org.junit.jupiter.api.Assertions.*;

import javafx.scene.Parent;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.*;

import java.time.Month;
import java.util.stream.Stream;


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
   @ArgumentsSource(Parameters.class)
    public void biggerThanZeroTest(Integer value){
        assertTrue(calculator.isBiggerThanZero(value));
   }

   @ParameterizedTest
   @CsvFileSource(resources = "/input.csv")
    public void addParameterizedTest(Integer a, Integer b, Integer sum){
        assertEquals(calculator.add(a,b), sum);
   }

   @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JANUARY", "NOVEMBER", "JULY"}, mode = EnumSource.Mode.EXCLUDE)
    public void isMonthLessThan31DaysTest(Month month){
        Integer days = month.length(false);
        assertTrue(days < 31);
   }

   @ParameterizedTest
    @ValueSource(strings = {"a", "b", "c"})
    public void divisionParameterizedTest(@ConvertWith(Converter.class) Integer i){
        assertEquals(1, calculator.division(i, 1));
   }






}
