public class Rectangle {
    
    private Point psg; // point supérieur gauche
    private float lar; // largeur
    private float lon; //  longueur

    public Rectangle () {
        this.psg = new Point(0, 0);
        this.lar = 0;
        this.lon = 0;
    }

    public Rectangle (float x_psg, float y_psg, float lar, float lon) {
        this.psg = new Point(x_psg, y_psg);
        this.lar = lar;
        this.lon = lon;
    }

    public Point getPsg () { return this.psg; }
    public float getLar () { return this.lar; }
    public float getLon () { return this.lon; }

    public void setPsg (Point psg) { this.psg = psg; }
    public void setLar (float lar) { this.lar = lar; }
    public void setLon (float lon) { this.lon = lon; }

    public float perimetre () {
        return 2*(lar+lon);
    }

    public float surface () {
        return lar*lon;
    }

    public boolean equals (Rectangle r) {
        if ((this.psg).equals(r.psg) && this.lar == r.lar && this.lon == r.lon) {
            return true;
        }
        return false;
    }

    public String toString () {
        return "Rectangle [" + (this.psg).toString() + "," + this.lar + "," + this.lon + "]";
    }

    protected Object clone () {
        float x_clone = (this.psg).getX();
        float y_clone = (this.psg).getY();
        return new Rectangle(x_clone, y_clone, this.lar, this.lon);
    }

    public static float perimetre (Rectangle r) {
        return (r.lar + r.lon) * 2;
    }

    public static float surface (Rectangle r) {
        return r.lar * r.lon;
    }

    public boolean estDans (Point p) {
        // il faut que le signe de l'abcisse et de l'ordonne du psg et
        // du point p soient idantiques (pour eviter les problemes d'orientation des axes)
        // la distance entre le psg et p doit etre <= lar et <= lon pour que p soit dans 
        // le rectangle

        double d = p.distance1(this.psg); // distance entre le psg et le point p
        if (d <= this.lar && d <= this.lon) return true;
        return false;
    }

    public boolean estInclus (Rectangle r) {
        // la lar et la lon du rectangle recepteur doit etre superieurs aux
        // parametre du rectangle "r"
        
        if (this.lar > r.lar && this.lon > r.lon) return true;
        return false;
    }

}
 