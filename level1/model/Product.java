package TascaS102Exceptions.level1.model;

public class Product {



    private String name;
    private double price;


    public Product(String name, double price){

		if(price < 0){
			throw new IllegalArgumentException("The price cannot be negative.");
		}

        this.name = name;
        this.price = price;



    }

    public String getName(){ return this.name;}
    public double getPrice(){ return this.price;}



    @Override
    public String toString(){

        return String.format("\nProduct: %s - Price: %.2f", getName(), getPrice());
    }
}

