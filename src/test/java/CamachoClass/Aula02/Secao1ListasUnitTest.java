package CamachoClass.Aula02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Secao1ListasUnitTest {

    private static class Pessoa {
        private final String nome;
        private final int idade;

        private Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pessoa pessoa = (Pessoa) o;
            return getIdade() == pessoa.getIdade() &&
                    Objects.equals(getNome(), pessoa.getNome());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getNome(), getIdade());
        }
    }

    @Test
    public void ex1_inverterLista() {
        //List<String> frutas = Arrays.asList("Banana", "Melão", "Maça", "Melancia");
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Melão");
        frutas.add("Maça");
        frutas.add("Melancia");
        Secao1Listas.inverterLista(frutas);

        assertThat(frutas.get(0), is("Melancia"));
        assertThat(frutas.get(1), is("Maça"));
        assertThat(frutas.get(2), is("Melão"));
        assertThat(frutas.get(3), is("Banana"));

       List<Pessoa> pessoas = new ArrayList<>();
       pessoas.add(new Pessoa("A", 25));
       pessoas.add(new Pessoa("B", 60));
       pessoas.add(new Pessoa("C", 7));
       Secao1Listas.inverterLista(pessoas);

       assertThat(pessoas.get(0).nome, is("C"));
       assertThat(pessoas.get(1).nome, is("B"));
       assertThat(pessoas.get(2).nome, is("A"));
    }

    @Test
    public void ex2_retornarListaInvertida() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Melão");
        frutas.add("Maça");
        frutas.add("Melancia");
        List<String> frutasInvertidas = Secao1Listas.retornarListaInvertida(frutas);

        assertThat(frutasInvertidas.get(0), is("Melancia"));
        assertThat(frutasInvertidas.get(1), is("Maça"));
        assertThat(frutasInvertidas.get(2), is("Melão"));
        assertThat(frutasInvertidas.get(3), is("Banana"));

        assertThat(frutas.get(0), is("Banana"));
        assertThat(frutas.get(1), is("Melão"));
        assertThat(frutas.get(2), is("Maça"));
        assertThat(frutas.get(3), is("Melancia"));

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("A", 25));
        pessoas.add(new Pessoa("B", 60));
        pessoas.add(new Pessoa("C", 7));
        List<Pessoa> pessoasInvertidas = Secao1Listas.retornarListaInvertida(pessoas);

        assertThat(pessoasInvertidas.get(0).nome, is("C"));
        assertThat(pessoasInvertidas.get(1).nome, is("B"));
        assertThat(pessoasInvertidas.get(2).nome, is("A"));

        assertThat(pessoas.get(0).nome, is("A"));
        assertThat(pessoas.get(1).nome, is("B"));
        assertThat(pessoas.get(2).nome, is("C"));
    }

    @Test
    public void ex3_listaContemElemento() {
        List<String> frutas = asList("Banana", "Melão", "Maça", "Melancia");
        assertThat(Secao1Listas.listaContemElemento(frutas, "Maça"), is(true));
        assertThat(Secao1Listas.listaContemElemento(frutas, "Melão"), is(true));
        assertThat(Secao1Listas.listaContemElemento(frutas, "Uva"), is(false));
    }
    
    @Test
    public void ex4_listaContemElementosNaMesmaOrdem() {
        List<Integer> numeros = asList(1, 2, 3, 4);

        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(2, 3, 4)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(4, 3, 2)), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(2, 3, 4, 5)), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(1, 2, 3, 4)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, singletonList(3)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, emptyList()), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(emptyList(), emptyList()), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(emptyList(), singletonList(3)), is(false));
    }

    @Test
    public void ex5_listaContemExatamenteOsMesmosElementosEmQualquerOrdem() {
        List<Integer> numeros = asList(1, 2, 3, 4);
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(1, 2, 3, 4)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(4, 2, 3, 1)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(2, 3, 1)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, emptyList()), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(emptyList(), emptyList()), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(emptyList(), singletonList(3)), is(false));

        List<Integer> numeros2 = singletonList(4);
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros2, singletonList(4)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros2, asList(4, 2)), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros2, emptyList()), is(false));
    }

    @Test
    public void ex6_listaContemExatamenteOsMesmosElementosNaMesmaOrdem() {
        List<Integer> numeros = asList(1, 2, 3, 4);
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(1, 2, 3, 4)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, asList(4, 2, 3, 1)), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros, emptyList()), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(emptyList(), emptyList()), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(emptyList(), singletonList(3)), is(false));

        List<Integer> numeros2 = asList(4);
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros2, asList(4)), is(true));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros2, asList(4, 2)), is(false));
        assertThat(Secao1Listas.listaContemElementosNaMesmaOrdem(numeros2, emptyList()), is(false));
    }
}
