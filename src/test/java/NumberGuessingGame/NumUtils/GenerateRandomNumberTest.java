package NumberGuessingGame.NumUtils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateRandomNumberTest {

    @Test
    @DisplayName("Generate random number between 0 and 100")
    void generateNum_noInputs_numInRange() {
        int test = GenerateRandomNumber.generateNum();
        boolean result = (test >= 0 && test <=100);
        assertTrue(result);
    }

    @Test
    @DisplayName("Num will statistically always be in range")
    void generateNum_noInputs_numAlwaysInRange() {
        int i = 1;
        boolean result = true;
        while(i <= 100 && result) {
            int test = GenerateRandomNumber.generateNum();
            if(test < 0 | test >100) {
                result = false;
            }
            i++;
        }
        assertTrue(result);
    }

    @Test
    @DisplayName("Generate random number between two given inputs")
    void generateNum_givenInputs_numInRange() {
        int test = GenerateRandomNumber.generateNum(10, 20);
        boolean result = (test >= 10 && test <=20);
        assertTrue(result);
    }

    @Test
    @DisplayName("Num between given inputs will statistically always be in range")
    void generateNum_givenInputs_numAlwaysInRange() {
        int i = 1;
        boolean result = true;
        while(i <= 100 && result) {
            int test = GenerateRandomNumber.generateNum(10, 20);
            if(test < 10 | test > 20) {
                result = false;
            }
            i++;
        }
        assertTrue(result);
    }
}