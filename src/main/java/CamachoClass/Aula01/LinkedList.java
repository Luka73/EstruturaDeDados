package CamachoClass.Aula01;

import CamachoClass.Aula01.Interfaces.List;

import java.util.function.Consumer;

public class LinkedList<T> implements List<T> {

    No first;

    @Override
    public void add(T element) {
        No<T> novoNo = new No<>(element);
        No<T> current = first;

        if (first == null)
            first = novoNo;

        else if (first.next == null) {
            first.next = novoNo;
        }
        else {
            while (current.next != null) {
                current = current.next;
            }

            current.next = novoNo;
        }
    }

    @Override
    public void addAll(List<T> list) {

    }

    @Override
    public T get(int i) {
        No<T> current = first;

        for(int j = 0; j < i; j++) {
            if(current.next != null) {
                current = current.next;
            }
        }

        return current.element;
    }

    @Override
    public void remove(T element) {

        if(first == null) {
            return;
        }

        No<T> current = first;
        No<T> temp;

        if(current.element.equals(element)) {
            first = current.next;
            return;
        }

        while(current.next != null) {
           if(current.next.element.equals(element)) {
               temp = current;
               current = current.next;
               temp.next = current.next;
               return;
           }
           current = current.next;
        }
    }

    @Override
    public int size() {

        if(first == null) {
            return 0;
        }

        int count = 1;
        No<T> current = first;

        while(current.next != null) {
            current = current.next;
            count++;
        }

        return count;
    }

    @Override
    public void forEach(Consumer<T> obj) {
        if (first == null)
            return;

        No<T> current = first;
        obj.accept(current.element);

        while (current.next != null) {
            current = current.next;
            obj.accept(current.element);
        }
    }

}

class No<T> {
    public T element;
    public No<T> next;

    public No(T value) {
        this.element = value;
    }
}

