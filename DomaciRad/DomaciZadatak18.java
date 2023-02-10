package DomaciRad;

import java.util.Scanner;

public class DomaciZadatak18 {
    public static void main(String[] args) {
//        Zadatak 1.
//        Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz imena i String
//        koji zelimo da proverimo, ispisati poruku ukoliko se ime nalazi u nizu, obavestiti ako nije tu.


        stampa(provera(nizImena()));
    }
    public static String[] nizImena() {
        String niz[] = {"Ana", "Mile", "Lena", "Pera", "Zika", "Laza"};
        return niz;
    }
    public static boolean provera(String[] ime) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime za proveru");
        String unosImena = sc.next();
        boolean exist = false;
        for (int i = 0; i < ime.length; i++) {
//            List<String> list = Arrays.asList(ime);
//            if(list.contains(unosImena)) {
            if (ime[i].equals(unosImena)) {
                exist = true;
                break;
            }
        }
        return exist;
    }
    public static void stampa(boolean exist) {
        if (exist) {
            System.out.println("Ime se nalazi u listi");
        } else {
            System.out.println("Ime se ne nalazi u listi");
        }
    }
}
