//1.feladat:

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static javax.swing.UIManager.get;

public class Main {
    private static List<Election> szavazatok;

    private static void debugger(){
        int i = 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        szavazatok = new ArrayList<>();

        File fbe = new File("files/voksok.txt");
        Scanner sbe = new Scanner(fbe);
        while (sbe.hasNextLine()){
            String fileLine = sbe.nextLine();
            szavazatok.add(new Election(fileLine));
        }

        System.out.println("2.feladat: adatok tárolva");
        System.out.println();

        System.out.println("3.feladat: " + szavazatok.size() + " polár szavazott.");
        System.out.println();

        Scanner nev = new Scanner(System.in);
        System.out.print("4.feladat: Kérek egy induló szervezetet: ");
        String id = nev.nextLine();

        int szavSz = 0;
        for (int i = 0; i < szavazatok.size(); i++){
            String j = szavazatok.get(i).getSzav();
            System.out.print(j);
            if (j == id){
                szavSz++;
                System.out.print(j);
            }
        }
        debugger();

        System.out.println(id + " " + szavSz + " szavazatot kapott.");
    }
}