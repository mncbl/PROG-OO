package dao;
import entidades.Aluno;
import java.util.ArrayList;

public class AlunoDao {
    private ArrayList<Aluno> alunoDao;

    public AlunoDao() {
        this.alunoDao = new ArrayList<>();
    }

    // Adicionar Aluno
    public void addAluno(String nome, String curso, String matricula) {
        alunoDao.add(new Aluno(nome, curso, matricula));
    }

    // Remover aluno da lista baseado na matricula
    public void removeAluno(String matricula) {
        alunoDao.removeIf(aluno -> aluno.getMatricula().equals(matricula));//utilizamos a seta pois o removeif estava dando erro
    }

    // Atualizar curso de aluno baseado na matricula
    public void atualizaCurso(String matricula, String novoCurso) {
        for (Aluno aluno : alunoDao) {
            if (aluno.getMatricula().equals(matricula)) {
                aluno.setCurso(novoCurso);
                break;
            }
        }
    }


    // Visualizar informações do aluno a partir da matricula
    public void infoAluno(String matricula) {
        for (Aluno aluno : alunoDao) {
            if (aluno.getMatricula().equals(matricula)) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Curso: " + aluno.getCurso());
                System.out.println("Matricula: " + aluno.getMatricula());
                return;
            }
        }
        System.out.println("Aluno não encontrado com a matricula: " + matricula);
    }

    // Visualizar informações de todos os alunos
    public void infoAlunoTodos() {
        for (Aluno aluno : alunoDao) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Curso: " + aluno.getCurso());
            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("------------");
        }
    }
}
