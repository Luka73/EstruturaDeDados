package CamachoClass.Aula01;

import CamachoClass.Aula01.Interfaces.List;

public class TryLists {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> newStringList = new ArrayList<>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");
        stringList.add("e");
        stringList.add("f");
        stringList.add("g");
        stringList.add("h");
        stringList.add("i");


        newStringList.addAll(stringList);
        stringList.remove("g");

        /* System.out.println(stringList.get(2));
        System.out.println(newStringList.get(2)); */

        for(int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        /*Pessoa a = new Pessoa("A", 30);
        Pessoa b = new Pessoa("B", 60);
        Pessoa c = new Pessoa("C", 40);

        a.idade = 1;
        b.idade = 2;
        c.idade = 3;

        c = a;

        a.idade = 4;
        b.idade = 5;
        c.idade = 6;

        Pessoa[] arr1 = new Pessoa[1];
        arr1[0] = a;

        Pessoa[] arr2 = new Pessoa [2];
        arr2[0] = a;
        arr2[1] = b;

        Pessoa[] arr3 = new Pessoa[3];
        arr3[0] = a;
        arr3[1] = b;
        arr3[2] = c;

        arr1 = arr3;

        arr3[2] = b;*/
    }
}
