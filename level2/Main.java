package TascaS102Exceptions.level2;

import TascaS102Exceptions.level2.model.Entrance;

import static TascaS102Exceptions.level2.model.Entrance.input;


public class Main {
	public static void main(String[] args) {

	System.out.println("The Byte type test.");
		byte rangeByte = Entrance.readByte("Enter a number and i will tell you if this number is inside of the byte data type range: ");
		System.out.println("Great!. The number "+rangeByte+ " it´s inside of the byte data type range.");
		System.out.println();

		System.out.println("The integer type test.");
		int age = Entrance.readInt("Enter your age: ");
		System.out.println("You have "+age+" years. Really?.");
		System.out.println();

		System.out.println("Float type memory test.");
		float number = Entrance.readFloat("Enter a number with decimals, then this number will be multiply by PI: ");
		System.out.println("This result "+number+ ", verify the floats number are only precise up to 7 digits after the coma.");
		System.out.println();

		System.out.println("Double type memory test.");
		double variable = Entrance.readDouble("Enter the same number used above, then this number will be multiply by PI: ");
		System.out.println("The result "+ variable+ " verify the double numbers are precise up to 15 digits after the coma, the double of memory size used by the float type numbers.");
		System.out.println();

		System.out.println("The char type test.");
		char letter = Entrance.readChar("Enter a character: (e.g. 'a','c','6').");
		System.out.println("The character \""+letter+ "\" is correct.");
		System.out.println();

		System.out.println("The String type test.");
		String userEntry = Entrance.readString("Enter your name: ");
		System.out.println("Hi!,\" "+userEntry+" \", how are you?");
		System.out.println();

		System.out.println("The boolean type test.");
		boolean verify = Entrance.readYESNO("Enter 'Y' or 'N' if you are an user.");
		if(verify){
			System.out.println("You have just entered an \"Y\", so returns true");
		}else {
			System.out.println("You have just entered a \"N\", so returns false");
		}

		input.close();
	}


}
