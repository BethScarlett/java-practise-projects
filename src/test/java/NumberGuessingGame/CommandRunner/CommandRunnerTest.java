package NumberGuessingGame.CommandRunner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandRunnerTest {

    @Test
    @DisplayName("Low guess returns too low")
    void validateGuess_validInputs_returnsTooLow() {
        String result = CommandRunner.validateGuess(1, 5);
        assertEquals("Too Low", result);
    }

    @Test
    @DisplayName("High guess returns too high")
    void validateGuess_validInputs_returnsTooHigh() {
        String result = CommandRunner.validateGuess(10, 5);
        assertEquals("Too High", result);
    }

    @Test
    @DisplayName("Correct guess returns correct")
    void validateGuess_validInputs_returnsCorrect() {
        String result = CommandRunner.validateGuess(5, 5);
        assertEquals("Correct", result);
    }
}