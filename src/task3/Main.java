package task3;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Price[] prices = new Price[2];

        Scanner hw = new Scanner(System.in);

        for (int i = 0; i < prices.length; i++){

            String productName;
            String shopName;
            double price;

            System.out.print("Enter product: ");
            productName = hw.next();
            System.out.print("Enter shop: ");
            shopName = hw.next();
            System.out.print("Enter price: ");
            price = hw.nextDouble();
        }

        for (int i = 0; i < prices.length; i++){
            System.out.println(prices[i].toString());
        }


    }
}
