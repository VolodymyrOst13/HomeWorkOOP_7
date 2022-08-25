package task3;

import java.util.Objects;

public class Price {
    String productName;
    String shopName;
    double price;

    public Price (String productName, String shopName, double price){
        this.productName = productName;
        this.shopName = shopName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product name: " + getProductName() + "\n" + "Supermarket: " + getShopName() + "\n" + "Price: " + getPrice();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }




}


