package entidades;

public class Aluno {

    public String matricula;
    public String nome;
    public String curso;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome , String curso, String matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }


    @Override
    public boolean equals (Object obj){
         if (obj != null && obj instanceof Aluno){
            Aluno aluno = (Aluno) obj;

             return this.matricula.equals(aluno.getMatricula());

         }  else {
             return false;

         }

     }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
  

 }

