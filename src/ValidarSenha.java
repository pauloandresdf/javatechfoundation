import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {

        String senhaCorreta = "123456";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a senha de acesso: ");
        String senhaDigitada = scanner.nextLine();

        scanner.close();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
