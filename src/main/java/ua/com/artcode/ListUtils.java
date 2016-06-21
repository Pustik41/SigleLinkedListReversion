package ua.com.artcode;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static A<String> createStringList() {
        A<String> head = new Node<>("A");
        A<String> second = new Node<>("B");
        A<String> third = new Node<>("C");
        A<String> fourth = new Node<>("D");
        A<String> fifth = new Node<>("E");
        A<String> sixth = new Node<>("F");
        A<String> seventh = new Node<>("G");
        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(fifth);
        fifth.setNext(sixth);
        sixth.setNext(seventh);
        return head;
    }

    public static<T> A<T> reversion(A<T> head) {

        if(head.getNext() != null) {
            A<T> tail = head;
            A<T> copyHead = head;
            A<T> iter = head;
            int count = 0;

            while (true) {
                if(tail.getNext() == null){
                    break;
                }
                tail = tail.getNext();
                count++;
            }

          head = tail;

            while (count != 0){

                while (true) {
                    if (iter.getNext() == tail) {
                        iter.setNext(null);
                        break;
                    }

                    iter = iter.getNext();
                }

                tail.setNext(iter);
                tail = iter;
                iter = copyHead;
                count--;
            }

        }

        return head;
    }
}
