package declaring.nested;

import java.time.LocalDate;

class InsufficientFundsException extends RuntimeException {

}

interface ATM {

    boolean login(int account);
    boolean deposit(double amount);
    boolean withdraw(double amount) throws InsufficientFundsException;
    double getBalance();

    /**
     * Card es una interface anidada
     */
    public static interface Card {
        String getNumber();
        String getSecurityCode();
        LocalDate getExpirationDate();
        String getCardHolderName();
    }
}
