package OOPS.Properties.Encapsulation;

public class Concepts {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(); //creating the object

        account.setBalance(100); // setting/modifying the value of balance
        //in setBalance - amount = 100 -> balance = 100 (since balance = amount)

        double currentBalance = account.getBalance(); // here we are returning the modified value of balance
        System.out.println(currentBalance);
    }
}

class BankAccount {
    private double balance;

    public void setBalance(double amount){ //setter -> to access and modify the private variable
        if(amount >= 0){
            balance = amount;   // value modifies
        }
    }

    public double getBalance(){  // getter -> to get the modified value (after setter has set the value)
        return balance;
    }
}
