package CamachoClass.Aula01;

import CamachoClass.Aula01.Interfaces.List;

import java.util.function.Consumer;
import java.util.function.Function;

public class ArrayList<T> implements List<T> {

    private T[] arr = (T[])new Object[3];
    int count = 0;

    @Override
    public void add(T element) {
        arr[count] = element;
        count++;

        if(count == arr.length) {
            T[] tempArr = (T[])new Object[count * 2];
            for(int i = 0; i <= count - 1; i++) {
                tempArr[i] = arr[i];
            }
            arr = tempArr;
        }
    }

    @Override
    public void addAll(List<T> list) {
        int arrSize = (arr.length < list.size()) ? list.size() : arr.length;
        T[] tempArr = (T[])new Object[arrSize];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = list.get(i);
        }
        arr = tempArr;
    }

    @Override
    public T get(int i) {
        return arr[i];
    }

    @Override
    public void remove(T element) {
        int pos = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == element) {
                arr[i] = null;
                pos = i;
            }
        }

        for(int i = pos; i < count; i++) {
           if(arr[i + 1] != null) {
                arr[i] = arr[i + 1];
           }
        }
        arr[count - 1] = null;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void forEach(Consumer<T> obj) {
        for(int i = 0; i < this.size(); i++) {
            obj.accept(this.arr[i]);
        }
    }

    public <E> ArrayList<E> map(Function<T, E> fun) {
        ArrayList<E> newList = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            newList.add(fun.apply(arr[i]));
        }

        return newList;
    }
}
