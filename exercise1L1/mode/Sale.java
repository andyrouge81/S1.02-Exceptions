package TascaS102Exceptions.exercise1L1.mode;

import TascaS102Exceptions.exercise1L1.exception.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {

    // class fields

    private List<Product> products;

    private double totalPrice;

    // constructor

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = totalPrice;
    }

    // getters
    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // method which add products into the List

    public void addProduct(Product newProduct) {

        products.add(newProduct);

    }

    // method which calculate the total of the sale
    public void calculateTotal() throws EmptySaleException {

        if (products.isEmpty()) {

            throw new EmptySaleException("To make a sale, first you have to add a product.");

        } else {

            for (Product p : products) {
                this.totalPrice += p.getPrice();
            }

        }

    }
}

