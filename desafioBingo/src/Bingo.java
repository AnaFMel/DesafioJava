import java.util.Arrays;
import java.util.Random;

public class Bingo{
    public static void main(String[] args) {
        int[][] bingo = new int[5][5];
        boolean jaTem = false;
         int contador = 0;
        int numeroGerado = 0;
        int l;
            for (int c = 0; c < 5; c++) {
                for (l = 0; l < 5; l++) {
                    do {
                        numeroGerado = gerarNumero(c);
                        jaTem = jaTemOuNao(bingo, numeroGerado);
                        if (jaTem == true) {
                            continue;
                        }
                    } while (jaTem == true);
                    bingo[l][c] = numeroGerado;
                }
            }

        bingo[2][2] = 99;
        System.out.println("| B|| I|| N|| G|| O|");
        for (int l2 = 0; l2 < 5; l2++) {
            for (int c2 = 0; c2 < 5; c2++) {
                System.out.printf("|%2d|", bingo[l2][c2]);
            }
            System.out.println();
        }
    }



    private static boolean jaTemOuNao(int[][] bingo, int numeroGerado) {
        int l;
        for (int c = 0; c < 5; c++) {
            for (l = 0; l < 5; l++) {
                if (Arrays.asList(bingo[l][c]).contains(numeroGerado)){
                    return true;
                }
            }
        }
        return false;
    }
    private static int gerarNumero(int c) {
        Random geradorAleatorio = new Random();
        int numeroAleatorio = 0;
        switch (c) {
            case 0:
                numeroAleatorio = geradorAleatorio.nextInt(1, 16);
                break;
            case 1:
                numeroAleatorio = geradorAleatorio.nextInt(16, 31);
                break;
            case 2:
                numeroAleatorio = geradorAleatorio.nextInt(31, 46);
                break;
            case 3:
                numeroAleatorio = geradorAleatorio.nextInt(46, 61);
                break;
            case 4:
                numeroAleatorio = geradorAleatorio.nextInt(61, 76);
                break;
        }
        return numeroAleatorio;
    }

}