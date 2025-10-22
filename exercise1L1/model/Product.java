package TascaS102Exceptions.exercise1L1.model;

public class Product {



    private String name;
    private double price;


    public Product(String name, double price){

        this.name = name;
        this.price = price;

        if(this.price<0){
            throw new IllegalArgumentException("The price can not be negative.");
        }

    }

    public String getName(){ return this.name;}
    public double getPrice(){ return this.price;}



    @Override
    public String toString(){

        return String.format("\nProduct: %s - Price: %.2f", getName(), getPrice());
    }
}

