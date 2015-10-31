import java.util.Scanner;


public class Viktoriin {
    // Mängijate arv - kaks mängijat
    // Mängitakse voorude kaupa , iga vooru kohta määratakse vastuste algustäht.
    // Mängijad täidavad tabeli kirjutades vastavatesse lahtritesse puu , linnu
    // , lille , linna
    // ja looma nime.
    //
    // Kui vastus on sama , mis vastasmängijal , siis saadakse 5 punkti ,
    // Juhul kui erinev , siis 10 punkti.Kui vastus puudub või vale vastus ,
    // siis 0 punkti.
    //
    /**
     * @param args
     */
    public static void main(String[] args) {

		/*
		 * Collection < "string" > string1 puu(akaatsia) lind
		 * (aul)lill(asalea)linn(antverpen)loom(ahv) Collection string2
		 * puu1(akaatsia) lind1() lind (alk) lill(alpi jänesekäpp)
		 * linn(aberdeen)loom(); if string1 == string2 give 5 pts else if string
		 * ==
		 */
        // String[] tahestik = {"a","b","c","d","e",};
        // String[] kysimus = {"puu","lind","lill","linn","loom"};
        // Loon massiivi tähestik
        String[] tahestik = { "a", "b" };
        // loon massivi Küsimuste loend
        String[] kysimus = { "puu", "lind" };
        // Loon massiivi Võistlejate arv
        int voistlejaid = 2;
        // Võistlejate Vastuste väljatrükkimine vastavalt valitud tähele
        String[][][] vastused = new String[tahestik.length][voistlejaid][kysimus.length];
        // for-tsükli abil liigutakse piki tähestikku alustades a-tähest
        Scanner in = new Scanner(System.in);
        for (int a = 0; a < tahestik.length; a++) {

            System.out.println("taht on  " + tahestik[a]);

            for (int v = 0; v < voistlejaid; v++) {

                System.out.println("Võistleja nr  " + v);

                for (int k = 0; k < kysimus.length; k++) {

                    System.out.println("Kirjuta " + kysimus[k] + " "
                            + tahestik[a] + "-tähega");
                    String vastus = in.nextLine();

                    vastused[a][v][k] = vastus;

                }

            }

        }

        // Vastuste väljaprintimine võistlejate kaupa
        System.out.println("VASTUSED:");
        for (int v = 0; v < voistlejaid; v++) {
            String voistlejaVastused = "";
            System.out.println("Võistleja nr  " + v);

            for (int a = 0; a < tahestik.length; a++) {
                voistlejaVastused += "\n" + tahestik[a] + ":";
                for (int k = 0; k < kysimus.length; k++) {
                    voistlejaVastused += " " + vastused[a][v][k];
//Loon massiivid võislejate 0 ja 1 vastused


                    //* String [] m;                       // massiivi kirjeldamine

                    //m = new String [10];               // mälu reserveerimine massiivile

                    // System.out.println (m.length);  // massiivi pikkuse väljastamine

                    // m[0] = voistlejaVastused;                       // omistamine elemendile indeksiga 0
                    //  m[1] = voistlejaVastused;

                    // massiivi väljastamine for-tsükli abil
                    // for (int i=0; i<m.length; i++)
                    //  System.out.print (String.valueOf (m[i]) + " ");
                    System.out.println();

                    //string[] voistleja 0 vastused = { "vastus 1" , "vastus2" };
                    //string[] voistleja 1 vastused = { "vastus1" , "vastus2"[][]};


                }
            }

            System.out.println(voistlejaVastused);
        }
        //if voistleja  0 "vastus 1" equals voistleja 1 "vastus 1"
        class massiivid {
            //public  void name("voistlejaVastused"); {

        }
    }//string [][] voistlejaVastused




    // TODO Auto-generated method stub

}// main

// class
