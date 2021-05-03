package DataStructure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Basic_Deque {
    public static void main(String args[]){
        // 1, new
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new ArrayDeque<>();

        // 2, add
        deque1.add(1);
        deque1.add(2);
        deque1.add(3);
        deque1.add(4);
        deque1.offer(5);
        deque1.offer(6);
        deque1.offer(7);
        deque1.offer(8);
        deque1.addFirst(11);
        deque1.addLast(12);
        System.out.println(deque1);

        // 3, get
        System.out.println(deque1.getFirst());
        System.out.println(deque1.getLast());

        // 4, remove
        deque1.pollFirst();
        System.out.println(deque1);
        deque1.pollLast();
        System.out.println(deque1);

    }
}
