package TascaS102Exceptions.exercise1L2.model;

import TascaS102Exceptions.exercise1L2.exception.EntranceException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Entrance {


	public static Scanner input = new Scanner(System.in);


	public static byte readByte(String message) {

		byte byteEntry = 0;
		boolean isValid = false;
		while (!isValid) {

			try {
				System.out.println(message);
				byteEntry = input.nextByte();
				if((byteEntry <  -128) && (byteEntry > 127)){
					System.out.println("The byte number type ranges from -128 to 127 years.");
				}else{
					isValid = true;
				}


			} catch (InputMismatchException e) {
				System.err.println("Clue! Enter a number between -128 and 127.");

			}
			input.nextLine();
		}

		return byteEntry;
	}


	public static int readInt(String message){

		boolean isValid = false;
		int age = 0;
		while (!isValid) {
			try{
				System.out.println(message);
				age = input.nextInt();
				if(age < 0 || age > 120){
					System.err.println("Enter a real age please.");
				}else{
					isValid = true;
				}


			} catch(InputMismatchException e){
				System.err.println("This is not a real age.");

			}
			input.nextLine();
		}

		return age;
	}


	public static float readFloat(String message){

		String number;
		float numResult = 0;
		boolean isValid = false;

		while(!isValid){
			try{
				System.out.println(message);
				number = input.next();
				numResult = Float.parseFloat(number);

				if (!number.contains(".") && (numResult == Float.valueOf(number))){

					throw new InputMismatchException("Input must contains a decimal point.");
				}

				numResult += Math.PI;
				isValid = true;


			}catch(InputMismatchException | NumberFormatException e){
				System.err.println("Format Error!. Please enter a float number. e.g. 4.5");

			}
			input.nextLine();
		}

		return numResult;

	}


	public static double readDouble(String message){
		double numDouble = 0;
		boolean isValid = false;
		String userEntry;
		while(!isValid){
			try{
				System.out.println(message);
				userEntry = input.next();
				numDouble = Double.parseDouble(userEntry);
				if(!userEntry.contains(".") && (numDouble == Double.valueOf(userEntry))){

					throw new InputMismatchException("The input must contain a decimal point.");
				}

				numDouble += Math.PI;

				isValid = true;




			} catch(InputMismatchException | NumberFormatException e){
				System.err.println("Format Error. Please enter a decimal number. e.g. 4.7");
			}
			input.nextLine();
		}

		return numDouble;
	}




	public static char readChar(String message){
		char userEntry = ' ';
		boolean isValid = false;
		while (!isValid){
			try{
				System.out.println(message);
				String a = input.nextLine();
				if(a.isEmpty()){
					System.out.println("Please enter any character.");
				}
				if(a.length() > 1){

					throw new EntranceException("Enter only one character.");
				}

				userEntry = a.charAt(0);
				isValid= true;
			}catch(StringIndexOutOfBoundsException | EntranceException e){
				System.err.println("I have must insist, entry some character.");
			}
		}

		return userEntry;

	}

	public static String readString(String message){
		String userEntry = "";
		boolean isValid = false;
		while(!isValid){
			try{
				System.out.println(message);
				userEntry = input.nextLine();
				if(userEntry.isBlank()){

					throw new EntranceException("You can't left in blank or enter spaces.");

				}
				isValid = true;
			}catch(EntranceException e){
				System.err.println("Please enter some characters.");

			}
		}

		return userEntry;
	}


	public static boolean readYESNO(String message){
		boolean statusVerify = false;

		String confirmation ="";
		boolean isValid = false;

		while(!isValid){
			try{
				System.out.println(message);
				confirmation = input.nextLine();

				if(confirmation.isBlank()){
					throw new EntranceException("Error!. No empty characters.");

				}
				if(!(confirmation.equalsIgnoreCase("y")) && !(confirmation.equalsIgnoreCase("n"))){
					throw new EntranceException("Error!. You should enter 'y' or 'n'.");
				}
				isValid = true;

			}catch (EntranceException e){
				System.err.println(e.getMessage());

			}
		}
		if(confirmation.equalsIgnoreCase("y")){
			statusVerify = true;
		}

		return statusVerify;
	}




}


