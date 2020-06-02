public class Calculator {
    public Operation sum() {
        return (a, b) -> a + b;
    }

    public Operation sub() {
        return (a, b) -> a - b;
    }

    public Operation multiply() {
        return (a, b) -> a * b;
    }

    public Operation divide() {
        return (a, b) -> a / b;
    }

    public Operation exponent() {
        return (a, b) -> (int) Math.pow(a, b);
    }
}
