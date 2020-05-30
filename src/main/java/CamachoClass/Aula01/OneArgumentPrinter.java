package CamachoClass.Aula01;

import CamachoClass.Aula01.Interfaces.OneArgument;

public class OneArgumentPrinter<T> implements OneArgument<T> {

    @Override
    public void run(T obj) {
        System.out.println(obj);
    }
}
