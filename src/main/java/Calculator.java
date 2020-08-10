import interfaces.InterCalculator;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator implements InterCalculator {

    @Override
    public int fibonachi(int index) {
        final double SQRT5 = sqrt(5);
        final double PHI = (SQRT5 + 1)/2;
        if (index <= 0) {
            return 0;
        }
        else if (index == 1 || index == 2) {
            return 1;
        }
        else {
            return (int)(pow(PHI, index) / SQRT5 + 0.5);
        }
    }

    @Override
    public double multip(double mulp1, double mulp2) {
        return mulp1*mulp2;
    }

    @Override
    public double sum(double num1, double num2) {
        return num1+num2;
    }
}
