import com.example.Calculator;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testIsTheNumberEven(){
        assertEquals(true, calculator.isEven(2));
        assertEquals(false,calculator.isEven(5));
    }

    @Test
    public void testSecondHighestNumber() throws Exception{
        assertEquals(6,calculator.secondHighestNumber(Arrays.asList(1,2,3,4,5,5,6,7)));
    }

    @Test
    public void testSecondHighestNumberWithException() {
       Exception exception = assertThrows(Exception.class,()-> calculator.secondHighestNumber(Arrays.asList(7)));
       assertEquals("No Second Number found", exception.getMessage());

        Exception exception1 = assertThrows(Exception.class,()-> calculator.secondHighestNumber(Collections.EMPTY_LIST));
        assertEquals("No Second Number found", exception1.getMessage());
    }

    @Test
    public void testSecondHighestNumberWithEmptyListException() {
        Exception exception1 = assertThrows(Exception.class,()-> calculator.secondHighestNumber(Collections.EMPTY_LIST));
        assertEquals("No Second Number found", exception1.getMessage());
    }
}
