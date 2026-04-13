public class CalculoPorcentagem {
    public static void main (String[]args) {
        double salario = 1230.10d;
        double porcentagem = 50d;
        double calculo= salario * (porcentagem/100d);
        System.out.println("50% do seu salário é équivalente a " + calculo);
    }
}
