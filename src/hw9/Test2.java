package hw9;


class Account {
    private int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        if(balance + amount > 4000) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance += amount;
        System.out.println("媽媽存了" + amount + "，帳戶共有: " + balance);
        if (balance >= 3000) {
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            notify();
        } else if (balance >= 2000) {
        	balance += amount;
        	System.out.println("媽媽存了" + amount + "，帳戶共有: " + balance);
        	System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            System.out.println("熊大被老媽告知帳戶已經有錢!");
            notify();
        }
        
    }

    public synchronized void withdraw(int amount) {
        if (balance < amount) {
            try {
                System.out.println("熊大看到帳戶沒錢，暫停提款");
                System.out.println("媽媽被熊大要求匯款!");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("熊大領了" + amount + "，帳戶共有: " + balance);
        if (balance <= 2000) {
            System.out.println("熊大看到餘額在2000以下，要求匯款");
            notify();
        }
        
    }
}

class MomThread extends Thread {
    private Account account;

    public MomThread(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit(2000);
        }
    }
}

class SonThread extends Thread {
    private Account account;

    public SonThread(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdraw(1000);

        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        Account account = new Account(2000);
        MomThread mom = new MomThread(account);
        SonThread son = new SonThread(account);

        mom.start();
        son.start();
    }
}
