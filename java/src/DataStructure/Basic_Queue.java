package DataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Basic_Queue {
    public static void main(String args[]){
        Basic_Create basic_create = new Basic_Create();
        Queue<Integer> q = basic_create.createQueue();
        for(int n : q){
            System.out.println(n);
        }
    }
}
