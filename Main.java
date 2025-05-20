import java.util.Scanner;

interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Scanner stdin = new Scanner(System.in);
        int num1 = stdin.nextInt();
        int num2 = stdin.nextInt();
        System.out.println( calc.add(num1, num2));
        System.out.println( calc.multiply(num1, num2));
        System.out.println( Calculator.subtract(num1, num2));
    }
}
