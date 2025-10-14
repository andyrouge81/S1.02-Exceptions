package TascaS102Exceptions.exercise1L1.mode;

import TascaS102Exceptions.exercise1L1.exception.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {


    private List<Product> products;

    private double totalPrice;


    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice=0;
    }


    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    public double getTotalPrice() {
        return totalPrice;
    }



    public void addProduct(Product newProduct) {

        products.add(newProduct);

    }


    public void calculateTotal() throws EmptySaleException {

        if (products.isEmpty()) {

            throw new EmptySaleException("To make a sale, please add a product.");

        } else {

            for (Product p : products) {
                this.totalPrice += p.getPrice();
            }
        }
    }
}

