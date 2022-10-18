public class EvenNumber {
    private int number;

    public EvenNumber(int number){
        setNumber(number);
    }

    public EvenNumber(EvenNumber e){
        this.number = e.number;
    }
    public void setNumber(int number) {
        if ((number%2) == 0){
            this.number = number;
        } else this.number = number - 1;

    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return String.valueOf(number);
    }

    public EvenNumber getNext(){
        int buffer = this.number;
        if ((buffer%2) == 0 ){
            buffer += 2;
        }else buffer += 1;
        return new EvenNumber(buffer);
    }

    public EvenNumber getSum(EvenNumber e2){
        return new EvenNumber(this.number + e2.number);
    }

    public EvenNumber getProd(EvenNumber e2){
        return new EvenNumber(this.number * e2.number);
    }
}
