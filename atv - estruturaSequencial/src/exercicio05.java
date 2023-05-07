import java.util.Scanner;

public class exercicio05 {
    /* Fazer um programa para ler o código de uma peça 1, 
    o número de peças 1, o valor unitário de cada peça 1, 
    o código de uma peça 2, o número de peças 2 e o valor 
    unitário de cada peça 2. Calcule e mostre o valor a 
    ser pago */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String codigo;
        double numPecas, quantPecas, valorFinal;

        System.out.println("Informe o codigo do produto, quantidade desejada e o preco do produto.");
        codigo = sc.next();
        numPecas = sc.nextDouble();
        quantPecas = sc.nextDouble();
        valorFinal = numPecas * quantPecas;

        System.out.print("Produto " + codigo);
        System.out.printf(": R$%.2f", valorFinal);

        sc.close();
    }
}