import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LoanAppTest {

    @Test
    void testApprovedLoan() {
        assertEquals("LOAN APPROVED",
                LoanApp.checkEligibility(60000, 750, 10000));
    }

    @Test
    void testRejectedLowSalary() {
        assertEquals("LOAN REJECTED",
                LoanApp.checkEligibility(30000, 750, 10000));
    }

    @Test
    void testRejectedLowCreditScore() {
        assertEquals("LOAN REJECTED",
                LoanApp.checkEligibility(60000, 600, 10000));
    }

    @Test
    void testRejectedHighDebt() {
        assertEquals("LOAN REJECTED",
                LoanApp.checkEligibility(60000, 750, 30000));
    }
}