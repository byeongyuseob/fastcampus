package ch14;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;

        CompleteCaculator calculator = new CompleteCaculator();
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        System.out.println(calculator.subtract(num1, num2));
        System.out.println(calculator.times(num1, num2));

        calculator.description();

        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Calc.total(arr));
    }
}
