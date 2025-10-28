package TascaS102Exceptions.level1.exception;

public class EmptySaleException extends Exception {
    public EmptySaleException() {

        super("To make a sale you hat to add products to the cart.");

    }

}
