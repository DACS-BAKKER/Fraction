import java.util.Arrays;

public class FractionRunner {

    public static void main(String[] args) {
        Fraction[] fractions = new Fraction[4];
        fractions[0] = new Fraction(7, 4);
        fractions[1] = new Fraction(5, 4);
        fractions[2] = new Fraction(1, 4);
        fractions[3] = new Fraction(2, 7);

        Arrays.sort(fractions);

        for (Fraction s : fractions)
            System.out.println(s);
    }
}
