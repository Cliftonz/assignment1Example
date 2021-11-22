import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment1Test {

    @Test
    @DisplayName("testwithone")
    void calculateFutureInvestment() {
        assertEquals(1647.83, Assignment1.CalculateFutureInvestment(1000,4.25,1));
    }

    @Test
    @DisplayName("testwithoneFloat")
    void calculateFutureInvestmentFloat() {
        assertEquals(12149.65, Assignment1.CalculateFutureInvestment(1000,4.25,1), 0.01);
    }

    @Test
    @DisplayName("testwithGiven Examples")
    void calculateFutureInvestment2() {
        assertAll(() -> assertEquals(1647.83, Assignment1.CalculateFutureInvestment(1000,.0425,1),0.01),
                () -> assertEquals(12149.65, Assignment1.CalculateFutureInvestment(1000,4.25,5),0.01)
                // add two more tests of your own here
        );

    }

}