package Return;

public class Quadrilatero {

    public static double area(double lado) {

        System.out.println(" Área do quadrado: " + lado * lado);
        return lado;
    }

    public static double area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
        return lado1;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do triângulo: " + ((baseMaior+baseMenor)*altura) / 2);
        return baseMaior;
    }
    
}
