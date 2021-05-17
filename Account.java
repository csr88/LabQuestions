class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amt) {
        double balan = getBalance();
        if (amt > balan) {
            System.out.println("Transaction failed");
        } else {
            System.out.println("Decrement a1 balance by amount: " + amt);
            balance = balan - amt;
            System.out.println("Remaining a1 balance: " + balance+"\n");
        }
    }
}

    class CheckingAccount{
        double overdraftAmount;

        public Account a1 = new Account(350000);
        double currentbalance = a1.getBalance();

        CheckingAccount(double currentbalance, double overdraftAmount){

            this.currentbalance = currentbalance;
            this.overdraftAmount = overdraftAmount;
        }

        CheckingAccount(double currentbalance){
            this.currentbalance = currentbalance;
        }

        public void withdraw(double amt){
            double bal = a1.getBalance();
            if (amt>bal){
                System.out.println("Transaction Failed");
                overdraftAmount = amt - bal;
            }
            else{
                System.out.println("Decrement a2 balance by amount: " + amt);
                currentbalance = currentbalance - amt;
                System.out.println("Remaining a2 balance: " + currentbalance + "\n");
            }
        }

    }


    class TestBanking{
        public static void main(String[] args) {
            double withdrawAmt = 15;

            Account a1 = new Account(350000);
            CheckingAccount a2 = new CheckingAccount(a1.getBalance());

            a1.withdraw(5000);


            System.out.println("Your a1 balance is: " + a1.getBalance() + "\n");

            a2.withdraw(400000);
            System.out.println("Overdraft is " + a2.overdraftAmount);

        }
    }



