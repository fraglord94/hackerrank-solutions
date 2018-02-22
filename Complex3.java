/**
 * Created by Aronee Dasgupta on 9/19/2017.
 */
public class Complex3 {

    private double num;
    private double den;

    public Complex3(double num, double den) {
        this.num = num;
        this.den = den;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getDen() {
        return den;
    }

    public void setDen(double den) {
        this.den = den;
    }

    public static void main(String[] args) {
        Complex3 n1 = new Complex3(2, 3);
        Complex3 n2 = new Complex3(4,5);



    }
}
