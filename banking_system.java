import java.util.*;

class Account {
    String Name;
    String AccountNumber;
    double balance;

    public Account(String Name, String AccountNumber, double balance) {
        this.Name = Name;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
    }

    public String getName() {
        return this.Name;
    }

    public String getAccountNumber() {
        return this.AccountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.setBalance(amount + this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Insufficient balance");
        } else {
            this.setBalance(this.balance - amount);
        }
    }

}

class Bank {
    private static ArrayList<Account> accounts = new ArrayList<Account>();

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void add_Account(Account account) {
        accounts.add(account);
    }

    public void remove_Account(Account account) {
        accounts.remove(account);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

}

public class banking_system {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account a1 = new Account("Raj", "123456789", 1000);
        Account a2 = new Account("Rahul", "987654321", 2000);
        Account a3 = new Account("Ramesh", "456789123", 3000);
        Account a4 = new Account("Rajesh", "789456123", 4000);
        bank.add_Account(a1);
        bank.add_Account(a2);
        bank.add_Account(a3);
        bank.add_Account(a4);
        bank.deposit(a4, 600);
        bank.withdraw(a3, 500);
        // to see details of all accounts
        ArrayList<Account> accounts = bank.getAccounts();
        for (Account a : accounts) {
            System.out.println("Name: " + a.getName() + " Account Number: " + a.getAccountNumber() + " Balance: "
                    + a.getBalance());
        }
        bank.remove_Account(a3);
        // to see details of all accounts
        accounts = bank.getAccounts();
        bank.withdraw(a4, 700);
        System.out.println("After removing an account");
        for (Account a : accounts) {
            System.out.println("Name: " + a.getName() + " Account Number: " + a.getAccountNumber() + " Balance: "
                    + a.getBalance());
        }
    }
}
