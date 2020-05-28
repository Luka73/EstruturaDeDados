package CamachoClass.Aula02;


import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    public static void inverteLista(List<String> lista) {
        for(int i = lista.size() - 1; i >= 0; i--)  {
            System.out.println(lista.get(i));
        }
    }

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Fabricia");
        lista.add("Maira");
        lista.add("Aline");
        lista.add("Bruna");
        lista.add("Angelica");
        lista.add("Tais");

        Exercicio1.inverteLista(lista);
    }
}
