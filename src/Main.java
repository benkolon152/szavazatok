//1.feladat:

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File fbe = new File("files/voksok.txt");
        Scanner sbe = new Scanner(fbe);
        while (sbe.hasNextLine()){
            String fileLine = sbe.nextLine();
        }
    }
}