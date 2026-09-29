package ex01_product;

public class ProductMain {
    static void main(String[] args) {

        Product shirt = new Product("Polo_Shirt", 10.99, 10);
        double total = shirt.totalValue();
        System.out.println(total);

        int remainder = shirt.sell(3);
        System.out.println(remainder);
        total = shirt.totalValue();
        System.out.println(total);

    }
}
