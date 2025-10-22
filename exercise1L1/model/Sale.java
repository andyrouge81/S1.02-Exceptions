package TascaS102Exceptions.exercise1L1.model;

import TascaS102Exceptions.exercise1L1.exception.EmptySaleException;

import java.util.ArrayList;
import java.util.List;

public class Sale {


    private List<Product> products;

    private double totalPrice;


    public Sale() {
        this.products = new ArrayList<>();

    }


    public List<Product> getProducts() {
        return List.copyOf(this.products);
    }


	public String getProductByIndex(int productIndex){
		String nameIndex="";
		for(int i = 0; i<products.size();i++){
			if(products.get(i)== products.get(productIndex)){
				nameIndex= products.get(i).getName();

			}
		}
		return nameIndex;

	}

    public void addProduct(Product newProduct) {

        this.products.add(newProduct);

    }


    public double calculateTotal() throws EmptySaleException {
        this.totalPrice = 0;

        if (this.products.isEmpty()) {
            throw new EmptySaleException();
        }

		for (Product p : this.products) {
			this.totalPrice += p.getPrice();
		}
		return this.totalPrice;
	}
}

