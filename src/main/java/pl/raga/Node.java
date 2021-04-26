package pl.raga;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Node {
    int value;
    Node next;


    public void showElements(Node list){
        while(list != null){
            System.out.println(list.value);
            list=list.next;
        }
    }

   /* @org.jetbrains.annotations.NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }*/
}