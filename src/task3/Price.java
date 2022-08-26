package task3;

import java.util.Objects;

public class Price {
    String productName;
    String shopName;
    double price;

    String shop1 = "ATB";
    String shop2 = "Silpo";

    public Price (String productName, String shopName, double price){
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product name: " + productName + "\n" + "Supermarket: " + shopName + "\n" + "Price: " + price + "\n";
    }

}


