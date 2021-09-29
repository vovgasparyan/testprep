package conditionals;

public class ConditionalExercises {

    public boolean isOdd(int number) {
        return number % 2 == 0;
    }

    public double calculator(double operand1, double operand2, String operator) {
        System.out.println(operand1 + " " + operator + " " + operand2);
        switch (operator) {
            case "add":
                return operand1 + operand2;
            case "subtract":
                return operand1 - operand2;
            case "multiply":
                return operand1 * operand2;
            case "divide":
                return operand2 == 0 ? -1 : operand1 / operand2;
            default:
                return -1;
        }
    }

    public void printNumberDescription(int value) {
        System.out.println("Generated number is: " + value);
        if (value >= 0 && value < 10) {
            System.out.println("It is a digit");
        } else if (value >= 10 && value < 100) {
            if (isOdd(value)) {
                System.out.println("It is a two-digit odd number");
            } else {
                System.out.println("It is a two-digit even number");
            }
        } else {
            System.out.println("Out of bounds");
        }
    }
}