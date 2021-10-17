package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_number_delimited_by_comma_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("2,3"));
    }
    
    @Test
    void string_with_multiple_numbers_delimited_by_comma_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(9, stringCalculator.add("5,1,3"));
    }
    
    @Test
    public void support_For_CustomDelimiter() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(10, stringCalculator.add(";\n1;2;3;4"));
    }
}
