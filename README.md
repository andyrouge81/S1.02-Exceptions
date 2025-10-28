# S1.02-Execptions 🚧

## 🧾 Task Objectives

- Complete the proposed exercises listed below.
- Use exception handling to implement the given requirements.
- Upload and manage your code using Git and GitHub.

---

## 📚 Documentation:


[Exceptions Java docs](https://docs.oracle.com/javase/tutorial/essential/exceptions/index.html)


---

## Proposed Exercises


### Level 1. Exercise 1.

<details>
  

Create a class named Producte with attributes name and price, and another class named Venda with a collection of products and a total price attribute.

The Venda class must have a method calcularTotal() that throws a custom exception VendaBuidaException and prints the message:

“To make a sale, you must first add products”

...if the product collection is empty.

If the collection has products, the method must loop through them, sum their prices, and store the result in the total price attribute.

The custom exception VendaBuidaException must extend Exception. The message should be passed through its constructor and shown using the getMessage() method when caught.

You must also write code that throws and catches an IndexOutOfBoundsException.

</details>


---

### Level 1. Exercise 2.


<details>

Create a class named Entrada to control the different exceptions that might occur when entering data from the keyboard using the Scanner class.

Start by instantiating a Scanner object. Then, implement static methods to read different data types from keyboard input.

Important

If an exception is thrown in any of the methods, handle it and keep asking the user for valid input until it is correctly entered.
For example: if the user enters a float with a dot instead of a comma, the program should display:

“Format Error”

...and keep prompting until valid input is received.

Each method must receive a String (message to display to the user), and return the corresponding typed data.

Methods to implement (handling InputMismatchException):

- public static byte readByte(String message);
- public static int readInt(String message);
- public static float readFloat(String message);
- public static double readDouble(String message);

Methods to implement (handling a custom Exception):

- public static char readChar(String message);
- public static String readString(String message);
- public static boolean readYesNo(String message);

If the user enters "y" → returns true

If the user enters "n" → returns false

</details>


---

### 💻 Technologies Used

- Java (JDK) 17 o higher. Oracle
- IntelliJ IDEA /  Eclipse.
- Git & GitHub.

### 📦 Requirements

- Java (JDK 17 o higher)
- An IDE: IntelliJ / Eclipse / VSCode (with Java extension)
- A terminal with Git installed

### ⚙️ Instalation

1. Clone the repository:
   ```bash
   git clone https://github.com/andyrouge81/S1.02-Exceptions.git

2. Navigate into the project folder:
   ```bash
   cd S1.02-Exceptions

3. Open the project in your IDE and ensure JDK compatibility is set correctly.

   
### ▶️ How to Run

1. Go to the `Main.java` file inside the appropriate package/folder.
2. Run the file to test the result of the exercise.
3. You can create objects and test how exceptions are thrown and handled.


### 🚀 Deployment

This project is for educational purposes only.

- You may generate an executable `.jar` file using your IDE if needed.


### 🤝 Contributing

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature/NuevaFuncionalidad
3. Make your changes and commit them:
   ```bash 
   git comió -m “feat: agrega una nueva funcionalidad”
4. Push the changes to your branch:
   ```bash
   git push origin feature/NuevaFuncionalidad
5. Open a Pull Request — we'll review it!



### 💌 Contact

If you have any questions or suggestions, feel free to open an _Issue_ or reach out via GitHub profile.





