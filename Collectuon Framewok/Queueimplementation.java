import java.util.*;

public class Queue {
   
 
    public static void main(String[] args) {
        // LinkedList example (as a Queue)
        Queue<String> linkedListQueue = new LinkedList<>();
        linkedListQueue.add("First");
        linkedListQueue.add("Second");
        linkedListQueue.add("Third");
        linkedListQueue.add("First"); // Allows duplicate elements
        System.out.println("LinkedList Queue: " + linkedListQueue);

        // PriorityQueue example
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Low");
        priorityQueue.add("High");
        priorityQueue.add("Medium");
        priorityQueue.add("Low"); // Allows duplicate elements
        System.out.println("PriorityQueue: " + priorityQueue);

        // ArrayDeque example
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Alpha");
        arrayDeque.add("Beta");
        arrayDeque.add("Gamma");
        arrayDeque.add("Alpha"); // Allows duplicate elements
        System.out.println("ArrayDeque: " + arrayDeque);

        // Iterate over the LinkedList Queue
        System.out.println("Iterating over LinkedList Queue:");
        while (!linkedListQueue.isEmpty()) {
            System.out.println(linkedListQueue.poll()); // Retrieves and removes the head of the queue
        }

        // Iterate over the PriorityQueue
        System.out.println("Iterating over PriorityQueue:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Retrieves and removes the head of the queue
        }

        // Iterate over the ArrayDeque
        System.out.println("Iterating over ArrayDeque:");
        while (!arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.poll()); // Retrieves and removes the head of the queue
        }
    }
}

    
}
