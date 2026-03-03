import java.util.Locale;
import java.util.Scanner;

public class SomaMedia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantidade;
        double soma, media;

        System.out.print("Digite quantos números você irá digitar: ");
        quantidade = sc.nextInt();

        double[] vetor =  new double[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Valores: ");
        for(int i = 0; i < quantidade; i++){
            System.out.print(String.format("%.1f  ", vetor[i]));
        }
        System.out.println();

        soma = 0;
        for(int i = 0; i < quantidade; i++){
            soma = soma + vetor[i];
        }

        System.out.println("Soma: " + String.format("%.2f", soma));

        media = soma / quantidade;
        System.out.println("Media: " + String.format("%.2f", media));

        sc.close();
    }
}
