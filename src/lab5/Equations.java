package lab5;

public class Equations {

    /**
     * Method calculates the ctg(x)/sin(7x-1)  expression
     * @param x Angle in degrees
     * @throws CalcException
     */
    public double calculator(int x) throws CalcException {
        double rad = 0;
        double rad2 = 0;
        double result;
        try {
            rad = Math.toRadians(7*x-1);
            rad2 = Math.toRadians(x);
            result = (1/Math.tan(rad2))/Math.sin(rad);
            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {

            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (x==0)
                throw new CalcException("Exception reason: X = 0");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return result;
    }
}
