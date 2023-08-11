public class App {
    public static void main(String[] args) throws Exception {
        status(2.0, 10.0, 8.0);
        metodo();
        bissexto(1900);
        semana(20);
        ePrimo(45);

    }

    public static void status(double nota1, double nota2, double notac) {
        double media;
        media = (nota1 + nota2) * 0.4 + notac * 0.2;
        if (media <= 7) {
            System.err.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }
        System.out.println(media);
    }

    public static void metodo() {
        int n;
        for (n = 150; n <= 200; n++) {
            System.out.println(n);
        }

    }
    public static void semana(int dia){


        switch (dia){
            case 2,9, 16, 23, 30:
                System.out.println("segunda");
                break;
            case 3, 10, 17, 24, 31:
                System.out.println("terça");
                break;
            case  4, 11, 18, 25:
                System.out.println("quarta");
                break;
            case 5,12, 19, 26:
                System.out.println("quinta");
                break;
            case 6,13, 20, 27:
                System.out.println("sexta");
                break;
            case 7,14, 21, 28:
                System.out.println("sabado");
                break;
            case 1, 8, 15, 22, 29:
                System.out.println("domingo");
                break;
            default:
                System.out.println("dia invalido");
        }




    }

    public static void bissexto(int ano) {
        int ver1, ver4, ver400;
        ver1 = ano % 100;
        ver4 = ano % 4;
        ver400 = ano % 400;
        if (ver4 > 0) {
            System.out.println("O ano não é bissexto.");
        } else if (ver1 == 0) {
            if (ver400 == 0) {
                System.out.println("O ano é bissexto.");
            } else {
                System.out.println("O ano não é bissexto.");
            }
        } else {
            System.out.println("O ano é bissexto.");
        }
    }

    public static void ePrimo (int num){
        int i;

        for (i=2; i < num; i++) {

            if (num % 1 == 0) {
                System.out.println(i);
                System.out.println("nao é primo");
                break;

            }
            else{
                System.out.println("é primo");
            }

        }


        }

    }

