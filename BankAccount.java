import java.util.*;

class Account {
    String name;
    String branch;
    private double bal = 0;

    Account(String n, String br, Double b) {
        name = n;
        branch = br;
        bal = b;
    }

    public double getBalance() {
        return bal;
    }

    public void updateBalance(double b) {
        System.out.println("For Customer," + name + "\nUpdated Balance : " + b);
        bal = b;

    }
}

class SavingAccount extends Account {
    static final int interest = 10;

    SavingAccount(String n, String br, Double b) {
        super(n, br, b);
    }

    public void addInterest() {
        double b = getBalance();
        updateBalance(b + b * interest / 100);
    }
}

class CurrentAccount extends Account {
    static final int OLimit = 10000;
    int w_amt = 0;

    CurrentAccount(String n, String br, Double b, int with_amt) {
        super(n, br, b);
        w_amt = with_amt;
    }

    public void withdraw() {
        if (w_amt > OLimit && w_amt >= getBalance()) {
            System.out.println("Tera Ghar Jayega");
        } else {
            updateBalance(getBalance() - w_amt);
        }
    }
}

class Bank {
    List<Object> accounts = new ArrayList<Object>();

    Bank(List<Object> arr) {
        accounts.addAll(arr);
    }

    public void browse() {
        for (Object acc : accounts) {
            if (acc instanceof SavingAccount) {
                ((SavingAccount) acc).addInterest();
            } else
                ((CurrentAccount) acc).withdraw();
        }
    }
}

class BankAccount {
    public static void main(String args[]) {
        SavingAccount s = new SavingAccount("A", "x", 5000.0);
        CurrentAccount c = new CurrentAccount("B", "y", 10000.0, 11000);
        List<Object> a = new ArrayList<Object>();
        a.add(s);
        a.add(c);
        Bank b = new Bank(a);
        b.browse();
    }
}
