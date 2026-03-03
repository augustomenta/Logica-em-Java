import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Define padrão americano (usa ponto para decimal)
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de pessoas que serão cadastradas: ");
        int quantidade = sc.nextInt();

        // Criamos VETORES para armazenar os dados de várias pessoas
        String[] nomes = new String[quantidade];
        int[] idades = new int[quantidade];
        double[] alturas = new double[quantidade];

        // Variáveis auxiliares
        double somaAlturas = 0;
        int menoresDe16 = 0;

        // Entrada de dados
        for (int i = 0; i < quantidade; i++) {

            System.out.println("Dados da " + (i + 1) + "ª pessoa:");

            System.out.print("Nome: ");
            nomes[i] = sc.next();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

            // Soma das alturas
            somaAlturas += alturas[i];

            // Contar menores de 16
            if (idades[i] < 16) {
                menoresDe16++;
            }

            System.out.println();
        }

        // Cálculo da média
        double mediaAltura = somaAlturas / quantidade;

        // Cálculo da porcentagem
        double porcentagem = (menoresDe16 * 100.0) / quantidade;

        // Saída
        System.out.printf("Altura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);

        // Mostrar nomes dos menores de 16
        for (int i = 0; i < quantidade; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}