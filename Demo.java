class EvenOddNumber {  
    public boolean findEvenOrOdd(int i) {
        return i % 2 == 0;
    }
}

public class Demo {
    public static void main(String[] args) {
        EvenOddNumber checker = new EvenOddNumber();
        int num1 = 10;
        int num2 = 7;

        if (checker.findEvenOrOdd(num1)) {
            System.out.println(num1 + " is an Even number");
        } else {
            System.out.println(num1 + " is an Odd number");
        }

        if (checker.findEvenOrOdd(num2)) {
            System.out.println(num2 + " is an Even number");
        } else {
            System.out.println(num2 + " is an Odd number");
        }
    }
}
