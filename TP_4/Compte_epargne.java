public class Compte_epargne extends Compte {
    
    private static float tauxInteretJournalier;

    private static int numero_epargne = 1;

    public Compte_epargne (float tauxInteretJournalier) {
        super();
        this.tauxInteretJournalier = tauxInteretJournalier;
        this.numero_epargne = numero_epargne;
        numero_epargne++;
    }

    public float getTauxInteretJournalier () {
        return this.tauxInteretJournalier;
    }

    public void setTauxInteretJournalier (float newtauxInteretJournalier) {
        this.tauxInteretJournalier = newtauxInteretJournalier;
    }

    public void AjoutInteret (Compte_epargne ce) {
        float interet = ce.getSolde() * tauxInteretJournalier;
        ce.debiter(interet);
    }

    public static int nbrCpt_epargne () {
        return numero_epargne - 1;
    }

    public String toString () {
        return "Compte_Epargne " + "numero_epargne = " + this.numero_epargne +  "tauxInteretJournalier = " + this.tauxInteretJournalier + this.toString();
    }

}
