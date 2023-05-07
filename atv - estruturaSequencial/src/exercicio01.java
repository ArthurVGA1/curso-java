import java.util.Scanner;

public class exercicio01 {
    /* Faça um programa para ler dois valores inteiros, e depois 
    mostrar na tela a soma desses números com uma mensagem 
    explicativa, conforme exemplos. */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, soma;

        System.out.println("Informe 2 numeros: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        soma = n1 + n2;

        System.out.println("A soma dos numeros e " + soma);

        sc.close();
    }
}
