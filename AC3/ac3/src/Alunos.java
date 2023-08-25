public class Alunos{
    String nomeAluno, curso ;
    int idade, anoNascimento, verIdade;




Alunos( String nomeAluno, String curso, int anoNascimento){
    this.nomeAluno = nomeAluno;
    this.curso= curso;
    this.anoNascimento = anoNascimento;
    if (anoNascimento <= 2005 ){
        System.out.println("É maior de idade");
    }else{
        System.out.println("é menor de idade");
    }


}
void mudaCurso(String novoCurso){
    this.curso = novoCurso;

}
}