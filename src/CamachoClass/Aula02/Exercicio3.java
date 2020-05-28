package CamachoClass.Aula02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {
    public static boolean contemTodosOsElementos(List<Integer> lista1, List<Integer> lista2) {
        for(Integer i : lista1) {
            if(!lista2.contains(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        List<Integer> numeros2 = new ArrayList<>();
        numeros2.add(2);
        numeros2.add(1);
        numeros2.add(3);

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.add(2);
        numeros3.add(1);
        List<Integer> numeros4 = new ArrayList<>();
        numeros4.add(4);
        numeros4.add(2);
        numeros4.add(3);

        if(Exercicio3.contemTodosOsElementos(numeros1, numeros2)) {
            System.out.println("Contém todos os elementos");
        } else {
            System.out.println("Não contém todos os elementos");
        }

        if(Exercicio3.contemTodosOsElementos(numeros3, numeros4)) {
            System.out.println("Contém todos os elementos");
        } else {
            System.out.println("Não contém todos os elementos");
        }
    }
}
