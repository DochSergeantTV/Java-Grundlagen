public class Grade {
    private float number;

    public Grade(float number){
        setNumber(number);
    }

    public Grade(Grade g){
        this.number = g.number;
    }
    public void setNumber(float number) {
        if (number == 1.0 || number == 1.3 || number == 1.7 || number == 2.0 || number == 2.3 || number == 2.7 || number == 3.0 || number == 3.3 || number == 3.7 || number == 4.0 || number == 5.0){
            this.number = number;
        }
        else throw new IllegalArgumentException("Piss dich, falsche Zahl, gib ne gueltige Note ein");
    }

    public float getNumber() {
        return number;
    }

    public String toString() {
        return String.valueOf(number);
    }

    public boolean pass(){
        boolean buffer = false;
        if(this.number <= 4.0f) {
            buffer = true;
        }
        return buffer;
    }
}
