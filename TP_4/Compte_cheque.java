public class Compte_cheque extends Compte {

    private float valeurMaxDecouvert;

    private static int numero_cheque = 1;

    public Compte_cheque(float valeurMaxDecouvert) {
        super();
        this.valeurMaxDecouvert = valeurMaxDecouvert;
        this.numero_cheque = numero_cheque;
        numero_cheque++;
    }

    public float getValeurMaxDecouvert() {
        return this.valeurMaxDecouvert;
    }

    public void setValeurMaxDecouvert(int valeurMaxDecouvert) {
        this.valeurMaxDecouvert = valeurMaxDecouvert;
    }

    public static int nbrCpt_cheque() {
        return numero_cheque - 1;
    }

    public String toString () {
        return "Compte_Cheque " + "numero_cheque = " + this.numero_cheque +  "valeurMaxDecouvert = " + this.valeurMaxDecouvert + this.toString();
    }

}
