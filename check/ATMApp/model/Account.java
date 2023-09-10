package ATMApp.model;

public class Account {
    private int accountNo;
    private String password;
    private double amount;
    private String customerName;

    public Account(){

    }
    public Account(int accountNo, String password,double amount,String customerName){
        this.accountNo = accountNo;
        this.password = password;
        this.amount = amount;
        this.customerName = customerName;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
