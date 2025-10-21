# S1.02-Execptions 🚧

## Tasks Objetives:

  - Complete the exercises provided in the following file.
  - Use exceptions to complete the exercise statements.
  - Add files to the GitHub repository using Git.


## 📚 Documentation.

[Exceptions Java docs](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)


## Proposed Exercises.

### Level 1. Exercise 1.

<details>
Create a class called "Product" with the attributes name and price, and another class called "Sale". This class has as attributes a collection of products and the total price of the sale.

The "Sale" class has a method called calculaTotal() that launches the custom exception "VendaBuidaException" and displays on screen "To make a sale you must first add products" if the product collection is empty. If the collection has products, then you must turn the collection around and save the sum of all the prices of the products to the total price attribute of the sale.

The custom exception "VendaBuidaException" must be the daughter of the Exception class. To make a sale you must first add products and when we capture the exception, we must show it on screen with the getMessage() method of the exception.

Write the necessary code to generate and capture an exception type "IndexOutOfBoundsException".

</details>

---

### Level 2. Exercise 1.

<details>
Create a class called "Input". This class should be used to control the different exceptions that may appear in Java when entering keyboard data using the Scanner class.
The first thing to do is to instantiate an object of the Scanner class and from there, create static methods to read the different types of data from the keyboard. 
### Important
It is important that if an exception is missed in any method, we treat it and ask the user for the data again until it is well introduced. For example: If you enter a float with a dot instead of a comma, it must show “Format Error”. Until the user does not enter a well-formed float, they must continue to request the data.

All methods receive a String with the message to be displayed to the user, for example: “Enter your age”, and return the timely data entered by the user in each method, for example: a byte with the age of the user.
Methods to be implemented by capturing the exception of the class "InputMismatchException":
- public static byte readByte(String message);
- public static int readInt(String message);
- public static float readFloat(String message);
- public static double readDouble(String message);
  
Methods to be implemented by capturing a custom exception of the Exception class:
- public static char readChar(String message);
- public static String readString(String message);
- public static boolean readYesNo(String message), if the user enters “y”, returns “true”, if the user enters “n”, returns “false”.

</details>

---

### Proposed Technologies. 

  - IntelliJ IDEA /  Eclipse.
  - Java (JDK) 17 or higher. Oracle
  - Git & GitHub.

### 🧾 Requirements.

	- Java (JDK 17 o higher)
	- IntelliJ IDEA / Eclipse / VSCode with Java extenxions
	- Git Terminal.

### Instalation.

1. Clone the repository.
	```bash
	git clone https://github.com/andyrouge81/S1.02-Exceptions.git

2. Go to the project directory.
	```bash
	cd S1.02-Exceptions

3. Open the project with your IDE and and make sure it is compatible with the JDK.

### Execution.

1. Navigate to `Main.java` file inside the corresponding folder.
2. Run the file to vrify the result of your exercise.
3. You can add objects and test how the exceptions are thrown.


### Deploying.

This project is only for educational porposes. 

	- Create an `.jar` executable from your IDE.

### Contributions.

1. _Fork_ the repository.
2. Create a new branch:
	```bash
	git checkout -b feature/NewFunctionality
3. Make your changes and commit.
	```bash 
	git comió -m “feat: add new functionality"
4. Push the changes to your branch.
	```bash
	git push origin feature/NuevaFuncionalidad
5. Open a _pull request_ and we will review it.

### 💌 Contact.

For questions and suggestions you can open an _Isuue_ or contact me through the GitHub profile.



