import java.util.Scanner;
import java.util.Locale;

public class CrescenteDecrescente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite dois números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        while(num1 != num2) {
            if(num1 < num2) {
                System.out.println("CRESCENTE");
            }
            else{
                System.out.println("DESCRESCENTE");
            }
            System.out.println("Digite dois números: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }

        sc.close();
    }
}
