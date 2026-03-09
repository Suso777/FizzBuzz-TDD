package FizzBuzz;

import org.example.Fizzbuzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({
            "1 , '1'",
            "2 , '2'",
            "4 , '4'",
            "7 , '7'",
            "8 , '8'",
    })
    void check_number_to_string(int input, String expectedOutput) {
        assertEquals(expectedOutput, new Fizzbuzz().convert(input));
    }

}