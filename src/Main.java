import horizon.*;

public class Main {
    public static void main(String[] args) {
        Medicament med[]=new Medicament[5];


        med[0]=new Antibiotique("Clamoxyl 500",4432, 5910, "18/02/2010", "thermophyle");
        med[1]=new Antibiotique( "Augmentin", 4433, 7850,"14/11/2010", "thermophyle");
        med[2]=new AntiInflammatoire("Maxilase" ,4434, 3880, "28/04/2010", "steroïdien",8);
        med[3]=new AntiInflammatoire("Slupred" ,4436, 13980, "28/04/2010", "steroïdien",6);
        med[4]=new Homeopatique("oscillococcinum" ,4435, 8750, " 23/12/2010", "saccharose");

        for (int i = 0; i < med.length ; i++)
            System.out.println(med[i]);
        System.out.println("****************************** Apres la valeur de taxe appliquée *******************************");
        for (int i = 0; i < med.length ; i++) {
            System.out.println(med[i]);

        }
        Pharmacie pharmacie= new Pharmacie();
        pharmacie.addMed(med[0]);
        pharmacie.addMed(med[1]);
        pharmacie.addMed(med[2]);
        pharmacie.addMed(med[3]);
        pharmacie.addMed(med[4]);

        System.out.println(""+
                "**************************Search Medicament**********************************");
        pharmacie.search(4432);
        pharmacie.search(4436);
        System.out.println(""+
                "************************** Remove Medicament**********************************");
        pharmacie.remove(4432);
        System.out.println(""+
                "**************************Search Medicament**********************************");
        pharmacie.affichage("antibiotique");
    }
}