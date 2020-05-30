package CamachoClass.Aula02;


import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {
    public static boolean contemTodos(List<Integer> lista1, List<Integer> lista2) {
        return lista1.containsAll(lista2);
    }

    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(2);
        numeros2.add(1);
        numeros2.add(3);

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.add(2);
        numeros3.add(1);
        List<Integer> numeros4 = new ArrayList<>();
        numeros4.add(1);
        numeros4.add(2);
        numeros4.add(3);

        if(Exercicio4.contemTodos(numeros1, numeros2)) {
            System.out.println("Contém todos");
        } else {
            System.out.println("Não contém todos");
        }

        if(Exercicio4.contemTodos(numeros3, numeros4)) {
            System.out.println("Contém todos");
        } else {
            System.out.println("Não contém todos");
        }
    }
}
