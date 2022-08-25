package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner hw = new Scanner(System.in);

        for (int i = 0; i < 10000; i++) {

            System.out.println("Enter a - ");
            calculator.a = hw.nextInt();

            System.out.println("Enter b - ");
            calculator.b = hw.nextInt();

            System.out.println("Arithmetic operation (+ - * /)");
            calculator.arithmeticOperation = hw.next();

            switch (calculator.arithmeticOperation) {
                case "+":
                    System.out.println(calculator.add());
                    break;
                case "-":
                    System.out.println(calculator.sub());
                    break;
                case "*":
                    System.out.println(calculator.mul());
                    break;
                case "/":
                    System.out.println(calculator.div());
                    break;
                default:
                    System.out.println("Please use only + - * /");
            }
        }
    }
}

