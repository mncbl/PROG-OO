public class App {
    public static void main(String[] args) {
        LivroFisico livro1 = new LivroFisico("Aventuras em Java", "João Autor");
        Ebook ebook1 = new Ebook("Programação Java Avançada", "João Autor", " PDF");
        System.out.println(livro1.autor + livro1.nome);
        System.out.println(" ");
        System.out.println(ebook1.autor + ebook1.nome + ebook1.formato);
        System.out.println(" ");

        livro1.emprestar(); // Vai exibir um texto dizendo que o livro precisa ser reservado primeiro.
        System.out.println(" ");

        // As mensagens abaixo devem exibir na tela que os livros foram reservados com
        // sucesso
        livro1.reservar();
        System.out.println(" ");
        ebook1.reservar();
        System.out.println(" ");

        ebook1.cancelarReserva(); // Deve dizer que a reserva foi cancelada
        System.out.println(" ");

        livro1.emprestar(); // Vai informar que o livro foi emprestado com sucesso
        System.out.println(" ");
        livro1.emprestar(); // Vai exibir um texto dizendo que o livro já está emprestado
        System.out.println(" ");
        livro1.devolver(); // Vai exibir um texto dizendo que o livro foi devolvido
        System.out.println(" ");
    }
}