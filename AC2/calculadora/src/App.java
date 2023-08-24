import java.util.Scanner;

// Mateus Norcia Carolino Barbosa Lima
public class App {
    public static void main(String[] args) throws Exception {
        // definindo variaveis
        double x, y;
        Scanner le = new Scanner(System.in);
        String continua = "Sim";
        String reset = "Nao";
        int opcao;
        double resultado;
        System.out.println("diga o primeiro numero");
        x = le.nextDouble();

        while (continua.equals("Sim")) {
            System.out.println("deseja continuar calculando, Sim ou Nao");
                    continua = le.next();
                    if (continua.equals("Sim")) {

                    }
             System.out.println("deseja resetar o  numero ? Sim ou Não");
                    reset = le.next();
                    if (reset.equals("Sim")) {
                        System.out.println("diga o primeiro numero");
                        x = le.nextDouble();
                    }
            // colocando as opções da interface
            System.out.println("Escolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");
            opcao = le.nextInt();

            // coloando os metodos das opçoes
            switch (opcao) {
                // realiza a soma
                case 1:
                    System.out.println("diga o segundo numero");
                    y = le.nextDouble();
                    resultado = soma(x, y);
                    System.out.println(resultado);
                    x = resultado;
                    break;

                // realiza a subtração
                case 2:
                    System.out.println("diga o segundo numero");
                    y = le.nextDouble();
                    resultado = subtrai(x, y);
                    System.out.println(resultado);
                    x = resultado;

                    break;

                // realiza a multiplicacao
                case 3:

                    System.out.println("diga o segundo numero");
                    y = le.nextDouble();
                    resultado = (multiplica(x, y));
                    x = resultado;
                    System.out.println(resultado);



                    break;

                // realiza a divisao
                case 4:

                    System.out.println("diga o segundo numero");
                    y = le.nextDouble();
                    resultado = (divide(x, y));
                    x = resultado;
                    System.out.println(resultado);

                    break;

                // encerra o programa
                case 5:
                    System.out.println("encerrando programa");
                    System.exit(0);
                    // trata de opções diferentes das citadas
                default:
                    System.out.println("invalido");
                    break;

            }
        }
        le.close();
    }

    // metodos que realiza a soma de dois numeros
    public static double soma(double x, double y) {
        return x + y;
    }

    // metodo que realiza a subtraçao de dois numeros
    public static double subtrai(double x, double y) {
        return x - y;
    }

    // metodo que realiza a multiplica de dois numeros
    public static double multiplica(double x, double y) {
        return x * y;
    }

    // metodo que realiza a divisao de dois numeros
    public static double divide(double x, double y) {
        return x / y;
    }
}
