import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    public void addTest(){
        final Calculator calculator = new Calculator();
        assertAll(
                () -> assertEquals(8, calculator.add(5,3)),
                () -> assertEquals(7, calculator.add(5,2))
        );
    }

    @Test
    public void isBiggerThanTest(){
        Calculator calculator = new Calculator();
        Boolean isBigger = calculator.isBiggerThan(5, 3);
        assertFalse(isBigger);
    }

    @Test
    public void testSame(){
        DummyObj d1 = new DummyObj();
        DummyObj d2 = new DummyObj();
        d1.setValue("42");
        d2.setValue("42");
        assertSame(d1, d2);
    }

}
