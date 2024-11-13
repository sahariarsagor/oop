public class problem6 {
    public static void main(String args[]) {
        Account sahariarAccount = new Account(1000);
        sahariarAccount.deposit(2000);
        sahariarAccount.withdraw(500);
        sahariarAccount.displayBalance();
    }
}

class Account{
    private double balance; 
    
    public Account(double initialBalance){
        if(initialBalance >= 0){
            this.balance = initialBalance;
        } else {
            System.out.println("Amount cannot be negetive.");
            this.balance = 0; 
        }
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposit: " + amount);
        } else{
            System.out.println("Deposit amount cannot be negetive.");
        }
    }
    
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient Balance.");
        } else if(amount > 0){
            balance -= amount; 
            System.out.println("Withdraw Done: " + amount);
        } else{
            System.out.println("Deposit amount cannot be negetive");
        }
    }
    
    public void displayBalance(){
        System.out.println("Current Balance: " + balance);
    }
}
