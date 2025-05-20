import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua nota 1");
         double nota1 = scanner.nextDouble();
        System.out.println("Insira sua nota 2");
         double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) /2;

         if (media >= 7) {
             System.out.println("Aprovado sua media e " + media);
         } else if (media >= 5 && media <= 6.9) {
             System.out.println("Recuperação sua media e " + media);
         } else {
            System.out.println("Reprovado sua media e" + media);
        }

    }
}
