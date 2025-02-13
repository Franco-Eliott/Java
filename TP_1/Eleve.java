public class Eleve {
    
    public String nom;
    private int math;
    private int phy;
    private int fra;
    private int ang;
    private int matricule;
    private static int nbrCreation = 0;

    public Eleve (String nom) {
        this.nom = nom.toUpperCase();
        this.math = 0;
        this.phy = 0;
        this.fra = 0;
        this.ang = 0;
        this.matricule = nbrCreation;
        nbrCreation++;
    
    }
    public Eleve (String nom, int math, int phy, int fra, int ang) {
        this.nom = nom.toUpperCase();
        this.math = math;
        this.phy = phy;
        this.fra = fra;
        this.ang = ang;
        this.matricule = nbrCreation;
        nbrCreation++;
    }

    public void setMath (int note) { this.math = note; }
    public void setPhy (int note) { this.phy = note; }
    public void setFra (int note) { this.fra = note; }
    public void setAng (int note) { this.ang = note; }
    public int getMatricule () { return this.matricule; }

    public String toString () {
        return "Eleve " + this.nom + " No_ " + this.matricule + " [ math " + this.math + ", phy " + this.phy + ", fra " + this.fra + ", ang " + this.ang + "]";
    }

    public float moyenne () {
        return (this.math + this.phy + this.fra + this.ang) / 4;
    }

    public boolean equals (Eleve e) {
        if (this.matricule == e.matricule) return true;
        return false;
    }

    protected Object clone () {
        return new Eleve (this.nom, this.math, this.phy, this.fra, this.ang);
    }

}
