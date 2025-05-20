import java.util.Scanner;

public class AnalisaNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();

            if (numero1 %2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }
    }


