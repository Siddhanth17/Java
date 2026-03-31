class account {
    protected double balance;

  
    account(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

class SavingsAccount extends account {

   
    SavingsAccount(double balance) {
        super(balance);
    }

   
    @Override
    double calculateInterest() {
        double interest = balance * 0.04;

        if (balance > 50000) {
            interest += 800;
        }

        return interest;
    }
}


class FixedDeposit extends SavingsAccount {


    FixedDeposit(double balance) {
        super(balance);
    }

 
    @Override
    double calculateInterest() {
        double interest = super.calculateInterest(); 
        interest += balance * 0.02; 
        return interest;
    }
}


public class cases1 {
    public static void main(String[] args) {

        FixedDeposit fd = new FixedDeposit(10000);

        System.out.println("Total Interest: " + fd.calculateInterest());
    }
}