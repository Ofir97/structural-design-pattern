public class FundsCheck {

    private double cashInAccount = 1000.0;

    public double getCashInAccount() {
        return cashInAccount;
    }

    private void decreaseCashInAccount(double cashToWithdraw) {
        cashInAccount -= cashToWithdraw;
    }

    private void increaseCashInAccount(double cashToDeposit) {
        cashInAccount += cashToDeposit;
    }

    public boolean withdraw(double cashToWithdraw) {
        if (cashToWithdraw > cashInAccount) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + cashInAccount);
            return false;
        }

        System.out.println("Withdrawing " + cashToWithdraw + " ...");
        decreaseCashInAccount(cashToWithdraw);
        System.out.println("Withdraw Complete. \nCurrent Balance: " + cashInAccount);
        return true;
    }

    public void deposit(double cashToDeposit) {
        System.out.println("Depositing " + cashToDeposit + " ...");
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete. \nCurrent Balance: " + cashInAccount);
    }
}
