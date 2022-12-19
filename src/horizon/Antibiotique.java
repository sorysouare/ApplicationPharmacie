package horizon;

public class Antibiotique extends Medicament implements Remboursable{
    protected String bacterie;

    public Antibiotique() {
        super();
        this.bacterie="";
    }

    @Override
    public double calculTaxeAppliquee() {
        if (bacterie.equals("thermophyle")){
            return (prix*0.1);
        } if (bacterie.equals("mesophyle")) {
            return (prix*012);
        }
        return (prix*0.15);
    }

    public Antibiotique(String lib, int ref, float prix, String date, String bacterie) {
        super(lib, ref, prix, date);
        this.bacterie = bacterie;
    }

    @Override
    public double remboursement() { 
        return (prix*0.9);
    }

    @Override
    public String toString() {
        return (super.toString()+" Type de Bacterie "+this.bacterie+" Remboursement "+remboursement());
    }
}
