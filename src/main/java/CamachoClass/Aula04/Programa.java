package CamachoClass.Aula04;

import java.util.List;
import java.util.stream.Collectors;

public class Programa {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Luana", 31);
        Aluno a2 = new Aluno("Fernando", 30);
        Aluno a3 = new Aluno("Gabriel", 32);
        Aluno a4 = new Aluno("Felipe", 34);

        System.out.println("Alunos : " + teste(List.of(a1, a2, a3, a4)));
    }

    private static List<String> teste(List<Aluno> alunos) {
        return alunos.stream()
                .filter(a -> a.nome.toUpperCase().startsWith("F"))
                .map(Aluno::getNome).collect(Collectors.toList());
    }
}
