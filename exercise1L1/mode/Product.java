package TascaS102Exceptions.exercise1L1.mode;

public class Product {

    // class fields

    private String name;
    private double price;

    //Constructor
    public Product(String name, double price){
        this.name = name;
        this.price = price;

    }
    // getters
    public String getName(){ return name;}
    public double getPrice(){ return price;}


    // setter
    public void setPrice(double price){
        this.price = price;
    }

    @Override
    public String toString(){

        return String.format("\nName: %s - Price: %.2f", getName(), getPrice());
    }
}

