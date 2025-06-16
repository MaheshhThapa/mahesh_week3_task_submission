           //BankAccount
class BankAccount {

    private String accountNumber;
    private double balance;

    BankAccount (String accountNumber,  double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }
            //getters
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
            //setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}


class SavingsAccount extends BankAccount{

    private double interestRate;

    SavingsAccount(String accountNumber,double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    void withdraw(double amount) {
        if((getBalance()-amount)<1000){
            System.out.println("Invalid request, Insufficient funds.");
        } 
        else {
            setBalance(getBalance() - amount); 
            System.out.println("Amount Rs." + amount + " withdrawn.");
            System.out.println("New balance = Rs."+ getBalance() );
        }
    }

    void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }
                //getter
    public double getInterestRate() {
        return interestRate;
    }
                //setter
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}


public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount person1 = new SavingsAccount("1242423", 100000.0, 0.09);

        System.out.println("Initial Balance: " + person1.getBalance());

        person1.deposit(500.0);
        System.out.println("After Deposit: " + person1.getBalance());

        person1.addInterest();
        System.out.println("After Adding Interest: " + person1.getBalance());

        person1.withdraw(10000);
        System.out.println("After Withdrawal Attempt: " + person1.getBalance());

        person1.withdraw(5000);
        System.out.println("After Withdrawal: " + person1.getBalance());
    }
}