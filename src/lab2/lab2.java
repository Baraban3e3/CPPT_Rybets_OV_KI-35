package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        String empty = "  ";
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();
        int n = (int) Math.ceil(nRows/2.0);
        arr = new char[n][];

       // System.out.println(arr.length);
        int pointer = nRows;
        for (int i = 0; i < n; i++) {
            arr[i] = new char[pointer];
            pointer = pointer - 2;
            if (pointer < 0) {
                pointer = 0;
            }
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        pointer = nRows;

        exit: for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < pointer; j++) {
                if (filler.length() == 1) {

                    arr[i][j] = filler.charAt(0);

                    fout.print(arr[i][j] + " ");
                    System.out.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            pointer = pointer - 2;
            if (pointer < 0) {
                pointer = 0;
            }

            System.out.print("\n" + empty);
            fout.print("\n" + empty);
            empty += "  ";
        }
        fout.flush();
        fout.close();

    }
}