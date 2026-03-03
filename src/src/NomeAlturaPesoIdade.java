import java.util.Locale;
import java.util.Scanner;

public class NomeAlturaPesoIdade {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade;
        double altura, peso;
        String nome;

        System.out.print("Digite seu nome: ");
        nome = sc.next();
        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.print("Digite seu altura: ");
        altura = sc.nextDouble();
        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso + "Kg");
        System.out.println("Altura: " + altura + "cm");
        System.out.println("Idade: " + idade + " anos");

        sc.close();
    }
}