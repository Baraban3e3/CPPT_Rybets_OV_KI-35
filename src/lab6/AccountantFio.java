package lab6;

import java.io.*;
import java.util.Scanner;

public class AccountantFio {
    private double result;
    private String BINARY_FILE_PATH;
    private String TXT_FILE_PATH;
    public void writeResTxt(String fName) throws FileNotFoundException
    {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }

    /**
     * Method implements read from file
     * @param fName
     */
    public void readResTxt(String fName)
    {
        try
        {
            File f = new File (fName);
            if (f.exists())
            {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            }
            else
                throw new FileNotFoundException("File " + fName + "not found");
        }
        catch (FileNotFoundException ex)
        {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Method implements write to bin file
     * @param fName
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException
    {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();

    }

    /**
     * Method implements read from bin file
     * @param fName
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * Method calculates the tg(x)/ctg(x) expression
     * @param x - angle in degrees
     * @throws CalcException
     */
    public double calculator(double x) throws lab5.CalcException {
        double rad = 0;
        double rad2 = 0;
        try {
            rad = Math.toRadians(7*x-1);
            rad2 = Math.toRadians(x);
            result = (1/Math.tan(rad2))/Math.sin(rad);
            if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {

            if (rad==Math.PI/2.0 || rad==-Math.PI/2.0)
                throw new lab5.CalcException("Exception reason: Illegal value of X for tangent calculation");
            else if (x==0)
                throw new lab5.CalcException("Exception reason: X = 0");
            else
                throw new lab5.CalcException("Unknown reason of the exception during exception calculation");
        }
        return result;
    }

    public double getResult()
    {
        return result;
    }

}


