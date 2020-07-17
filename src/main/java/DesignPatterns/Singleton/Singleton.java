package DesignPatterns.Singleton;

public class Singleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                MyClass c1 = MyClass.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                MyClass c1 = MyClass.getInstance();
            }
        });

        t1.start();
        //try{Thread.sleep(10); }catch (Exception e) {}
        t2.start();

       /* MyClass c1 = MyClass.getInstance();]
        MyClass c2 = MyClass.getInstance();
        c1.name = "Luana";
        System.out.println(c1.name);
        System.out.println(c2.name);*/
    }
}

class MyClass {

    static MyClass obj; //passo 1 // new MyClass();  --> Eager
    public String name;
    public int age;

    private MyClass() { //passo 2
        System.out.println("Instancia Criada");
    }

    public static /*synchronized*/ MyClass getInstance() { //passo 3
        if (obj == null) // Garante q só será criado uma vez
            synchronized (MyClass.class) { //Double checked locking
                if (obj == null)
                    obj = new MyClass(); // --> Lazy
            }
        return obj;
    }
}