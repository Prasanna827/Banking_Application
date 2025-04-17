import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bank1 = new BankAccount("XYZ","01");
        bank1.showMenu();
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
        if(amount != 0) {
            balance = balance+amount;
            previousTransaction = amount;
        }
      }

      void withdraw(int amount) {
        if(amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
      }

      void getPreviousTransaction() {
        if(previousTransaction >0) {
            System.out.println("deposited: " + previousTransaction);
        }
        else if(previousTransaction <0) {
            System.out.println("withdrawn: " + Math.abs(previousTransaction));
        }
        else {
            System.out.println("No transaction is occured!");
        }
      }

      void showMenu() {
        char option = '\0';
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome" + customerName);
        System.out.println("Your ID is: " + customerId);
        System.out.println();
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. previous Transaction");
        System.out.println("5. Exit");

        do {
            System.out.println("====================");
            System.out.println("Enter the option");
            System.out.println("====================");
            option = sc.next().charAt(0);
            Character.toUpperCase(option);

            switch (option) {
                case '1':
                    System.out.println("====================");
                    System.out.println("Balance is: " + balance);
                    System.out.println("====================");
                    System.out.println();
                    break;

                case '2':
                    System.out.println("====================");
                    System.out.println("Enter the amount to deposit "); 
                    System.out.println("====================");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;

                case '3':
                    System.out.println("====================");
                    System.out.println("Enter the amount to withdraw");
                    System.out.println("====================");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;

                case '4':
                    System.out.println("====================");
                    getPreviousTransaction();
                    System.out.println("====================");
                    System.out.println();
                    break;

                case '5':
                    System.out.println("====================");
                    break;

                default:
                    System.out.println("Invalid option1 please try again");
                    break;       
            }    
        }while (option != '5');
      }
}