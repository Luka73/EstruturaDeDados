package CamachoClass.Aula02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
        List<String> frutas = Arrays.asList("Banana", "Melão", "Maça", "Melancia");
        Secao1Listas.inverterLista(frutas);

        assertThat(frutas.get(0), is("Melancia"));
        assertThat(frutas.get(1), is("Maça"));
        assertThat(frutas.get(2), is("Melão"));
        assertThat(frutas.get(3), is("Banana"));

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("A", 25),
                new Pessoa("B", 60),
                new Pessoa("C", 7)
        );
        Secao1Listas.inverterLista(pessoas);

        assertThat(pessoas.get(0).nome, is("C"));
        assertThat(pessoas.get(1).nome, is("B"));
        assertThat(pessoas.get(2).nome, is("A"));
    }

    @Test
    public void ex2_retornarListaInvertida() {
        List<String> frutas = Arrays.asList("Banana", "Melão", "Maça", "Melancia");
        List<String> frutasInvertidas = Secao1Listas.retornarListaInvertida(frutas);

        assertThat(frutasInvertidas.get(0), is("Melancia"));
        assertThat(frutasInvertidas.get(1), is("Maça"));
        assertThat(frutasInvertidas.get(2), is("Melão"));
        assertThat(frutasInvertidas.get(3), is("Banana"));

        assertThat(frutas.get(0), is("Banana"));
        assertThat(frutas.get(1), is("Melão"));
        assertThat(frutas.get(2), is("Maça"));
        assertThat(frutas.get(3), is("Melancias"));

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("A", 25),
                new Pessoa("B", 60),
                new Pessoa("C", 7)
        );
        List<Pessoa> pessoasInvertidas = Secao1Listas.retornarListaInvertida(pessoas);

        assertThat(pessoasInvertidas.get(0).nome, is("C"));
        assertThat(pessoasInvertidas.get(1).nome, is("B"));
        assertThat(pessoasInvertidas.get(2).nome, is("A"));

        assertThat(pessoasInvertidas.get(0).nome, is("A"));
        assertThat(pessoasInvertidas.get(1).nome, is("B"));
        assertThat(pessoasInvertidas.get(2).nome, is("C"));
    }

    @Test
    public void ex3_listaContemElemento() {
        List<String> frutas = Arrays.asList("Banana", "Melão", "Maça", "Melancia");
        assertThat(Secao1Listas.listaContemElemento(frutas, "Maça"), is(true));
        assertThat(Secao1Listas.listaContemElemento(frutas, "Melão"), is(true));
        assertThat(Secao1Listas.listaContemElemento(frutas, "Uva"), is(false));
    }
}
