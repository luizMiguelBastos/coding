package ex01_product;

public class Product {

    private String name;
    private double price;
    private int quantity;

    Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double totalValue (){
        double total = getPrice() * getQuantity();
        return total;
    }

    public int sell (int units){
        int remainder = getQuantity() - units;

        if (remainder < 0){
          throw new IllegalArgumentException("the quantity cannot be lower than 0");
       }
        setQuantity(getQuantity()-units);
      return remainder;

    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
