package task5;

import javax.naming.NameNotFoundException;

public class Calculator {
    int a;
    int b;

    int res;

    String arithmeticOperation;

    public int add() {
        return a + b;
    }
    public int sub() {
        return a - b;
    }
    public int mul() {
        return a * b;
    }

    public int div() {
        try {
            res = (a / b);
            System.out.println(res);
        } catch(ArithmeticException e) {
            System.out.println("На нуль ділити не можна");
        }
        return res = 0;
    }
}
