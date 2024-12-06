public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    // Getters & Setters
    public String getAccountNumber() {
        return accountNumber;
    } 

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = Integer.toString(accountNumber);
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Implementation
    @Override
    public String showAccountType() {
        return "Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

    @Override
    public double computeBalanceWithInterest() {
        return (getBalance() * getInterestRate()) + getBalance(); 
    }

    @Override
    public String showInfo() {
        return "Account number: " + getAccountNumber() +
               "\nAccount name: " + getAccountName() +
               "\nBalance: " + getBalance();
    }
}