public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // (3 * 4 + 5 * 7)^2
        int result1 = calc.square(
                calc.add(
                        calc.multiply(3, 4),
                        calc.multiply(5, 7)
                )
        );

        // (4 + 7)^2 + (8 + 3)^2
        int result2 = calc.add(
                calc.square(calc.add(4, 7)),
                calc.square(calc.add(8, 3))
        );

        System.out.println("(3 * 4 + 5 * 7)^2 = " + result1);
        System.out.println("(4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
