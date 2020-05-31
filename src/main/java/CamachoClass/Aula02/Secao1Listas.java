package CamachoClass.Aula02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
}
