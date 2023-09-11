public class Ebook extends App {
    String nome;
    String formato;
    String autor;
    public Ebook(String nome, String autor, String formato){

        this.nome = nome;
        this.autor = autor;
        this.formato = formato;


    }
    public void reservar(){
        System.out.println("o EBOOK " + nome + " precisa ser reservadp ");
    }
    public void cancelarReserva(){
        System.out.println("o EBOOK "+ nome+ " foi reservado ");
    }






}
