import java.util.Scanner;

public class ClassificacaoDeNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua nota: ");
        double nota = sc.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Bom!");
        } else if (nota >= 5) {
            System.out.println("Satisfatório.");
        } else if (nota < 5) {
            System.out.println("Insatisfatório.");
        }


    }

}
