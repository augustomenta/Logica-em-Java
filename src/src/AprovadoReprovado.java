import java.util.Scanner;
import java.util.Locale;

public class AprovadoReprovado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas provas você fez? ");
        int quantidade = sc.nextInt();

        double[] nota = new double[quantidade];

        double somaNotas = 0;

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Nota da " + (i + 1) + "ª prova:");
            nota[i] = sc.nextDouble();
            somaNotas += nota[i];
        }
        double media = somaNotas / quantidade;
        System.out.print("Sua média é "+media);

        System.out.println();

        if(media >= 7){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}
