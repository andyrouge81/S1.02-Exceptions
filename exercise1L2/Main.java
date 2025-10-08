package TascaS102Exceptions.exercise1L2;

import TascaS102Exceptions.exercise1L2.model.Enter;

public class Main {
    public static void main(String[] args) {

        // byte instance and method call
        byte age = Enter.readByte("Enter your age: ");
        System.out.println("The number "+age+ " is a byte number type.");
        System.out.println();

        // Integer instance and method call
        int cars = Enter.readInt("How many cars do you have? ");
        System.out.println("You have "+cars+" cars.");
        System.out.println();

        // Float instance and method call
        float number = Enter.readFloat("Enter a float number: ");
        System.out.println("The float number "+number+ " is correct.");
        System.out.println();

        // Double instance and method call
        double variable = Enter.readDouble("Enter a double number: ");
        System.out.println("The number "+ variable+ " is a double type.");
        System.out.println();

        // Char instance and method call
        char letter = Enter.readChar("Enter a character: (e.g. 'a','c').");
        System.out.println("The character "+letter+ " is correct.");
        System.out.println();

        // String instance and method call
        String chain = Enter.readString("Enter a chain of characters: ");
        System.out.println("This is your chain character: \" "+chain+" \"");
        System.out.println();

        // Boolean instance and method call
        boolean verify = Enter.readYESNO("Enter 'Y' or 'N' if you are an user.");
        if(verify){
            System.out.println("Y");
        }else {
            System.out.println("N");
        }


    }
}
