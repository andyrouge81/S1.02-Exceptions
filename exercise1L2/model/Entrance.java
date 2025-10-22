package TascaS102Exceptions.exercise1L2.model;

import TascaS102Exceptions.exercise1L2.exception.EnterException;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Enter {


    static Scanner input = new Scanner(System.in);

    // Byte method
    public byte readByte(String message) {
        byte age = 0;
        boolean isValid = false;
        while (!isValid) {

            try {
                System.out.println(message);
                age = input.nextByte();
                isValid = true;


            } catch (InputMismatchException e) {
                System.err.println("Format Error!. Please enter a byte number.");

            }finally{
                input.nextLine();
            }

        }

        return age;
    }

    // Integer method
    public static int readInt(String message){
        boolean isValid = false;
        int cars = 0;
        while (!isValid) {
            try{
                System.out.println(message);
                cars = input.nextInt();
                isValid = true;


            } catch(InputMismatchException e){
                System.err.println("Not an integer value.");

            }finally{

                input.nextLine();
            }
        }

        return cars;
    }
    // Float method
    public static float readFloat(String message){
        String number;
        float num = 0;
        boolean test = false;

        while(!test){
            try{
                System.out.println(message);
                number = input.nextLine();
                if (!number.contains(".")){

                    throw new InputMismatchException("Input must contains a decimal point.");
                }
                num = Float.parseFloat(number);
                test = true;


            }catch(InputMismatchException e){
                System.err.println("Format Error!. Please enter a float number. e.g. 4.5");

            }
        }

        return num;

    }

    // double method
    public static double readDouble(String message){
        double var1=0;
        boolean isValid = false;
        String stringVar = "";
        while(!isValid){
            try{
                System.out.println(message);
                stringVar = input.nextLine();
                if(!stringVar.contains(".")){

                    throw new InputMismatchException("The input must contain a decimal point.");
                }
                var1 = Double.parseDouble(stringVar);
                isValid = true;

            } catch(InputMismatchException | NumberFormatException e){
                System.err.println("Format Error. Please enter a decimal number. e.g. 4.7");
            }
        }

        return var1;
    }

    // methods with an EnterException class

    //Chat method
    public static char readChar(String message){
        char b = ' ';
        boolean isValid = false;
        while (!isValid){
            try{
                System.out.println(message);
                String a = input.nextLine();
                if(a.length() > 1 ){

                    throw new EnterException("You must enter only one letter.");
                }
                b = a.charAt(0);
                isValid= true;
            }catch(EnterException e){
                System.err.println(e.getMessage());
            }
        }

        return b;

    }

    // String method
    public static String readString(String message){
       String chain = "";
        boolean isValid = false;
        while(!isValid){
            try{
                System.out.println(message);
                chain = input.nextLine();
                if(chain.isBlank()){

                    throw new EnterException("The string can not be empty.");

                }
                isValid = true;
            }catch(EnterException e){
                System.err.println(e.getMessage());

            }
        }

        return chain;
    }

    //boolean method
    public static boolean readYESNO(String message){
        boolean affirmation= false;

        String confirmation ="";
        boolean isValid = false;

        while(!isValid){
            try{
                System.out.println(message);
                confirmation = input.nextLine();

                if(confirmation.isBlank() || !(confirmation.equalsIgnoreCase("y")) && !(confirmation.equalsIgnoreCase("n"))){
                    throw new EnterException("Format Error!. No empty characters and should enter 'y' or 'n'.");

                }
            isValid = true;
            }catch (EnterException e){
                System.err.println(e.getMessage());

            }
        }
        if(confirmation.equalsIgnoreCase("y")){
            affirmation = true;
        }

        return affirmation;
    }


}


