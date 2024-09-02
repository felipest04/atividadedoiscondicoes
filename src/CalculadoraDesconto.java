import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorOriginal = scanner.nextDouble();

        double desconto;
        double valorDescontado;
        double valorFinal;

        if (valorOriginal > 500) {
            desconto = 0.20; // 20%
        } else if (valorOriginal >= 200) {
            desconto = 0.10; // 10%
        } else if (valorOriginal >= 100) {
            desconto = 0.05; // 5%
        } else {
            desconto = 0.00; // Sem desconto
        }

        valorDescontado = valorOriginal * desconto;
        valorFinal = valorOriginal - valorDescontado;

        System.out.println("Valor original: R$ " + valorOriginal);
        System.out.println("Percentual de desconto: " + (desconto * 100) + "%");
        System.out.println("Valor descontado: R$ " + valorDescontado);
        System.out.println("Valor final: R$ " + valorFinal);

        scanner.close();
    }
}
