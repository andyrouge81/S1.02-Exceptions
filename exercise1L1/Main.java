package TascaS102Exceptions.exercise1L1;

import TascaS102Exceptions.exercise1L1.exception.EmptySaleException;
import TascaS102Exceptions.exercise1L1.mode.Product;
import TascaS102Exceptions.exercise1L1.mode.Sale;

public class Main {
    public static void main(String[] args) {

        // we create new products

        Product product1 = new Product("Bananas", 14.5);

        Product product2 = new Product("Pizza", 7.25);

        // we create an objet "sale1"
        Sale sale1 = new Sale();

        // we add two products to our sale1
        // if you move the products after the Exeption structure you can see how it works
        sale1.addProduct(product2);
        sale1.addProduct(product1);

        // exception which we created called EmptySaleException
        // now with the try-catch structure we can handle the exception
        try{
            sale1.calculateTotal();
            System.out.println("The total is: "+sale1.getTotalPrice()+ " €");

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // for testing the "IndexPoutOfBoundsException" exception we create an emptyproduct variable
        // who goes to the 3 position, so we can see there isn't any value in the 3 position inside the array

        try {
            Product emptyProduct = sale1.getProducts().get(3);
            System.out.println("The value in this position is: "+emptyProduct);

        }catch(IndexOutOfBoundsException e){

            System.out.println("There isn't any value in this position.");
            }
        finally {
            System.out.println(sale1.getProducts());
        }

    }
}
