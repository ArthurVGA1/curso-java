import java.util.Scanner;

public class exercicio04 {
    /* Fazer um programa que leia o número de um funcionário, 
    seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, 
    mostre o número e o salário do funcionário, com duas casas
    decimais. */

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String idFuncionario;
        double horas, salarioHora, salarioTotal;

        System.out.println("Informe seu id de funcionario, suas horas trabalhadas no mes e o valor do seu salario hora:");
        idFuncionario = sc.nextLine();
        horas = sc.nextDouble();
        salarioHora = sc.nextDouble();
        salarioTotal = horas * salarioHora;

        System.out.println("Funcionario: " + idFuncionario);
        System.out.printf("O valor a ser recibido esse mes e R$%.2f", salarioTotal);

        sc.close();
    }
}
