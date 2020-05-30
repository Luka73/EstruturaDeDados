package CamachoClass.Aula02;


import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static boolean estaContido(List<String> lista, String elemento) {
        return lista.contains(elemento);
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Fabricia");
        lista.add("Maira");
        lista.add("Aline");
        lista.add("Bruna");
        lista.add("Angelica");
        lista.add("Tais");

        if(Exercicio2.estaContido(lista, "Bruna")) {
            System.out.println("Contém");
        } else {
            System.out.println("Não contém");
        }

        if(Exercicio2.estaContido(lista, "Juliana")) {
            System.out.println("Contém");
        } else {
            System.out.println("Não contém");
        }
    }
}
