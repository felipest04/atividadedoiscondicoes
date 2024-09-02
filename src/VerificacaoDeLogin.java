import java.util.Scanner;

public class VerificacaoDeLogin {
    public static void main(String[] args) {

        final String USERNAME_CORRETO = "usuario123";
        final String SENHA_CORRETA = "senha123";


        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o nome de usuário: ");
        String nomeUsuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();


        if (nomeUsuario.equals(USERNAME_CORRETO) && senha.equals(SENHA_CORRETA)) {

            System.out.println("Login bem-sucedido!");
        } else {

            System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
        }


        scanner.close();
    }
}