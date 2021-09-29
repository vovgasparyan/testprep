package conditionals;

public class ConditionalsMain {
    public static void main(String[] args) {

        ConditionalExercises exercises = new ConditionalExercises();

        // calculator
        int operator1 = (int) (Math.random() * 10);
        int operator2 = (int) (Math.random() * 10);
        String operation = "add";
        double result = exercises.calculator(operator1, operator2, operation);
        System.out.println("Result is: " + result);

        int value = (int) (Math.random() * 200);
        exercises.printNumberDescription(value);
    }
}
