package Week10.BankAccount;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    private boolean hasOverdraft;
    private double deposit;
    private double withdraw;


    public BankAccount(String accountHolder, String
            accountNumber, double balance, boolean
            hasOverdraft, double deposit, double
            withdraw) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.hasOverdraft = hasOverdraft;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        if (deposit > 0 && getWithdraw()){
            return (balance + deposit) - withdraw;
        }else if (deposit > 0 && !getWithdraw()){
            return balance + deposit;
        }else if (deposit < 0 && getWithdraw()){
            return balance - withdraw;
        }else {
            return balance;
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft() {
        return hasOverdraft;
    }

    public void setHasOverdraft(boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean getDeposit() {
        return (deposit > 0);
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public boolean getWithdraw() {
        if (withdraw > 0 && withdraw < balance
                && hasOverdraft) {
            return true;

        } else if (withdraw > 0 && withdraw < balance
                && !hasOverdraft){
            return true;

        } else if (withdraw > 0 && withdraw > balance
                && hasOverdraft){
            return true;

        }else if (withdraw > 0 && withdraw > balance
                && !hasOverdraft){
            return false;

        } else {
            return false;
        }
    }

    public void setWithdraw(double withdraw) {

        if (hasOverdraft) {
            this.withdraw = withdraw;

        }else if (withdraw > balance) {
            this.withdraw = 0;

        } else {
            this.withdraw = withdraw;
        }
    }

    public double addinterest(double interest) {
        assert (balance > 0); {
            return ((balance * interest) / 100) + balance;
        }
    }

    @Override
    public String toString() {
        return "Account Holder: " + getAccountHolder() +
                ", Account Number: " + getAccountNumber() +
                ", Balance: " + getBalance() +
                ", Has overdraft: " + hasOverdraft +
                ", Deposit acceptance: " +getDeposit() +
                ", Withdraw acceptance: " + getWithdraw();
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Dawid",
                "01234567", 100,false,
                20, 10);
        System.out.println(myAccount);
    }
}
