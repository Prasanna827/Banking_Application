import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("XYZ", "01");

        System.out.print("Enter amount to deposit: ");
        int amount = sc.nextInt();
        account.deposit(amount);

        System.out.println("Amount deposited successfully.");
        System.out.println("Current Balance: " + account.balance);
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if (amount != 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }
}
