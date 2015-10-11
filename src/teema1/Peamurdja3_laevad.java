package teema1;

//import ...
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args) {
        Scanner kasutaja = new Scanner(System.in);
        System.out.println("Sisesta laua suurus");
        int sisestus = kasutaja.nextInt();
//        int hit = laud[sisestus];

//        int lauasuurus = 5;  /fix lauasuuruse määramine
        int[] laud;
        laud = new int[sisestus];
//        laud = new int[lauasuurus];
//        int laud[] = new int[5]
//        int[] laud = [];
//        int[] laud = {0,1,1,0,0,1,0,0,1};
//        System.out.println(Arrays.toString(laud));

        Random randomGenerator = new Random();
//        for (int idx = 0; idx < lauasuurus; ++idx){
        for (int idx = 0; idx < sisestus; ++idx){
            int randomInt = randomGenerator.nextInt(2);
//            log("Generated : " + randomInt);
            laud[idx] = randomInt;
            System.out.println(laud[idx]);
        }
//if ("success" != statusCheck.intern())
//if (!"success".equals(statusCheck))


            for (int idx = 0; idx < sisestus; ++idx) {
//            if (laud[idx] != 1) {
                Scanner pakutudPositsioon = new Scanner(System.in);
                System.out.println("Paku positsioon:");
                int positsioonx = pakutudPositsioon.nextInt();
                System.out.println(positsioonx);
                System.out.println(laud[positsioonx]);

                /**
                if ((laud[idx]) != 1) {


                    if (laud[positsioonx] == 0) {
                        laud[positsioonx]=3;
                        System.out.println("Mööda !!");
                    }

                    if (laud[positsioonx] == 1) {
                        laud[positsioonx]=2;
                        System.out.println("Põhjas !!");
                    }

                    if (laud[positsioonx] == 3) {
                        System.out.println("Oled seda positsiooni juba küsinud - oli mööda !!");
                    }

                    if (laud[positsioonx] == 2) {
                        System.out.println("Oled seda positsiooni juba küsinud - oli Pihtas !!");
                    }

                }

                else {
                System.out.println("Mäng on lõppenud !!");
                System.exit(1);
                }
**/

                switch (positsioonx) {
                    case 0:
                        laud[positsioonx]=3;
                        System.out.println("Mööda !!");
                        break;
                    case 1:
                        laud[positsioonx]=2;
                        System.out.println("Põhjas !!");
                        break;
                    case 2:
                        System.out.println("Oled seda positsiooni juba küsinud - oli mööda !!");
                        break;
                    case 3:
                        System.out.println("Oled seda positsiooni juba küsinud - oli Pihtas !!");
                    default:
                        System.out.println("Mäng on lõppenud !!");
                        System.exit(1);

                        break;
                }

            }



//        System.out.println(laud[3]);
//        System.out.println("kontrollin");

    }
}
