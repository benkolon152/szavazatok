//1.feladat:

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Election> szavazatok;

    public static void main(String[] args) throws FileNotFoundException {
        szavazatok = new ArrayList<>();

        File fbe = new File("files/voksok.txt");
        Scanner sbe = new Scanner(fbe);
        while (sbe.hasNextLine()){
            String fileLine = sbe.nextLine();
            szavazatok.add(new Election(fileLine));
        }
        System.out.println("2.feladat: adatok tárolva");
    }
}