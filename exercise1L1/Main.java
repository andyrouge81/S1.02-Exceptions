package TascaS102Exceptions.exercise1L1;

import TascaS102Exceptions.exercise1L1.exception.EmptySaleException;
import TascaS102Exceptions.exercise1L1.model.Product;
import TascaS102Exceptions.exercise1L1.model.Sale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		Scanner enter = new Scanner(System.in);

        Product product1 = new Product("Bananas", 14.5);

        Product product2 = new Product("Pizza", 7.7);


        Sale sale1 = new Sale();

        // we add two products to our sale1
        // if you move the products after the first try-catch structure you can see how it works

        sale1.addProduct(product2);
        sale1.addProduct(product1);

		System.out.println("The actual product cart is: "+sale1.getProducts());
        System.out.println("The price of the two added products are: "+product1.getPrice()+ " € plus "+product2.getPrice()+" €");

		try{
            sale1.calculateTotal();
            System.out.println("The total is: "+sale1.calculateTotal()+ " €");

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

		System.out.println();
		System.out.println("Now an example of 'IndexOutOfBoundsException' exception type... ");

		try{
			System.out.println("Enter an index for searching the product: ");
			int indexSearch = enter.nextInt();
			System.out.println("The product with the index "+indexSearch+" is: "+sale1.getProductByIndex(indexSearch));

		}catch (IndexOutOfBoundsException ie){
			System.out.println("There isn't any product at this index.");
		}


    }
}
