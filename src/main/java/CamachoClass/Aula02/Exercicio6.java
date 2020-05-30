package CamachoClass.Aula02;

import java.util.ArrayList;
import java.util.List;

public class Exercicio6 {
    public static boolean contidosNaMesmaPosicao(List<String> lista1, List<String> lista2) {
        for(int i = 0; i < lista1.size(); i++) {
            if(!(lista2.contains(lista1.get(i)) && lista2.indexOf(lista1.get(i)) == i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>();
        nomes1.add("Fabricia");
        nomes1.add("Maira");

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Fabricia");
        nomes2.add("Maira");
        nomes2.add("Angelica");

        List<String> nomes3 = new ArrayList<>();
        nomes3.add("Fabricia");
        nomes3.add("Maira");
        nomes3.add("Aline");

        List<String> nomes4 = new ArrayList<>();
        nomes4.add("Fabricia");
        nomes4.add("Angelica");
        nomes4.add("Maira");

        if(Exercicio6.contidosNaMesmaPosicao(nomes1, nomes2)) {
            System.out.println("Contém todos na mesma posição");
        } else {
            System.out.println("Não contém todos na mesma posição");
        }

        if(Exercicio6.contidosNaMesmaPosicao(nomes3, nomes4)) {
            System.out.println("Contém todos na mesma posição");
        } else {
            System.out.println("Não contém todos na mesma posição");
        }
    }
}
