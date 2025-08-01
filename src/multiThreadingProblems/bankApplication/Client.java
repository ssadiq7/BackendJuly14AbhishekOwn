package multiThreadingProblems.bankApplication;

public class Client
{
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount(0);

        Thread t1 = new Thread(new DepositTask(bankAccount));
        Thread t2 = new Thread(new WithdrawTask(bankAccount));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Bank balance: " + bankAccount.getBalance());
    }
}
