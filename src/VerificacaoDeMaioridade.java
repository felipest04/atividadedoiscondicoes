import java.util.Scanner;

public class VerificacaoDeMaioridade {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        Integer idade = sc.nextInt();

        if (idade >= 18)
            System.out.println("Você é maior de idade.");

        else
            System.out.println("Você é menor de idade.");
    }

}