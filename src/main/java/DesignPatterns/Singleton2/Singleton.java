package DesignPatterns.Singleton2;

public class Singleton {

}

class MyClass {
    public String name;
    public int age;
    static MyClass obj;

    private MyClass() { //default constructor
        System.out.println("Instanced class");
    }

    /*public static MyClass getInstance() {
        if (obj == null) // Garante q só será criado uma vez

        }
        return obj;
    }*/

}
