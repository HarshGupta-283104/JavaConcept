import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer("Krishna");
        queue.offer("Radha");
        queue.offer("Sudama");

        // Peek front element
        System.out.println("Front Element: " + queue.peek());  // Krishna

        // Dequeue elements
        System.out.println("Removed: " + queue.poll());        // Krishna
        System.out.println("Removed: " + queue.poll());        // Radha

        // Check if empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Remaining element
        System.out.println("Remaining: " + queue);
    }
}
