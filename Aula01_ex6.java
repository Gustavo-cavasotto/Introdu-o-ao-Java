import java.util.Scanner;
public class Aula01_ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano");
        int ano = scanner.nextInt();


        if (mes == 2 && dia > 28) {
            System.out.println("Data inválida");
        }

        else if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 0){
            System.out.println("Data inválida");
        }

        else {
            System.out.println("Data válida:" + dia + mes + ano);
        }

    }
}
