public class Cercle {
    
    public static final float PI=(float) 3.14; // Constance de classe

    private Point centre;
    private float rayon;

    public Cercle (float x, float y, float ray) {
        this.centre = new Point(x, y);
        this.rayon = ray;
    }

    public Cercle (float x, float ray) {
        this.centre = new Point(x, x);
        this.rayon = ray;
    }

    public Cercle (Point centre, float ray) {
        this.centre = centre;
        this.rayon = ray;
    }

    float getRayon () { return this.rayon; }
    Point getCentre () { return this.centre; }
    void setRayon (float ray) { this.rayon = ray; }
    void setCentre (Point centre) { this.centre = centre; }
    void setCentre (float a, float b) {
        this.centre.setX(a);
        this.centre.setY(b);
    }

    public String toString () {
        return "[" + (this.centre).toString() + "," + this.rayon + "]";
    }

    public float perimetre () {
        return PI * this.rayon * 2;

    }

    public float perimetre (Cercle c) {
        return PI * c.rayon * 2;
    }

    public float surface () {
        return PI * this.rayon * this.rayon;
    }

    public float surface (Cercle c) {
        return PI * c.rayon * c.rayon;
    }

    public boolean surLeCercle (Point p) {
        if (p.distance1(this.centre) == this.rayon) return true;
        return false;
    }

    public boolean dansLeCercle (Point p) {
        if (p.distance1(this.centre) <= this.rayon) return true;
        return false;
    }

    public boolean equals (Cercle c) {
        if (this.rayon == c.rayon && this.centre.equals(c.centre) == true) return true;
        return false;
    }

    protected Object clone () {
        return new Cercle(this.centre, this.rayon);
    }

}
