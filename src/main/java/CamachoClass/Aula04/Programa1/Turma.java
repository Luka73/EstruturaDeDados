package CamachoClass.Aula04.Programa1;

import java.util.List;

public class Turma {

    public Turma(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    private List<Aluno> alunos;

    public List<Aluno> getAlunos() {
        return alunos;
    }
}