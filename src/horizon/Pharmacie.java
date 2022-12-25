package horizon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pharmacie {
    Medicament[] medicament;
    protected int nbMedicament;

    public void addMed(Medicament med){
       medicament[nbMedicament]=med;
       nbMedicament++;
    }

     public int search(int ref){
        for (int i = 0; i < nbMedicament; i++){
            if (medicament[i].reference==ref) {
                System.out.println("La référence  existe  à la position :" + i);
                return i;
            }
        }
        System.out.println("La valeur recherchée n'existe pas");
        return -1;
    }

    public void remove( int ref){
        int indice = search(ref);
        if(indice!=-1){
            for (int i = indice; i < nbMedicament-1; i++) {
                medicament[i]=medicament[i+1];
                System.out.println(medicament[i]);
            }
        }
        System.out.println("La référence du médicament "+ref+" est supprimée");
    }
    public Pharmacie() {
        nbMedicament=0;
        medicament= new Medicament[10];
    }

    public Pharmacie(Medicament[] medicament, int nbMedicament) {
        this.medicament = medicament;
        this.nbMedicament=nbMedicament;
    }

    public void display(String type){
        if (type.equals("antibiotique")) {
            System.out.println("------------- Display des Antibiotiques ----------------");
            for (int i = 0; i <nbMedicament; i++) {
                if (medicament[i] instanceof Antibiotique) {
                    System.out.println(medicament[i]);
                }
            }
        }
        if (type.equals("antiInflammatoire")) {
            System.out.println("------------- Display des AntiInflammatoire ----------------");
            for (int i = 0; i <nbMedicament; i++) {
                if (medicament[i] instanceof AntiInflammatoire) {
                    System.out.println(medicament[i]);
                }
            }
        }
        if (type.equals("homeopatique")) {
            System.out.println("------------- Display the Homeopatique ----------------");
            for (int i = 0; i <nbMedicament; i++) {
                if (medicament[i] instanceof Homeopatique) {
                    System.out.println(medicament[i]);
                }
            }
        }
    }
}
