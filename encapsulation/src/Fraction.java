public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.setNumerator(numerator);
        if (denominator <= 0)
            throw new IllegalArgumentException("denominator must be positive");
        this.setDenominator(denominator);
    }


    private int getNumerator() {
        return numerator;
    }

    private void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    private int getDenominator() {
        return denominator;
    }

    private void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public Fraction sum(Fraction fraction) {
        int x = numerator * fraction.getDenominator() + fraction.getNumerator() * denominator;
        int y = denominator * fraction.getDenominator();
        while (x % 2 == 0 && y % 2 == 0) {
            x = x / 2;
            y = y / 2;
        }
        while (x % 3 == 0 && y % 3 == 0) {
            x = x / 3;
            y = y / 3;
        }
        while (x % 5 == 0 && y % 5 == 0) {
            x = x / 5;
            y = y / 5;
        }
        while (x % 7 == 0 && y % 7 == 0) {
            x = x / 7;
            y = y / 7;
        }
        return new Fraction(x, y);

    }

    public Fraction minus(Fraction fraction) {
        int x = numerator * fraction.getDenominator() - fraction.getNumerator() * denominator;
        int y = denominator * fraction.getDenominator();
        while (x % 2 == 0 && y % 2 == 0) {
            x = x / 2;
            y = y / 2;
        }
        while (x % 3 == 0 && y % 3 == 0) {
            x = x / 3;
            y = y / 3;
        }
        while (x % 5 == 0 && y % 5 == 0) {
            x = x / 5;
            y = y / 5;
        }
        while (x % 7 == 0 && y % 7 == 0) {
            x = x / 7;
            y = y / 7;
        }
        return new Fraction(x, y);

    }

    public Fraction sum(int i) {
        int x = numerator  + i * denominator;
        int y = denominator;
        return new Fraction(x, y);

    }

    public Fraction minus(int i) {
        int x = numerator  - i * denominator;
        int y = denominator;
        return new Fraction(x, y);

    }
    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }
}
