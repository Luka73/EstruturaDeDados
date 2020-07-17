package DesignPatterns.Singleton;

public class SingletonEnum { //Serialzation and thread-safety guaranteed.
    public static void main(String[] args) {
        MyEnum obj1 = MyEnum.INSTANCE;
        obj1.i = 10;
        obj1.show();

        MyEnum obj2 = MyEnum.INSTANCE;
        obj2.i = 20;
        obj2.show();
        obj1.show();
    }
}

enum MyEnum {
    INSTANCE;
    int i;
    public void show() {
        System.out.println(i);
    }
}
