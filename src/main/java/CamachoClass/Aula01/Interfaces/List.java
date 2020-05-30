package CamachoClass.Aula01.Interfaces;

import java.util.function.Consumer;

public interface List<T> {
    void add(T element);
    void addAll(List<T> list);
    T get(int i);
    void remove(T element);
    int size();
    void forEach(Consumer<T> obj);
}
