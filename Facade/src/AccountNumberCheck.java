public class AccountNumberCheck {

    private int accountNumber = 12345678;

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean isAccountActive(int accountNumber) {
        return this.accountNumber == accountNumber;
    }
}
