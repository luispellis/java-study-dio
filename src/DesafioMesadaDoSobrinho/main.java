package DesafioMesadaDoSobrinho;

/*

    Seu sobrinho começou a ganhar mesada dos pais. No auge dos seus 8 anos
    recebendo 50 reais por mês, ele quer saber quanto terá se juntar todo o dinheiro,
    sem gastar nada, durante alguns meses. E você, como um bom tio com habilidades de
    programação, vai criar um programa que com as entradas do seu sobrinho vai calcular
    automaticamente a quantidade de dinheiro que ele terá em X meses.


    Entrada: A entrada será o número de meses que o sobrinho polpará o dinheiro.

    Saída: A saída deve ser o valor que o sobrinho terá ao final dos meses. (sem as aspas)


 */


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mesada = 50;


        int meses = scan.nextInt();

        int resultado = meses * mesada;
        System.out.println(resultado);

    }
}
