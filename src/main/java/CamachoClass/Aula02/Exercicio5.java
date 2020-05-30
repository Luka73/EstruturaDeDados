package CamachoClass.Aula02;


import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {
    public static boolean saoIquais(List<Integer> lista1, List<Integer> lista2) {
        if(lista1.size() != lista2.size()) {
            return false;
        }

        for(int i = lista1.size() - 1; i >= 0; i--) {
            if(!lista1.get(i).equals(lista2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.add(2);
        numeros3.add(1);
        numeros3.add(3);
        List<Integer> numeros4 = new ArrayList<>();
        numeros4.add(1);
        numeros4.add(2);
        numeros4.add(3);


        if (Exercicio5.saoIquais(numeros1, numeros2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        if (Exercicio5.saoIquais(numeros3, numeros4)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}
