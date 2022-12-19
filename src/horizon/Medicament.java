package horizon;

public abstract class Medicament {
    protected String libelle;
    public int reference;
    protected float prix;
    protected String dateFabrication;

    public Medicament(){

    }
    public Medicament(String lib, int ref, float prix, String date){
        this.libelle=lib;
        this.reference=ref;
        this.prix=prix;
        this.dateFabrication=date;
    }

    @Override
    public String toString() {
        return ("Le médicament est de libelle "
        +this.libelle+" de référence "
        +this.reference+" de prix "+this.prix+" et la date de fabrication "
        +this.dateFabrication);
    }
    public abstract double calculTaxeAppliquee();

}
