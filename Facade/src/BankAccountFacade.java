public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    private AccountNumberCheck accountNumberCheck;
    private SecurityCodeCheck securityCodeCheck;
    private FundsCheck fundsCheck;

    private final WelcomeToBank bankWelcome;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode  = securityCode;

        bankWelcome = new WelcomeToBank();
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToWithdraw) {
        if (accountNumberCheck.isAccountActive(accountNumber) &&
                securityCodeCheck.isCodeCorrect(securityCode) &&
                fundsCheck.withdraw(cashToWithdraw)) {
            System.out.println("Transaction Complete");
            System.out.println("--------------------\n");
        }
        else {
            System.out.println("Transaction Failed");
            System.out.println("--------------------\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (accountNumberCheck.isAccountActive(accountNumber) && securityCodeCheck.isCodeCorrect(securityCode)) {
            fundsCheck.deposit(cashToDeposit);
            System.out.println("Transaction Complete");
            System.out.println("--------------------\n");
        }
        else {
            System.out.println("Transaction Failed");
            System.out.println("--------------------\n");
        }
    }
}
