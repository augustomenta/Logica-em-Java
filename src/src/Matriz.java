import java.util.Scanner; // Importa a classe Scanner para leitura de dados

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Cria objeto Scanner para entrada pelo teclado

        int linhas, colunas; // Declara variáveis para número de linhas e colunas
        System.out.print("Quantas linhas vai ter a matriz: "); // Solicita número de linhas
        linhas = sc.nextInt(); // Lê o valor digitado para linhas
        System.out.print("Quantas colunas vai ter a matriz: "); // Solicita número de colunas
        colunas = sc.nextInt(); // Lê o valor digitado para colunas

        int[][] matriz = new int[linhas][colunas]; // Cria a matriz com tamanho definido pelo usuário
        for (int i = 0; i < linhas; i++){ // Percorre cada linha da matriz
            for (int j = 0; j < colunas; j++){ // Percorre cada coluna da matriz
                System.out.print("Elemento [" + i + "][" + j + "]: "); // Mostra posição atual
                matriz[i][j] = sc.nextInt(); // Lê e armazena o valor na posição [i][j]
            }
        }
        System.out.println(); // Quebra de linha
        System.out.println("matriz digitada:"); // Título antes de imprimir a matriz
        for (int i = 0; i < linhas; i++){ // Percorre novamente as linhas
            for (int j = 0; j < colunas; j++) { // Percorre novamente as colunas
                System.out.print(matriz[i][j] + " "); // Imprime cada elemento da matriz
            }
            System.out.println(); // Quebra de linha
        }

        sc.close(); // Fecha o Scanner para liberar recursos
    }
}