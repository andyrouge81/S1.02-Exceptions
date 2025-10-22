package TascaS102Exceptions.exercise1L1.exception;

public class EmptySaleException extends Exception {
    public EmptySaleException() {

        super("To make a sale you hat to add products to the cart.");

    }

}
