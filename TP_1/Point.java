// public package TP_1;

class Point {

    private float x;
    private float y;

    public Point (float a, float b) {
        this.x = a;
        this.y = b;
    }

    private Point (float a) {
        this(a, a);
    }

    public float getX () { return this.x; }
    public float getY () { return this.y; }
    public void setX (float a) { this.x = a; }
    public void setY (float b) { this.y = b; }


    public String toString () {
        return "(" + this.x + "," + this.y + ")"; 
    }

    private void presenteToi () {
        System.out.println(this);
    }

    public double distance1 (Point p) {
        double a = Math.pow ((this.x - p.x), 2);
        double b = Math.pow ((this.y - p.y), 2);
        return Math.sqrt(a - b);
    }

    public double distance2 (Point p1, Point p2) {
        double a = Math.pow ((p1.x - p2.x), 2);
        double b = Math.pow ((p1.y - p2.y), 2);
        return Math.sqrt(a - b);
    }

    public Point milieu1 (Point p) {
        float mx = (this.x + p.x)/2;
        float my = (this.y + p.y)/2;
        return new Point(mx, my);
    }

    public Point milieu2 (Point p1, Point p2) {
        float mx = (p1.x + p2.x)/2;
        float my = (p1.y + p2.y)/2;
        return new Point(mx, my);
    }

    boolean equals (Point p) {
        if (this.x == p.x && this.y == p.y) return true;
        return false;
    }

    public Object clone () {
        return new Point(this.x, this.y);
    }
}