package 미래인재5일차.calculatot;

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

        System.out.println(+ calc.add(5, 3));
        System.out.println(+ calc.multiply(5, 3));
        System.out.println(+ Calculator.subtract(5, 3));
    }
}