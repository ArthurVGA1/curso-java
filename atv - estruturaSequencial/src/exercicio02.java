import java.util.Scanner;

public class exercicio02 {
    /* Faça um programa para ler o valor do raio de um círculo, 
    e depois mostrar o valor da área deste círculo com quatro
    casas decimais conforme exemplos.
    Fórmula da área: area = π . raio2
    Considere o valor de π = 3.14159 */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double raio, area;

        System.out.println("Informe o raio do circulo: ");
        raio = sc.nextDouble();
        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A area do circulo e %.4f", area);

        sc.close();
    }
}
