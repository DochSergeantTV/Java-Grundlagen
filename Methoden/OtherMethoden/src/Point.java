public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "(" + x + "|" + y + ")";
    }

    public void translate(double dx, double dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
}
