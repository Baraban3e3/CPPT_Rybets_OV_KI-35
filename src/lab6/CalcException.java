package lab6;

public class CalcException extends ArithmeticException {
    public CalcException() {
    }

    /**
     * Constructor with string
     * @param cause
     */
    public CalcException(String cause)
    {
        super(cause);
    }
}


