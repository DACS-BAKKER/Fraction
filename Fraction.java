public class Fraction implements Comparable<Fraction> {

    private int numerator;
    private int denominator;

    public Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public int compareTo(Fraction f) {
        return (numerator - f.numerator);
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }

    public String toString() {
        return (numerator + "/" + denominator);
    }

}
