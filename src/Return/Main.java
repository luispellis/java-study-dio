package Return;

/*

    Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. Agora faça os metódos
    retornarem valores.


 */


import ExercicioSobrecarga.Quadrilatero;

public class Main {

    public static void main(String[] args) {

        // Quadrilatero
        System.out.println(" Exercicio Quadrilátero ");
        ExercicioSobrecarga.Quadrilatero.area(3);
        ExercicioSobrecarga.Quadrilatero.area(5d, 5d);
        ExercicioSobrecarga.Quadrilatero.area(7, 8, 9);
        Quadrilatero.area(5f, 5f);

    }

}
