public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        int number = 0;
        for (int i = 0; i < a; i++) {
            number += b;
        }
        return number;
    }

    /**
     * Divides the first number with the second number
     * @param a number one
     * @param b number two
     * @return the division
     */
    public int divide(int a, int b) {
//      Divides the first number with the second number
        return a / b;
    }

    public int square(int a) {
        int number = 0;
        for (int i = 0; i < a; i++) {
            number += a;
        }
        return number;
    }
}
