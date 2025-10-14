package TascaS102Exceptions.exercise1L1.mode;

public class Product {



    private String name;
    private double price;


    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }

    public String getName(){ return name;}
    public double getPrice(){ return price;}



    @Override
    public String toString(){

        return String.format("Name: %s - Price: %.2f", getName(), getPrice());
    }
}

