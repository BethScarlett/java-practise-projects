package BankingApp.User;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    @DisplayName("Correct amount of money is deposited")
    void depositMoney_validInput_balanceCorrectlyChanges() {
        Customer test = new Customer("Test", "Private", 50);

        double initialAmount = test.getBalance();
        assertEquals(50, initialAmount);

        test.depositMoney(20);
        initialAmount = test.getBalance();
        assertEquals(70, initialAmount);
    }

    @Test
    @DisplayName("Transaction fails if deposit amount is negative")
    void depositMoney_negativeInput_failureReturned() {
        Customer test = new Customer("Test", "Private", 50);

        String result = test.depositMoney(-20);
        assertEquals("Failure-Negative Withdrawal", result);
        assertEquals(50, test.getBalance());
    }

    @Test
    @DisplayName("Correct amount of money is withdrawn")
    void withdrawMoney_validInput_balanceCorrectlyChanges() {
        Customer test = new Customer("Test", "Private", 50);

        double initialAmount = test.getBalance();
        assertEquals(50, initialAmount);

        test.withdrawMoney(20);
        initialAmount = test.getBalance();
        assertEquals(30, initialAmount);
    }

    @Test
    @DisplayName("Transaction fails if withdrawal amount > current balance")
    void withdrawMoney_higherInput_failureReturned() {
        Customer test = new Customer("Test", "Private", 50);

        String result = test.withdrawMoney(70);
        assertEquals("Failure-Low Balance", result);
        assertEquals(50, test.getBalance());
    }

    @Test
    @DisplayName("Transaction fails if withdrawal amount is negative")
    void withdrawMoney_negativeInput_failureReturned() {
        Customer test = new Customer("Test", "Private", 50);

        String result = test.withdrawMoney(-40);
        assertEquals("Failure-Negative Withdrawal", result);
        assertEquals(50, test.getBalance());
    }
}