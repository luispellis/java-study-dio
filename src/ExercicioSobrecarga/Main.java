package ExercicioSobrecarga;

/*

                        Exercitando


       Crie uma aplicação que calcular a área dos 3 quadriláteros notáveis:


            Quadrado
            Retângulo
            Trapézio

        OBS: Use Sobrecarga.

 */

public class Main {

    public static void main(String[] args) {

        // Quadrilatero
        System.out.println(" Exercicio Quadrilátero ");
        Quadrilatero.area(3);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

    }
}
