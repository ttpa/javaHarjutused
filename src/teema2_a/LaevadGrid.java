package teema2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 30.10.15.
 */
public class LaevadGrid {

    private static int[][] laud;
    static int lauaLaius = 3;
    static int lauaKorgus = 3;
    static Scanner sc = new Scanner(System.in);

    public static  void  main(String[] args) {
        //genereeri laud();
        //paiguta laevad();
        //kysi kasutajalt();
        //kysi tabamust();
        //kasOnLaevuAlles();
        //gameover();

    }

    private static void kontrolliTabamust(int[] xy) {
        if (laud[xy[0]][xy[1]] == 0) {
        } else if (tabamus == 1) {
            laud[xy[0]][xy[1]] = 2;
        }

    }

    private  static  void  kysiKasutajalt() {
        System.out.println("Sisesta x ja y kordinaadid (tühik vahel)");
        String sisestus = sc.nextLine(); //5 6
        char a ='2';
        int x = Integer.parseInt( sisestus.substring(0, 1));
        int y = Integer.parseInt( sisestus.substring(2, 3));
        // int y = (int) sisestus.charAt(2);

    }

    public static void  paigutaLaevad() {
        for (int i = 0; i < lauaKorgus; i++){
            for (int j = 0; j < lauaLaius; j ++){
                laud[i][j] = (int) Math.round(Math.random());
            }
            System.out.println( Arrays.toString(laud[i]));
        }

    }
    public static void genereerilaud() {
        //System.out.println("Jah, käivitan");
        laud = new int[lauaKorgus][lauaLaius];
    }

}
