package CamachoClass.Aula02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Secao1Listas {

    /**
     * Inverte a lista.
     * @param lista
     * @param <T>
     */
    public static <T> void inverterLista(List<T> lista) {
        List<T> tmpList = new ArrayList<>();
        int pos = 0;

        for (int i = lista.size() - 1; i >= 0; i--) {
            tmpList.add(pos, lista.get(i));
            pos++;
        }

        lista.clear();
        lista.addAll(tmpList);
    }

    /**
     * Cria uma nova lista com os elementos da lista passada ao contário.
     * @param lista
     * @param <T>
     */
    public static <T> List<T> retornarListaInvertida(List<T> lista) {
        List<T> tmpList = new ArrayList<>();
        int pos = 0;

        for (int i = lista.size() - 1; i >= 0; i--) {
            tmpList.add(pos, lista.get(i));
            pos++;
        }

        return tmpList;
    }

    /**
     * Retorna true se o elemento está contido na lista, false caso contário.
     * @param lista
     * @param elemento
     * @param <T>
     * @return
     */
    public static <T> boolean listaContemElemento(List<T> lista, T elemento) {
        return lista.contains(elemento);
    }

    /**
     * Retorna true se todos os elementos na lista 2 estão contidos na lista 1 na mesma ordem que estão na lista 2.
     * @param lista1
     * @param lista2
     * @param <T>
     * @return
     */
    public static <T> boolean listaContemElementosNaMesmaOrdem(List<T> lista1, List<T> lista2) {
        int count = 0;

        if (lista1.isEmpty()) {
            return lista2.isEmpty();
        }

        if (lista2.isEmpty() || (lista2.size() > lista1.size())) {
            return false;
        }

        T n = lista2.get(0);

        if(lista1.contains(n)) {
            int i = lista1.indexOf(n);
            int j = 0;

            while (i < lista1.size() && j < lista2.size()) {
                if(lista1.get(i).equals(lista2.get(j))) {
                    count++;
                    j++;
                } else {
                    count = 0;
                }
                i++;
            }
        }

        return count == lista2.size();
    }

    /**
     * Retorna true se ambas as listas tem exatamente os mesmos elementos em qualquer ordem
     * @param lista1
     * @param lista2
     * @param <T>
     * @return
     */
    public static <T> boolean listaContemExatamenteOsMesmosElementosEmQualquerOrdem(List<T> lista1, List<T> lista2) {
        return false;
    }

    /**
     * Retorna true se ambas as listas tem exatamente os mesmos elementos na exata mesma ordem
     * @param lista1
     * @param lista2
     * @param <T>
     * @return
     */
    public static <T> boolean listaContemExatamenteOsMesmosElementosNaMesmaOrdem(List<T> lista1, List<T> lista2) {
        return false;
    }
}
