package DataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Basic_LinkedList {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(1, 2, 3, 4 ,5, 6);
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        System.out.println(linkedList);

    }
}
