package DataStructure;

import java.util.*;

public class Basic_Create {

    public List<Integer> createList(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        return list;
    }

    public List<Integer> createLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        return linkedList;
    }

    public HashMap<Integer, Integer> createHashMap(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 2);
        return map;
    }

    public Set<Integer> createSet(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        return set;
    }

    public Stack<Integer> createStack(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        return stack;
    }

    public Queue<Integer> createQueue(){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        return queue;
    }
}
