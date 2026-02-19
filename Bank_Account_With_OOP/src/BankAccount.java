public class BankAccount {
    String accountNumber;
    double accountBalance;
    String customerName;
    String email;
    int phoneNumber;


    public void dipositFund(double dipositMoney){
        accountBalance += dipositMoney;
        System.out.println("Deposit of $ " + dipositMoney + " is Added. and The Balance is $ " + accountBalance);
    }

    public void withdrowFunds(double withdrawAmount){

        if(accountBalance - withdrawAmount < 0){
            System.out.println(("Insufficient Fund: You only have $" + accountBalance + " in your accounte"));
            }else{
            accountBalance -= withdrawAmount;
            System.out.println("Withdrowl of $" + withdrawAmount +  "processed, Remaining balance = $" + accountBalance);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public void withdrawFund(){


    }


}
