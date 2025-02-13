public class Client {
    
    private String nom;
    private String adresse;
    private Compte [] tab;
    private int libre; // indique la 1er position libre de tab

    public Client () {
        this.nom = null;
        this.adresse = null;
        this.tab = new Compte [3];
        this.libre = 0;
    }

    public Client (String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.tab = new Compte [3];
        this.libre = 0;
    }

    public String getNom () { return this.nom; }

    public String getAdresse () { return this.adresse; }

    public void setnom (String nom) { this.nom = nom; }

    public void setAdresse (String adresse) { this.adresse = adresse; }

    public boolean estPlein () {
        if (this.libre == 3) return true;
        return false;
    }

    public boolean AjoutCompte (Compte c) {
        if (!(this.estPlein())) {
            this.tab[this.libre] = c;
            this.libre++;
            return true;
        }
        return false;
    }

    public float getSoldeCpt_1 () { return this.tab[0].getSolde(); }
    public float getSoldeCpt_2 () { return this.tab[1].getSolde(); }
    public float getSoldeCpt_3 () { return this.tab[2].getSolde(); }

    public float getSoldeCumuler () { // meme avec le boucle for, ca marche
        return this.tab[0].getSolde() + this.tab[1].getSolde() + this.tab[2].getSolde();

    }

    public int nbrCpt_cheque_client () {
        int nbr = 0;
        for (int i = 0; i < 3; i++) {
            if (this.tab[i] instanceof Compte_cheque) {
                nbr++;
            }
        }
        return nbr;
    }

    public int nbrCpt_epargne_client () {
        int nbr = 0;
        for (int i = 0; i < 3; i++) {
            if (this.tab[i] instanceof Compte_epargne) {
                nbr++;
            }
        }
        return nbr;
    }

    public boolean equals (Client cl) {
        if (this.nom.equals(cl.nom)) return true; // ou this.nom == cl.nom
        return false;
    }

    protected Object clone () {
        Client cl = new Client(this.nom, this.adresse);
        for (int i = 0; i < 3; i++) {
            cl.AjoutCompte(this.tab[i]);
        }
        return cl;
    }

}
