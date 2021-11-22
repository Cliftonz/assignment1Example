import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Assignment1Test {

    @Test
    @DisplayName("Example 1")
    void calculateFutureInvestmentEx1() {
        assertEquals(1647.83, Assignment1.CalculateFutureInvestment(1000,4.25,1),0.01);
    }

    @Test
    @DisplayName("Example 2")
    void calculateFutureInvestmentEx2() {
        assertEquals(12149.65, Assignment1.CalculateFutureInvestment(1000,4.25,5),0.01);
    }

    @Test
    @DisplayName("Test with Given Examples and your Own")
    void calculateFutureInvestment2() {
        assertAll(() -> assertEquals(1647.83, Assignment1.CalculateFutureInvestment(1000,4.25,1),0.01),
                () -> assertEquals(12149.65, Assignment1.CalculateFutureInvestment(1000,4.25,5),0.01)
                // copy the two test above and change investmentAmount of 2000
        );

    }

}