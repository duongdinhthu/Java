package JavaCollection.queueInterface;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueExample {

    public static void main(String[] args) {
        // Create a Deque (Double Ended Queue) using LinkedList
        Deque<String> deque = new LinkedList<>();

        // Add elements to the Deque
        deque.offerFirst("ten dau tien : thu"); // Add to the front
        deque.offerLast("ten cui cung : nam");   // Add to the back
        deque.offerFirst("them"); // Add to the front again

        // Display the current Deque
        System.out.println("Current Deque: " + deque);

        // Peek at elements
        System.out.println("Peek First: " + deque.peekFirst()); // Check front element
        System.out.println("Peek Last: " + deque.peekLast());   // Check back element

        // Poll (remove) elements from the Deque
        System.out.println("Poll First: " + deque.pollFirst()); // Remove from the front
        System.out.println("Poll Last: " + deque.pollLast());   // Remove from the back

        // Display the Deque after polling
        System.out.println("Deque after polling: " + deque);

        // Add and remove more elements
        deque.offerLast("Another Last Element");
        deque.offerFirst("Another First Element");
        System.out.println("Deque after adding more elements: " + deque);

        deque.pollFirst();
        deque.pollLast();
        System.out.println("Final Deque: " + deque);
    }
}
