
import java.util.Stack;


public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("Arjun");
        stack.push("Bheem");
        stack.push("Karna");

        // Peek top element
        System.out.println("Top Element: " + stack.peek());  // Karna

        // Pop elements
        System.out.println("Popped: " + stack.pop());        // Karna
        System.out.println("Popped: " + stack.pop());        // Bheem

        // Check if empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Remaining element
        System.out.println("Remaining: " + stack);
    }
}

    
