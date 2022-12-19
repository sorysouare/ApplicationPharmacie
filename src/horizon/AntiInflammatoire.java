package horizon;

public class AntiInflammatoire extends Medicament implements Remboursable{
    protected String molecule;
    protected int acidite;

    public AntiInflammatoire() {
        super();
        this.molecule="";
        this.acidite=0;
    }

    @Override
    public double calculTaxeAppliquee() {
        if (molecule.equals("steroidien"))
            return (prix*0.1);
        return (prix*0.15);
    }

    public AntiInflammatoire(String lib, int ref, float prix, String date, String molecule, int acidite) {
        super(lib, ref, prix, date);
        this.molecule = molecule;
        this.acidite = acidite;
    }

    @Override
    public double remboursement() {
        
        return (prix*0.8);
    }

    @Override
    public String toString() {
        return (super.toString()+" Type molecule "+this.molecule+" acidité "+this.acidite+" rembourcements ="+remboursement());
    }
}
