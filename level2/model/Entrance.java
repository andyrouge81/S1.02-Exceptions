package TascaS102Exceptions.level2.model;

import TascaS102Exceptions.level2.exception.EntranceException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Entrance {


	public static Scanner input = new Scanner(System.in);


	public static byte readByte(String message) {

		byte byteEntry;

		while (true) {

			try {
				System.out.println(message);
				byteEntry = input.nextByte();

				return byteEntry;


			} catch (InputMismatchException e) {
				System.err.println("Clue! Enter a number between -128 and 127.");

			}

			input.nextLine();
		}

	}


	public static int readInt(String message){

		int age ;
		while (true) {
			try{
				System.out.println(message);
				age = input.nextInt();
				if(age < 0 || age > 120){
					System.err.println("Enter a real age please.");
					continue;
				}
				return age;


			} catch(InputMismatchException e){
				System.err.println("This is not a real age.");

			}
			input.nextLine();
		}

	}


	public static float readFloat(String message){

		String number;
		float numResult ;


		while(true){
			try{
				System.out.println(message);
				number = input.next();
				numResult = Float.parseFloat(number);

				if (!number.contains(".") && (numResult == Float.valueOf(number))){

					throw new InputMismatchException("Input must contains a decimal point.");
				}

				numResult += Math.PI;
				return numResult;


			}catch(InputMismatchException | NumberFormatException e){
				System.err.println("Format Error!. Please enter a float number. e.g. 4.5");

			}
			input.nextLine();
		}

	}


	public static double readDouble(String message){
		double numDouble ;

		String userEntry;
		while(true){
			try{
				System.out.println(message);
				userEntry = input.next();
				numDouble = Double.parseDouble(userEntry);
				input.nextLine();
				if(!userEntry.contains(".") && (numDouble == Double.valueOf(userEntry))){

					throw new InputMismatchException("The input must contain a decimal point.");
				}

				numDouble += Math.PI;

				return numDouble;


			} catch(InputMismatchException | NumberFormatException e){
				System.err.println("Format Error. Please enter a decimal number. e.g. 4.7");

			}

		}

	}



	public static char readChar(String message){
		char userEntry ;

		while (true){
			try{
				System.out.println(message);
				String a = input.nextLine();

				if(a.isBlank()){
					throw new EntranceException("Enter at least one character.");
				}
				if( a.length() > 1){
					throw new EntranceException("Enter only one character.");
				}

				userEntry = a.charAt(0);
				return userEntry;

			}catch(StringIndexOutOfBoundsException | EntranceException e){
				System.err.println("I have must insist, entry some character.");
				System.out.println(e.getMessage());
			}
		}

	}

	public static String readString(String message){
		String userEntry ;

		while(true){
			try{
				System.out.println(message);
				userEntry = input.nextLine();
				if(userEntry.isBlank()){

					throw new EntranceException("You can't left in blank or enter spaces.");

				}
				return userEntry;

			}catch(EntranceException e){
				System.err.println("Please enter some characters.");

			}
		}

	}


	public static boolean readYESNO(String message){

		String confirmation ;

		while(true){
			try{
				System.out.println(message);
				confirmation = input.nextLine();

				if(confirmation.isBlank()){
					throw new EntranceException("Error!. No empty characters.");
				}
				if(confirmation.equalsIgnoreCase("y")){

					return true;
				}

				if(confirmation.equalsIgnoreCase("n")){
					return false;
				}

				throw new EntranceException("Error!. You should enter 'y' or 'n'.");

			}catch (EntranceException e){
				System.err.println(e.getMessage());

			}
		}
	}
}


