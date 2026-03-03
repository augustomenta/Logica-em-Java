import java.util.Scanner;

public class Área {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double largura, altura;

        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();
        System.out.println("Digite a largura: ");
        largura = sc.nextDouble();

        double area = altura * largura;
        System.out.println("A área é: " + area);

        sc.close();
    }
}
