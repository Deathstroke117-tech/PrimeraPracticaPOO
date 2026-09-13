public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    private static String bankName = "Banco Isil";

    public BankAccount(String _acccountNumber, String _accountHolder){
        this.accountNumber = _acccountNumber;
        this.accountHolder = _accountHolder;
        this.balance = 0;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("No tienes saldo suficiente.");
            return;
        }
        else{
            balance -= amount;
        }
    }
    public String summary(){
        return "Account: " + accountHolder;
    }
}
