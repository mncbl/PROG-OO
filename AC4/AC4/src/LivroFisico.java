public class LivroFisico extends App {
    String nome;
    String autor;

    public LivroFisico(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;

    }

    public void emprestar() {
        System.out.println("O livro "+ nome+ " foi emprestado com sucesso");
    }

    public void reservar() {
        System.out.println("o livro "+ nome+ " foi reservado com sucesso  ");
    }

    public void cancelarReserva() {
        System.out.println("A reserva do livro" + nome+ " foi cancelado ");
    }

    public void devolver() {
        System.out.println("livro"+ nome+ " devolvido com sucesso");
    }

}
