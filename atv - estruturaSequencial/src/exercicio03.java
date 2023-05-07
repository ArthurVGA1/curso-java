import java.util.Scanner;

public class exercicio03 {
    /* Fazer um programa para ler quatro valores inteiros A, B, 
    C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: 
    DIFERENCA = (A * B - C * D). */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, difProduto;

        System.out.println("Informe 4 numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        difProduto = (a * b - c * d);

        System.out.println("A diferença do produto de A e B pelo produto de C e D e " + difProduto);

        sc.close();
    }
}
