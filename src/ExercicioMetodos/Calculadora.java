package ExercicioMetodos;

public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A Soma de " + numero1 + " mais " + numero2 + " é de: " + resultado);
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A Subtração de " + numero1 + " menos " + numero2 + " é de: " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A Multiplicação de " + numero1 + " vezes " + numero2 + " é de: " + resultado);
    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A Divisão de " + numero1 + " dividido por " + numero2 + " é de: " + resultado);
    }

}
