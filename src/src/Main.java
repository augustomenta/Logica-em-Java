import java.util.Locale;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 21;
        salario = 3000.00;
        altura = 180;
        genero = 'M';
        nome = "Augusto";

        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + String.format("%.2f" , salario));
        System.out.println("Altura: " + altura);
        System.out.println("Genero: " + genero);
        System.out.println("Nome: " + nome);

        System.out.println("O funcionário  " + nome + ", do genero " + genero + ", com a idade de " + idade + " anos e com um salário de " + salario);
    }
}