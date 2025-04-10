public class CalculatorOperations extends Calculator {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a * b;
    }

    public int min(int a, int b) {
        return a - b;
    }

    @Override
    public int div(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на ноль!");
            return 0;
        }
        return a / b;
    }
}
