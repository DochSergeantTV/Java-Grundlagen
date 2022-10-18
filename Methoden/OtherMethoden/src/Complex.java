public class Complex {
    private double t1;
    private double t2;

    public Complex(double t1, double t2){
        sett1(t1);
        sett2(t2);
    }
    public Complex(Complex c){
        this.t1 = c.t1;
        this.t2 = c.t2;
    }
    public void sett1(double t1){
        this.t1 = t1;
    }
    public void sett2(double t2) {
        this.t2 = t2;
    }

    public double gett1() {
        return t1;
    }

    public double gett2() {
        return t2;
    }

    public String toString(){
        return t1 + "+ i*(" + t2 + ")";
    }

    public String getAbs(){
        if (this.t1 <= 0){
            this.t1 *=-1;
        }
        if (this.t2 <= 0){
            this.t2 *=-1;
        }
        return t1 + "+ i*(" + t2 + ")";
    }

    public void complexConjugate(){
        this.t2 = this.t2 * -1;
    }

    public Complex getComplexConjugate(){
        double t3 = t1;
        double t4 = t2 * -1;

        return new Complex(t3, t4);
    }

    public void add(Complex c){
        this.t1 = this.t1 + c.t1;
        this.t2 = this.t2 + c.t2;
    }

    public void mult(Complex c){
        this.t1 = (this.t1* c.t1 - this.t2*c.t2);
        this.t2 = (this.t1*c.t2 + c.t1* this.t2);
    }
}
