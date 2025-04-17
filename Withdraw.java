import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("XYZ", "01");

        System.out.print("Enter amount to deposit initially: ");
        account.deposit(sc.nextInt());

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        account.withdraw(amount);

        System.out.println("Amount withdrawn successfully.");
        System.out.println("Remaining Balance: " + account.balance);
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

    void withdraw(int amount) {
        if (amount != 0) {
            balance -= amount;
            previousTransaction = -amount;
        }
    }
}
