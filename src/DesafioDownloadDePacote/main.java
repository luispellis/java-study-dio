package DesafioDownloadDePacote;
import java.util.Scanner;

/*

        Você foi contratado para criar um gerenciador de pacotes. Porém, o que restou para você
        fazer foi o contador de porcentagem de download dos pacotes. Mas como o espaço para essa
        informação ficou pequeno, a empresa optou por fazer uma escala de 10 – 1. Então a escala
        será 1 = 10%,  3 = 30% e et2 = 20%,c.

        Para cada 10% de download, o programa deve printar, em sequência e sem espaços,
        uma barra “/”.

        Entrada: A entrada será um número que representará a porcentagem.

        Saída: A saída serão as barras sem espaços entre elas.

 */

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int valor = scan.nextInt();
        for(int i = valor; i <= 10; i++){

            System.out.println(i);
        }



    }
}
