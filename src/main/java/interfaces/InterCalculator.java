package interfaces;

import anotations.Cachable;

public interface InterCalculator {

    @Cachable(persistent = true)
    int fibonachi(int index);

    double multip(double mulp1, double mulp2);

    double sum(double num1, double num2);
}
