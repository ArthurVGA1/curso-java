import java.util.Scanner;

public class exercicio06 {
    /* Fazer um programa que leia três valores com ponto flutuante 
    de dupla precisão: A, B e C. Em seguida, calcule e mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B. */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetagulo;

        System.out.println("Informe 3 valores: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        areaTriangulo = a * c / 2;
        areaCirculo = Math.PI * Math.pow(c, 2);
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = b * b;
        areaRetagulo = a * b;

        System.out.printf("A area do triangulo e %.2f\nA area do circulo e %.2f\nA area do trapezio e %.2f\n A area do quadrado e %.2f\nA area do retangulo e %.2f", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetagulo);

        sc.close();
    }
}
