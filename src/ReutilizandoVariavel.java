public class ReutilizandoVariavel {
    public static void main(String[]args) {
        int primeiraporcentagem=30;

        int segundaporcentagem=15;

        int terceiraporcentagem=5;

        double salario= 13450d;

        double calculo= salario * (primeiraporcentagem / 100d);

        System.out.println("30% de " + salario +  " é igual a " + calculo);

        calculo= salario * (segundaporcentagem / 100d);
        System.out.println("15% do seu salário que é de " + salario + " é igual a " + calculo);

        calculo= salario * (terceiraporcentagem / 100d);
        System.out.println("5% do seu salário é de " + calculo);
    }
}
