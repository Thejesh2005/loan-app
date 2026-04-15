public class LoanApp {

    public static String checkEligibility(double salary, int creditScore, double debt) {

        if (salary >= 50000 && creditScore >= 700 && debt < 20000) {
            return "LOAN APPROVED";
        }

        return "LOAN REJECTED";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Loan Eligibility Service Running...");

        while (true) {
            System.out.println(checkEligibility(60000, 750, 10000));
            Thread.sleep(5000);
        }
    }
}