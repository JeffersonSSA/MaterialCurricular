import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora simples!");

        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Selecione a operação que deseja realizar:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = input.nextInt();

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        System.out.println("O resultado da operação é: " + resultado);

        input.close();
    }

}
