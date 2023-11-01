import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String nomeArq = "C:\\Users\\mateu\\OneDrive\\faculdade\\quarto periodo\\PROG-OO\\Ac6\\src\\alunos.txt";
        File arq = new File(nomeArq);
        Scanner opcao = new Scanner(System.in);
        System.out.println("Escolha a operação:");
        System.out.println("1. incluir lista");
        System.out.println("2. remover da lista");
        System.out.println("3. ver lista");
        System.out.println("4. editar");
        System.out.println("5. Sair");
        int escolha = opcao.nextInt();
        opcao.nextLine();

        
        switch (escolha) {
            case 1:
                System.out.print("Nome: ");
                String nome = opcao.nextLine();
                System.out.print("Matrícula: ");
                int matricula = opcao.nextInt();
                opcao.nextLine(); // Consumir a nova linha deixada pelo nextInt
                System.out.print("Curso: ");
                String curso = opcao.nextLine();
                StringBuilder sb = new StringBuilder(nome);
                sb.append(" " + matricula);
                sb.append(" " + curso);

                try (FileWriter fileWriter = new FileWriter(arq, true);
                        BufferedWriter writer = new BufferedWriter(fileWriter)) {
                    writer.write(sb.toString());
                    writer.newLine();
                    System.out.println("Aluno adicionado ao arquivo.");

                } catch (IOException e) {
                    e.printStackTrace();
                }


                break;


            case 2:
                // Adicione lógica para a opção 2 aqui
                break;
            case 3:
                try (FileReader leitorArq = new FileReader(arq);
                        BufferedReader bufferArq = new BufferedReader(leitorArq)) {
                    String linha;
                    while ((linha = bufferArq.readLine()) != null) {
                        System.out.println(linha);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                escolha = opcao.nextInt();

            case 4:
                // Adicione lógica para a opção 4 aqui
                break;

            case 5:
                // Adicione lógica para a opção 5 aqui
                break;
            default:
                System.out.println("Escolha inválida.");
        }
        opcao.close();
    }
}
