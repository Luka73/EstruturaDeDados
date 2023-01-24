package CamachoClass.Aula04.Programa1;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Programa1 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Luana", 31);
        Aluno a2 = new Aluno("Fernando", 30);
        Aluno a3 = new Aluno("Gabriel", 32);
        Aluno a4 = new Aluno("Felipe", 34);

        Aluno a5 = new Aluno("Fátima", 31);
        Aluno a6 = new Aluno("Talita", 30);
        Aluno a7 = new Aluno("Frederico", 32);
        Aluno a8 = new Aluno("Fabrícia", 34);

        List<Aluno> alunosT1 = List.of(a1, a2, a3, a4);
        List<Aluno> alunosT2 = List.of(a5, a6, a7, a8);

        Turma t1 = new Turma(alunosT1);
        Turma t2 = new Turma(alunosT2);

        List<Turma> turmas = List.of(t1, t2);

        System.out.println("AlunosF em Turma1: " + stream1(alunosT1));
        System.out.println("Total de AlunosF em todas as Turmas : " + stream2(turmas));
        System.out.println("Nomes dos AlunosF em todas as Turmas em maiúsculo : " + stream3(turmas));
    }

    private static List<String> stream1(List<Aluno> alunos) {
        return alunos.stream()
                .filter(a -> a.nome.toUpperCase().startsWith("F"))
                .map(Aluno::getNome).collect(Collectors.toList());
    }


    private static long stream2(List<Turma> turmas) {
        return turmas.stream()
                .flatMap(t -> t.getAlunos().stream())
                .map(Aluno::getNome)
                .filter(n -> n.startsWith("F"))
                .count();
    }

    private static List<String> stream3(List<Turma> turmas) {
        return turmas.stream()
                .flatMap(t -> t.getAlunos().stream())
                .filter(n -> n.getNome().startsWith("F"))
                .map(a -> a.getNome().toUpperCase(Locale.CANADA))
                .collect(Collectors.toList());
    }
}
