package implementing.methods;

class InsufficientFundsException extends RuntimeException {}

class FundLimitExceededException extends Exception {}


interface Banker {
    double withdraw(double amount) throws InsufficientFundsException;

    void deposit(double amount) throws FundLimitExceededException;
}


/**
 * El cliente no tiene limite al depositar ni al retirar dinero
 */
class MinimumBalanceBank implements Banker {

    // Se ha eliminado la clausula throws
    @Override
    public double withdraw(double amount) throws InsufficientFundsException {
        return 0;
    }

    // Se ha eliminado la clausula throws
    @Override
    public void deposit(double amount) throws FundLimitExceededException {
    }
}

class NoLimitBank implements Banker {

    @Override
    public double withdraw(double amount) {
        return 0;
    }

    @Override
    public void deposit(double amount)  {
    }
}

class ArbitraryException extends Exception {}

class UnstablePredictableBank implements Banker {

    @Override
    public double withdraw(double amount) throws InsufficientFundsException {
        return 0;
    }

    // No se pueden añadir nuevas excepciones a la lista de un método que implementa
    // un método de la interface
    @Override
    //public void deposit(double amount) throws FundLimitExceededException, ArbitraryException { } // No compila
    //protected void deposit(double amount) throws FundLimitExceededException { } // No compila
    //private void deposit(double amount) throws FundLimitExceededException { } // No compila
    public void deposit(double amount) throws FundLimitExceededException { }
}

class BankingTest {

    public static void main(String[] args) {
        testWithInterfaceReferenceType();
        testWithImplementerClassType();
        testWithInterfaceTypeArbitrary();
    }

    private static void testWithInterfaceReferenceType() {
        Banker banker = new NoLimitBank();

        banker.withdraw(500);
        //banker.deposit(300);
        try { // El compilador no sabe el tipo en ejecución del objeto referenciado por banker
            // El tipo en compilación de banker es Banker
            // y en su interfaz el metodo deposit declara la excepción comprobada
            banker.deposit(300);
        } catch (FundLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void testWithImplementerClassType() {

        NoLimitBank banker = new NoLimitBank();

        banker.withdraw(500);
        banker.deposit(300); // Ahora no es necesario capturar la excepción
    }

    private static void testWithInterfaceTypeArbitrary() {

        Banker banker = new UnstablePredictableBank();
        banker.withdraw(500);
        //banker.deposit(300);
        try { // El compilador no sabe el tipo en ejecución del objeto referenciado por banker
            // El tipo en compilación de banker es Banker
            // y en su interfaz el método deposit declara la excepción comprobada
            banker.deposit(300);// ¿Que pasaría si lanza una ArbitraryException???
        } catch (FundLimitExceededException e) { // El código no estaría preparado para manejarla
            System.out.println(e.getMessage());
        }
    }
}
