public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        if (calculator.add(2, 3) == 5) {
            System.out.println("Test Add: Passed");
        } else {
            System.out.println("Test Add: Failed");
        }

        if (calculator.subtract(5, 3) == 2) {
            System.out.println("Test Subtract: Passed");
        } else {
            System.out.println("Test Subtract: Failed");
        }

        if (calculator.multiply(2, 3) == 6) {
            System.out.println("Test Multiply: Passed");
        } else {
            System.out.println("Test Multiply: Failed");
        }

        try {
            if (calculator.divide(6, 3) == 2.0) {
                System.out.println("Test Divide: Passed");
            } else {
                System.out.println("Test Divide: Failed");
            }
        } catch (ArithmeticException e) {
            System.out.println("Test Divide: Failed (Exception)");
        }

        try {
            calculator.divide(5, 0);
            System.out.println("Test Divide by Zero: Failed");
        } catch (ArithmeticException e) {
            System.out.println("Test Divide by Zero: Passed");
        }
    }
}
