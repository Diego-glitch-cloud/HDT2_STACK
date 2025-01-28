import java.util.Stack;

public class Calculator {

    public void evaluate(String operation) {
        // Creating the instance of the Stack
        Stack<Integer> stack = new Stack<>();

        // Creating a bool variable to make sure the operation was done properly
        boolean success = true;

        for (int i = 0; i < operation.length(); i++) {
            char placeholder = operation.charAt(i);

            // Checking if the character is a number and if it has more than one digit
            if (Character.isDigit(placeholder)) {
                int number = Character.getNumericValue(placeholder);

                while ((i + 1 < operation.length()) && Character.isDigit(operation.charAt(i + 1))) {
                    i++;
                    number = number * 10 + Character.getNumericValue(operation.charAt(i));
                }

                stack.push(number);
            } 
            // Checking for valid operators
            else if (placeholder == '+' || placeholder == '-' || placeholder == '*' || 
                     placeholder == '/' || placeholder == '%') {

                // Checking there is enough numbers to operate
                if (stack.size() < 2) {
                    System.out.println("Not enough numbers for operation");
                    success = false;
                    break;
                }

                // Getting both numbers
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                // Choosing the operation to perform
                switch (placeholder) {
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        if (b == 0) {
                            System.out.println("Cannot divide by 0");
                            success = false;
                            break;
                        } else {
                            result = a / b;
                        }
                        break;
                    case '%':
                        result = a % b;
                        break;
                }
                if (!success) break;
                stack.push(result);
            } 
            // Handle invalid characters while ignoring spaces
            else if (placeholder != ' ') {
                success = false;
                System.out.println("The string contains an invalid character");
                break;
            }
        }

        if (success) {
            // Making sure there is only one number left in the Stack
            if (stack.size() == 1) {
                System.out.println("Result: " + stack.pop());
            } else {
                System.out.println("Too many numbers left in the stack");
            }
        }
    }
}