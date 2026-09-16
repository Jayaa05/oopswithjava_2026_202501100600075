class BankAccount {

    private int balance = 500;

    synchronized void withdraw(int amount) {

        System.out.println(
            Thread.currentThread().getName()
            + " is trying to withdraw " + amount
        );

        while (balance < amount) {

            System.out.println("Insufficient balance, waiting...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful");
        System.out.println("Balance: " + balance);
    }

    synchronized void deposit(int amount) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println(
            Thread.currentThread().getName()
            + " is depositing " + amount
        );

        balance = balance + amount;

        System.out.println("Deposit successful");
        System.out.println("Balance: " + balance);

        notify();
    }
}


public class InterThreadCommunication {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.withdraw(1000);
        }, "Person 1");

        Thread t2 = new Thread(() -> {
            account.deposit(1000);
        }, "Person 2");

        t1.start();
        t2.start();
    }
}