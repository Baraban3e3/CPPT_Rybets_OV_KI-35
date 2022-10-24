package lab6;

import java.io.IOException;
import java.util.Scanner;

public class EquationsApp {
    public static void main(String[] args) throws IOException {
        boolean IsCatched = true;
        AccountantFio obj = new AccountantFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        try
        {
            obj.calculator(data);
        }
        catch (CalcException ex)
        {
            IsCatched = false;
            System.out.println(ex.getMessage());
        }

        if(IsCatched) {
            System.out.println("Result is: " + obj.getResult());
            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");

            obj.readResBin("BinRes.bin");
            System.out.println("Result is(read from bin): " + obj.getResult());
            obj.readResTxt("textRes.txt");
            System.out.println("Result is(read from txt): " + obj.getResult());
        }

    }
}