public class Compte {

    private static int numero = 1;
    private float solde;

    public Compte () {
        this.solde = 0;
        this.numero = numero;
        numero++;
    }

    // public Compte (int montant) { // n'est pas dans l'exo
    //     this.solde = montant;
    //     this.numero = numero;
    //     numero++;
    // }

    public void crediter (float montant) { // retirer de l'argent
        this.solde = this.solde - montant;
    }

    public void debiter (float montant) {
        this.solde = this.solde + montant;
    }

    public float getSolde () { return this.solde; }
    
    public int nbrCpt () { return numero - 1; }
    
    protected Object clone () {
        Compte c = new Compte();
        c.solde = this.solde;
        return c;
    }

    public String toString () {
        return "Compte "+ this.numero + "Solde = " + (this.solde);
    }
}
