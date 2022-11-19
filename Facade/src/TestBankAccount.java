public class TestBankAccount {

    /**
     * Facade is when you create a simplified interface that performs many other actions behind the scenes.
     *
     */
    public static void main(String[] args) {
        BankAccountFacade bankAccess = new BankAccountFacade(12345678, 1234);

        bankAccess.withdrawCash(50.0);
        bankAccess.withdrawCash(910.0);
        bankAccess.withdrawCash(100.0);
        bankAccess.depositCash(200.0);

    }
}
