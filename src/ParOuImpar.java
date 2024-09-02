import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        String resultado = new String();
        if (num % 2 == 0) {
            resultado = "Par";
        } else if (num % 2 == 1) {
            resultado = "Impar";
        }

        System.out.printf("O número %d é %s.%n", num, resultado);

    }

}
