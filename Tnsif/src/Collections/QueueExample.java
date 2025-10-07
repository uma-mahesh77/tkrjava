package Collections;
import java.util.*;
public class QueueExample {
	 public static void main(String[] args) {
	        Queue<String> queue = new LinkedList<>();

	        queue.add("Task1");
	        queue.add("Task2");
	        queue.add("Task3");

	        System.out.println("Queue: " + queue);
	        System.out.println("Removed: " + queue.poll());
	        System.out.println("After poll(): " + queue);
	        System.out.println("Peek: " + queue.peek());
	        
	    }
	}