package horizon;

public class Homeopatique extends Medicament{
    protected String plante;

    public Homeopatique() {
        super();
        this.plante=" ";
    }

    @Override
    public double calculTaxeAppliquee() {
        return (prix*0.2);
    }

    public Homeopatique(String lib, int ref, float prix, String date, String plante) {
        super(lib, ref, prix, date);
        this.plante = plante;
    }

    @Override
    public String toString() {
        return (super.toString()+" La plante est :"+this.plante);
    }
}
