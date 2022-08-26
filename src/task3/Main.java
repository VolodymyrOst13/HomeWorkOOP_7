package task3;

import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        Price[] prices = new Price[5];

        prices[0] = new Price("Bread", "ATB", 14);
        prices[1] = new Price("Milk", "Silpo", 20);
        prices[2] = new Price("Wine", "ATB", 150);
        prices[3] = new Price("Bear", "Silpo", 18);
        prices[4] = new Price("Chips", "Bedryonka", 10);

        for (int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }




    }
}
