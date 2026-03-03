import java.util.Scanner;
import java.util.Locale;

public class Vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você irá digitar? ");
        int NumerosDigitados =  sc.nextInt();

        double[] vet = new double[NumerosDigitados];
        for (int i = 0; i < NumerosDigitados; i++){
            System.out.println("Digite um número: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println("Númeoros Digitados: ");
        for (int i = 0; i < NumerosDigitados; i++) {
            System.out.println(vet[i]);
        }

    sc.close();
    }
}
