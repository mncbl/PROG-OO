import dao.AlunoDao;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoDao alunos = new AlunoDao();

        //Objetos alunos
        alunos.addAluno("Bruno","Ciencia de Dados", "11");
        alunos.addAluno("Mateus","Ciencia de Dados", "12");

        //Gera lista dos Alunos
        alunos.infoAlunoTodos();
        //Remove aluno da lista
        alunos.removeAluno("11");
        alunos.infoAlunoTodos();

        //Gera informacoes de determionado aluno baseado a matricula
        alunos.infoAluno("12");

        //Altera o curso do aluno baseado a matricula
        alunos.atualizaCurso("12", "ADM");
        System.out.println("_________________________________________________--");
        alunos.infoAluno("12");







    }
}











