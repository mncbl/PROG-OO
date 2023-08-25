public class App {
    public static void main(String[] args) throws Exception {
        Evento evento1, evento2;
        Alunos alunos1, alunos2;
        Palestrante palestrante1;
        evento1 = new Evento("festa", "Taubate", "12/06/2023", 170);
        System.out.println("nome: " + evento1.nomeEvento);
        System.out.println("local: " + evento1.local);
        System.out.println("data: " + evento1.data);
        System.out.println("numero maximo: " + evento1.numMax + " pessoas");
        System.out.println("_____________________________________");
        evento2 = new Evento("Sarneia", "Rio", "13/09/1990", 100);
        System.out.println("nome: " + evento2.nomeEvento);
        System.out.println("local: " + evento2.local);
        System.out.println("data: " + evento2.data);
        System.out.println("numero maximo: " + evento2.numMax + " pessoas");
        System.out.println("_____________________________________");

        alunos1 = new Alunos("Mateus", "ADM", 2004);
        System.out.println("Novo ALuno");
        System.out.println("nome: " + alunos1.nomeAluno);
        System.out.println("cuso: " + alunos1.curso);
        System.out.println(alunos1.anoNascimento);
        System.out.println("esta cadastrado no: " + evento1.nomeEvento);
        System.out.println("_____________________________________");

        alunos2 = new Alunos("gabriel", "ADM", 2009);
        System.out.println("Novo ALuno");
        System.out.println("nome: " + alunos2.nomeAluno);
        System.out.println("cuso: " + alunos2.curso);
        System.out.println(alunos2.anoNascimento);
        System.out.println("esta cadastrado no: " + evento2.nomeEvento);
        alunos2.mudaCurso("economia");
        System.out.println("O"+ alunos2.nomeAluno+"trocou o curso para "+ alunos2.curso);
        System.out.println("_____________________________________");

        palestrante1 = new Palestrante();
        System.out.println("Evento "+ evento2.nomeEvento);
        System.out.println("Nome do palestrante: "+ palestrante1.nomePalestrante);
        System.out.println("idade: "+ palestrante1.idadePalestrante);
        System.out.println("nasceu em: "+ palestrante1.cidNatal);




    }
}
