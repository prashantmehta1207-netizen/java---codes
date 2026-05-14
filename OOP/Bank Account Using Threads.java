class BankAccount {
    private int balance = 1000;

    // synchronized method
    synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName()
                + " is trying to withdraw ₹" + amount);

        if (balance >= amount) {
            System.out.println("Processing withdrawal...");
            balance -= amount;

            System.out.println(Thread.currentThread().getName()
                    + " completed withdrawal.");

            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient Balance for "
                    + Thread.currentThread().getName());
        }
    }
}

class Customer extends Thread {
    BankAccount account;
    int amount;

    Customer(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Customer c1 = new Customer(account, 700, "Customer-1");
        Customer c2 = new Customer(account, 500, "Customer-2");

        c1.start();
        c2.start();
    }
}
