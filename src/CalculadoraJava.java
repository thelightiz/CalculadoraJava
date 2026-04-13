import java.util.Scanner;
public class CalculadoraJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá! Selecione a operação matemática a ser feita:\n" +
                " 1 - Adição\n" +
                " 2 - Subtração\n" +
                " 3 - Multiplicacão\n" +
                " 4 - Divisão\n");
        int escolha = scanner.nextInt();

        if (escolha > 4 || escolha < 1) {
            System.out.println("Digite um número de 1-4...");
            System.exit(1);
        }

        System.out.println("Escolha o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Escolha o segundo número: ");
        int numero2 = scanner.nextInt();

        if (escolha == 1) {
            int calculo = (numero1 + numero2);
            System.out.println("O resultado desta adição é " + calculo);
        } else if (escolha == 2) {
            int calculo = (numero1 - numero2);
            System.out.println("Esta subtração tem como resultado: " + calculo);
        } else if (escolha == 3) {
            int calculo = (numero1 * numero2);
            System.out.println("Esta operação possui um resoltado de: " + calculo);
        }

        if (escolha == 4) {
            if (numero2 == 0) {
                System.out.println("Não é possível dividir por zero.");
                System.exit(1);
            } else {
                int calculo = (numero1 / numero2);
                System.out.println("O resultado desta divisão é de: " + calculo);
            }
        }
    }
}





