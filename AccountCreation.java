public class AccountCreation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("XYZ", "01");
        System.out.println("Account created successfully!");
        System.out.println("Customer Name: " + account.customerName);
        System.out.println("Customer ID: " + account.customerId);
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
}
