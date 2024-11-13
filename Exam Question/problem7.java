
class loanCandidate{
    private String name;
    private double annualIncome;
    private int nidNum;
    private int accNum;
    private int creditScore;
    
    public loanCandidate(String name, double annualIncome, int nidNum, int accNum, int creditScore){
        this.name = name;
        this.annualIncome = annualIncome;
        this.nidNum = nidNum;
        this.accNum = accNum;
        this.creditScore = creditScore;
    }
    
    public void checkLoanEligibility(int loanAmount){
        if(creditScore > 700){
            double maxLoanAmount = 0.5 * annualIncome; 
            if(loanAmount <= maxLoanAmount){
                System.out.println("Loan Approved for amount: " + loanAmount);
            } else{
                System.out.println("Loan Request Rejected. ");
            }
        } else if(creditScore >= 600 && creditScore <= 700){
            double maxLoanAmount = annualIncome * 0.3; 
            if(loanAmount <= maxLoanAmount){
                System.out.println("Loan Approved for amount: " + loanAmount);
            } else {
                System.out.println("Loan Request Rejected.");
            }
        } else{
            System.out.println("Not Eligible for loan ");
        }
    }
}

public class problem7 {

    public static void main(String args[]) {
       loanCandidate candidate1 = new loanCandidate("saharia", 50000, 124658, 1224, 650);
       candidate1.checkLoanEligibility(10000);
    }
}
